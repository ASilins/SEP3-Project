using Microsoft.AspNetCore.Mvc;
using Repositories.Interfaces;
using Repositories.Logic;
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
}