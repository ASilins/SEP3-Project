using Microsoft.AspNetCore.Mvc;
using Database.Interfaces;
using Database.Logic;
using Shared.DTOs;

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
    public async Task<ActionResult<Workout>> GetWorkout([FromQuery] int id)
    {
        try
        {
            return await _dao.GetWorkout(id);
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
            return Ok(await _dao.GetWorkouts());
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
            return Ok(await _dao.AssignWorkout(dto));
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
            return Ok(await _dao.EditWorkout(workout));
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
            if (await _dao.DeleteWorkout(id))
            {
                return NoContent();
            }

            return StatusCode(400, $"Workout with id:{id} does not exist");
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}