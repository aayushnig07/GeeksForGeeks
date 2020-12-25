package daysOfStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class WeightedMean {
    public static void main(String[] args) throws IOException {
        NumberFormat formatter = new DecimalFormat("#0.0");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] marks = new int[N];
        String marksString = br.readLine();
        String[] words01 = marksString.split(" ");
        for (int i = 0; i < N; i++) {
            marks[i] = Integer.parseInt(words01[i]);
        }

        int[] weight = new int[N];
        String weightString = br.readLine();
        String[] words02 = weightString.split(" ");
        for (int i = 0; i < N; i++) {
            weight[i] = Integer.parseInt(words02[i]);
        }

        float sum = 0;
        float weightSum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + (marks[i] * weight[i]);
            weightSum += weight[i];
        }


        float weightedMean = sum / weightSum;
        System.out.println(formatter.format(weightedMean));

    }
}
