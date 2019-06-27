package template;

public class MainClass
{
    //abstract class handles template how workflow should look like. We can change behaviour of
    //certain tasks but process order stays the same because processing method is final -> can't be
    //overwritten
    public static void main(String[] args)
    {
        GameTemplate football = new Football();

        football.proceedGameWorkflow();

        System.out.println("//////////////");
        GameTemplate chess = new Chess();

        chess.proceedGameWorkflow();
    }
}
