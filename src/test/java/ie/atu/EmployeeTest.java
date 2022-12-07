package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee EmployeeName;
    Employee EmployeeNumber;

    @BeforeEach
    void setUp() {
        EmployeeName = new Employee();
    }

    @Test
    void testName(){
        assertEquals("Oisin",EmployeeName.EmployeeName("Oisin"));
    }

    @Test
    void testNumber(){
        assertEquals("123456789100",EmployeeNumber.EmployeeNumber("123456789100"));
    }



    @AfterEach
    void tearDown() {
    }
}