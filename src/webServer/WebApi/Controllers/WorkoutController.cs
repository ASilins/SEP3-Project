using GrpcClient.Interfaces;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Model.DTOs;
using Model.Tools;
using Shared.DTOs;

namespace WebApi.Controllers;

[ApiController]
[Route("/[controller]")]
public class WorkoutController : ControllerBase
{
    private readonly IWorkoutClient _client;

    public WorkoutController(IWorkoutClient client)
    {
        _client = client;
    }

    [HttpGet, Authorize(Roles = "Member,Trainer,Admin")]
    public async Task<ActionResult<WorkoutDTO>> GetWorkout([FromQuery] int id)
    {
        try
        {
            Logger.WriteLog("<Received GetWorkout request>", "info");

            return Ok(await _client.GetWorkout(id));
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("/[controller]s"), Authorize(Roles = "Member,Trainer,Admin")]
    public async Task<ActionResult<IEnumerable<WorkoutDTO>>> GetWorkouts()
    {
        try
        {
            Logger.WriteLog("<Received GetWorkouts request>", "info");

            return Ok(await _client.GetWorkouts());
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost("/[controller]/assign"), Authorize(Roles = "Trainer,Admin")]
    public async Task<ActionResult<FollowWorkoutDTO>> AssignWorkout([FromBody] FollowWorkoutDTO dto)
    {
        try
        {
            Logger.WriteLog("<Received AssignWorkout request>", "info");

            return Ok(await _client.AssignWorkout(dto));
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpPut, Authorize(Roles = "Member,Trainer,Admin")]
    public async Task<ActionResult<WorkoutDTO>> EditWorkout([FromBody] WorkoutDTO workout)
    {
        try
        {
            Logger.WriteLog("<Received EditWorkout request>", "info");

            await _client.EditWorkout(workout);
            return Ok();
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpDelete, Authorize(Roles = "Member,Trainer,Admin")]
    public async Task<ActionResult<WorkoutDTO>> DeleteWorkout([FromQuery] int id)
    {
        try
        {
            Logger.WriteLog("<Received DeleteWorkout request>", "info");

            await _client.DeleteWorkout(id);
            return NoContent();
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }
}