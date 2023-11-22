package furama_resort.models;

public class Contract{
    private String contractId;
    private String bookingCode;
    private Long deposit;
    private Long totalPayment;

    public Contract() {
    }

    public Contract(String contractId, String bookingCode, Long deposit, Long totalPayment) {
        this.contractId = contractId;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Long getDeposit() {
        return deposit;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public Long getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Long totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId=" + contractId +
                ", bookingCode=" + bookingCode +
                ", deposit=" + deposit +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
