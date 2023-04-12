import java.io.IOException;

// Java에서 Kotlin 예외 다루기
public class JavaThrow {

    // throws를 통해 throwIOException 메서드를 사용하는 측에 예외를 전파
    public void throwIOException() throws IOException {
        throw new IOException("체크드 익셉션인 IOException 발생");
    }

    public static void main(String[] args) {

        // Java에서는 try~catch로 감싸주는 게 필수
        JavaThrow javaThrow = new JavaThrow();
        try {
            javaThrow.throwIOException();;
        } catch (IOException e) {
            e.printStackTrace();
        }

        KotlinThrow kotlinThrow = new KotlinThrow();
        // kotlinThrow.throwIOException();
        try {
            kotlinThrow.throwIOException();
        } catch(IOException e) {

        }

    }
}