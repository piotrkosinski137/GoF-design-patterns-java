package flyweight

import spock.lang.Specification

class VocationFactoryTest extends Specification
{
    private def vocationFactory = new VocationFactory()


    def "should create knight based on given parameters"()
    {
        given:
        def resultVocation = vocationFactory.getVocationFromFactory(VocationType.KNIGHT)

        expect:
        resultVocation instanceof Knight
    }

    def "generated knights should be equal but should be different instances"()
    {
        given:
        def resultVocation1 = vocationFactory.getVocationFromFactory(VocationType.KNIGHT)
        def resultVocation2 = vocationFactory.getVocationFromFactory(VocationType.KNIGHT)

        expect:
        resultVocation1 != resultVocation2
    }
}
