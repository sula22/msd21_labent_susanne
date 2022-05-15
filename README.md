# Bash-Script _Simple Calculator_
`simple_calculator.sh`


```
#!/bin/bash
# A simple calculator
# simple_calculator.sh

read -p "Enter two values: " VALUE_1 VALUE_2
read -p "Enter operand ( +, -, /, *): " OPERAND
((result = $VALUE_1 $OPERAND $VALUE_2))
printf "Output: $VALUE_1 $OPERAND $VALUE_2 = $result"
echo
exit 0
```

## Description
This Bash-Script reads in two values and a operand you entered in your command-line (Bourne-Again-Shell).
You can enter any integers you want. You will get the result of the operation right in your command-line.

## Installation
This script can be started in the Bourne-Again-Shell. As Windows-User be sure you have installed bash. If not, learn
[here](https://en.wikipedia.org/wiki/Bash_(Unix_shell)) more about it. If you use MacOS or Linux you don't have to do
anything - you just have to start the terminal.


## How it works
Open bash and enter the following code-sequence to start the programm:
```
bash simple_calculator.sh
```
If it worked, the following words will appear:
```
Enter two values:
```
Now you have to enter your two values you want to calculate. Be sure to enter them with a empty line between them.
For example you can enter: ` 2 10 `

In the next step you have enter what kind of calculation you want the programm to do.
Use `+, -, /, *` to add, subtract, divide, or multiply the entered values.
For example:
```
Enter operand ( +, -, /, * ):
```
In the last step the programm runs and calculates your two values. You will get (in case you entered the values `2 10` and `+`)
the following output:
```
Output: 2 + 10 = 12
```

## License

This is free software, you can use and addapt it in every way you want to.

## Link to exercise file

- [Link](\exercise1.md) to exercise1
- [Link](\exercise2.md) to exercise2
- [Link](\exercise3.md) to exercise3