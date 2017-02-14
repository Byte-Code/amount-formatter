/**
 * Created by {@author ste}.
 */
public enum Currency {

    EUR("EUR"),
    GBP("GBP");

    private String code;

    Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
