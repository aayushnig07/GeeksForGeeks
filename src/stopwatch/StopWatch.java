package stopwatch;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Scanner;

public class StopWatch {

    static HashMap<String, Boolean> stopwatchMap = new HashMap<>();
    Instant start = null;
    Instant stop = null;

    int l = 0;

    StopWatch() {
        stopwatchMap.put("start", true);
        stopwatchMap.put("stop", false);
        stopwatchMap.put("pause", false);
        stopwatchMap.put("reset", false);
    }

    public void start() {
        stopwatchMap.put("pause", true);
        stopwatchMap.put("reset", false);
        stopwatchMap.put("stop", false);
        stopwatchMap.put("start", false);
        start = Instant.now();
    }

    public void pause() {
        stopwatchMap.put("start", true);
        stopwatchMap.put("stop", true);
        stopwatchMap.put("reset", true);
        stopwatchMap.put("pause", false);
        if (l == 0) {
            stop = Instant.now();
            l = (int) Duration.between(start, stop).toSeconds();
        } else {
            stop = Instant.now();
            l += (int) Duration.between(start, stop).toSeconds();
        }

        String time = formatSeconds(l);
        System.out.println(time);
    }

    public void stop() {
        stopwatchMap.put("start", true);
        stopwatchMap.put("reset", true);
        stopwatchMap.put("pause", false);
        stopwatchMap.put("stop", false);
        stop = Instant.now();
        String time = formatSeconds(l);
        System.out.println(time);
        l = 0;
    }

    public void reset() {
        stopwatchMap.put("start", true);
        stopwatchMap.put("stop", false);
        stopwatchMap.put("pause", false);
        stopwatchMap.put("reset", false);
        l = 0;
        System.out.println("00:00:00");

    }

    public static String formatSeconds(int timeInSeconds) {
        int hours = timeInSeconds / 3600;
        int secondsLeft = timeInSeconds - hours * 3600;
        int minutes = secondsLeft / 60;
        int seconds = secondsLeft - minutes * 60;

        String formattedTime = "";
        if (hours < 10)
            formattedTime += "0";
        formattedTime += hours + ":";

        if (minutes < 10)
            formattedTime += "0";
        formattedTime += minutes + ":";

        if (seconds < 10)
            formattedTime += "0";
        formattedTime += seconds;

        return formattedTime;
    }

    public static void main(String[] args){

        StopWatch obj = new StopWatch();
        Scanner sc = new Scanner(System.in);
        boolean state = true;
        while (state) {
            System.out.println("Enter 1 to start, 2 to pause, 3 to stop, 4 to reset, 5 to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (stopwatchMap.get("start")) {
                        System.out.println("Stopwatch started");
                        obj.start();
                    } else
                        System.out.println("Start cannot be performed");
                    break;
                case 2:
                    if (stopwatchMap.get("pause")) {
                        System.out.println("Stopwatch paused");
                        obj.pause();
                    } else
                        System.out.println("Pause cannot be performed");
                    break;
                case 3:
                    if (stopwatchMap.get("stop")) {
                        System.out.println("Stopwatch stopped");
                        obj.stop();
                    } else
                        System.out.println("Stop cannot be performed");
                    break;
                case 4:
                    if (stopwatchMap.get("reset")) {
                        System.out.println("Stopwatch reset");
                        obj.reset();
                    } else
                        System.out.println("Reset cannot be performed");
                    break;
                case 5:
                    System.out.println("Exiting!!");
                    state = false;
                    break;
                default:
                    System.out.println("Invalid choice!! Try again");

            }
        }
    }
}


