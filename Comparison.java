public class Comparison {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "JAVA";
        s2 = s1;
        System.out.println("Comparison of references: " + (s1 == s2));
        s2 = new String(s1);
        System.out.println("Comparison of references: " + (s1 == s2));
        System.out.println("Comparison of values: " + s1.equals(s2));
    }
}
