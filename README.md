# BEDMAS.kt

**BEDMAS.kt** is a simple Kotlin utility for evaluating mathematical expressions. It supports the full order of operations (BEDMAS: Brackets, Exponents, Division, Multiplication, Addition, Subtraction) and lets you easily evaluate math expressions in a String format.

## Features
- Evaluate math expressions as Strings.
- Supports BEDMAS operations (Brackets, Exponents, Division, Multiplication, Addition, Subtraction).
- Works with simple and complex expressions.
- Supports exponential calculations.

## Upcoming Features
- **Brackets Support**: Currently, the evaluation of expressions with brackets is not implemented. This feature is planned for a future update.

## Usage

1. Copy the `BEDMAS.kt` file into your project.
2. Change the package name as needed.
3. Start calculating math expressions with the built-in functions.

### Example:

```kotlin
val simpleExpression = "6/3"
println(simpleExpression.removeSpace().extractExpression().execute()) // Output: 2.0

val complexExpression = "12+53*7-21/43"
println(complexExpression.removeSpace().extractExpression().execute()) // Output: 376.0

val exponentialExpression = "2+5^4*9/9"
println(exponentialExpression.removeSpace().extractExpression().execute()) //Output: 157.0
```

## How it Works

The `BEDMAS.kt` file provides simple functions to evaluate mathematical expressions while respecting the order of operations (BEDMAS: Brackets, Exponents, Division, Multiplication, Addition, Subtraction).

### Functions

1. **`removeSpace()`**: This function removes any spaces from the expression string, ensuring the expression is clean for evaluation.
   
2. **`extractExpression()`**: Prepares the cleaned-up expression for evaluation by parsing it.

3. **`execute()`**: Evaluates the parsed expression according to the BEDMAS order of operations and returns the result.

### Example Walkthrough

1. The **`removeSpace()`** function first removes any spaces from the expression, ensuring the input is consistent.
   
2. The **`extractExpression()`** function processes the cleaned-up expression into a format that can be evaluated.
   
3. Finally, the **`execute()`** function runs the evaluation based on the BEDMAS rules and outputs the result.

For example, given the expression `"2+5^4*9/9"`, it evaluates the exponential part first, then multiplication and division, and finally addition, returning the correct result.

### Supported Operations
- **Brackets** (To be added in future releases)
- **Exponents**
- **Division**
- **Multiplication**
- **Addition**
- **Subtraction**


## License

This project is licensed under the [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).

You may use, modify, and distribute this file in your own projects, provided that you comply with the terms of the Apache License 2.0. This file is provided "as is," without any warranties or conditions of any kind.
