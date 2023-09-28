import java.lang.*;

class stringreversewithoutinbuiltfunction {
    public static void main(String[] args) {
        String s = "JAVA PROGRAMMING";
        StringBuilder s2 = new StringBuilder();
        s2.append(s);
        s2 = s2.reverse(); // used string builder to reverse
        System.out.println(s2);

    }
}

// output: GNIMMARGORP AVAJ