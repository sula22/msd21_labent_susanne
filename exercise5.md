# Exercise 5: Logging

## Topics
- __Explore using git branches__
- __Integration of Apache log4j__
- __What is logging?__

### Why logging is used?

Logging is used to analyze the code flow and catch if there are possible errors or exceptions.

### What Loglevels are there in Log4J?

Loglevels are here to categorize logs and are here to show the importance and serverity of an event.

### What kind of configurations are possible in log4J?

Log4J can be configurated in XML, JSON or YAML files and it has the ability to configure itself during initialization.
If there isn't any configuration file, Log4J sets up with default configuration.
There are the following loglevels:
ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL

- __ALL__ All events

- __TRACE__ A message capturing the trace of an application

- __DEBUG__ A debugging event

- __INFO__ General informations about the event

- __WARN__ A events that possibly leads to an error

- __ERROR__ A error in the application

- __FATAL__ Severe error that prevents the application from continuing
