import java.time.*;
import java.time.format.*;
import java.util.*;
public class timeleft_timing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
	        String input = sc.nextLine();

	        try {
	            LocalDateTime event = LocalDateTime.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
	            Duration d = Duration.between(LocalDateTime.now(), event);

	            if (d.isNegative()) {
	                System.out.println("The event has already passed.");
	                return;
	            }

	            long mins = d.toMinutes();
	            System.out.printf("Time remaining until event:\n\t%d days, %d hours, and %d minutes\n",
	                    mins / 1440, (mins % 1440) / 60, mins % 60);
	        } catch (Exception e) {
	            System.out.println("Invalid format. Use yyyy-MM-dd HH:mm");
	        }
	}

}
