package ss16_io_text_file.bai_tap.copy_text;

import java.util.ArrayList;
import java.util.List;

public class CopyText {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = Reader.readFile("result.txt");
        for (String s:list){
            System.out.println(s);
        }
        Writer.writeFile(list,"result1.txt");
    }
}
