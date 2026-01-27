# Elementary Math Puzzle Application

This is a Java-based math puzzle designed for elementary school students. It reads arithmetic questions from an external file, evaluates user answers, and logs scores to a separate file.

## Project Structure
- **Main.java**: The entry point of the application.
- **MathPuzzle.java**: Contains the logic for the game, file handling, and scoring.
- **questions.txt**: Input file containing math problems.
- **scores.txt**: Output file where student results are saved.

## How to Use
1. **Prepare Questions**: Ensure `questions.txt` exists with the format `Equation=Result` (e.g., `5+5=10`).
2. **Compile**: Run `javac Main.java MathPuzzle.java` in your terminal.
3. **Run**: Execute the command `java Main`.
4. **Input**: Enter your name, choose a difficulty, and solve the math problems that appear.

## Features
- Dynamic question loading from text files.
- Persistent score tracking (appends to `scores.txt`).
- Simple console-based user interface.
