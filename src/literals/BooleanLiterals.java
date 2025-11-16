package literals;

public class BooleanLiterals {
    public static void main(String[] args) {
        boolean h = true;
        System.out.println("h = "+h);
        boolean isMatched = false;
        System.out.println("isMatched = "+isMatched);
        //boolean isVerified = True; true or false should be in small letters
        boolean isVerified;

        //isVerified=10; can not assign other than true or false to boolean variables
        isVerified=false;
        System.out.println("isVerified value  = "+isVerified + " - on first occurrence");
        isVerified=true;
        System.out.println("isVerified = "+isVerified + " - on second occurrence");
    }
}
