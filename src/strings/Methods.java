package strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Sunil Ballani";
//        System.out.println(Arrays.toString(name.toCharArray()));
//        String a = name.substring(0, name.length()/2);
//        System.out.println(a);

        // all important string methods
        // https://www.w3schools.com/java/java_ref_string.asp
        // 1. charAt()
        System.out.println(name.charAt(0));
        // 2. codePointAt()
        System.out.println(name.codePointAt(0));
        // 3. codePointBefore()
        System.out.println(name.codePointBefore(7));
        // 4. codePointCount()
        System.out.println(name.codePointCount(0, name.length()-1));
        // 5. compareTo()
        System.out.println(name.compareTo("SunilBallani"));
        // 6. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("sunilballani"));
        // 7. concat()
        System.out.println(name.concat(" is a good lad"));
        // 8. contains()
        System.out.println(name.contains("ab"));
        // 9. endsWith()
        System.out.println(name.endsWith("ni"));
        // 10. equals()
        System.out.println("sunil".equals("ballani"));
        // 11. equalsIgnoreCase()
        System.out.println("Sunil".equalsIgnoreCase("sunil"));
        // 12. intern()
        System.out.println(name.intern());
        // 13. isEmpty()
        System.out.println(name.isEmpty());
        // 14. lastIndexOf()
        System.out.println(name.lastIndexOf('l'));
        // 15. replace()
        System.out.println(name.replace("un", "ab"));
        System.out.println(name);
        // 16. replaceFirst()
        System.out.println("Godohmygod".replaceFirst("od", "ill"));
        // 17. replaceAll()
        System.out.println("Godohmygod". replaceAll("od", "ill"));
        // 18. split()
        System.out.println(Arrays.toString(name.split(" ")));
        // 19. startsWith()
        System.out.println(name.startsWith("n"));
        // 20. subsequence()
        System.out.println(name.subSequence(0, 4));
    }
}
