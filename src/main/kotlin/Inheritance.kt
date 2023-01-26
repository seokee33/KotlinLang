fun main(){
    val s1 = Student("kim",22,123456)

    println(s1.toString())

    s1.printPersonInfo() //부모클래스(Person)의 함수를 사용할 수 있다.


    val s2 = Student2("lee",24,222444)
    println(s2.toString())

    s2.printPersonInfo()
}

//부모클래스로 사용을 하려면 class 앞에 open을 붙여준다.
open class Person(val name:String, val age:Int){
    fun printPersonInfo(){
        println("Person Info => $name : $age")
    }
}

class Student(name:String,age:Int,val studentID:Int) : Person(name,age){
    override fun toString(): String {
        return "Student Info => $name : $age : $studentID"
    }
}


// constructor 사용예시2
open class Person4(open val name:String, open val age:Int){
    fun printPersonInfo(){
        println("Person Info => $name : $age")
    }
}

class Student2(override val name:String, override val age:Int) : Person4(name,age){
    var studentID:Int = 0
    constructor(name:String,age:Int, studentID: Int): this(name,age){
        this.studentID = studentID
    }
    override fun toString(): String {
        return "Student Info => $name : $age : $studentID"
    }
}
