package furama_resort.services.impl;

import furama_resort.models.Booking;
import furama_resort.repositories.IBookingRepository;
import furama_resort.repositories.impl.BookingRepository;
import furama_resort.services.IBookingService;

import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BookingService implements IBookingService {
    private static IBookingRepository bookingRepository = new BookingRepository();
    @Override
    public void addNewBooking(Booking booking) {
        bookingRepository.addNewBooking(booking);
    }

    @Override
    public Set<Booking> getAll() {
       return bookingRepository.getAll();
    }

    @Override
    public Queue<Booking> getListBookingHouseAndVilla() {
        return bookingRepository.getListBookingHouseAndVilla();
    }

    @Override
    public boolean checkExistBookingCode(String bookingCode) {
        return bookingRepository.checkExistBookingCode(bookingCode);
    }
}
