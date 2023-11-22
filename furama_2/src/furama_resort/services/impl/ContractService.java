package furama_resort.services.impl;

import furama_resort.models.Contract;
import furama_resort.repositories.IContactRepository;
import furama_resort.repositories.impl.ContractRepository;
import furama_resort.services.IContactService;

import java.util.Queue;
import java.util.Set;

public class ContractService implements IContactService {
    private IContactRepository contractRepository = new ContractRepository();

    @Override
    public void addNewContract(Contract contract) {
        contractRepository.addNewContract(contract);
    }

    @Override
    public boolean checkBookingCode(String bookingCode) {
        return contractRepository.checkBookingCode(bookingCode);
    }


    @Override
    public boolean checkExistContract(String contractId) {
        return contractRepository.checkExistContract(contractId);
    }

    @Override
    public Set<Contract> getAllContract() {
        return contractRepository.getAllContract();
    }
}
