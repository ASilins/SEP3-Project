namespace Shared.DTOs;

public class Response
{
    public object ResponseObject { get; }

    public Response(object obj)
    {
        ResponseObject = obj;
    }
}