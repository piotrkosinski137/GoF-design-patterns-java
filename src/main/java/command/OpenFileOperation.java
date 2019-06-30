package command;

public class OpenFileOperation implements TextFileOperation
{
    private final TextFile textFile;

    OpenFileOperation(TextFile file)
    {
        textFile = file;
    }

    @Override
    public String execute()
    {
        return textFile.open();
    }
}
