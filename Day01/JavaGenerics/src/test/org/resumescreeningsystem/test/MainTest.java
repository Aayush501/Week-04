package org.resumescreeningsystem.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.resumescreeningsystem.DataScientist;
import org.resumescreeningsystem.ProductManager;
import org.resumescreeningsystem.Resume;
import org.resumescreeningsystem.SoftwareEngineer;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTest {
    // created a method to test the solution of mealPlanGenerator code
    @Test
    public void testing() {
        // creating softwareEngineer object initialize the requiredSkills
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        Resume<SoftwareEngineer> resume1 = new Resume<>("Person1", new ArrayList<>(Arrays.asList("Java", "SpringBoot", "Angular", "JUnit")), softwareEngineer);

        // creating dataScientist object initialize the requiredSkills
        DataScientist dataScientist = new DataScientist();
        Resume<DataScientist> resume2 = new Resume<>("Person2", new ArrayList<>(Arrays.asList("Python", "PowerBI", "Visual Basics", "Java")), dataScientist);

        // creating productManager object initialize the requiredSkills
        ProductManager productManager = new ProductManager();
        Resume<ProductManager> resume3 = new Resume<>("Person3", new ArrayList<>(Arrays.asList("AWS", "Project management Tools", "Testing")), productManager);

        // creating a false test case
        Resume<ProductManager> resume4 = new Resume<>("Person4", new ArrayList<>(Arrays.asList("Project management Tools", "Testing")), productManager);

        // preparing testcases
        boolean test1 = resume1.isMatched(resume1, softwareEngineer);
        boolean test2 = resume2.isMatched(resume2, dataScientist);
        boolean test3 = resume3.isMatched(resume3, productManager);
        boolean test4 = resume4.isMatched(resume4, productManager);

        // performing tests
        assertTrue(test1);
        assertTrue(test2);
        assertTrue(test3);
        assertFalse(test4);
    }
}
