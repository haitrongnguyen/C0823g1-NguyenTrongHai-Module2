package furama_resort.utils.read_and_write.booking;

import furama_resort.models.Booking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class BookingWriteToFile {
    private static final String PATH = "src/furama_resort/data/booking.csv";
    private static final String COMA = ",";
    public static void writeToFile(Set<Booking> bookings){
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking booking: bookings){
                bufferedWriter.write(booking.getBookingCode()+COMA+booking.getBookingDay()
                                +COMA+ booking.getBeginDay()+COMA+booking.getEndDay()+COMA+booking.getCustomerCode()
                        +COMA+ booking.getServiceCode());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());;
        }finally {
            try {
                assert bufferedWriter != null;
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }

    }
}
