
Tic-Tac-Toe is a simple game but requires a fair amount of logic, loops, and data structures
to complete the game. I thought this would be a good starting place to learn about Kotlin.
The game is played on a 3x3 board. The board is made up of three arrays. As the player makes 
moves the arrays are updated with either X or O in the corresponding index position. The game
continues until someone has won, or the game is a tie. The player will then be asked if they 
would like to play again. 

I would really like to learn how to make an Android App. I thought this would be a great game
to start with. It is relatively simple yet complex enough to learn about the Kotlin language.


[Software Demo Video](http://youtube.link.goes.here)

# Development Environment

I used the following tools to develop this software:
* IntelliJ IDEA
* JDK 16

Important note: I had a hard time getting the environment to work correctly with JDK 16. I 
attempted to print "Hello World", and the program would not compile. I got a series of language
level errors that were rather confusing. Turns out when I installed IntelliJ IDEA the version 
Kotlinc-jvm 1.4 was installed. Also, it turns out that version 1.4 is incompatible with the 
JDK 16 compiler which is why I was getting so many compile errors. I updated to the most recent
version which was 1.5 and sure enough I no longer had any compile errors.

I used the programming language Kotlin to develop this game. I used the math library as well
as the scanner library. In Java and Kotlin getting input from the user requires the use of a scanner.
The math library is used to determine if there is a tie bases on the number of moves. If the number of
moves reaches 8 then the game is a tie. 

# Useful Websites

{Make a list of websites that you found helpful in this project}
* [Kotlin Docs](https://kotlinlang.org/docs/home.html)
* [Techiedelight](https://www.techiedelight.com/return-multiple-values-kotlin/)

# Future Work

Features I would like to add in the future:
* Create graphical user interface, so the board is appealing.
* Convert this into an Android app.
* Add a scoring system. 
