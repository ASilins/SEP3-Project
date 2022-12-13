namespace Model.Tools;

public static class Logger
{
    private const string EXTENTION = ".txt";
    private const string FILELOCATION = "../LOG/";
    private static readonly string _FileDate = "_" + DateTime.Now.ToString("dd-MM-yyyy");

    public static void WriteLog(string msg, string fileName)
    {
        string filePath = FILELOCATION + fileName.ToUpper() + _FileDate + EXTENTION;
        using StreamWriter writer = new(filePath, true);
        writer.WriteLine($"{DateTime.Now} : {msg}");
    }
}