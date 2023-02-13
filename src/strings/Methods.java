package strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "SunilBallani";
        System.out.println(Arrays.toString(name.toCharArray()));
        String a = name.substring(0, name.length()/2);
        System.out.println(a);
    }
}
