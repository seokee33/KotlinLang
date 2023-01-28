fun main(){
    val a = "String"
    val b = 1
    var result :Any

    println("타입비교/확인")
    println(typeCheck(1))
    println(typeCheck("String"))

    ////////////////////////////////////////////////////////
    println("타입 Cast")

    result = (a as? String) ?: "실패"
    println("Type Cast - a : $result")

    result = (b as? String) ?: "실패"
    println("Type Cast - b : $result")

    println("타입 SmartCast")
    println(smartCast(10))
    println(smartCast("String 일까?"))
    println(smartCast(true))
}

fun typeCheck(a: Any): String {
    val result = when (a) {
        is String -> {
            "String"
        }
        is Int -> {
            "Int"
        }
        is Boolean ->{
            "Boolean"
        }
        else -> {
            "else"
        }
    }
    return result
}

fun smartCast(a : Any): Int {
    return if(a is String) {
        a.length
    } else if(a is Int) {
        a.dec()
    } else {
        -1
    }
}