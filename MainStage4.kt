package signature

import java.io.File
import java.lang.Integer.max

const val frame = "8"

fun main() {

    val fontRomanLines =
        File("/Users/e.buravleva/Projects/ASCII Text Signature/ASCII Text Signature/task/src/signature/roman.txt")
            .readLines()
    val fontMediumLines =
        File("/Users/e.buravleva/Projects/ASCII Text Signature/ASCII Text Signature/task/src/signature/medium.txt")
            .readLines()

    val romanGap = 10
    val mediumGap = 5

    print("Enter name and surname: ")
    val name = readln()
    print("Enter person's status: ")
    val status = readln()

    val nameLength = getStringLength(fontRomanLines, name, romanGap)
    val statusLength = getStringLength(fontMediumLines, status, mediumGap)
    val signatureLength = max(nameLength, statusLength)
    val cardLength = signatureLength + 8

    repeat(cardLength) { print(frame) }
    println()
    printString(name, nameLength, fontRomanLines, romanGap, signatureLength)
    printString(status, statusLength, fontMediumLines, mediumGap, signatureLength)
    repeat(cardLength) { print(frame) }
}

fun printString(string: String, stringLength: Int, fontList: List<String>, gapSize: Int, maxLength: Int) {
    val letterHigh: Int = fontList.first().split(" ").first().toInt()
    for (str in 0 until letterHigh) {
        print("$frame$frame  ")
        repeat((maxLength - stringLength) / 2) { print(" ") }
        for (l in string) {
            if (l != ' ') {
                print(getLetterString(fontList, l.toString(), str))
            } else {
                repeat(gapSize) { print(" ") }
            }
        }
        repeat((maxLength - stringLength) - (maxLength - stringLength) / 2) { print(" ") }
        println("  $frame$frame")
    }
}

fun getLetterString(fontList: List<String>, letter: String, stringNumber: Int): String {
    val letterHigh: Int = fontList.first().split(" ").first().toInt()
    var letterFragment = ""
    for (str in 1 until fontList.size step letterHigh + 1) {
        if (letter == fontList[str].first().toString()) {
            letterFragment = fontList[str + 1 + stringNumber]
        }
    }
    return letterFragment
}

fun getStringLength(fontList: List<String>, string: String, gapSize: Int): Int {
    val letterHigh: Int = fontList.first().split(" ").first().toInt()
    var length = 0
    for (letter in string) {
        if (letter != ' ') {
            for (str in 1 until fontList.size step letterHigh + 1) {
                if (letter == fontList[str].first()) {
                    length += fontList[str].split(" ").last().toInt()
                }
            }
        } else {
            length += gapSize
        }
    }
    return length
}
