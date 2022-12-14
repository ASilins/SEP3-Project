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
    public async Task<ActionResult<WorkoutDTO>> GetWorkout([FromQuery] int id)
    {
        try
        {
            Logger.WriteLog("<Received GetWorkout request>", "info");

            Workout? w = await _dao.GetWorkout(id);

            if (w == null)
            {
                return StatusCode(404);
            }

            var dto = new WorkoutDTO()
            {
                Id = w.Id,
                Name = w.Name,
                Description = w.Description,
                DurationInMin = w.DurationInMin,
                FollowedBy = w.FollowedBy,
                IsPublic = w.IsPublic
            };

            var exercises = new List<ExerciseDTO>();

            // foreach (var item in (List<Exercise>)w.Exercises)
            // {
            //     exercises.Add(new ExerciseDTO()
            //     {
            //         Id = item.Id,
            //         Name = item.Name,
            //         Description = item.Description,
            //         Duration = item.DurationInMin
            //     });
            // }

            dto.Exercises = exercises;

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
    public async Task<ActionResult<WorkoutDTO>> EditWorkout([FromBody] WorkoutDTO workout)
    {
        try
        {
            Logger.WriteLog("<Received EditWorkout request>", "info");

            await _dao.EditWorkout(workout);

            return Ok();
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
}