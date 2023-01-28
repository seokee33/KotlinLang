fun main(){
    /**
     * Kotlin에서 List는 list 와 mutalbelist가 있다.
     * list - listOf() -> 읽기 전용
     * mutablelist - mutableListOf() -> 읽기/쓰기 가능
     *
     * add() - add(?) : ?를 추가
     *       - add(n, ?) : n번째 칸에 ?를 추가
     * */
    val list = mutableListOf(1,2,3,4,5)
    list.add(6)
    list.addAll(listOf(7,8,9))

    println(list.joinToString(","))

    /**
     * map은 map 과 mutableMapOf가 있다.
     * map은 읽기 전용
     * mutableMap은 읽기/쓰기 가능
     * */
    val map = mapOf((1 to "바나나"),(2 to "사과"), (3 to "포도"))
    // map.put -> 불가능
    println(map)
    val mutableMap = mutableMapOf((1 to "바나나"),(2 to "사과"), (3 to "포도"))

    //추가할때
    // put(key,value) 또는
    // mutalbeMap[key] = value 이렇게 가능하다.
    mutableMap.put(4,"수박")
    mutableMap[5] = "참외"
    println(mutableMap)

}