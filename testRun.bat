@echo off
REM add javac and java to the path environment variables
set PATH=%PATH%;"C:\Program Files\Java\jdk1.7._45\bin\" 

@javac -cp ".;libs\junit-4.11.jar;libs\hamcrest-core-1.3.jar" CaesarModelTest.java
@java -cp ".;libs\junit-4.11.jar;libs\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CaesarModelTest 

pause

@javac -cp ".;libs\miglayout-4.0-swing.jar" Caesar.java
@start javaw -cp ".;libs\miglayout-4.0-swing.jar" Caesar

