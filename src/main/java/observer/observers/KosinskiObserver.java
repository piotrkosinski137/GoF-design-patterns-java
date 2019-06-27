package observer.observers;

public class KosinskiObserver implements Observer
{
    @Override
    public void updateStatus(String fromWho, String message)
    {
        System.out.println(String.format("Kosinski otrzymał tweeta od [%s]: [%s]", fromWho, message));

    }
}
