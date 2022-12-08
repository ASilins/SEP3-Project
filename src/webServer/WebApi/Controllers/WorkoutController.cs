using GrpcClient.Interfaces;
using Microsoft.AspNetCore.Mvc;
using Model.DTOs;
using Shared.DTOs;

namespace WebApi.Controllers;

[ApiController, Route("/[controller]")]
public class WorkoutController : ControllerBase
{
    private readonly IWorkoutClient _client;

    public WorkoutController(IWorkoutClient client)
    {
        _client = client;
    }

    [HttpGet]
    public async Task<ActionResult<Workout>> GetWorkout([FromQuery] int id)
    {
        try
        {
            return Ok(await _client.GetWorkout(id));
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("/[controller]s")]
    public async Task<ActionResult<IEnumerable<Workout>>> GetWorkouts()
    {
        try
        {
            return Ok(await _client.GetWorkouts());
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost, Route("/[controller]/assign")]
    public async Task<ActionResult<FollowWorkoutDTO>> AssignWorkout([FromBody] FollowWorkoutDTO dto)
    {
        try
        {
            return Ok(await _client.AssignWorkout(dto));
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPut]
    public async Task<ActionResult<Workout>> EditWorkout([FromBody] Workout workout)
    {
        try
        {
            return Ok(await _client.EditWorkout(workout));
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpDelete]
    public async Task<ActionResult<Workout>> DeleteWorkout([FromQuery] int id)
    {
        try
        {
            await _client.DeleteWorkout(id);
            return NoContent();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}