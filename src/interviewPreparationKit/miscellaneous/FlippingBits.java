package interviewPreparationKit.miscellaneous;

public class FlippingBits {
    public static void main(String[] args) {
        long n = 1;
        String thirtyTwoBitBinary = Long.toBinaryString(n);
        String resultWithPadding = String.format("%32s", thirtyTwoBitBinary).replaceAll(" ", "0");
        System.out.println("In binary = " + resultWithPadding);

        StringBuilder flippedBits = new StringBuilder();
        resultWithPadding.chars().forEach(c->{
            if(c=='0'){
                flippedBits.append('1');
            }
            else{
                flippedBits.append('0');
            }
        });
        System.out.println("In flipped binary = " + flippedBits.toString());

        System.out.println(Long.parseLong(flippedBits.toString(),2));
    }
}
