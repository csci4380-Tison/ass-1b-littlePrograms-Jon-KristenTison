## Setup dependencies
Make sure on your machine, you have;
- git installed
- a working unix shell (like git bash. If not there install git and use its "git bash")
- working JDK installed (with JAVA_HOME env variable added, and PATH env variable prefixed with %JAVA_HOME%/bin)

## The Process of the Project
- Each program except 2.18 imports and creates a Scanner object input.
- Ex.2.6
	- User enters one number at a time, and each is stored in one of three int variables.
	- the program multiplies the three numbers and stores the product in the result variable
	- Sysout prints out the result as part of a message
	
- Ex.2.15
	- User enters one number at a time, and each is stored in one of two int variables.
	- The program adds x and y and stores in result
	- sysout prints the result in a message
	- this process is repeated with subtraction, multiplication and division.
	- With division, an extra step is taken to determine the remainder of the division. Both the quotient and remainder are printed in a message
	
- Ex.2.16
	- User inputs numbers one at a time. Each is stored in an int variable
	- The program compares the numbers, and prints an appropriate message depending on if which is larger or if they are equal.
	
- Ex.2.17
	- User inputs 3 number that are stored in three int variables
	- The program stores their sum in result and prints it in a message
	- result is then divided by three so the average can be printed
	- The program first checks if the three variables have the same value. If they do, it skips comparisons and prints a unique message
	- If even one of the variables has a different value, the system compares x to y and z to determine which is smallest. The smallest is stored in small and printed.
	- The process is repeated but to check for the largest of the three.
	
- Ex.2.18
	- A string variable shape is made. 
	- This variable is made up of multiple strings with different sequences of *. At the end of each is a \n to let the program know to put the next sequence on a new line.
	- sysout prints shape, showing that the sequences create four shapes in a row when given new lines at the designated points.# ass-1b-littlePrograms-Jon-KristenTison
