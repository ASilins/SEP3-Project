using Microsoft.AspNetCore.Mvc;
using Repositories.Interfaces;
using Shared;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class MemberController : ControllerBase
{
    private readonly ICreateMemberDAO dao;

    public MemberController(ICreateMemberDAO dao)
    {
        this.dao = dao;
    }

    [HttpPost]
    public async Task<ActionResult<Member>> CreateMember([FromBody] Member member)
    {
        Console.WriteLine("<<Request came in>>");
        try
        {
            Response response = await dao.CreateMember(member);
            Member created = (Member)response.ResponseObject;
            Console.WriteLine("<<<Success>>>");
            return Created("Member created", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}