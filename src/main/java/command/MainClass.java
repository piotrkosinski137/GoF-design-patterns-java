package command;

public class MainClass
{

    public static void main(String[] args)
    {
        TextFile receiverTextFile = new TextFile("file.txt");

        TextFileOperation openFile = new OpenFileOperation(receiverTextFile);
        TextFileOperation saveFile = new SaveFileOperation(receiverTextFile);

        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor(openFile);
        System.out.println(textFileOperationExecutor.invoke());

        textFileOperationExecutor = new TextFileOperationExecutor(saveFile);
        System.out.println(textFileOperationExecutor.invoke());
    }

}
