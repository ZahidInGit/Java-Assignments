# Custom PRNG Algorithm Implementation

This project implements a custom Pseudo-Random Number Generator (PRNG) using Java. It features a standalone utility class that employs mathematical transformations to generate various numerical types including integers, doubles, and floats.

## Project Structure
- **CustomRandom.java**: A separate utility class containing overloaded static methods for random number generation.
- **Main.java**: The test application that accepts user input, populates arrays, and demonstrates method calls.
- **README.md**: Documentation of the mathematical formulas and implementation details.

## Mathematical Logic
The algorithm is based on a Linear Congruential Generator (LCG) enhanced by a specific transformation function:

1.  **Core State Update**:
    The seed is updated using: $X_{n+1} = (aX_n + c) \mod m$
    
2.  **Transformation Formula**:
    As per requirements, the result is processed through:
    $f(|x|, |n|) = x \cdot (\frac{n}{x} - 1)$
    where $x$ is the current seed and $n$ is the target bound.



## How to Use
1.  **Integration**: Access the generator using the class name: `CustomRandom.nextInt(bound)`.
2.  **Compile**: Run `javac CustomRandom.java Main.java` in your command line.
3.  **Run**: Execute `java Main`.
4.  **Input**: The program will prompt for 10 values to populate a `double[]` array, demonstrating the integration of user input with the custom algorithm.

## Features
- **Static Method Overloading**: Provides `nextInt()`, `nextFloat()`, and `nextDouble()` within a single class.
- **Custom Entropy**: Uses system clock and bitwise operations to ensure high variability.
- **Range Control**: Allows for bounded integer generation (e.g., 0 to $n$).
