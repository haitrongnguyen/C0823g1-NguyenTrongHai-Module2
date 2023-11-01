package ss16_io_text_file.thuc_hanh.max_number;

import java.util.List;

public class FindMaxValue {
    private static Integer max(List<Integer> list){
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer>list = readAndWriteFile.readFile("D:\\code_gym\\module_2\\module_2\\src\\ss16_io_text_file\\thuc_hanh\\max_number\\number.txt");
        int max = FindMaxValue.max(list);
        System.out.println(max);
        readAndWriteFile.writeFile("result.txt",max);

    }
}
