package interviewPreparationKit.warmUp;

import java.util.stream.IntStream;

public class RepeatedStrings {
    public static void main(String[] args) {
        String s = "cfimaakj";
        long n = 76887687;
        int lenOfString = s.length();

        if(n<=lenOfString){
            s=s.substring(0,(int)n);
            System.out.println(s.chars().filter(c -> c == 'a').count());
            return;
        }

        long countOfa = s.chars().filter(c -> c == 'a').count();
        if (countOfa == 0) {
            System.out.println(0);
            return;
        }

        long quo = n / lenOfString;
        long rem = n % lenOfString;
        countOfa=quo*countOfa;
        countOfa =countOfa+ s.chars().filter(c -> c == 'a').count();
        System.out.println(countOfa);
    }
}
