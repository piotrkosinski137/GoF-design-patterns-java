package command;

//Receiver object
class TextFile
{
    private String name;

    TextFile(String name)
    {
        this.name = name;
    }

    String open() {
        return "opening..." + name;

    }

    String save() {
        return "saving..." + name;

    }
}
