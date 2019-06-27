package adapter.mph

import spock.lang.Specification

class CalculatorAdapterTest extends Specification
{
    private final def distance = 50
    private final def time = 60

    def "should correctly calculate speed in km/h"()
    {
        given:
        def kmhCalculator = new KMHCalculator()

        when:
        def speed = kmhCalculator.getSpeedKmh(distance, time)

        then:
        speed == 50
    }

    def "should correctly calculate speed in mp/h"()
    {
        given:
        def mphCalculatorAdapter = new MPHCalculatorAdapter(new KMHCalculator())

        when:
        def speedMessage = mphCalculatorAdapter.getSpeedMph(distance, time)

        then:
        speedMessage == "Result is: " + 31.068550000000002
    }
}
