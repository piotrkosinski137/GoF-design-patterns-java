package state.postReference

import spock.lang.Specification

class PackageTest extends Specification
{

    def "should change status from ordered to delivered"()
    {
        given:
        def pkg = new Package()

        when:
        pkg.nextStatus()

        then:
        pkg.packageState() instanceof DeliveredState
    }

    def "should change state from ordered to received"()
    {
        given:
        def pkg = new Package()

        when:
        pkg.nextStatus()
        pkg.nextStatus()

        then:
        pkg.packageState() instanceof ReceivedState
    }

    def "should prev state from received to delivered"()
    {
        given:
        def pkg = new Package()
        pkg.setPackageState(new ReceivedState())

        when:
        pkg.prevStatus()

        then:
        pkg.packageState() instanceof DeliveredState
    }
}
