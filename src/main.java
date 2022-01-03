
import javax.swing.*;
import java.util.Arrays;
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
    }
}
