# ASCII-Text-Signature
проект из курса обучения JetBrains - создание визитки из персональных данных

Stage 4/4: ASCII New Roman
Description
Let's increase the text size and use another font, which looks very similar to the existing font called "Times New Roman".

The first four lowercase characters of this Roman font are shown below in this new font:

           .o8                       .o8
          "888                      "888
 .oooo.    888oooo.   .ooooo.   .oooo888
`P  )88b   d88' `88b d88' `"Y8 d88' `888
 .oP"888   888   888 888       888   888
d8(  888   888   888 888   .o8 888   888
`Y888""8o  `Y8bod8P' `Y8bod8P' `Y8bod88P"
You can download this font, along with the smaller and less fancy font from the previous example (the Medium font). The file contains information about the font size and about all lowercase and uppercase letters.

In this stage, you need to create a program that generates a name tag using the new font.

Objectives
Your program should generate a person's name tag using the Roman font. Also, it should print the personal status using the Medium font.

Both fonts have a special description included in their .txt file. The first line of the file contains two numbers. The first number is the font size, which indicates how many lines are needed to print one character using this font. For example, the Medium font, which you used in the previous stage, needs 3 lines, and the Roman font needs 10. The second number is the number of characters described in the file. The file for each font contains information about 52 characters: 26 uppercase and 26 lowercase letters.

The next lines contain information about each character, one after another. The character information includes the name of the character, the width of the character, and in the next lines, the way the character is represented in ASCII symbols.

Note that these fonts already contain a column of spaces after each font character, so you don't need to add any.

What you need to do :

download the Roman and Medium fonts. The Medium font has been used in the previous stage;

read the personal name and status from standard input like in the previous stage;

output the name tag with the status in a frame; find the necessary characters in the .txt files of the two provided fonts.

to create the borders of the frame, use ‘88’.

The personal status should be centered horizontally. If the status is longer than the full name, then the full name should be centered.

When the status is shorter than the full name, use 2 columns of whitespaces between the first letter of the name and left border and 3 columns between the last letter of the full name and the right border, not including the indents in the font (and vice versa).

There are three blank lines in height between the personal name and the personal status.

Use 6 spaces between the words in the Medium font is 6 symbols in the Medium font (including indents; every letter already has a one space after it). In the Roman font, your program should insert 10 spaces between the words.

Examples
Example 1:

Enter name and surname: Ian One
Enter person's status: VIP
888888888888888888888888888888888888888888888888888888888888888888888888888888888
88  ooooo                                   .oooooo.                           88
88  `888'                                  d8P'  `Y8b                          88
88   888   .oooo.   ooo. .oo.             888      888 ooo. .oo.    .ooooo.    88
88   888  `P  )88b  `888P"Y88b            888      888 `888P"Y88b  d88' `88b   88
88   888   .oP"888   888   888            888      888  888   888  888ooo888   88
88   888  d8(  888   888   888            `88b    d88'  888   888  888    .o   88
88  o888o `Y888""8o o888o o888o            `Y8bood8P'  o888o o888o `Y8bod8P'   88
88                                                                             88
88                                                                             88
88                                                                             88
88                                _  _ _ ___                                   88
88                                |  | | |__]                                  88
88                                 \/  | |                                     88
888888888888888888888888888888888888888888888888888888888888888888888888888888888
Example 2:

Enter name and surname: A b
Enter person's status: long participant
88888888888888888888888888888888888888888888888888888888888888888888888888888888
88                         .o.                  .o8                           88
88                        .888.                "888                           88
88                       .8"888.                888oooo.                      88
88                      .8' `888.               d88' `88b                     88
88                     .88ooo8888.              888   888                     88
88                    .8'     `888.             888   888                     88
88                   o88o     o8888o            `Y8bod8P'                     88
88                                                                            88
88                                                                            88
88                                                                            88
88  _    ____ _  _ ____      ___  ____ ____ ___ _ ____ _ ___  ____ _  _ ___   88
88  |    |  | |\ | | __      |__] |__| |__/  |  | |    | |__] |__| |\ |  |    88
88  |___ |__| | \| |__]      |    |  | |  \  |  | |___ | |    |  | | \|  |    88
88888888888888888888888888888888888888888888888888888888888888888888888888888888
