fun main(){
    max1(50,30)
    max2(40,20)

    checkScore(75)
    checkScore(85)
    checkScore(95)

    println(week("월"))
}

fun max1(a: Int, b: Int) {
    var result:Int
    if (a > b){
        result = a
    } else{
        result = b
    }
    println(result)
}

fun max2(a: Int, b: Int) {
    val result = if (a > b) a else b
    println(result)
}


// 성적 확인
fun checkScore(score: Int) {
    when (score) {
        in 90..100 -> {
            println("A")
        }
        in 80..89 -> {
            println("B")
        }
        in 70..79 -> {
            println("C")
        }
        else ->{
            println("D")
        }
    }
}

// 요일
fun week(day: String) :Int{
    when (day) {
        "월"-> return 1
        "화"->return 2
        "수"->return 3
        "목"->return 4
        "금"->return 5
        "토"->return 6
        "일"->return 7
    }
    return 0
}