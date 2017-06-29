Quoterino
=========
Quoterino is a collection of REST services for office use.

Countdown
---------
*/Countdown*

Returns the time left until an event.

Day of the week
---------
*/whatDay*

Returns the current day.

Random Quote
---------
*/inspireMe*

Returns a random quote. Use when in dire need of inspiration.

All Quotes
---------
*/allQuotes*

Returns all quotes known by the system.

Add Quote
-------------------------------------
*/addQuote?quote=INSERT YOUR QUOTE HERE*

Add a quote to the system.


Usage
-----
- Debug the application: mvn spring-boot:run
- Build a jar: mvn install
- Run the jar: java filename.jar
- Override default properties: put a application.properties file in ./config relative to the jar file.

see:
- https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-running-your-application.html
- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html#boot-features-external-config-profile-specific-properties