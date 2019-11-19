# Logging

> Vergleich log4j, logback, acl, log4j2...: 

> https://www.marcobehler.com/guides/a-guide-to-logging-in-java
> https://stackify.com/compare-java-logging-frameworks/


## Eine 'Facade' fürs Logging:

> http://www.slf4j.org/

- Stabile Version von slf4j einbinden:

> https://mvnrepository.com/artifact/org.slf4j/slf4j-api

- Eine Binding für 'konkrete' Logger-Realisierung:

> Binding für java.util.logger: https://mvnrepository.com/artifact/org.slf4j/slf4j-jdk14

- Für 'logback'-Realisierung brqucht slf4j keine Binding.
 
> Logback im Internet: http://logback.qos.ch/

> Logback einbinden als Logger-Realisierung: https://mvnrepository.com/artifact/ch.qos.logback/logback-classic
> Achtung! Logback wird von Slf4j nativ unterstützt und braucht keine Binding.

> Logback-Konfigurationen bitte im Netz suchen. z.B. Appender:
> http://logback.qos.ch/manual/appenders.html
 