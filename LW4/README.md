# LW4 - Defining Classes

This project contains solutions for Lab Worksheet 4, organized by question package.

## Package Structure

- `src/Q1` - `Temperature` class and Celsius to Fahrenheit program
- `src/Q2` - Fahrenheit to Celsius program using `Temperature#setFahrenheit`
- `src/Q3` - `Circle` class and circular region area program
- `src/Q4` - `Owner` and modified `Bicycle` class
- `src/Q5` - University course registration classes (`Course`, `Lecturer`, `Student`)

## How to Run (IntelliJ)

1. Open the project.
2. Open the `Main` file inside the package you want to run (`Q1.Main`, `Q2.Main`, etc.).
3. Click the run icon next to `main`.

## How to Compile and Run (Command Prompt)

```bat
cd /d d:\DEV\Java\CT2022053\LW4
if not exist out mkdir out
javac -d out src\Main.java src\Q1\*.java src\Q2\*.java src\Q3\*.java src\Q4\*.java src\Q5\*.java
java -cp out Q1.Main
java -cp out Q2.Main
java -cp out Q3.Main
java -cp out Q4.Main
java -cp out Q5.Main
```

Replace the last command with the question package you need to run.
