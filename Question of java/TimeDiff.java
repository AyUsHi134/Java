//Difference between time starting time to ending time
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
public class TimeDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start time (format: HH:mm:ss):");
        String startTimeInput=sc.nextLine();
        LocalTime startTime = LocalTime.parse(startTimeInput);
        System.out.println("Enter the end time (format: HH:mm:ss):");
        String endTimeInput = sc.nextLine();
        LocalTime endTime=LocalTime.parse(endTimeInput);

        sc.close();

        Duration duration = Duration.between(startTime,endTime);

        long hours=duration.toHours();
        long minutes=duration.toMinutesPart();
        long seconds=duration.toSecondsPart();

        System.out.println("Time difference: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

    }
}
