package command;

//Knows how to invoke stuff but doesn't know how all works internally
//thin layer between commands and consumers
class TextFileOperationExecutor
{
    private final TextFileOperation textFileOperation;

    TextFileOperationExecutor(TextFileOperation operation)
    {
        textFileOperation = operation;
    }

    String invoke() {
        return textFileOperation.execute();
    }
}
