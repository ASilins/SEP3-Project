using GrpcClient.Interfaces;

var builder = WebApplication.CreateBuilder(args);

builder.Services.AddScoped<IExerciseClient, ExerciseClient>();
var app = builder.Build();

app.MapGet("/", () => "Hello World!");

app.Run();
