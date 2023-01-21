package functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1,2,3,4,6,7,89,56,45);
//        multiple(45, 56, "Sunil", "Ballani", "is", "good");
        demo(1, 2, 3, 4 ,5);
        demo("Sunil", "Ballani", "is", "good");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(a + Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
