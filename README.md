# Simple calculator

[![Build Status](https://travis-ci.org/sideeffffect/testoutsource.svg)](https://travis-ci.org/sideeffffect/testoutsource)

This is a simple Java program that performs simple arithmetic calculations.
The instructions for calculation are read from stdin and the result is printed to stdout.


## Classes overview

There are 3 most important classes:

 * `cz.sideeffect.testoutsource.Calculator` represents the calculator.

 * `cz.sideeffect.testoutsource.instructions.Instruction`
   represents instructions for the calculator,
   it is an abstract class with concrete subclasses for each instruction.

 * `cz.sideeffect.testoutsource.Main` is used for executing the program from commandline.


## Usage

This project is managed by [gradle](https://gradle.org/).


### Running

You can run the program via gradle.
The instructions are read from `stdin`.
Result is written to `stdout`.

```
gradle -q run < src/test/resources/test1
```


### Tests

The project is automatically tested at [Travis-CI](https://travis-ci.org/sideeffffect/testoutsource).
You can run tests yourself via gradle:

```
gradle test
```


### Documentation

The documentation is located in `build/docs/javadoc`.
It is build via gradle:

```
gradle javadoc
```


## TODO

 * reading from file was underspecified, thus stdin is used instead
