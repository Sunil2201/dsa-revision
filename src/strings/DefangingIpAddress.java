package strings;

public class DefangingIpAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String newAdd = address.replace('.', '[');
        System.out.println(newAdd);
    }
}
