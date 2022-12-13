package via.sep3.logicserver.shared.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    public static void writeLog(String msg, String fileName) {
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String filename = "Log/" + fileName.toUpperCase() + "_" + formattedDate + ".txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            LocalDateTime currentDateTime = LocalDateTime.now();
            String timestamp = currentDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

            writer.append(timestamp + " : ");
            writer.append(msg + "\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception while writing log " + e.getMessage());
        }
    }
}
