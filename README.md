# Cucumber base

This is a maven project for using cucumber

## Executing

``mvn clean test``

In this phase, there is only the belly.feature. You should see this after executing:

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.kata.bdd.cucumber.RunCukesTest
...

1 Scenarios (1 passed)
3 Steps (3 passed)
0m0.097s

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.516 sec

Results :

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.715 s
[INFO] Finished at: 2015-03-10T05:49:12+01:00
[INFO] Final Memory: 15M/166M
[INFO] ------------------------------------------------------------------------
```

## Thanks to

This maven project has been possible due to [Thomas Sundberg](https://twitter.com/@thomassundberg) and [this post]
(https://thomassundberg.wordpress.com/2014/05/29/cucumber-jvm-hello-world/)

Should you want to, there's a tweet to thank him the effort: [tweet intent here](https://twitter
.com/intent/tweet?text=@thomassundberg thanks for the cucumber bdd tutorial! We're using it from an @agilebcn meetup;Keep up the good work&url=https://thomassundberg.wordpress.com/2014/05/29/cucumber-jvm-hello-world/)

## Info

 * I have tested this with project with the following settings:

```
Apache Maven 3.2.5 (12a6b3acb947671f09b81f49094c53f426d8cea1; 2014-12-14T18:29:23+01:00)
Maven home: ~/Applications/maven-3.2.5
Java version: 1.8.0_25, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.9.4", arch: "x86_64", family: "mac"
```

 * More info about cucumber [here](https://cukes.info/)
