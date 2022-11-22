namespace Shared;

public class Response
{
    public object ResponseObject { get; } = null!;

    public Response(object obj)
    {
        ResponseObject = obj;
    }
}