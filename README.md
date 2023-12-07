# TeachMeSkills_C26_Lesson_11_HW

Write a program with the following functionality:
Pass a string as input (we will assume that this is a certain standard document number in a given format).
The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is any number, and y is a letter of the Latin alphabet (can be large or small).
- Display the first two blocks of 4 digits on the screen in one line.
- Display the document number, but replace blocks of three letters with *** (each letter will be replaced with *).
- Display only one letter from the document number in the format yyy/yyy/y/y in lowercase.
- Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in uppercase (implemented using the StringBuilder class).
- Check whether the document number contains the sequence "abc" and whether the message contains it or not (moreover, abc and ABC are considered the same sequence).
- Check whether the document number begins with the sequence 555.
- Check whether the document number ends with the sequence 1a2b.
Implement all these methods in a separate class in static methods, each task in a separate method.
Methods for input (input parameter) will accept a string entered as input to the program.
Given a string of arbitrary length with arbitrary words.
Find the shortest word in a line and display it on the screen.
Find the longest word in a line and display it on the screen.
If there are several such words, then print the last one.
An arbitrary string is given.
Print a new line to the console, which duplicates each letter from
starting line.
For example, "Hello" -> "HHeelllloo".
