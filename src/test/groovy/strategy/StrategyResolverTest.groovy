package strategy

import spock.lang.Specification

class StrategyResolverTest extends Specification
{
    private final def num1 = 3
    private final def num2 = 3

    def "should correctly add two values"()
    {
        given:
        def resolver = new StrategyResolver(new Add())

        when:
        def result = resolver.startEquation(num1, num2)

        then:
        result == 6
    }

    def "should correctly multiply two values"()
    {
        given:
        def resolver = new StrategyResolver(new Miltiply())

        when:
        def result = resolver.startEquation(num1, num2)

        then:
        result == 9
    }
}
