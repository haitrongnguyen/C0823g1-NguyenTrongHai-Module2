package furama_resort.repositories;

import furama_resort.models.Contract;

import java.util.Queue;
import java.util.Set;

public interface IContactRepository {
    boolean checkExistContract(String contractId);

    void addNewContract(Contract contract);

    boolean checkBookingCode(String bookingCode);

    Set<Contract> getAllContract();
}
