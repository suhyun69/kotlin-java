public class JvmStaticExample {

    public static void main(String[] args) {

        // HelloClass.Companion.hello(); // Companion
        // Companion Object는 Companion 객체를 통해서 접근
        //
        String hello = HelloClass.hello();
        System.out.println(hello);

        // HiObject.INSTANCE.hi();
        // Instance는 Instance 객체를 통해서 접근
        String hi = HiObject.hi();
        System.out.println(hi);

    }
}