# Ceiling Fan Simulation

## Overview

This project simulates a ceiling fan with two classes: `CeilingFan` and `Main`. The fan has adjustable speed and direction, and it does not operate on December 25th. 

## Classes

### `CeilingFan`

The `CeilingFan` class represents a ceiling fan with the following features:
- **Speed Control**: The fan has four speed settings (0 to 3). Pulling the speed cord increases the speed by one until it resets to 0 after reaching the maximum speed.
- **Direction Control**: The fan can rotate in clockwise and anti-clockwise directions. Pulling the direction cord toggles the rotation direction.
- **Off Day**: The fan does not operate on December 25th. Any attempts to change speed or direction on this day will have no effect.

### `Main`

The `Main` class contains the `main` method and provides an interactive console interface to control the ceiling fan. It provides the user options to pull the speed and direction cords through `Scanner`, hence the user can interact through the console interface:
- Pull the speed cord to change the fan's speed.
- Pull the direction cord to change the fan's rotation direction.
- Quit the application.

### `Space and time Complexity`

- **Time Complexity**: O(n) where n is the number of user interactions.
- **Space Complexity**: O(1) since it uses a fixed amount of space for the variables and objects.

1. **Compile the Code**:
    javac src/*.java -d bin
   

2. **Run the Application**:
    java -cp bin Main

## Usage

1. **Start the Application**:
   - The current date will be displayed, and a brief instruction on how to use the fan will be provided.

2. **Control the Fan**:
   - You will be prompted to enter an option to control the fan:
     - Enter `1` to pull the speed cord.
     - Enter `2` to pull the direction cord.
     - Enter `3` to quit the application.

3. **Fan Behavior**:
   - The speed and direction of the fan will be displayed after each action.
   - If the date is December 25th, the fan will be off, and pulling the cords will have no effect.

### Example

The date today is 2024-05-16

This is a ceiling fan. To turn the ceiling fan on, you need to pull the speed cord. Each time you pull speed cord, the speed of the fan will increase. The fan has three speeds, the fourth time you pull the speed cord, the speed of the fan will reset to 0.
You can also change the direction of the fan by pulling the direction cord. The fan does not operate on December 25.

The following are the options to control the ceiling fan
Please enter 1 to pull the speed cord.
Please enter 2 to pull the direction cord.
Please enter 3 to quit.

1
Current speed: 1, Direction: clockwise Direction

2
Current speed: 1, Direction: anti-clockwise direction

3
Application terminated.