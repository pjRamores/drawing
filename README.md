
Drawing App
=======

This program will allow a user to simulate basic drawing. Its feature includes creating canvas,
drawing vertical and horizontal lines, drawing rectangle and filling a bucket with color.

---

## System Requirements :
  1. Internet connection - to download dependencies.
  2. OS - tested only on windows but should be able to run on other OS theoritically.
  3. Jdk version 8 or higher
    * get installer from https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
    * make sure to setup JAVA_HOME environment variable - https://javatutorial.net/set-java-home-windows-10
  4. Maven
    * get installer from https://maven.apache.org/download.cgi
    * make sure to setup M2_HOME environment variable - https://www.tutorialspoint.com/maven/maven_environment_setup.htm

<br>

## Hardware Requirement :
  * This app should be able to run in most modern computers.

<br>

---

## Commands to control the program :
| Command               | Description
|:----------------------|:--------------------------------------------------------------------------------
| **C w h**             | Should create a new canvas of width w and height h. **Currently the canvas**
| ``                    | **has a minimum size of 3 x 3 and maximum size of 150 x 50**.
| **L x1 y1 x2 y2**     | Should create a new line from (x1,y1) to (x2,y2). Currently only
| ``                    | horizontal or vertical lines are supported. Horizontal and vertical lines
| ``                    | will be drawn using the 'x' character. **Invalid coordinates will be ignored**
| **R x1 y1 x2 y2**     | Should create a new rectangle, **whose one corner is (x1,y1) and**
| ``                    | **opposite corner is (x2,y2)**. Horizontal and vertical lines will be drawn
| ``                    | using the 'x' character. **Invalid coordinates will be ignored**
| **B x y c**           | Should fill the entire area connected to (x,y) with "colour" c. The
| ``                    | behaviour of this is the same as that of the "bucket fill" tool in paint
| ``                    | programs. **Point (x, y) should be within the canvas area. An error message**
|``                     | **will be displayed if invalid coordinates are entered**.
| **Q**                 | Should quit the program.

<br>

---

## Build and run :
To build the program, open a console and go to the root folder then execute the following command :
````
mvn clean install
````
To run the program, execute the following command :
````
mvn exec:java
````
