package strings;

public class BasicProperties {
    public static void main(String[] args) {
        String a = "Sunil";
        String b = "Sunil";
        a = "Sunil Ballani";
        String ans = "G()(al)";
        ans.replaceAll("(al)", "al");
        System.out.println(ans);

        System.out.println(a);
        System.out.println(b);
    }
}
