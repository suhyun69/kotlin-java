import java.time.LocalDate

class Student {

    @JvmField
    var name: String? = null

    var birthDate: LocalDate? = null

    val age: Int = 10

    var grade: String? = null
        private set // 접근제어자. 이 grade에 대한 값을 변환하는 건 Student 클래스 내부에서만 가능

    // 별도의 외부 접근 함수를 만들거나, 내부에서 변경하거나.
    // setter와 같은 역할을 하는 함수
    fun changeGrade(grade:String) {
        this.grade = grade
    }
}