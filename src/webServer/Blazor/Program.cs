using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using Blazor;
using Blazor.Services;

var builder = WebAssemblyHostBuilder.CreateDefault(args);
builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");

builder.Services.AddScoped(sp =>
                new HttpClient
                {
                    BaseAddress = new Uri("https://localhost:7239")
                });

builder.Services.AddScoped<MemberService>();
builder.Services.AddScoped<ExerciseService>();

await builder.Build().RunAsync();
