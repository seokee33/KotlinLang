fun main(){
    exam1()
    exam2(11)
    println(exam3())
    println(exam4(1,2))

    //추가
    //vararg
    exam5(5,3,1,6,4,8)
    exam5(7,5,4,3,2,8, iNum = 1) // -> 이렇게 매개변수를 명시적으로 사용해야 한다.

    //IntArray
    val iArray = intArrayOf(9,7,5,3,1,2,4,6,8)
    exam6(iArray)

    //오버로딩
    println("오버로딩")
    println("1 * 2 * 3 = " + mul(1,2,3))
    println("1 * 2 * 5.0 = " + mul(1,2,5.0))
    println("1 * 2.0 * 10.0 = " + mul(1,2.0))
    // 이렇게 파라미터의 이름을 명시하여 사용이 가능하다
    println("1 * 2.0 * 20.0 = " + mul(1,2.0,c=20.0))
}

//함수의 기본적인 형태
//1. 매개변수, 반환값이 없는 경우
fun exam1(){
    println("exam1")
}

//2. 매개변수만 있는 경우
fun exam2(param:Int){
    println("exam2 : $param")
}
//3. 반환값만 있는 경우
fun exam3():Int{
    print("exam3 : ")
    return 3
}

//4. 매개변수와 반환값 모두 있는 경우
fun exam4(param1:Int,param2:Int):Int{
    print("exam4 : ")
    return param1+param2
}

//추가!!
fun exam5(vararg items:Int){
    print("exam5 : ")
    items.sort()
    println(items.contentToString())
}
//-> 유의 사항 매개변수를 여러개 받는 상황에 vararg를 사용시
fun exam5(vararg items:Int,iNum:Int){
    print("exam5 : ")
    items.sort()
    println("$iNum : "+items.contentToString())
}

fun exam6(items:IntArray){
    print("exam6 : ")
    items.sort()
    println(items.contentToString())
}

//오버로딩(overloading) -> 이름이 같은 함수를 여러개 정의 할수 있는 것
fun mul(a:Int,b:Int,c:Int) = a*b*c
fun mul(a:Int,b:Int,c:Double) = a*b*c
fun mul(a:Int,b:Double,c:Double = 10.0) = a*b*c
