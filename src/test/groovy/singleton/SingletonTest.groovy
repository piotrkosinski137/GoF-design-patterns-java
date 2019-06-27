package singleton

import spock.lang.Specification

class SingletonTest extends Specification
{
    def "should instantiate class only one time"()
    {
        given:
        def singleton1 = Singleton.get()
        def singleton2 = Singleton.get()

        expect:
        singleton1 == singleton2
    }
}
