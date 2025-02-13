package org.insurancepolicy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Policy {
    // declaring attributes of this class
    private String number, holderName, coverageType;
    private LocalDate startDate, expiryDate;
    private double premiumAmount;

    // parameterized constructor to initialize the object
    Policy(String number, String holderName, String startDate, long durationInDays, String coverageType, double premiumAmount) {
        this.number = number;
        this.holderName = holderName;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.startDate = LocalDate.parse(startDate, dateFormat);
        this.expiryDate = this.startDate.plusDays(durationInDays);
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
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

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }
}
