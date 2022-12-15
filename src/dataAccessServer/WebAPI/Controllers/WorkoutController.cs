using Microsoft.AspNetCore.Mvc;
using Database.Interfaces;
using Database.Logic;
using Shared.DTOs;
using Shared.Model;
using Shared.Tools;

namespace WebAPI.Controllers;

[ApiController, Route("/[controller]")]
public class WorkoutController : ControllerBase
{
    private readonly IWorkoutDAO _dao;

    public WorkoutController(IWorkoutDAO dao)
    {
        _dao = dao;
    }

    [HttpGet]
    public async Task<ActionResult<WorkoutDTO>> GetWorkout([FromQuery] int w)
    {
        try
        {
            Logger.WriteLog("<Received GetWorkout request>", "info");

            WorkoutDTO dto = await _dao.GetWorkout(w);

            return Ok(dto);
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("/[controller]s")]
    public async Task<ActionResult<IEnumerable<WorkoutDTO>>> GetWorkouts()
    {
        try
        {
            Logger.WriteLog("<Received GetWorkouts request>", "info");

            return Ok(await _dao.GetWorkouts());
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost, Route("/[controller]/assign")]
    public async Task<ActionResult<FollowWorkoutDTO>> AssignWorkout([FromBody] FollowWorkoutDTO dto)
    {
        try
        {
            Logger.WriteLog("<Received AssignWorkout request>", "info");

            return Created("Workout assigned", await _dao.AssignWorkout(dto));
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpPut]
    public async Task<ActionResult<WorkoutDTO>> EditWorkout([FromBody] Workout workout)
    {
        try
        {
            Logger.WriteLog("<Received EditWorkout request>", "info");

            await _dao.EditExercisesInWorkout(workout);
            await _dao.EditWorkout(workout);

            return NoContent();
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpDelete]
    public async Task<ActionResult<int>> DeleteWorkout([FromQuery] int id)
    {
        try
        {
            Logger.WriteLog("<Received DeleteWorkout request>", "info");

            await _dao.DeleteWorkout(id);

            return NoContent();
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost, Route("/[controller]/create")]
    public async Task<ActionResult<IEnumerable<Workout>>> CreateWorkout([FromBody] WorkoutDTO workout)
    {
        try
        {
            WorkoutDTO created = await _dao.CreateWorkout(workout);
            return Created("Workout created", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}