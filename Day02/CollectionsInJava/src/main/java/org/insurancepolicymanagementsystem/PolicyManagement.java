package org.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManagement {
    // method to retrieve a policy by policyNumber
    void retrievePolicy(HashMap<String, Policy> policyHashMap, String policyNumber) {
        if (!policyHashMap.containsKey(policyNumber)) { // if policy does not exist
            System.out.println("Policy Does Not Exist!");
            return;
        }

        Policy obj = policyHashMap.get(policyNumber);
        // displaying data of the policy
        System.out.println("Holder Name: " + obj.getHolderName() + "\nExpiry Date: " + obj.getExpiryDate());
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

    // listing all policies in the name of one person only
    void listAll(HashMap<String, Policy> policy1, TreeMap<LocalDate, String> policy2, LinkedHashMap<String, Policy> policy3, String person) {
        // clearing HashMap and TreeMap
        policy1.clear();
        policy2.clear();

        // using an Iterator to safely modify policy3
        Iterator<Map.Entry<String, Policy>> iterator = policy3.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Policy> entry = iterator.next();
            String key = entry.getKey();
            Policy value = entry.getValue();

            // inserting values into the other maps
            policy1.put(person, value);
            policy2.put(value.getExpiryDate(), person);

            // removing from policy3 using Iterator
            iterator.remove();
        }
    }

    // method to remove all expired policies from all maps
    void removeExpirePolicies(HashMap<String,Policy>policy1, TreeMap<LocalDate,String>policy2, LinkedHashMap<String,Policy>policy3) {
        policy2.forEach((key, value) -> {
            if(key.isBefore(LocalDate.now())) { // if expiry date of policy was before current date
                policy1.remove(value);
                policy3.remove(value);
                policy2.remove(key);
            }
        });
    }
}
