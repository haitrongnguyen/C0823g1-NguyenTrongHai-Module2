package furama_resort.views;

import furama_resort.controllers.*;
import furama_resort.models.Booking;
import furama_resort.models.Contract;
import furama_resort.models.facility.Facility;
import furama_resort.models.facility.House;
import furama_resort.models.facility.Room;
import furama_resort.models.facility.Villa;
import furama_resort.models.person.Customer;
import furama_resort.models.person.Employee;
import furama_resort.utils.exception.NumberFormat;

import java.time.LocalDate;
import java.util.*;
import java.util.regex.Pattern;

public class FuramaResortView {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;
    private static EmployController employController = new EmployController();
    private static CustomerController customerController = new CustomerController();
    private static FacilityController facilityController = new FacilityController();
    private static BookingController bookingController = new BookingController();
    private static ContractController contractController = new ContractController();
    //    private static
    private static String code;
    private static boolean findCode;
    private static Employee employee;
    private static Customer customer;

    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        do {
            System.out.println("-------Menu--------\n" +
                    "1. Quản lí nhân viên\n" +
                    "2. Quản lí khách hàng\n" +
                    "3. Quản lí cơ sở\n" +
                    "4. Quản lí booking\n" +
                    "5. Quản lí khuyến mãi\n" +
                    "6. Thoát");
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
                    System.out.println("Chào tạm biệt! Hẹn gặp lại.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không đúng");
            }
        } while (true);
    }

    private static void displayPromotionMenu() {
        System.out.println("-----Quản lí khuyến mãi----\n" +
                "1. Hiển thị danh sách khách hàng sử dụng dịch vụ\n" +
                "2. Hiển thị danh sách khách hàng nhận voucher\n" +
                "3. Quay lại\n");
        System.out.println("Chọn chức năng: ");
        choice = NumberFormat.checkChoice(choice);
    }

    private static void displayBookingMenu() {
        System.out.println("-----Quản lí booking----\n" +
                "1. Thêm mới booking\n" +
                "2. Hiển thị danh sách booking\n" +
                "3. Tạo hợp đồng mới\n" +
                "4. Hiển thị danh sách hợp đồng\n" +
                "5. Chỉnh sửa hợp đồng\n" +
                "6. Quay lại");
        System.out.println("Chọn chức năng: ");
        choice = NumberFormat.checkChoice(choice);
        switch (choice) {
            case 1:
                addNewBooking();
                break;
            case 2:
                displayListBooking();
                break;
            case 3:
                creatNewContract();
                break;
            case 4:
                displayListContract();
                break;
            case 5:
//                editContract();
                break;
        }
    }

    private static void displayListContract() {
        Set<Contract> contracts = contractController.getAllContract();
        for (Contract contract : contracts) {
            System.out.println(contract);
        }
    }

    private static void creatNewContract() {
        boolean checkExist;
        Contract contract;
        String bookingCode = null;
        Queue<Booking> bookings = bookingController.getListBookingHouseAndVilla();

        while (!bookings.isEmpty()) {
            bookingCode = bookings.peek().getBookingCode();
            checkExist = contractController.checkExistBookingCode(bookingCode);
            if (checkExist) {
                bookings.poll();
            } else {
                System.out.println("Nhập thông tin hợp đồng cho mã booking " + bookingCode);
                contract = inputInformationContract(bookingCode);
                contractController.addNewContract(contract);
                System.out.println("Đã hoàn thành hợp đồng");
            }
        }
        System.out.println("Không có booking mới");


    }

    private static Contract inputInformationContract(String bookingCode) {
        String contractId;
        boolean checkExistContractId;
        do {
            System.out.println("Nhập mã hợp đồng");
            contractId = inputContractId();
            checkExistContractId = contractController.checkExistContractId(contractId);
            if (checkExistContractId) {
                System.out.println("Id đã tồn tại");
            }
        } while (checkExistContractId);
        System.out.println("Nhập số tiền đặt cọc");
        Long deposit = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập tổng tiền thanh toán");
        Long totalPayment = Long.parseLong(scanner.nextLine());
        return new Contract(contractId, bookingCode, deposit, totalPayment);
    }

    private static String inputContractId() {
        String contractId;
        boolean checkContractId;
        do {
            contractId = scanner.nextLine();
            checkContractId = Pattern.matches("^HD-[0-9]+$", contractId);
            if (!checkContractId) {
                System.out.println("Nhập đúng định dạng");
            }
        } while (!checkContractId);
        return contractId;
    }

    private static void displayListBooking() {
        Set<Booking> bookings = bookingController.getAll();
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    private static void addNewBooking() {
        displayCustomerList();
        boolean checkCodeCustomer;
        boolean checkExistCode = true;
        String codeService = null;
        do {
            System.out.println("Chọn mã khách hàng");
            code = inputCodeCustomer();
            checkCodeCustomer = customerController.findCodeCustomer(code);
            if (checkCodeCustomer) {
                displayListFacility();
                System.out.println("Nhập mã dịch vụ");
                codeService = checkCodeFacility();
                checkExistCode = facilityController.checkExist(codeService);
                if (!checkExistCode) {
                    System.out.println("Mã dịch vụ không tồn tại");
                }
            } else {
                System.out.println("Mã khách hàng không tồn tại");
            }
        } while (!checkExistCode || !checkCodeCustomer);
        Booking booking = null;
        if (codeService.contains("SVRO-") || codeService.contains("SVHO-") || codeService.contains("SVVL-")) {
            if (codeService.contains("SVRO-")) {
                System.out.println("Bạn chọn dịch vụ thuê Room. Nhập thông tin");
                booking = informationBooking();

            }
            if (codeService.contains("SVHO-")) {
                System.out.println("Bạn chọn dịch vụ thuê House. Nhập thông tin");
                booking = informationBooking();

            }
            if (codeService.contains("SVVL-")) {
                System.out.println("Bạn chọn dịch vụ thuê Villa. Nhập thông tin");
                booking = informationBooking();
            }
        }
        assert booking != null;
        booking.setCustomerCode(code);
        booking.setServiceCode(codeService);
        bookingController.addNewBooking(booking);
    }

    private static Booking informationBooking() {
        String bookingCode;
        boolean checkExistBooking;
        do {
            bookingCode = inputBookingCode();
            checkExistBooking = bookingController.checkExistBookingCode(bookingCode);
            if (checkExistBooking) {
                System.out.println("Mã booking đã tồn tại.");
            }
        } while (checkExistBooking);
        System.out.println("Nhập ngày booking");
        String bookingDay = inputDate();
        System.out.println("Ngày bắt đầu thuê");
        String beginDay = inputDate();
        System.out.println("Ngày kết thúc thuê");
        String endDay = inputDate();
        return new Booking(bookingCode, bookingDay, beginDay, endDay);
    }

    private static String inputDate() {
        String date;
        boolean checkDay;
        do {
            date = scanner.nextLine();
            checkDay = Pattern.matches("^([012][0-9]|3[12])/(0[0-9]|1[012])/(2[0-9]{3})$", date);
            if (!checkDay) {
                System.out.println("Nhập đúng định dạng");
            }
        } while (!checkDay);
        return date;
    }


    private static String inputBookingCode() {
        String bookingCode;
        boolean checkCode;
        do {
            System.out.println("Nhập mã booking");
            bookingCode = scanner.nextLine();
            checkCode = Pattern.matches("BK-[0-9]{4}", bookingCode);
            if (!checkCode) {
                System.out.println("Phải đúng định dạng");
            }
        } while (!checkCode);
        return bookingCode;
    }

    private static void displayFacilityMenu() {
        do {
            System.out.println("-----Facility Manager----\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Delete facility\n" +
                    "5. Return main menu");
            System.out.println("Chọn chức năng: ");
            choice = NumberFormat.checkChoice(choice);
            switch (choice) {
                case 1:
                    displayListFacility();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    displayListFacilityMaintenance();
                    break;
                case 4:
                    removeFacility();
                    break;
                case 5:
                    return;
            }
        } while (true);

    }

    private static void displayListFacilityMaintenance() {
        System.out.println("---Danh sách bảo trì----");
        List<Facility> facilityList = facilityController.getMaintenance();
        for (Facility facility : facilityList) {
            System.out.println(facility);
        }
    }

    private static void removeFacility() {
        System.out.println("Nhập mã cơ sở muốn xóa");
        boolean checkExist;
        do {
            code = checkCodeFacility();
            checkExist = facilityController.checkExist(code);
            if (checkExist) {
                facilityController.removeFacility(code);
            } else {
                System.out.println("Code không tồn tại");
            }
        } while (!checkExist);


    }

    private static void addNewFacility() {
        do {
            System.out.println("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n");
            choice = NumberFormat.checkChoice(choice);
            switch (choice) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    return;
            }
        } while (true);

    }

    private static void addNewVilla() {
        String code;
        boolean checkExist;
        System.out.println("Nhập mã dịch vụ (SVVL-YYYY, x là số từ 0-9): ");
        do {
            code = checkCodeFacility();
            checkExist = facilityController.checkExist(code);
            if (checkExist) {
                System.out.println("Mã villa đã tồn tại. Nhập lại");
            }
        } while (checkExist);
        Facility villa = inputInformationFacility();
        villa.setServiceCode(code);
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandards = checkNameFacility();
        System.out.println("Nhập số tầng");
        Integer numberOfFloor = inputNumberOfFloor();
        System.out.println("Nhập diện tích hồ bơi");
        double poolArea = checkArea();
//        room.getServiceCode(),room.getServiceName(),room.getUsableArea(),room.getRentalCosts(),room.getMaximumPeople(),
//                room.getRentalType(),freeService
        Villa villa1 = new Villa(villa.getServiceCode(), villa.getServiceName(), villa.getUsableArea(), villa.getRentalCosts(),
                villa.getMaximumPeople(), villa.getRentalType(), roomStandards, poolArea, numberOfFloor);
        facilityController.addNewVilla(villa1);
        System.out.println("Thêm thành công");
    }


    private static void addNewHouse() {
        String code;
        boolean checkExist;
        System.out.println("Nhập mã dịch vụ (SVHO-YYYY, x là số từ 0-9): ");
        do {
            code = checkCodeFacility();
            checkExist = facilityController.checkExist(code);
            if (checkExist) {
                System.out.println("Mã house đã tồn tại. Nhập lại");
            }
        } while (checkExist);
        Facility house = inputInformationFacility();
        house.setServiceCode(code);
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandards = checkNameFacility();
        System.out.println("Nhập số tầng");
        Integer numberOfFloor = inputNumberOfFloor();
//        room.getServiceCode(),room.getServiceName(),room.getUsableArea(),room.getRentalCosts(),room.getMaximumPeople(),
//                room.getRentalType(),freeService
        House house1 = new House(house.getServiceCode(), house.getServiceName(), house.getUsableArea(), house.getRentalCosts(),
                house.getMaximumPeople(), house.getRentalType(), roomStandards, numberOfFloor);
        facilityController.addNewHouse(house1);
        System.out.println("Thêm thành công");
    }

    private static Integer inputNumberOfFloor() {
        int number;
        do {
            number = Integer.parseInt(scanner.nextLine());
            if (number <= 0) {
                System.out.println("Số tầng phải lớn hơn 0 và nguyên");
            }
        } while (number <= 0);
        return number;
    }


    private static void addNewRoom() {
        String code;
        boolean checkExist;
        System.out.println("Nhập mã dịch vụ (SVRO-YYYY, x là số từ 0-9): ");
        do {
            code = checkCodeFacility();
            checkExist = facilityController.checkExist(code);
            if (checkExist) {
                System.out.println("Mã đã tồn tại. Nhập mã mới");
            }
        } while (checkExist);
        Facility room = inputInformationFacility();
        System.out.println("Nhập dịch vụ miễn phí kèm theo");
        String freeService = scanner.nextLine();
        room.setServiceCode(code);
        Room room1 = new Room(room.getServiceCode(), room.getServiceName(), room.getUsableArea(), room.getRentalCosts(), room.getMaximumPeople(),
                room.getRentalType(), freeService);
        facilityController.addNewRoom(room1);
        System.out.println("Thêm thành công");

    }
    //    Mã dịch vụ, Tên dịch vụ, Diện tích sử dụng, Chi phí thuê,
//    Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.

    private static Facility inputInformationFacility() {
        System.out.println("Nhập tên dịch vụ");
        String name = checkNameFacility();
        System.out.println("Nhập diện tích sử dụng");
        Double area = checkArea();
        System.out.println("Nhập chi phí");
        Long cost = checkCost();
        System.out.println("Số người tối đa");
        Integer maxPeople = checkMaxPeople();
        System.out.println("Nhập kiểu thuê");
        String rentalType = selectType();
        return new Facility(name, area, cost, maxPeople, rentalType);
    }

    private static String selectType() {
        String rentalType = null;
        System.out.println("1. Theo năm\n" +
                "2. Theo tháng\n" +
                "3. Theo Ngày\n" +
                "4. Theo giờ");
        choice = NumberFormat.checkChoice(choice);
        switch (choice) {
            case 1:
                rentalType = "Theo năm";
                break;
            case 2:
                rentalType = "Theo tháng";
                break;
            case 3:
                rentalType = "Theo ngày";
                break;
            case 4:
                rentalType = "Theo giờ";
                break;
        }
        return rentalType;
    }

    private static Integer checkMaxPeople() {
        int maxPeople = 0;
        do {
            try {
                maxPeople = Integer.parseInt(scanner.nextLine());
                if (maxPeople <= 0 || maxPeople >= 20) {
                    System.out.println("Số lượng phải lớn hơn 0 và nhỏ hơn 20");
                }
            } catch (NumberFormatException e) {
                System.err.println("Phải là số");
            }
        } while (maxPeople <= 0 || maxPeople >= 20);
        return maxPeople;
    }

    private static Long checkCost() {
        long cost = 0;
        do {
            try {
                cost = Long.parseLong(scanner.nextLine());
                if (cost <= 0) {
                    System.out.println("Chi phí phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Phải là số");
            }

        } while (cost <= 0);
        return cost;
    }

    private static double checkArea() {
        double area = 0;
        do {
            try {
                area = Double.parseDouble(scanner.nextLine());
                if (area <= 30) {
                    System.out.println("Diện tích phải lớn hơn 30m2. Nhập lại");
                }
            } catch (NumberFormatException e) {
                System.err.println("Phải là số");
            }

        } while (area <= 30);
        return area;
    }

    private static String checkNameFacility() {
        String name;
        boolean checkName;
        do {
            name = scanner.nextLine();
            checkName = Pattern.matches("^[A-Z]\\w+$", name);
            if (!checkName) {
                System.out.println("Phải viết hoa chữ cái đầu");
            }
        } while (!checkName);
        return name;
    }

    private static String checkCodeFacility() {
        String code;
        boolean checkCodeRoom;
        do {
            code = scanner.nextLine();
            checkCodeRoom = Pattern.matches("^SV(RO|HO|VL)-[0-9]{4}$", code);
            if (!checkCodeRoom) {
                System.out.println("Mã không đúng định dạng");
            }
        } while (!checkCodeRoom);
        return code;
    }

    private static void displayListFacility() {
        Map<Facility, Integer> facilityMap = facilityController.getAll();
        Set<Facility> facilitySet = facilityMap.keySet();
        for (Facility facility : facilitySet) {
            System.out.println(facility);
        }
    }

    private static void displayCustomerMenu() {
        do {
            System.out.println("-----Customer Manager----\n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Delete customer\n" +
                    "5. Search by name customer\n" +
                    "6. Return main menu");
            System.out.println("Chọn chức năng");
            choice = NumberFormat.checkChoice(choice);
            switch (choice) {
                case 1:
                    displayCustomerList();
                    break;
                case 2:
                    addNewCustomer();
                    break;
                case 3:
                    editCustomer();
                    break;
                case 4:
                    removeCustomer();
                    break;
                case 5:
                    searchByNameCustomer();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (true);

    }

    private static void searchByNameCustomer() {
        System.out.println("Nhập tên khách hàng muốn tìm");
        String name = scanner.nextLine();
        List<Customer> customerList = customerController.searchByNameCustomer(name);
        if (customerList.isEmpty()) {
            System.out.println("Không có khách hàng nào tương tự");
        } else {
            for (Customer customer1 : customerList) {
                System.out.println(customer1);
            }
        }
    }

    private static void removeCustomer() {
        do {
            code = inputCodeCustomer();
            findCode = customerController.findCodeCustomer(code);
            if (findCode) {
                System.out.println("Bạn muốn xóa khách hàng có mã: " + code + "\n" +
                        "1. Xóa\n" +
                        "2. Hủy");
                choice = NumberFormat.checkChoice(choice);
                if (choice == 1) {
                    customerController.removeCustomer(code);
                    System.out.println("Xóa thành công!");
                }
            } else {
                System.out.println("Không tìm được nhân viên có mã: " + code);
            }
        } while (!findCode);

    }

    private static void editCustomer() {
        do {
            code = inputCodeCustomer();
            findCode = customerController.findCodeCustomer(code);
            if (findCode) {
                customer = inputInformationCustomer();
                customer.setCode(code);
                customerController.editCustomer(customer);
                System.out.println("Sửa thông tin thành công!");
            } else {
                System.out.println("Không tìm thấy mã khách hàng");
            }
        } while (!findCode);

    }

    private static void addNewCustomer() {
        do {
            code = inputCodeCustomer();
            findCode = customerController.findCodeCustomer(code);
            if (findCode) {
                System.out.println("Code trùng. Nhập lại");
            } else {
                customer = inputInformationCustomer();
                customer.setCode(code);
                customerController.addCustomer(customer);
                System.out.println("Thêm thành công!");
            }
        } while (findCode);

    }

    //customer.getCode()+COMA+customer.getName()+COMA+
//            customer.getDateOfBirth()+COMA+customer.getGender()+COMA+customer.getIdCard()+
//    COMA+customer.getPhoneNumber()+COMA+customer.getEmail()+COMA+
//            customer.getStyleCustomer()+COMA+customer.getAddress());
    private static Customer inputInformationCustomer() {
        System.out.println("Nhập tên khách hàng");
        String name = inputNameEmployAndCustomer();
        System.out.println("Nhập ngày sinh (Định dạng dd/mm/yyyy)");
        String date = inputDateOfBirth();
        System.out.println("Nhập giới tính");
        String gender = inputGender();
        System.out.println("Nhập số CMND (9-12 số)");
        String idCard = inputIdCard();
        System.out.println("Nhập số điện thoại");
        String phoneNumber = inputPhoneNumber();
        System.out.println("Nhập email");
        String email = inputEmail();
        System.out.println("Chọn loại khách");
        String styleCustomer = inputStyleCustomer();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        return new Customer(name, date, gender, idCard, phoneNumber, email, styleCustomer, address);
    }

    private static String inputStyleCustomer() {
        String style = null;
        System.out.println("1. Diamond\n" +
                "2. Platinum\n" +
                "3. Gold\n" +
                "4. Silver\n" +
                "5. Member");
        choice = NumberFormat.checkChoice(choice);
        switch (choice) {
            case 1:
                style = "Diamond";
                break;
            case 2:
                style = "Platinum";
                break;
            case 3:
                style = "Gold";
                break;
            case 4:
                style = "Silver";
                break;
            case 5:
                style = "Member";
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
        return style;
    }

    private static String inputEmail() {
        boolean checkEmail;
        String email;
        String[]lengthName;
        do {
            email = scanner.nextLine();
            checkEmail = Pattern.matches("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$", email);
            if (!checkEmail) {
                System.out.println("Email không đúng");
            }else {
              lengthName = email.split("@");
              if (lengthName[0].isEmpty() || lengthName[0].length()>50){
                  checkEmail = false;
              }
            }
        } while (!checkEmail);
        return email;
    }

    private static String inputCodeCustomer() {
        System.out.println("Nhập code khách hàng (Định dạng KH-YYYY ,Y là số)");
        boolean checkCodeCustomer;
        do {
            code = scanner.nextLine();
            checkCodeCustomer = Pattern.matches("KH-[0-9]{4}", code);
            if (!checkCodeCustomer) {
                System.out.println("Code phải đúng định dạng");
            }
        } while (!checkCodeCustomer);
        return code;
    }

    private static void displayCustomerList() {
        System.out.println("-----Danh sách khách hàng----");
        List<Customer> customerList;
        customerList = customerController.getAll();
        if (customerList==null){
            System.out.println("Danh sách rỗng");
        }else {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }
    }

    private static void displayEmployMenu() {
        do {
            System.out.println("-----Employ Manager----\n" +
                    "1. Hiển thị danh sách nhân viên\n" +
                    "2. Thêm nhân viên mới\n" +
                    "3. Chỉnh sửa nhân viên theo mã\n" +
                    "4. Xóa nhân viên\n" +
                    "5. Tìm nhân viên theo tên\n" +
                    "6. Quay lại");
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
                    searchByNameEmployee();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (true);
    }

    private static void searchByNameEmployee() {
        System.out.println("Nhập tên nhân viên cần tìm");
        String name = scanner.nextLine();
        List<Employee> employees = employController.searchByName(name);
        if (employees.isEmpty()) {
            System.out.println("Không có nhân viên nào có tên " + name);
        } else {
            for (Employee employee1 : employees) {
                System.out.println(employee1);
            }
        }

    }

    private static void removeEmployee() {
        code = inputCodeEmployee();
        findCode = findEmployeeByCode(code);
        if (findCode) {
            System.out.println("Bạn muốn xóa nhân viên có mã " + code + "\n" +
                    "1. Xóa\n" +
                    "2. Hủy");
            choice = NumberFormat.checkChoice(choice);
            if (choice == 1) {
                if (findCode){
                    employController.removeEmployee(code);
                    System.out.println("Xóa thành công");
                }else {
                    System.out.println("Xóa không thành công");
                }
            }
        }
    }

    private static void editEmployee() {
        do {
            code = inputCodeEmployee();
            findCode = findEmployeeByCode(code);
            if (!findCode) {
                System.out.println("Code không tồn tại.");
            } else {
                employee = employController.getEmployee(code);
                System.out.println(employee);
                System.out.println("Bạn muốn sửa: \n" +
                        "1. Toàn bộ thông tin\n" +
                        "2. Một số thông tin\n" +
                        "3. Hủy");
                choice = NumberFormat.checkChoice(choice);
                switch (choice){
                    case 1:
                        editAll();
                        break;
                    case 2:
                        editSomeInformation();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }
//                System.out.println("Nhập thông tin sửa");
//                employee = informationEmployee();
//                employee.setCode(code);
//                employController.editEmployee(employee);
//                System.out.println("Sửa thành công");
            }
        } while (!findCode);


    }

    private static void editSomeInformation() {
        do {
            System.out.println(employController.getEmployee(code));
            System.out.println("Chọn thông tin cần sửa\n" +
                    "1. Họ và tên\n" +
                    "2. Ngày Sinh\n" +
                    "3. Giới tính\n" +
                    "4. Số CMND\n" +
                    "5. Số điện thoại\n" +
                    "6. Email\n" +
                    "7. Trình độ\n" +
                    "8. Vị Trí\n" +
                    "9. Lương\n" +
                    "10. Thoát");
            choice = NumberFormat.checkChoice(choice);
            switch (choice){
                case 1:
                    System.out.println("Tên cũ: "+employee.getName());
                    System.out.println("Nhập tên mới");
                    String name;
                    name = inputNameEmployAndCustomer();
                    employee.setName(name);
                    break;
                case 2:
                    System.out.println("Ngày sinh cũ: "+employee.getDateOfBirth());
                    System.out.println("Nhập ngày sinh");
                    String day;
                    day = inputDateOfBirth();
                    employee.setDateOfBirth(day);
                    break;
                case 3:
                    System.out.println("Giới tính: "+employee.getGender());
                    System.out.println("Chọn giới tính: ");
                    String gender;
                    gender = inputGender();
                    employee.setGender(gender);
                    break;
                case 4:
                    System.out.println("Số CMND: "+employee.getIdCard());
                    System.out.println("Nhập số CMND mới: ");
                    String idCard;
                    idCard = inputIdCard();
                    employee.setIdCard(idCard);
                    break;
                case 5:
                    System.out.println("Số điện thoại: "+employee.getPhoneNumber());
                    System.out.println("Nhập số điện thoại: ");
                    String phoneNumber;
                    phoneNumber = inputPhoneNumber();
                    employee.setPhoneNumber(phoneNumber);
                    break;
                case 6:
                    System.out.println("Email cũ: "+employee.getEmail());
                    System.out.println("Nhập e mail mới: ");
                    String email;
                    email = inputEmail();
                    employee.setEmail(email);
                    break;
                case 7:
                    System.out.println("Trình độ cũ: "+employee.getLevel());
                    System.out.println("Chọn trình độ: ");
                    String level;
                    level = selectLevelEmploy();
                    employee.setLevel(level);
                    break;
                case 8:
                    System.out.println("Vị trí: "+employee.getLocation());
                    System.out.println("Chọn vị trí mới: ");
                    String location;
                    location = selectLocation();
                    employee.setGender(location);
                    break;
                case 9:
                    System.out.println("Lương cũ: "+employee.getWage());
                    System.out.println("Nhập lương mới: ");
                    Long wage;
                    wage = inputWage();
                    employee.setWage(wage);
                    break;
                case 10:
                    return;
            }
            employController.editEmployee(employee);
            System.out.println("Sửa thành công");
        }while (true);

    }

    private static void editAll() {
        System.out.println(employController.getEmployee(code));
        System.out.println("Nhập thông tin sửa");
                employee = informationEmployee();
                employee.setCode(code);
                employController.editEmployee(employee);
                System.out.println("Sửa thành công");
    }

    private static boolean findEmployeeByCode(String code) {
        return employController.findCode(code);
    }

    private static void addNewEmployee() {
        do {
            code = inputCodeEmployee();
            findCode = findEmployeeByCode(code);
            if (findCode) {
                System.out.println("Code trùng. Chọn code khác");
            } else {
                employee = informationEmployee();
                employee.setCode(code);
                employController.addEmployee(employee);
                System.out.println("Thêm thành công");
            }
        } while (findCode);
    }

    private static void displayEmployeeList() {
        List<Employee> employeeList;
        System.out.println("---Danh sách nhân viên---");
        employeeList = employController.getAll();
        if (employeeList == null) {
            System.out.println("Không có nhân viên nào");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }

    }

    private static Employee informationEmployee() {
        System.out.println("Nhập họ và tên(Viết hoa chữ cái đầu)");
        String name = inputNameEmployAndCustomer();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = inputDateOfBirth();
        System.out.println("Chọn giới tính");
        String gender = inputGender();
        System.out.println("Nhập số CMND(9-12 số): ");
        String idCard = inputIdCard();
        System.out.println("Nhập số điện thoại(bắt đầu bằng số 0,gồm 10 số)");
        String phoneNumber = inputPhoneNumber();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Chọn trình độ");
        String level = selectLevelEmploy();
        System.out.println("Vị trí");
        String location = selectLocation();
        System.out.println("Nhập lương");
        Long wage = inputWage();
        return new Employee(name, dateOfBirth, gender, idCard, phoneNumber,
                email, level, location, wage);
    }

    private static String inputDateOfBirth() {
        String date = null;
        boolean checkDate;
        int year;
        int month;
        LocalDate localDate = LocalDate.now();
        int yearNow = localDate.getYear();
        int monthNow = localDate.getMonthValue();
        int dayNow = localDate.getDayOfMonth();
        int age;
        int checkMonth;
        int day;
        int checkDay;
        do {
            date = scanner.nextLine();
            checkDate = Pattern.matches("^([012][0-9]|3[12])/(0[0-9]|1[12])/(1[0-9]{3}|2[0-9]{3})$", date);
            if (!checkDate) {
                System.out.println("Nhập đúng định dạng dd/mm/yyyy hoặc bạn chưa đủ 18 tuổi");
            }
            year = Integer.parseInt(date.substring(6));
            month = Integer.parseInt(date.substring(3, 5));
            day = Integer.parseInt(date.substring(0, 2));
            checkMonth = monthNow - month;
            age = yearNow - year;
            checkDay = dayNow - day;
            if (age == 18) {
                if (checkMonth == 0) {
                    if (checkDay < 0) {
                        checkDate = false;
                        System.out.println("Bạn Không đủ tuổi");
                    }
                }
            } else if (age < 18) {
                checkDate = false;
                System.out.println("Bạn không đủ tuổi");
            }

        } while (!checkDate);
        return date;
    }

    private static String inputGender() {
        String gender = null;
        System.out.println("1. Nam\n" +
                "2. Nữ\n" +
                "3. Khác");
        choice = NumberFormat.checkChoice(choice);
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
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
        return gender;
    }

    private static Long inputWage() {
        long wage = 0;
        do {
            try {
                wage = Long.parseLong(scanner.nextLine());
                if (wage <= 0) {
                    System.out.println("Lương phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Phải là số");
            }

        } while (wage <= 0);
        return wage;
    }

    private static String selectLocation() {
        String location = null;
        System.out.println("1. Lễ tân\n" +
                "2. Phục vụ\n" +
                "3. Chuyên viên\n" +
                "4. Giám sát\n" +
                "5. Quản lý\n" +
                "6. Giám đốc");
        choice = NumberFormat.checkChoice(choice);
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

    private static String selectLevelEmploy() {
        String level = null;
        System.out.println("1. Trung cấp\n" +
                "2. Cao Đẳng\n" +
                "3. Đại học\n" +
                "4. Sau đại học");
        choice = NumberFormat.checkChoice(choice);
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

    private static String inputNameEmployAndCustomer() {
        boolean checkName;
        String name;
        do {
            name = scanner.nextLine();
            checkName = Pattern.matches("^([A-Z].+(\\S|\\s)){2,}$", name);
//            checkName = Pattern.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", name);
            if (!checkName) {
                System.out.println("Viết hoa kí tự đầu của mỗi từ");
            }else if (name.length()>50){
                System.out.println("Độ dài không đúng");
                checkName = false;
            }
        } while (!checkName);
        return name;
    }

    private static String inputCodeEmployee() {
        boolean checkCode;
        System.out.println("Nhập mã nhân viên (NV-xxxx, x là số)");
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
