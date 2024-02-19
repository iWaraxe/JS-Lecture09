package com.coherentsolutions.section2.example5;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void testStudentSave() {
        // Create a mock Database object
        Database mockDatabase = mock(Database.class);

        // Create a Student object with the mock Database
        Student student = new Student(mockDatabase);

        // Perform the save operation
        student.persist();

        // Verify if the save method on the mock Database object is called
        verify(mockDatabase, times(1)).save(any(Student.class));
    }
}
