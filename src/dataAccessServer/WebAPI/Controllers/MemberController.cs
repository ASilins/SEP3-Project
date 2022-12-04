using Microsoft.AspNetCore.Mvc;
using Repositories.Interfaces;
using Shared.DTOs;

namespace WebAPI.Controllers;

[ApiController]
[Route("/[controller]")]
public class MemberController : ControllerBase
{
    private readonly ICreateMemberDAO dao;

    public MemberController(ICreateMemberDAO dao)
    {
        this.dao = dao;
    }

    [HttpPost]
    [Route("/[controller]/create")]
    public async Task<ActionResult<MemberDTO>> CreateMember([FromBody] MemberDTO member)
    {
        try
        {
            MemberDTO created = await dao.CreateMember(member);
            return Created("Member created", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    [Route("/[controller]/login")]
    public async Task<ActionResult<MemberDTO>> LoginMember([FromBody] MemberDTO member)
    {
        try
        {
            MemberDTO loggedIn = await dao.LoginMember(member);
            return Ok(loggedIn);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}