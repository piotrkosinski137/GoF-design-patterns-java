package decorator;

public class MainClass
{
    //real examples are FileReader BufferedReader etc. Adding functions
    //in a runtime without changing base class
    public static void main(String[] args)
    {
        Tree christmasTree = new ChristmasTree();

        ChristmasTreeDecorator gwiazdka = new Gwiazdka(christmasTree);
        ChristmasTreeDecorator lancuch = new Lancuch(gwiazdka);
        ChristmasTreeDecorator babki = new Babki(lancuch);

        babki.decorate();

    }
}
