What is this About 
==================

A java program that encrypt a string using Caesar Cipher also demonstrates 
simple implementation of Model-View-Controller pattern and uses theMigLayout 
library for the UI.

Requirements 
------------

-Java Development Kit  
-miglayout-4.0-swing.jar from MigLayout (www.miglayout.com/)  
-hamcrest-core-1.3.jar and junit-4.11.jar of JUnit 4 suite for testing     


How to Compile
--------------

Since it uses the MiG Layout Java Layout Manager for Swing and SWT you have to 
include miglayout-swing.jar to the Class Path . So typing this to the 
commandline, to where your source codes are located

	javac -cp ".;libs\miglayout-4.0-swing.jar" Caesar.java

will yield class files which will be used for running the program

How to Run 
----------

The MigLayout is still needed in the execution so this is how it can be run

	java -cp ".;libs\miglayout-4.0-swing.jar" Caesar

you may change to this if you want dos window to minimize during execution

	start javaw -cp ".;libs\miglayout-4.0-swing.jar" Caesar

or much better if you just double-click the included batch file. It assumes you 
have installed Java Development Kit in your system, and java, javac, or javaw is 
included in the PATH environment variable.

If you are using Eclipse just import this library in the project

How to run Tests
----------------

The application has been tested using JUnit, but only tests the Model class CaesarModel.java
to test simply type the command below to the folder where CaesarModelTest.java resides

	javac -cp ".;libs\junit-4.11.jar;libs\hamcrest-core-1.3.jar" CaesarModelTest.java
	java -cp ".;libs\junit-4.11.jar;libs\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CaesarModelTest 

There is an included batch file (testRun.bat) to automate all this commands, simply make sure 
the required jars are existing in the libs folder so everything will be okay.


Link to Libraries
----------------

	http://www.migcalendar.com/miglayout/versions/4.0/miglayout-4.0-swing.jar  
	http://mirrors.ibiblio.org/maven2/junit/junit/4.11/junit-4.11.jar  
	https://hamcrest.googlecode.com/files/hamcrest-core-1.3.jar  


copyleft 2014 0xrcd











