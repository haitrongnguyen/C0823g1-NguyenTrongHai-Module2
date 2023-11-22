package furama_resort.utils.read_and_write.contract;

import chuyen_bay.utils.read_and_write.FlyReader;
import furama_resort.models.Contract;

import java.io.*;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class ContractReadFile {

    public static Set<Contract> readFile(){
        File file = new File("src/furama_resort/data/contract.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        Set<Contract> contracts = new HashSet<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[]lineString;
            while ((line = bufferedReader.readLine())!=null){
                lineString = line.split(",");
                contracts.add(new Contract(lineString[0],
                        lineString[1],Long.parseLong(lineString[2]),
                        Long.parseLong(lineString[3])));
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Không có dữ liệu");
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }

        }
        return contracts;
    }
}
