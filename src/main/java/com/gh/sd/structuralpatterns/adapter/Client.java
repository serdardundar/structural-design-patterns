package com.gh.sd.structuralpatterns.adapter;

public class Client {

    public static void main(String[] args) {
        /** Using class/Two-Way Adapter **/
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);

        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);

        System.out.println("****************************************************************");

        /** Using Object Adapter**/
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Magic Johnson");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Besiktas, Istanbul");
    }
}
