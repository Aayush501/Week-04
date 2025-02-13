package org.insurancepolicy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
            // created hashmap, LinkedHashMap, and TreeMap to store associated data
            HashMap<String, Policy> policyHashMap;
            LinkedHashMap<String, Policy> policyLinkedHashMap = new LinkedHashMap<>();
            TreeMap<LocalDate, String> policyTreeMap = new TreeMap<>();

            // creating objects of Policy class
            Policy policy1 = new Policy("P-01", "Person1", "11-02-2025", 300, "Health", 5000);
            Policy policy2 = new Policy("P-02", "Person2", "10-02-2025", 200, "Auto", 8000);
            Policy policy3 = new Policy("P-03", "Person3", "09-02-2025", 200, "Home", 30000);
            Policy policy4 = new Policy("P-04", "Person4", "12-02-2025", 100, "Home", 25000);
            Policy policy5 = new Policy("P-05", "Person5", "13-02-2025", 250, "Auto", 10000);
            Policy policy6 = new Policy("P-06", "Person6", "08-02-2025", 300, "Health", 8000);
            Policy policy7 = new Policy("P-07", "Person7", "07-02-2025", 200, "Health", 6000);
            Policy policy8 = new Policy("P-08", "Person8", "06-02-2025", 100, "Auto", 12000);

            // adding data in LinkedHashMap to maintain the order of insertion
            policyLinkedHashMap.put(policy1.getPolicyNumber(), policy1);
            policyLinkedHashMap.put(policy2.getPolicyNumber(), policy2);
            policyLinkedHashMap.put(policy3.getPolicyNumber(), policy3);
            policyLinkedHashMap.put(policy4.getPolicyNumber(), policy4);
            policyLinkedHashMap.put(policy5.getPolicyNumber(), policy5);
            policyLinkedHashMap.put(policy6.getPolicyNumber(), policy6);
            policyLinkedHashMap.put(policy7.getPolicyNumber(), policy7);
            policyLinkedHashMap.put(policy8.getPolicyNumber(), policy8);

            // put data inside HashMap
            policyHashMap  = new HashMap<>(policyLinkedHashMap);
            // sorting Policies according to expiry dates
            policyLinkedHashMap.forEach((key, value) -> policyTreeMap.put(value.getExpiryDate(), key));

            // manipulating the data inside maps
            PolicyManagement obj = new PolicyManagement();

            // displaying the data

            // data retrieval
            obj.retrievePolicy(policyHashMap, "P-04");
            obj.retrievePolicy(policyHashMap, "P-06");
            obj.retrievePolicy(policyHashMap, "P-08");
            obj.retrievePolicy(policyHashMap, "P-02");

            obj.expiryChecker(policyTreeMap); // checking expiry for data
    }

}
