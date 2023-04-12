public class ExtensionExample {

    public static void main(String[] args) {
        //"ABCD".first(); // 컴파일 오류

        // Java로 변환했을 때에는, String 객체에 생성되는 게 아니라 static 메서드로 사용해야 한다
        // 확장함수의 파일명 + kt 형태의 확장함수로 사용
        MyExtensionsKt.first("ABCD");
        MyExtensionsKt.addFirstChar("ABCD", 'Z');

    }
}