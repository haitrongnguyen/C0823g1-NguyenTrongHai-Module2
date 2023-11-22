package furama_resort.utils.read_and_write.contract;

import furama_resort.models.Contract;

import java.io.*;
import java.util.Set;

public class ContractWriteFile {
    private static final String COMA = ",";
    public static void writeFile(Set<Contract> contracts){
        File file = new File("src/furama_resort/data/contract.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Contract contract:contracts){
                bufferedWriter.write(contract.getContractId()+COMA
                +contract.getBookingCode()+COMA
                +contract.getDeposit()+COMA
                +contract.getTotalPayment());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
