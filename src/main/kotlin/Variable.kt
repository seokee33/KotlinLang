/**
- 가변 변수와 불변 변수

가변 변수 : var
불변 변수는 변수를 한번 초기화를 하면 다른 값들을 대입할 수 없습니다.

불변 변수 : val
불변 변수는 변수를 한번 초기화를 하면 다른 값들을 대입할 수 없습니다.

c언어의 const, 자바의 final과 같은 의미 입니다.



- 타입 추론 : 컴파일러가 코드의 문맥에서 데이터 타입을 도출해주는 기능입니다.

아래 코드에서 var iNum3 = 123과 val dNum3 = 123.4와 같은 경우입니다.
*/
fun main(){
    // var : 일반적으로 통용되는 변수 언제든지 읽기 쓰기가 가능함
    var iNum1 : Int = 123
    var iNum2 = 123.toInt()
    var iNum3 = 123

    //데이터.javaClass.name을 하면 데이터 타입을 확인 할 수 있습니다.
    println("iNum1의 자료형"+iNum1.javaClass.name)
    println("iNum2의 자료형"+iNum2.javaClass.name)
    println("iNum3의 자료형"+iNum3.javaClass.name)

    // val : 선언시에만 초기화 가능 중간에 값을 변경할 수 없음
    val dNum1 : Double = 123.4
    val dNum2 = 123.4.toDouble()
    val dNum3 = 123.4

    //dNum2 = 456.7 -> val로 선언하고 다른 값으로 대입하려고 하면 에러가 발생

    println("dNum1의 자료형"+dNum1.javaClass.name)
    println("dNum2의 자료형"+dNum2.javaClass.name)
    println("dNum3의 자료형"+dNum3.javaClass.name)


}