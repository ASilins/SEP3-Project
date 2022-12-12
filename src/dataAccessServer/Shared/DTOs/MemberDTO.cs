namespace Shared.DTOs;

// In new build
public class MemberDTO
{
    public int Id { get; init; }
    public string? Username { get; set; }
    public byte[]? Password { get; set; }
    public byte[]? Salt { get; set; }
    public string? Position { get; set; }
}