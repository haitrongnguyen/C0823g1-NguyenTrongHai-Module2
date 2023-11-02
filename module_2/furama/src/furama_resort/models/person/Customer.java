package furama_resort.models.person;

public class Customer extends Person{
    private String styleCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String code, String name, String dateOfBirth,
                    String gender, String idCard, String phoneNumber,
                    String email, String styleCustomer, String address) {
        super(code, name, dateOfBirth, gender, idCard, phoneNumber, email);
        this.styleCustomer = styleCustomer;
        this.address = address;
    }

    public Customer(String name, String date, String gender, String idCard, String phoneNumber, String email, String styleCustomer, String address) {
        super(name,date,gender,idCard,phoneNumber,email);
        this.styleCustomer = styleCustomer;
        this.address = address;
    }

    public String getStyleCustomer() {
        return styleCustomer;
    }

    public void setStyleCustomer(String styleCustomer) {
        this.styleCustomer = styleCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void booking(String codeBooking){

    }

    @Override
    public String toString() {
        return  super.toString()+
                ", styleCustomer: " + styleCustomer +
                ", address: " + address;
    }
}
