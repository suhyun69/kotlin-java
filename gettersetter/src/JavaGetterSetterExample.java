import java.time.LocalDate;

// Java에서 Kotlin의 getter/setter 호출하기
public class JavaGetterSetterExample {

    public static void main(String[] args) {
        Student student = new Student();
        
        // 코틀린의 프로퍼티를 Java로 변환하면 getter/setter로만 접근이 가능한데
        // @JvmField를 사용하면 
        // Java Property 형태로 접근 가능하다
        
        /*
        // @JvmField를 붙이면 getter/setter 적용 안 됨
        // setter를 통해 값 변경 가능
        student.setName("스티브로저스")
         */

        // @JvmField
        student.name = "스티브로저스"; 
        student.setBirthDate(LocalDate.of(1918, 7, 4));

        // System.out.println(student.getName);
        System.out.println(student.name);
        System.out.println(student.getBirthDate());

        // 불변 변수 age 접근하기
        // setter 만들어주지 않음 -> getter만 생성
        // student.setAge(10); // 컴파일 에러
        // kotlin val 프로퍼티는 java에서 사용할 때 setter 사용할 수 없다
        System.out.println(student.getAge());

        student.changeGrade("A");
        System.out.println(student.getGrade());
    }
}