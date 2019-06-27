package adapter.socket

import spock.lang.Specification

class SocketAdapterTest extends Specification
{

    def "should correctly change volt by adapter"()
    {
        given:
        def indianSocket = new IndianSocket()
        def socketAdapter = new SocketAdapterImpl(indianSocket)

        when:
        def volts120 = socketAdapter.get120V()

        then:
        volts120.getVolts() == 120
    }
}
