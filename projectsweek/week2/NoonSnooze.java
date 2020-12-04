public class NoonSnooze {
    public static void main(String[] args) {
        int snooze = Integer.parseInt(args[0]);

        int minutesSnooze = 12 * 60 + snooze;

        int minuteSnooze = minutesSnooze % 1440;

        int hour = minuteSnooze / 60;
        int minute = minuteSnooze % 60;
        boolean isAm = (hour >= 0 && hour < 12);
        hour %= 12;
        if (hour == 0)
            hour = 12;
        if (isAm)
            System.out.printf("%d:%02dam", hour, minute);
        else
            System.out.printf("%d:%02dpm", hour, minute);

    }


}
