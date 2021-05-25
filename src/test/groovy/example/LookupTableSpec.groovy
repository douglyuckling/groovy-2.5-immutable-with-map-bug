package example

import spock.lang.Specification

class LookupTableSpec extends Specification {

    void "can be instantiated via tuple constructor"() {
        given:
        Map<Long, String> data = [(1L): 'foo', (2L): 'bar']

        when:
        new LookupTable(data)

        then:
        notThrown Exception
    }

    void "can be instantiated via map constructor"() {
        given:
        Map<Long, String> data = [(1L): 'foo', (2L): 'bar']

        when:
        new LookupTable(data: data)

        then:
        notThrown Exception
    }

}
