fun main(){
    var name : String ="Kim"
    // name = null -> Error : Kotlin에서 일반적으로 Null 값을 가질수 없다.
    //but,
    var nameNull : String? //참조 타입 '?'를 붙여주면 Null 값을 가질수 있다.
    nameNull = null

    //Null 체크
    //Java나 다른 언어를 사용할때 Null 체크를 할때
    //if문을 사용하여 확인을 하지만
    val result = if(nameNull == null){
        "if - Null"
    }else{
        nameNull
    }
    println(result)

    //코틀린에서는 아래와 같이 확인이 가능하다.
    val result2 = nameNull?:"Non if - Null"
    println(result2)

    // 응용
    // val size = nameNull.length -> Error : nameNull이 현재 Null값을 들고 있을수도 있다고 판단하여 Error 가 발생하는데
    val size = nameNull?.length //-> 이렇게 ?를 참조 해주면 Error가 사라지게 된다. : 값이 Null 이면 length 함수를 실행하지 않음
    println(size)

}