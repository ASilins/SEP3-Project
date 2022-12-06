using GrpcClient.Interfaces;
using Microsoft.AspNetCore.Mvc;
using Model.DTOs;

namespace WebApi.Controllers;

[ApiController]
[Route("/[controller]")]
public class ExerciseController : ControllerBase
{
    private readonly IExerciseClient _client;

    public ExerciseController(IExerciseClient client)
    {
        _client = client;
    }

    [HttpPost, Route("/[controller]/create")]
    public async Task<ActionResult<ExerciseDTO>> CreateExercise([FromBody] ExerciseDTO exercise)
    {
        try
        {
            ExerciseDTO created = await _client.CreateExercise(exercise);
            return Created("Exercise created", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("/[controller]s")]
    public async Task<ActionResult<IEnumerable<ExerciseDTO>>> GetExercises()
    {
        try
        {
            return Ok(await _client.GetExercises());
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}