package jennifer.org.model;

import jennifer.org.Enums.Gender;

public class Customers extends Person {
    private String customerId;
    private Double walletBalance;

    public Customers(String name, Integer phoneNo, Gender gender, String customerId, Double walletBalance) {
        super(name, phoneNo, gender);
        this.customerId = customerId;
        this.walletBalance = walletBalance;


}

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(Double walletBalance) {
        this.walletBalance = walletBalance;
    }
}






