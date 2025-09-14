package java_basic;

public class PrintTheTableOf9WithoutUsingLoop {

    public static void printTable(int num, int multiplier){
        int counter = multiplier+1;
        if (counter<=10){
            System.out.printf("%d X %d = %d",num,counter,num*(counter));
            System.out.println( );
            printTable(num,counter);
        }

    }
    public static void main(String[] args) {
        int table = 9, multiplier = 0;
        printTable(table,multiplier);

    }
}
