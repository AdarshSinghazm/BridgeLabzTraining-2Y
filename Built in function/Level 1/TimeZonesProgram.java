import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZonesProgram {
    public static void main(String[] args) {
        ZoneId gmt = ZoneId.of("GMT");
        ZoneId ist = ZoneId.of("Asia/Kolkata");
        ZoneId pst = ZoneId.of("America/Los_Angeles");
        
        ZonedDateTime currentTime = ZonedDateTime.now();
        
        ZonedDateTime gmtTime = currentTime.withZoneSameInstant(gmt);
        ZonedDateTime istTime = currentTime.withZoneSameInstant(ist);
        ZonedDateTime pstTime = currentTime.withZoneSameInstant(pst);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        
        System.out.println("Current Time in Different Time Zones:");
        System.out.println("GMT: " + gmtTime.format(formatter));
        System.out.println("IST: " + istTime.format(formatter));
        System.out.println("PST: " + pstTime.format(formatter));
    }
}