fun main(args: Array<String>) {

    val s1  = "Hey there!"
    val s2 = "Hey there!"
    var result: String

    println("Length of s1 string is ${s1.length}.")

    result = if (s1.compareTo(s2) == 0) "equal" else "not equal"
    println("Strings s1 and s2 are $result.")

    // s1.get(2) is equivalent to s1[2]
    println("Third character is ${s1.get(2)}.")

    result = s1.plus(" How are you?") // result = s1 + " How are you?"
    println("result = $result")

    println("Substring is \"${s1.subSequence(4, 7)}\"")

}