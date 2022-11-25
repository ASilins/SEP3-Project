using Grpc.Net.Client;

namespace Test;

public class Client
{
    private readonly string _url = "http://localhost:6565";
    private LogicServer.LogicServerClient client;

    public async void CreateMember()
    {
        using var channel = GrpcChannel.ForAddress(_url);
        client = new LogicServer.LogicServerClient(channel);

        var reply = await client.createMemberAsync(new CreatedMember
        {
            Username = "Test",
            Password = "Password"
        });

        Console.WriteLine(reply.Username);
    }

}