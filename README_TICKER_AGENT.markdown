# TickerAgent JADE Project

## Overview
This project implements a `TickerAgent` using the JADE (Java Agent DEvelopment Framework) to create a simple agent-based application. The agent runs a periodic task every 10 milliseconds to prompt the user for two numbers via console input and calculates their sum. The project demonstrates the use of JADE's `TickerBehaviour` to execute repetitive tasks in an agent-based environment.

## Features
- Utilizes JADE framework for agent creation and management.
- Implements `TickerBehaviour` to perform a task every 10 milliseconds.
- Accepts user input through the console to perform basic arithmetic (addition).
- Displays the agent's name and the result of the addition operation.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- JADE framework (available via Maven or downloadable from the [JADE website](http://jade.tilab.com/))
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a terminal with Java configured

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/TickerAgent.git
   ```
2. Ensure JADE is added to your project dependencies. For Maven, include:
   ```xml
   <dependency>
       <groupId>jade</groupId>
       <artifactId>jade</artifactId>
       <version>4.5.0</version>
   </dependency>
   ```
3. Compile and run the project using your IDE or via the terminal:
   ```bash
   java -cp .:jade.jar TickerAgent
   ```

## Usage
1. Run the JADE platform.
2. Start the `TickerAgent` class.
3. The agent will prompt for two numbers every 10 milliseconds.
4. Enter two integers to calculate their sum, which will be displayed in the console.

## Code Structure
- `TickerAgent.java`: The main agent class that extends JADE's `Agent` and implements `TickerBehaviour` to periodically request user input and calculate the sum of two numbers.

## Future Improvements
- Add support for additional arithmetic operations.
- Implement error handling for invalid user inputs.
- Extend to support multiple agents for distributed calculations.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.