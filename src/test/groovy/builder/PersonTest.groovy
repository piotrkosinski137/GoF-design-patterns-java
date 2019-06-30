package builder

import spock.lang.Specification

class PersonTest extends Specification
{
    def "should create person via builder"()
    {
        given:
        def person = Person.create()
                           .withName("Piotr")
                           .withAge(26)
                           .andHomeTown("Bytom")

        expect:
        with(person) {
            name() == "Piotr"
            age == 26
            homeTown == "Bytom"
        }
    }
}
