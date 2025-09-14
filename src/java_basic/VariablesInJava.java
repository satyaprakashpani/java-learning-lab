package java_basic;

public class VariablesInJava {
   public static void display(){
       int x=5;
       char c = 'G';
       String first_name = "Narayan";
       boolean _testFlag = false;
       long $age = 139;
       byte age = 127;
       System.out.println("Age in byte : "+age);
       System.out.println("x- "+x +", c- "+c+", First Name - "+first_name+", test flag - "+_testFlag+", age - "+$age);
   }

    public static void main(String[] args) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
        display();
    }
}
