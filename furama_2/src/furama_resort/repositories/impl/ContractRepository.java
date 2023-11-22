package furama_resort.repositories.impl;

import furama_resort.models.Booking;
import furama_resort.models.Contract;
import furama_resort.repositories.IContactRepository;
import furama_resort.utils.read_and_write.contract.ContractReadFile;
import furama_resort.utils.read_and_write.contract.ContractWriteFile;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ContractRepository implements IContactRepository {

    @Override
    public boolean checkExistContract(String contractId) {
        Set<Contract> contracts = ContractReadFile.readFile();
        for (Contract contract:contracts){
            if (contract.getContractId().equals(contractId)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addNewContract(Contract contract) {
        Set<Contract> contracts = ContractReadFile.readFile();
        contracts.add(contract);
        ContractWriteFile.writeFile(contracts);
    }

    @Override
    public boolean checkBookingCode(String bookingCode) {
        Set<Contract> contracts = ContractReadFile.readFile();
        for (Contract contract: contracts){
            if (contract.getBookingCode().equals(bookingCode)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<Contract> getAllContract() {
        return ContractReadFile.readFile();
    }
}
