public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        // Split time into hours and minutes
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        // Calculate total minutes
        int totalMinutes = hours * 60 + minutes + minutesToAdd;

        // Calculate new hours and minutes
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes % 60;

        // Print result in hh:mm format
        System.out.println(String.format("%02d:%02d", newHours, newMinutes));
    }
}
