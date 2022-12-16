using Microsoft.AspNetCore.Mvc;
using Database.Interfaces;
using Shared.DTOs;
using Shared.Tools;

namespace WebAPI.Controllers;

[ApiController]
[Route("/api/[controller]")]
public class ExerciseController : ControllerBase
{
    private readonly IExerciseDAO _dao;

    public ExerciseController(IExerciseDAO dao)
    {
        _dao = dao;
    }

    [HttpPost, Route("create")]
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

    [HttpGet]
    public async Task<ActionResult<ExerciseDTO>> GetExercise([FromQuery] int id)
    {
        try
        {
            Logger.WriteLog("<Received GetExercise request>", "info");

            return Ok(await _dao.GetExercise(id));

        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("/api/[controller]s")]
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

    [HttpPut]
    public async Task<ActionResult> EditExercise([FromBody] ExerciseDTO dto)
    {
        try
        {
            Logger.WriteLog("<Received EditExercise request>", "info");

            await _dao.EditExercise(dto);

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
    public async Task<ActionResult> DeleteExercise([FromQuery] int id)
    {
        try
        {
            Logger.WriteLog("<Received DeleteExercise request>", "info");

            await _dao.DeleteExercise(id);

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