package com.techelevator.crm;
import com.techelevator.hr.Employee;
import org.junit.*;


import java.util.HashMap;
import java.util.Map;

public class EmployeeBillableTest {

    @Test
    public void employee_billable_test() {
        Employee employee = new Employee("Test", "Testerson");
        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("walking", 25.00);
        servicesRendered.put("grooming", 17.00);
        servicesRendered.put("watching", 72.00);

        double testBalance = employee.getBalanceDue(servicesRendered);
        double expectedBalance = ((25.00 + 17.00 + 72.00)/2);

        Assert.assertEquals(expectedBalance, testBalance, 0.0);
    }
}