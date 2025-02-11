package org.mealplangenerator.test;

import org.junit.jupiter.api.Test;
import org.mealplangenerator.*;
import org.universitycoursemanagement.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    // created a method to test the solution of mealPlanGenerator code
    @Test
    public void testing() {
        // object of Meal class
        Meal<MealPlan> meal = new Meal<>();

        // declaring the objects of various MealType classes
        MealPlan test1 = new VegetarianMeal("Vegetarian1", 250);
        MealPlan test2 = new VeganMeal("Vegan1", 300);
        MealPlan test3 = new KetoMeal("Keto1", 350);
        MealPlan test4 = new HighProteinMeal("HighProtein1", 300);

        // adding these to the meal list
        meal.addMeal(test1);
        meal.addMeal(test2);
        meal.addMeal(test3);
        meal.addMeal(test4);

        // getting the list of items from Meal
        List<MealPlan> expectedResult = meal.getMealList();

        // performing tests
        assertEquals(test1, expectedResult.getFirst());
        assertEquals(test2, expectedResult.get(1));
        assertEquals(test3, expectedResult.get(2));
        assertEquals(test4, expectedResult.get(3));
    }
}
