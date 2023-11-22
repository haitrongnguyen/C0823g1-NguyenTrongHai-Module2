package furama_resort.utils.read_and_write.booking;

import furama_resort.models.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookingReadFile {
    private static final String PATH = "src/furama_resort/data/booking.csv";

    public static Set<Booking> readBooking() {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        Set<Booking> bookings = new TreeSet<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] lineString;
            Booking booking;
            while ((line = bufferedReader.readLine())!= null){
                lineString = line.split(",");
                booking = new Booking(lineString[0],lineString[1],lineString[2],lineString[3],lineString[4],lineString[5]);
                bookings.add(booking);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());;
        } catch (IOException e) {
            System.err.println(e.getMessage());;
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());;
            }

        }
        return bookings;
    }

}
