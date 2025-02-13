package org.insurancepolicymanagementssystem;

import java.util.*;

class Policy implements Comparable<Policy> {

    // creating maps
    HashSet<Policy> hashSet;
    LinkedHashSet<Policy> linkedHashSet;
    TreeSet<Policy> treeSet;

    // creating attributes of Policy class
    int policyNumber;
    String holderName;
    int expiryDate;
    String coverageType;
    int premiumAmount;

    // non parameterized constructor to initialize the objects
    Policy(){
        hashSet = new HashSet<>();
        linkedHashSet = new LinkedHashSet<>();
        treeSet = new TreeSet<>();
    }

    // parameterized constructor
    Policy(int policyNumber, String holderName, int expiryDate, String coverageType, int premiumAmount){
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // method to add elements in the maps
    public void addElements(int policyNumber, String holderName, int expiryDate, String coverageType, int premiumAmount){
        Policy policy = new Policy(policyNumber, holderName, expiryDate, coverageType, premiumAmount);

        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);

    }

    // method t display details of policies
    public void displayPolicy(Policy policy){
        System.out.println("Policy Number : " + policy.policyNumber);
        System.out.println("Policy Holder Name : " + policy.holderName);
        System.out.println("Policy expiry date : " + policy.expiryDate);
        System.out.println("Policy coverage type : " + policy.coverageType);
        System.out.println("Policy Premium amount : " + policy.premiumAmount);
        System.out.println();
    }

    // method to display all unique policies
    public void displayAll(){
        System.out.println("List of Policies : ");
        System.out.println();
        for (Policy policy : hashSet) {
            displayPolicy(policy);
        }
    }

    // method to retrieve data based on coverage type
    public void displayGroupedBasedOnCoverageType(String coverageType){
        for (Policy policy : hashSet) {
            if(policy.coverageType.equals(coverageType)){
                displayPolicy(policy);
            }
        }
    }

    // method to display policies in order of expiry dates
    public void displayByExpiryDate(){
        for (Policy policy : treeSet) {
            if(policy.expiryDate <= 30){
                displayPolicy(policy);
            }
            else{
                break;
            }
        }
    }

    // method to display duplicate policies based on policy number
    public void displayDuplicate(int policyNumber){
        for (Policy policy : hashSet) {
            if(policy.policyNumber == policyNumber){
                displayPolicy(policy);
            }
        }
    }

    // overriding the compareTo method of comparable class
    @Override
    public int compareTo(Policy policy) {
        return Integer.compare(this.expiryDate, policy.expiryDate) ;
    }

    // method to compare the performances of different maps and linked hash set
    public void comparePerformance(Policy policy) {
        long start, end;

        // Adding performance
        start = System.nanoTime();
        hashSet.add(policy);
        end = System.nanoTime();
        System.out.println("HashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.add(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.add(policy);
        end = System.nanoTime();
        System.out.println("TreeSet Add: " + (end - start) + " ns");

        // Searching performance
        start = System.nanoTime();
        hashSet.contains(policy);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(policy);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start) + " ns");

        // Removing performance
        start = System.nanoTime();
        hashSet.remove(policy);
        end = System.nanoTime();
        System.out.println("HashSet Remove: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.remove(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Remove: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.remove(policy);
        end = System.nanoTime();
        System.out.println("TreeSet Remove: " + (end - start) + " ns");
    }

}

public class PolicyManagementSystem {

    public static void main(String[] args) {
        Policy policy = new Policy();
        policy.addElements(101, "Anshik", 56, "Health", 50000);
        policy.addElements(102, "Aayush", 80, "Health", 80000);
        policy.addElements(103, "Durgesh", 20, "Car", 20000);

        // managing the policy data
        policy.displayByExpiryDate();
        policy.displayGroupedBasedOnCoverageType("Health");
        policy.displayDuplicate(101);
        policy.comparePerformance(policy);
        policy.displayAll();
    }
}
