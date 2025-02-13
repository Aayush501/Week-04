package org.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Policy {
    // declaring attributes of this class
    private String number, holderName;
    private LocalDate startDate, expiryDate;

    // parameterized constructor to initialize the object
    Policy(String number, String holderName, String startDate, long durationInYears) {
        this.number = number;
        this.holderName = holderName;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.startDate = LocalDate.parse(startDate, dateFormat);
        this.expiryDate = this.startDate.plusYears(durationInYears);
    }

    // getter methods of this class
    public String getPolicyNumber() {
        return this.number;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
