namespace Shared.DTOs;

// In new build
public class LoginCreateDTO
{
    public string Username { get; set; }
    public byte[] Password { get; set; }
    public byte[] Salt { get; set; }
}