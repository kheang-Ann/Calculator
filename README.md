# Calculator Application

This project is a simple calculator application built using Java Swing. It provides a graphical user interface (GUI) for performing basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Project Structure

```
CalculatorApp
├── src
│   ├── Calculator.java
│   └── utils
│       └── MathUtils.java
├── .gitignore
└── README.md
```

## Files

- **src/Calculator.java**: Contains the main class `Calculator` which extends `JFrame`. It initializes the GUI components, including a text area for displaying calculations. The constructor sets up the layout and visibility of the window.

- **src/utils/MathUtils.java**: Contains a utility class `MathUtils` which provides static methods for performing basic arithmetic operations.

- **.gitignore**: Specifies files and directories that should be ignored by Git, such as compiled class files and IDE-specific files.

## How to Build and Run

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the `src` directory in your terminal.
4. Compile the Java files using the command:
   ```
   javac Calculator.java utils/MathUtils.java
   ```
5. Run the application using the command:
   ```
   java Calculator
   ```

## Dependencies

This project does not have any external dependencies beyond the standard Java libraries.