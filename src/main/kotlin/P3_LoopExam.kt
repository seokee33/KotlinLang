fun main() {
    examLoop1()
    examLoop2()
}

fun examLoop1(){
    println("Exam1")
    var sum :Int = 0
    var input :Int = 0

    // while 문은 조건식 -> 실행문 으로 실행이 된다.
    // 아래 반복문을 보면 input이 이미 0 이기 때문에 실행문이 실행되지 않고 반복문을 빠져나와버린다.
    println("while")
    while(input != 0){
        input = readLine()!!.toInt()
        sum += input
    }
    println("while - Sum : $sum")
    input = 0
    sum = 0

    // do-while 문은 실행문 -> 조건문 으로 실행이 된다.
    // 아래 반복문은 먼저 실행문이 작동해서 입력값을 받는것을 볼수있습니다.
    println("do-while")
    do{
        input = readLine()!!.toInt()
        sum+=input
    }while(input != 0)
    println("while - Sum : $sum")


}


fun examLoop2(){
    println("Exam2")

    //1 2 3 4 5 6 7 8 9 출력
    val iArray1 = arrayOf(1,2,3,4,5,6,7,8,9)
    for(a:Int in iArray1){
        print("$a ")
    }
    println()

    //1부터 10까지
    //1 2 3 4 5 6 7 8 9 10
    for(i in IntRange(1, 10)){
        print(i)
        print(" ")
    }
    println()

    //1 부터 10까지
    //1 2 3 4 5 6 7 8 9 출력
    for(i in 1 until 10) {
        print(i)
        print(" ")
    }
    println()

    //1부터 10까지 +2씩
    //1 3 5 7 9 출력
    for(i in 1..10 step(2)) {
        print(i)
        print(" ")
    }
    println()

    //10에서 1까지
    //10 9 8 7 6 5 4 3 2 1 출력
    for(i in 10 downTo 1) {
        print(i)
        print(" ")
    }
    println()

    //10에서 2까지 -2씩
    //10 8 6 4 2 출력
    for(i in 10 downTo 1 step(2)) {
        print(i)
        print(" ")
    }
    println()
}