import java.util.UUID;

public class Person {

    private String name;

    private int age;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // getter
    // Person 클래스 내에서 별도의 프로퍼티가 없음
    // 메서드의 시작이 get = getter
    public String getUUID() {
        return UUID.randomUUID().toString();
    }

    // setter 메서드
    // getter의 역할을 하는
    public void setAddress(String address) {
        this.address = address;
    }

    // address에 대해서 getter가 없다
    public String myAddress() {
        return address;
    }
}