package Variables;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 5; 
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(--a);
        String b = (a > 4) ? "false": "true";
        System.out.println("value of b is " + b); 
    }
}
