package furama_resort.views;

import furama_resort.controllers.EmployController;
import furama_resort.models.person.Employee;
import furama_resort.utils.exception.NumberFormat;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FuramaResortView {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;
    private static EmployController employController = new EmployController();
    private static List<Employee> employeeList;
    private static String code;
    private static boolean findCode;
    private static Employee employee;

    public static void main(String[] args) {
        do {
            displayMainMenu();
        } while (true);
    }

    private static void displayMainMenu() {
        System.out.println("-------Menu--------\n" +
                "1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        System.out.println("Chọn chức năng: ");
        choice = NumberFormat.checkChoice(choice);
        switch (choice) {
            case 1:
                displayEmployMenu();
                break;
            case 2:
                displayCustomerMenu();
                break;
            case 3:
                displayFacilityMenu();
                break;
            case 4:
                displayBookingMenu();
                break;
            case 5:
                displayPromotionMenu();
                break;
            case 6:
                System.out.println("Bye bye");
                System.exit(0);
            default:
                System.out.println("Lựa chọn không đúng");
        }
    }

    private static void displayPromotionMenu() {
        System.out.println("-----Promotion Manager----\n" +
                "1. Display list customers use service\n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu\n");
        System.out.println("Chọn chức năng: ");
        choice = Integer.parseInt(scanner.nextLine());
    }

    private static void displayBookingMenu() {
        System.out.println("-----Booking Manager----\n" +
                "1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new contracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu");
    }

    private static void displayFacilityMenu() {
        System.out.println("-----Facility Manager----\n" +
                "1. Display list facility\n" +
                "2. Add new facility\n" +
                "3. Display list facility maintenance\n" +
                "4. Delete facility\n" +
                "5. Return main menu");
    }

    private static void displayCustomerMenu() {
        System.out.println("-----Customer Manager----\n" +
                "1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Delete customer\n" +
                "5. Search by name customer\n" +
                "6. Return main menu");
    }

    private static void displayEmployMenu() {
        do {
            System.out.println("-----Employ Manager----\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Delete employee\n" +
                    "5. Search by name employee\n" +
                    "6. Return main menu");
            System.out.println("Chọn chức năng");
            choice = NumberFormat.checkChoice(choice);
            switch (choice) {
                case 1:
                    displayEmployeeList();
                    break;
                case 2:
                    addNewEmployee();
                    break;
                case 3:
                    editEmployee();
                    break;
                case 4:
                    removeEmployee();
                    break;
                case 5:
                    searchByName();
                    break;
                case 6:
                    return;
            }

        }while (true);
    }

    private static void searchByName() {
        System.out.println("Nhập tên nhân viên cần tìm");
        String name = scanner.nextLine();
        List<Employee> employees = employController.searchByName(name);
        if (employees.isEmpty()){
            System.out.println("Không có nhân viên nào có tên "+name);
        }else {
            for (Employee employee1:employees){
                System.out.println(employee1);
            }
        }

    }

    private static void removeEmployee() {
        code = inputCodeEmployee();
        findCode = findCode(code);
        if (findCode){
            System.out.println("Bạn muốn xóa nhân viên có mã "+code+"\n" +
                    "1. Xóa\n" +
                    "2. Hủy");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1){
                employController.removeEmployee(code);
                System.out.println("Xóa thành công");
            }
        }
    }

    private static void editEmployee() {
        do {
            code = inputCodeEmployee();
            findCode = findCode(code);
            if (!findCode) {
                System.out.println("Code đã tồn tại. Nhập lại");
            }else {
                System.out.println("Nhập thông tin sửa");
                employee = informationEmployee();
                employee.setCode(code);
                employController.editEmployee(employee);
                System.out.println("Sửa thành công");
            }
        }while (!findCode);


    }

    private static boolean findCode(String code) {
       return employController.findCode(code);
    }

    // Mã nhân viên, Họ tên, Ngày sinh, Giới tính,
//    Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
    private static void addNewEmployee(){
        code = inputCodeEmployee();
        Employee employee;
        employee = informationEmployee();
        employee.setCode(code);
        employController.addEmployee(employee);
        System.out.println("Thêm thành công");
    }
    private static void displayEmployeeList(){
        System.out.println("---Danh sách nhân viên---");
        employeeList = employController.getAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    private static Employee informationEmployee() {
        System.out.println("Nhập họ và tên(Viết hoa chữ cái đầu)");
        String name = inputName();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Chọn giới tính");
        String gender = inputGender();
        System.out.println("Nhập số CMND(9-12 số): ");
        String idCard = inputIdCard();
        System.out.println("Nhập số điện thoại(bắt đầu bằng số 0,gồm 10 số)");
        String phoneNumber = inputPhoneNumber();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Chọn trình độ");
        String level = selecLevel();
        System.out.println("Vị trí");
        String location = selecLocation();
        System.out.println("Nhập lương");
        String wage = inputWage();
        return new Employee(name, dateOfBirth, gender, idCard, phoneNumber,
                email, level, location, wage);
    }

    private static String inputGender() {
        String gender = null;
        System.out.println("1. Nam\n" +
                "2. Nữ\n" +
                "3. Khác");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                gender = "Nam";
                break;
            case 2:
                gender = "Nữ";
                break;
            case 3:
                gender = "Khác";
                break;
        }
        return gender;
    }

    private static String inputWage() {
        String wage;
        boolean checkWage;
        do {
            wage = scanner.nextLine();
            checkWage = Pattern.matches("^[1-9]\\d+$", wage);
            if (!checkWage) {
                System.out.println("Lương phải lớn hơn 0");
            }
        } while (!checkWage);
        return wage;
    }

    private static String selecLocation() {
        String location = null;
        System.out.println("1. Lễ tân\n" +
                "2. Phục vụ\n" +
                "3. Chuyên viên\n" +
                "4. Giám sát\n" +
                "5. Quản lý\n" +
                "6. Giám đốc");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                location = "Lễ tân";
                break;
            case 2:
                location = "Phục vụ";
                break;
            case 3:
                location = "Chuyên viên";
                break;
            case 4:
                location = "Giám sát";
                break;
            case 5:
                location = "Quản lý";
                break;
            case 6:
                location = "Giám đốc";
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
        return location;
    }

    private static String selecLevel() {
        String level = null;
        System.out.println("1. Trung cấp\n" +
                "2. Cao Đẳng\n" +
                "3. Đại học\n" +
                "4. Sau đại học");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                level = "Trung cấp";
                break;
            case 2:
                level = "Cao đẳng";
                break;
            case 3:
                level = "Đại học";
                break;
            case 4:
                level = "Sau đại học";
                break;
            default:
                System.out.println("Lựa chọn không đúng");
        }
        return level;
    }

    private static String inputPhoneNumber() {
        boolean checkPhoneNumber;
        String phoneNumber;
        do {
            phoneNumber = scanner.nextLine();
            checkPhoneNumber = Pattern.matches("^0\\d{9}$", phoneNumber);
            if (!checkPhoneNumber) {
                System.out.println("Số điện thoại bắt đầu 0 số và đủ 10 số");
            }
        } while (!checkPhoneNumber);
        return phoneNumber;
    }

    private static String inputIdCard() {
        boolean checkIdCard;
        String idCard;
        do {
            idCard = scanner.nextLine();
            checkIdCard = Pattern.matches("^\\d{9,12}$", idCard);
            if (!checkIdCard) {
                System.out.println("Số CMND phải từ 9-12 số");
            }
        } while (!checkIdCard);
        return idCard;
    }

    private static String inputName() {
        boolean checkName;
        String name;
        do {
            name = scanner.nextLine();
            checkName = Pattern.matches("^([A-Z].+(\\S|\\s))*$", name);
            if (!checkName) {
                System.out.println("Viết hoa kí tự đầu của mỗi từ");
            }
        } while (!checkName);
        return name;
    }

    private static String inputCodeEmployee() {
        boolean checkCode;
        System.out.println("Nhập mã nhân viên");
        do {
            code = scanner.nextLine();
            checkCode = Pattern.matches("^NV-\\d{4}$", code);
            if (!checkCode) {
                System.out.println("Mã nhân viên đúng định dạng NV-xxxx,x là số");
            }
        } while (!checkCode);
        return code;
    }
}
