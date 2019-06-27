package observer;

import observer.observers.KosinskiObserver;
import observer.observers.NowakowskiObserver;
import observer.observers.Observer;
import observer.subjects.LewandowskiSubject;
import observer.subjects.OdyasSubject;
import observer.subjects.Subject;

public class MainClass
{
    //subject stores collection of observers. When state in subject is changed, we inform all subscribers (observers)
    //about change
    public static void main(String[] args)
    {
        Subject lewandowski = new LewandowskiSubject();
        Subject odyas = new OdyasSubject();

        Observer kosinski = new KosinskiObserver();
        Observer nowakowski = new NowakowskiObserver();

        lewandowski.registerObserver(kosinski);
        lewandowski.registerObserver(nowakowski);

        odyas.registerObserver(kosinski);

        lewandowski.notifyObservers("Kolejny mecz kolejna bramka");
        odyas.notifyObservers("Handsome team goes out");
    }
}
