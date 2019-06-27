package observer.subjects

import observer.observers.Observer
import spock.lang.Specification

class LewandowskiSubjectTest extends Specification
{
    private def lewandowskiSubject = new LewandowskiSubject()

    def "should correctly register observers"()
    {
        given:
        def mockObserver = Mock(Observer)

        when:
        lewandowskiSubject.registerObserver(mockObserver)

        then:
        with(lewandowskiSubject.getObservers()) {
            size() == 1
            get(0) == mockObserver
        }
    }

    def "should notify observers about status"()
    {
        given:
        def mockObserver1 = Mock(Observer)
        def mockObserver2 = Mock(Observer)
        lewandowskiSubject.registerObserver(mockObserver1)
        lewandowskiSubject.registerObserver(mockObserver2)

        when:
        lewandowskiSubject.notifyObservers("status")

        then:
        1 * mockObserver1.updateStatus("Robert Lewandowski", "status")
    }

    def "should unsubscribe observer"()
    {
        given:
        def mockObserver = Mock(Observer)
        lewandowskiSubject.registerObserver(mockObserver)

        when:
        lewandowskiSubject.unregisterObserver(mockObserver)

        then:
        lewandowskiSubject.getObservers().size() == 0
    }
}
