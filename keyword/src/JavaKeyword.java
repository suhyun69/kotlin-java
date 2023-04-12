import java.io.InputStream;

public class JavaKeyword {

    private InputStream in;

    private Boolean is;

    // in이나 is가 Java에서는 이상이 없으나, Kotlin에서는 이미 지정된 키워드.
    // kotlin에서는 이 문제를 `(backtik) 문자를 사용하여 해결

    public InputStream getIn() {
        return in;
    }

    public void setIn(InputStream in) {
        this.in = in;
    }

    public Boolean getIs() {
        return is;
    }

    public void setIs(Boolean is) {
        this.is = is;
    }
}

enum CountryCodeJava {
    kr, jp, us;
}