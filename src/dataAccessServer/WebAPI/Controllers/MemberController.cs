using Microsoft.AspNetCore.Mvc;
using Database.Interfaces;
using Shared.DTOs;
using Shared.Tools;

namespace WebAPI.Controllers;

[ApiController]
[Route("/api/[controller]")]
public class MemberController : ControllerBase
{
    private readonly IMemberDAO dao;

    public MemberController(IMemberDAO dao)
    {
        this.dao = dao;
    }

    [HttpPost]
    [Route("create")]
    public async Task<ActionResult<MemberDTO>> CreateMember([FromBody] LoginCreateDTO member)
    {
        try
        {
            Logger.WriteLog("<Received CreateMember request>", "info");

            MemberDTO created = await dao.CreateMember(member);
            return Created("Member created", created);
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost]
    [Route("login")]
    public async Task<ActionResult<MemberDTO>> GetByUsername([FromBody] Login member)
    {
        try
        {
            Logger.WriteLog("<Received GetByUsername request>", "info");

            MemberDTO? loggedIn = await dao.GetByUsername(member.Username);

            if (loggedIn == null)
            {
                return StatusCode(404);
            }

            return Ok(loggedIn);
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }


    [HttpPost]
    [Route("/api/[controller]/getById")]
    public async Task<ActionResult<MemberDTO>> GetById([FromBody] int id)
    {
        try
        {
            MemberDTO? dto = await dao.GetById(id);

            if (dto == null)
            {
                return StatusCode(404);
            }

            return Ok(dto);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPut]
    public async Task<ActionResult<MemberDTO>> EditMember([FromBody] MemberDTO memberDto)
    {
        try
        {
            Logger.WriteLog("<Received EditMember request>", "info");

            await dao.EditMember(memberDto);

            return NoContent();
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("/api/[controller]s")]
    public async Task<ActionResult<IEnumerable<MemberDTO>>> GetMembers()
    {
        try
        {
            Logger.WriteLog("<Received GetMembers request>", "info");

            return Ok(await dao.GetMembers());
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    public async Task<ActionResult<int>> DeleteMember([FromQuery] int id)
    {
        try
        {
            await dao.DeleteMember(id);

            return Ok();
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("Error");
            return StatusCode(500, e.Message);
        }
    }
}