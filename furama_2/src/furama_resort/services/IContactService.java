package furama_resort.services;

import furama_resort.models.Contract;

import java.util.Queue;
import java.util.Set;

public interface IContactService {

    void addNewContract(Contract contract);

    boolean checkBookingCode(String bookingCode);


    boolean checkExistContract(String contractId);

    Set<Contract> getAllContract();
}
