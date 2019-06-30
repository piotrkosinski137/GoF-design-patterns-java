package command;

public class SaveFileOperation implements TextFileOperation
{
    private final TextFile textFile;

    public SaveFileOperation(TextFile file)
    {
        textFile = file;
    }

    @Override
    public String execute()
    {
        return textFile.save();
    }
}
