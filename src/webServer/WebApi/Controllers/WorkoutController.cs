using GrpcClient.Interfaces;
using Microsoft.AspNetCore.Mvc;
using Model.DTOs;

namespace WebApi.Controllers;

[ApiController, Route("/[controller]")]
public class WorkoutController : ControllerBase
{
    private readonly IWorkoutClient _client;

    public WorkoutController(IWorkoutClient client)
    {
        _client = client;
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
}