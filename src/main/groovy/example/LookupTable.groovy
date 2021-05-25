package example

import groovy.transform.Immutable

@Immutable
class LookupTable {
    Map<Long, String> data
}
