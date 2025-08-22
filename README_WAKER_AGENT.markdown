# Waker Agent Multiplication

This repository contains a Java implementation of a simple agent-based system using the JADE (Java Agent DEvelopment Framework). The system features a single agent, `WakerAgent`, that utilizes a `WakerBehaviour` to perform a multiplication operation on two user-provided integers after a specified delay. The agent prompts the user for input, computes the product, and then terminates itself.

## Features

- **WakerAgent**: A JADE agent that activates after a 5-second delay to perform a task.
- **WakerBehaviour**: Executes a multiplication operation on two integers provided by the user via console input.
- **User Interaction**: Prompts the user to input two numbers and displays their product.
- **Agent Lifecycle Management**: The agent automatically terminates after completing the multiplication task.

## Requirements

- Java 8 or higher
- JADE framework (`jade.jar` must be included in the classpath)
- A terminal or console for user input

## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/waker-agent.git
   ```
2. Ensure the JADE framework is installed and configured:
   - Download JADE from http://jade.tilab.com/
   - Add `jade.jar` to your project's classpath.
3. Compile and run the Java program:

   ```bash
   javac -cp jade.jar WakerAgent.java
   java -cp .:jade.jar WakerAgent
   ```

   (On Windows, use `;` instead of `:` for the classpath separator.)
4. After a 5-second delay, the agent will prompt for two integers. Enter the numbers, and the agent will display their product before terminating.

## How It Works

- **WakerAgent**: Initializes upon startup and adds a `My_Waker_Behaviour` with a 5-second timeout.
- **My_Waker_Behaviour**: A custom `WakerBehaviour` that triggers after the timeout. It:
  - Prompts the user to input two integers via the console.
  - Computes and displays their product.
  - Terminates the agent using `doDelete()`.
- **JADE Framework**: Manages the agent's lifecycle and behavior execution.

## Limitations

- The program requires manual input via the console, making it interactive but not fully autonomous.
- The agent terminates after a single multiplication operation.
- No error handling for invalid user inputs (e.g., non-integer values).

## License

MIT License