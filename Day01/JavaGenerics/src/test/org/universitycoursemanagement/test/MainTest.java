package org.universitycoursemanagement.test;

import org.junit.jupiter.api.Test;
import org.universitycoursemanagement.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    // created a method to test the solution of universityCourseManagement code
    @Test
    public void testing() {
        // declaring the objects of various course classes
        ExamCourse test2 = new ExamCourse();
        AssignmentCourse test1 = new AssignmentCourse();
        ResearchCourse test3 = new ResearchCourse();

        // object of Course class
        Course<CourseType> course = new Course<>();

        // adding attributes to the objects and adding them to the storage
        test1.setCourseAttributes("Higher Secondary", 12);
        course.addCourse(test1);
        test2.setCourseAttributes("Engineering", 48);
        course.addCourse(test2);
        test3.setCourseAttributes("PHD", 24);
        course.addCourse(test3);

        // getting the list of items from course
        List<CourseType> expectedResult = course.getCourses();

        // performing tests
        assertEquals(test1, expectedResult.getFirst());
        assertEquals(test2, expectedResult.get(1));
        assertEquals(test3, expectedResult.get(2));
    }
}
