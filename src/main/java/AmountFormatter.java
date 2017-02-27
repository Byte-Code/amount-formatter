import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by {@author ste}.
 */
public class AmountFormatter {

    private static AmountFormatter instance = null;

    private AmountFormatter() {
    }

    public static AmountFormatter get() {
        if (instance == null) {
            instance = new AmountFormatter();
        }
        return instance;
    }

    private Map<String, String> getCurrenciesMap() {
        Map<String, String> currenciesMap = new HashMap<>();
        currenciesMap.put(Currency.EUR.getCode(), "€");
        currenciesMap.put(Currency.GBP.getCode(), "£");
        return currenciesMap;
    }

    public String getLabel(String currency) {
        String label = getCurrenciesMap().get(currency);

        if (label == null) return "N/A";
        return label;
    }

    public String format(String currency, String amount, Boolean vat) {
        Double convertedAmount = Double.valueOf(amount) / 100;
        Locale locale;

        switch (Currency.valueOf(currency)) {
            case EUR:
                locale = new Locale("it", "IT");
                break;
            case GBP:
                locale = new Locale("en", "GB");
                break;
            default:
                locale = new Locale("en", "GB");

        }

        NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
        String stringAmount = fmt.format(convertedAmount);

        if(Boolean.TRUE.equals(vat)) stringAmount += " + VAT";

        return stringAmount;
    }

}
