package literals;

public class CharacterLiterals {
    public static void main(String[] args) {
        char ch = 'a'; // A to Z, a-z, !@#$%^&*()_+
        //char c = "A"; // "" == String = Bunch of Char

        char b = 'B';
        char c ='!';
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("LearnJava");
        System.out.println("Learn"+new_line+"Java");
        System.out.println( " ----- ");
        System.out.println("Learn\nJava");
        System.out.println( " ----- ");
        System.out.println("Learn"+tab_line+"Java");
        System.out.println( " ----- ");
        System.out.println("Learn"+back_space+"Java");
        System.out.println( " ----- ");
        System.out.println("Learn"+carriage_return+"Java");
        System.out.println( " ----- ");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line \t this is after tab ");

        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65
        System.out.println("ASCII value of A - "+(int)c10);

        char rupees = '₹';
        System.out.println(rupees);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char eta = '\u1f22';
        System.out.println("eta = "+eta);

        char c11  = '\u1F66';
        System.out.println(c11);
    }
}
