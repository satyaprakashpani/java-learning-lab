package java_basic;

public class KeywordInJava {
     String y = "Krishna";
    public  void display(String y){
        this.y = y;
        System.out.println(y);
    }
    public static void main(String[] args) {
        final String x = "test string";

        System.out.println(x);
        System.out.println(new KeywordInJava().y);
        new KeywordInJava().display("RAM");
    }
}
