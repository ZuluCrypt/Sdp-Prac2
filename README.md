good day everyone, welcome to our prac 2. lets get this done as soon as possible and please create your own branch when doing your task thank you

FORMATTING CODE
==============================================================
CODE:
Remove unnecessary whitespaces 
BRANCH:
Preferred Format 
TASK-#(Student_Number)

For example 
TASK-6(G21S6211)

AFTER COMPLETING TASK 
===============================================================
BRANCH:
Merge branch to master

FEW CONFIGURATIONS TO BUILD THE SOFTWARE
===============================================================
if you have already noticed the gradle version of the project is outdated and does not run with the current 
JVM environment so you will need to change a few Wrapper properties to accomplish this and test your program 
that it builds and actually runs. 

To do:
1. open gradle-wrapper.properties
2. edit distributionUrl=https\://services.gradle.org/distributions/gradle-7.5-bin.zip to
   distributionUrl=https\://services.gradle.org/distributions/gradle-8.7-bin.zip
3. then run normal ./gradlew build or ./gradlew run command to build
================================================================



