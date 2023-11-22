package furama_resort.controllers;

import furama_resort.models.Contract;
import furama_resort.services.IContactService;
import furama_resort.services.impl.ContractService;

import java.util.Queue;
import java.util.Set;

public class ContractController {
    private IContactService contractService = new ContractService();
    public boolean checkExistBookingCode(String bookingCode) {
        return contractService.checkBookingCode(bookingCode);
    }

    public void addNewContract(Contract contract) {
        contractService.addNewContract(contract);
    }

    public boolean checkExistContractId(String contractId) {
        return contractService.checkExistContract(contractId);
    }

    public Set<Contract> getAllContract() {
        return contractService.getAllContract();
    }
}
