package org.insurancepolicy;

import java.time.LocalDate;
import java.util.*;

public class PolicyManagement {
    // method to retrieve a policy by criteria
    void retrievePolicy(HashMap<String, Policy> policyHashMap, String criteria) {
        if (policyHashMap.containsKey(criteria)) {
            Policy obj = policyHashMap.get(criteria);
            // displaying data of the policy
            System.out.println("(Holder Name: "+ obj.getHolderName() + ")(Expiry Date: " + obj.getExpiryDate()+")(Coverage Type: " + obj.getCoverageType() + ")(Premium Amount: " + obj.getPremiumAmount() + ")");
            return;
        }

        policyHashMap.forEach((key, value) -> {
            if(value.getCoverageType().equals(criteria)) {
                System.out.println(key + " = (Holder Name: "+ value.getHolderName() + ")(Expiry Date: " + value.getExpiryDate()+")(Coverage Type: " + value.getCoverageType() + ")(Premium Amount: " + value.getPremiumAmount() + ")");
                return;
            }
        });

        System.out.println("Policy Does Not Exist!");
    }

    // method to check which policies are going to expire in 30 days
    void expiryChecker(TreeMap<LocalDate, String> policyTreeMap) {
        // iteration through tree map
        policyTreeMap.forEach((key, value) -> {
            if (key.isBefore(LocalDate.now().plusDays(30))) {
                System.out.println(value + " is going to expire in 30 days.");
            }
        });
        System.out.println("No More Policies Are Going To Be Expired In 30 Days.");
    }

    // method to display all policies
    void displayAll(LinkedHashSet<Policy>policy3) {
        // displaying policy details
        System.out.println("LinkedHashSet: ");

    }
}
