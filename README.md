This repository demonstrates the issue documented in [GROOVY-10108](https://issues.apache.org/jira/browse/GROOVY-10108).

To see the failing test, run these commands in a local clone of this repo:

    git checkout groovy-2.5
    ./gradlew test 

There is also a `groovy-2.4` branch which demonstrates that the issues does not exist under Groovy 2.4,
and a `groovy-3.0` branch demonstrating that the issue also exists in that version.
