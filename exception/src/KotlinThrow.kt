import java.io.IOException

class KotlinThrow {

    // throws 추가
    @Throws(IOException::class)
    fun throwIOException() {
        throw IOException("체크드 익셉션인 IOException 발생")
        // IOException만 예외 전파
        // throws가 없다
    }

}

fun main() {
    val javaThrow = JavaThrow()
    javaThrow.throwIOException() // kotrlin에서 호출할 때는 try~catch 강제하지 않음

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}