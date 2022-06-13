
import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Milan", "London", "New York", "San Francisco");

        //使用String.join()
        String citiesCommaSeparated = String.join(",", cities);
        System.out.println( citiesCommaSeparated);

        //使用steam
        String citiesCommaSeparated2 = cities.stream().collect(Collectors.joining(","));
        System.out.println(citiesCommaSeparated2);

        //使用steam + 轉大寫
        String citiesCommaSeparaedUpper = cities.stream().map(String ::toUpperCase).collect(Collectors.joining(","));
        System.out.println(citiesCommaSeparaedUpper);

        //
        Double f = 80.00;
        System.out.println("轉前: " + f.toString());//1.0
        System.out.println("轉後: " + subZeroAndDot(f.toString()));; // 轉換後為1
        System.out.println(subZeroAndDot("1"));; // 轉換後為1
        System.out.println(subZeroAndDot("10"));; // 轉換後為10
        System.out.println(subZeroAndDot("1.0"));; // 轉換後為1
        System.out.println(subZeroAndDot("1.010"));; // 轉換後為1.01
        System.out.println(subZeroAndDot("1.01"));; // 轉換後為1.01

        final HashMap<String, String> res = new HashMap<>();
        res.put("merchantReferenceCode","FF123");
        res.put("ccCreditService_captureRequestID","123");

        String cybersourceRefundUrl = "{merchantReferenceCode}//refund-{captureRequestId}/aaa/bb";
        String ss = cybersourceRefundUrl.replace("{merchantReferenceCode}", res.get("merchantReferenceCode"))
                .replace("{captureRequestId}", res.get("ccCreditService_captureRequestID"));

        System.out.println("ss = "+ss);

        LocalDateTime start = LocalDate.now().minusDays(3).atStartOfDay();
        LocalDateTime end = LocalDate.now().atStartOfDay();

        System.out.println(end);


        int a = 5;
        System.out.println("a = "+a);
        int b = a;
        System.out.println("b =" + b);
        b = 10;
        System.out.println("a = "+a);
        System.out.println("b =" + b);

    }

    public static String subZeroAndDot(String s){
        if(s.indexOf(".") > 0){
            s = s.replaceAll("0 ?$", "");//去掉多餘的0
            s = s.replaceAll("[.]$", "");//如最後一位是.則去掉
        }
        return s;
    }
}
