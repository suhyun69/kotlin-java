class HelloClass {

    companion object {

        // Java와 동시 운용 시 추가
        // Companion 및 Instance 객체 추가할 필요 없음
        @JvmStatic
        fun hello() = "hello!"

    }
}

// Singleton
object HiObject {

    @JvmStatic
    fun hi() = "hi!"
}

fun main() {
    // 클래스 지시자를 사용해서 함수를 호출할 수 있다
    // Java static과 유사
    val hello = HelloClass.hello()
    println(hello)

    val hi = HiObject.hi()
    println(hi)


}