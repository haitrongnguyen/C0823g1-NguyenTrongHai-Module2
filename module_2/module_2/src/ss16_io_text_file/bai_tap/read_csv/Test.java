package ss16_io_text_file.bai_tap.read_csv;

import ss16_io_text_file.bai_tap.copy_text.Reader;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Country> countryList = new ArrayList<>();
        list = Reader.readFile("src/ss16_io_text_file/bai_tap/read_csv/flie.csv");
        String[] line = null;
        for (String s : list) {
            line = s.split(",");
            countryList.add(new Country(Integer.parseInt(line[0]), line[1], line[2]));
        }
        for (Country c : countryList) {
            System.out.println(c);
        }
    }
}
