package abstractFactory

import abstractFactory.animals.AnimalFactory
import abstractFactory.cars.CarFactory
import spock.lang.Specification

class FactoryProviderTest extends Specification
{

    def "should return animal instance of factory" () {
        given:
        def factoryProvider = new FactoryProvider()

        when:
        def resultFactory = factoryProvider.getFactory(Choice.ANIMAL)

        then:
        resultFactory instanceof AnimalFactory
    }

    def "should return car instance of factory" () {
        given:
        def factoryProvider = new FactoryProvider()

        when:
        def resultFactory = factoryProvider.getFactory(Choice.CAR)

        then:
        resultFactory instanceof CarFactory
    }

    def "should throw exception if factory is not implemented yet" () {
        given:
        def factoryProvider = new FactoryProvider()

        when:
        factoryProvider.getFactory(Choice.PHONE)

        then:
        thrown(RuntimeException)
    }
}
