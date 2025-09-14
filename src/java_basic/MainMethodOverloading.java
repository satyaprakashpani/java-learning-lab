package java_basic;

public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("This is the main method with string[] parameter");
    }

    public static void main(String args) {
        System.out.println("This is the main method with string parameter");
    }

    public  int  main(int args) {
        System.out.println("This is the main method with int parameter");
      return 0;
    }

    public static void main(int[] args) {
        System.out.println("This is the main method with int[] parameter");
    }

}
