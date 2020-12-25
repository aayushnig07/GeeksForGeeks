package daysOfStatistics;


import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MeanMedianMode {
    public static void main(String[] args) throws IOException {
        NumberFormat formatter = new DecimalFormat("#0.0");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String list = br.readLine();
        String[] words = list.split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(words[i]);
        }
        Arrays.sort(arr);

        //mean
        float sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        float mean = sum / N;
        System.out.println(formatter.format(mean));

        //median
        if (N % 2 == 0) {
            //even
            int firstEle = N / 2;
            int secondEl = N / 2 - 1;
            float median = ((float) (arr[firstEle] + arr[secondEl])) / 2;
            System.out.println(formatter.format(median));
        } else {
            //odd
            int mid = N / 2;
            float median = arr[mid];
            System.out.println(formatter.format(median));
        }

        //mode
        for (int i = 0; i < N; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else
                map.put(arr[i], 1);
        }
        int mode = map.entrySet().stream().max((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue())).get().getKey();
        System.out.println(mode);

    }
}