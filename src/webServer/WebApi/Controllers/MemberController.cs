using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using GrpcClient.Interfaces;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Model.DTOs;
using Model.Tools;

namespace WebApi.Controllers;

[ApiController]
[Route("/api/[controller]")]
public class MemberController : ControllerBase
{
    private readonly IMemberClient _client;

    public MemberController(IMemberClient client)
    {
        _client = client;
    }

    [HttpPost("create"), AllowAnonymous]
    public async Task<ActionResult<MemberDTO>> CreateMember([FromBody] LoginCreateDTO member)
    {
        try
        {
            Logger.WriteLog("<Received CreateMember request>", "info");

            MemberDTO created = await _client.CreateMember(member);
            return Created("Member created", created);
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost("login"), AllowAnonymous]
    public async Task<ActionResult<LoginDTO>> LoginMember([FromBody] LoginCreateDTO member)
    {
        try
        {
            Logger.WriteLog("<Received LoginMember request>", "info");

            string loggedIn = await _client.LoginMember(member);
            LoginDTO dto = new()
            {
                Token = loggedIn
            };

            return Created("User logged in", dto);
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpPut]
    public async Task<ActionResult<MemberDTO>> EditMember([FromBody] MemberDTO member)
    {
        try
        {
            Logger.WriteLog("<Received EditMember request>", "info");

            await _client.EditMember(member);
            return NoContent();
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("/[controller]s")]
    public async Task<ActionResult<IEnumerable<MemberDTO>>> GetMembers()
    {
        try
        {
            Logger.WriteLog("<Received GetMembers request>", "info");

            return Ok(await _client.GetMembers());
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
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

}