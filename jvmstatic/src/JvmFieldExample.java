public class JvmFieldExample {

    public static void main(String[] args) {

        // JvmFieldClass.Companion.getId();
        // @JvmField 사용하면 Companion 사용할 필요 없이 직접 프로퍼티 접근 가능
        int id = JvmFieldClass.id;

        // JvmFieldObject.INSTANCE.getName();
        String name = JvmFieldObject.name;


        // java에서 사용할 때는, 상수 같은 경우에는 직접 접근이 가능
        int code = JvmFieldClass.CODE;
        String familyName = JvmFieldObject.FAMILY_NAME;
    }
}