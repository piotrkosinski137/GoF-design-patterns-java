package state

import spock.lang.Specification

class TVTest extends Specification
{

    def "should change state from off to on"()
    {
        given:
        RemoteControl off = new Off()
        def tv = new TV(off)

        when:
        tv.pressButton()

        then:
        tv.state() instanceof On
    }

    def "should change state from on to off"()
    {
        given:
        RemoteControl on = new On()
        def tv = new TV(on)

        when:
        tv.pressButton()

        then:
        tv.state() instanceof Off
    }

    def "after clicking two times shold go back to start state"()
    {
        given:
        RemoteControl on = new On()
        def tv = new TV(on)

        when:
        tv.pressButton()
        tv.pressButton()

        then:
        tv.state() instanceof On
    }
}
