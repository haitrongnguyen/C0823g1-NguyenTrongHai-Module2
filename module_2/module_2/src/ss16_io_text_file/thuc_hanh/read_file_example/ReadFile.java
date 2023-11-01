package ss16_io_text_file.thuc_hanh.read_file_example;


import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public void readFileText(String pathFile) {
        try {
            File file = new File(pathFile);
            if (!file.exists()) {

                throw new FileNotFoundException();
            }
//            FileReader fileReader = new FileReader(fileReader);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng = " + sum);
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại or lỗi");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file");
        String path = scanner.nextLine();
        ReadFile readFile = new ReadFile();
        readFile.readFileText(path);

    }
}
