using GrpcClient.Interfaces;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Model.DTOs;

namespace WebApi.Controllers;

[ApiController]
[Route("/[controller]")]
public class MemberController : ControllerBase
{
    private readonly IMemberClient _client;

    public MemberController(IMemberClient client)
    {
        _client = client;
    }

    [HttpPost("/[controller]/create"), AllowAnonymous]
    public async Task<ActionResult<MemberDTO>> CreateMember([FromBody] LoginCreateDTO member)
    {
        try
        {
            MemberDTO created = await _client.CreateMember(member);
            return Created("Member created", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost("/[controller]/login"), AllowAnonymous]
    public async Task<ActionResult<string>> LoginMember([FromBody] LoginCreateDTO member)
    {
        try
        {
            string loggedIn = await _client.LoginMember(member);
            return Ok(loggedIn);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPut]
    public async Task<ActionResult<MemberDTO>> EditPrivilege([FromBody] MemberDTO member)
    {
        try
        {
            await _client.EditPrivilege(member);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("/[controller]s")]
    public async Task<ActionResult<IEnumerable<MemberDTO>>> GetMembers()
    {
        try
        {
            return Ok(await _client.GetMembers());
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    public async Task<ActionResult<MemberDTO>> DeleteMember([FromQuery] int id)
    {
        try
        {
            Logger.WriteLog("<<Received DeleteMember request>>", "info");

            await _client.DeleteMember(id);
            return NoContent();
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    // Only for development

    [HttpGet("token"), AllowAnonymous]
    public OkObjectResult GetToken()
    {
        return Ok(_client.GetToken());
    }
}