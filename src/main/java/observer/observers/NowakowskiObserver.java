package observer.observers;

public class NowakowskiObserver implements Observer
{
    @Override
    public void updateStatus(String fromWho, String message)
    {
        System.out.println(String.format("Nowakowski otrzymał tweeta od [%s]: [%s]", fromWho, message));
    }
}
