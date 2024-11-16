public class TimeCalc {
    public static void main(String[] args) {
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutesToAdd = Integer.parseInt(args[1]);
        int hoursToAdd = minutesToAdd / 60;
        minutesToAdd = minutesToAdd % 60;
        hours = hours + hoursToAdd;
        minutes = minutes + minutesToAdd;
        if (minutes >= 60) {
            hours++;
            minutes = minutes % 60;
        }
        if (hours >= 24) {
            hours = hours % 24;
        }
		String min = (minutes < 10) ? "0" + minutes : "" + minutes;
        String hour = (hours == 0) ? "0" + hours : "" + hours;
        System.out.println(hour + ":" + min);
        }

	}
