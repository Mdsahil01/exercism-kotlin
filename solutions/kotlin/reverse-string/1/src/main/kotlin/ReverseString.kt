fun reverse(input: String): String {
    var result = ""

    for (i in input.length - 1 downTo 0) {
        result += input[i]
    }

    return result
}

