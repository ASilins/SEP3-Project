using Microsoft.AspNetCore.Mvc;
using Database.Interfaces;
using Shared.DTOs;
using Shared.Tools;

namespace WebAPI.Controllers;

[ApiController]
[Route("/[controller]")]
public class ExerciseController : ControllerBase
{
    private readonly IExerciseDAO _dao;

    public ExerciseController(IExerciseDAO dao)
    {
        _dao = dao;
    }

    [HttpPost, Route("/[controller]/create")]
    public async Task<ActionResult<ExerciseDTO>> CreateExercise([FromBody] ExerciseDTO exercise)
    {
        try
        {
            Logger.WriteLog("<Received CreateExercise request>", "info");

            ExerciseDTO created = await _dao.CreateExercise(exercise);
            return Created("Exercise created", created);
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("/[controller]s")]
    public async Task<ActionResult<IEnumerable<ExerciseDTO>>> GetExercises()
    {
        try
        {
            Logger.WriteLog("<Received GetExercises request>", "info");

            return Ok(await _dao.GetExercises());
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }
}