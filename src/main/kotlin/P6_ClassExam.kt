fun main(){
    //기본 클래스 생성
    val p1 = Person1() //Person1 인스턴스 생성
    p1.name = "Park"
    p1.age = 50
    p1.printInfo()

    //생성자 클래스 생성
    val p2 = Person2("Kim",26) //Person2 인스턴스 생성
    println("${p2.name} : ${p2.age}")

    val p3 = Person3("Lee","991212")
    println(p3.toString())
}


//클래스 정의
//기본 클래스 정의
class Person1(){
    var name: String = ""
    var age:Int = 0

    fun printInfo(){
        println("$name : $age")
    }
}

//생성자
open class Person2(open val name:String, open var age: Int)

class Person3(val name:String, var birth:String){
    var age:Int = 0
    var birthday :String =""

    //초기화 블록을 사용하여 초기화를 할수 있다.
    init {
        if(String.format("19%s%s",birth[0],birth[1]).toInt()<2000){
            age = 2023-String.format("19%s%s",birth[0],birth[1]).toInt()
        }else{
            age = 2023-String.format("19%s%s",birth[0],birth[1]).toInt()
        }
        birthday = String.format("%s%s%s%s",birth[2],birth[3],birth[4],birth[5])
    }

    override fun toString(): String {
        return "$name : $age : $birthday"
    }
}