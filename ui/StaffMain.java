package ui;

import business.AllowanceCalulator;
import business.EmployeeManagement;
import entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffMain {

    static Scanner scan = new Scanner(System.in);

    static Employee createNewEmployee() {
        System.out.println("Do you want to create a Staff or a Teacher (enter S for Staff, other for Teacher");

        String choice = scan.next();
        scan.nextLine();
        if (choice.equalsIgnoreCase("s")) {
            Staff s = new Staff();
            System.out.println("Staff name: ");
            String  fullName = scan.nextLine();
            s.setFullName(fullName);


            System.out.println("Staff department: ");
            String dept = scan.nextLine();
            s.setDepartment(dept);

            System.out.println("Staff position (1-HEAD; 2-VICE HEAD; 3-STAFF): ");
            int position = scan.nextInt();
            if (position == 1) {
                s.setPosition(EPosition.HEAD);
            } else if (position == 2) {
                s.setPosition(EPosition.VICE_HEAD);
            } else {
                s.setPosition(EPosition.VICE_HEAD);
            }

            System.out.println("No of working day: ");
            float noOfWorkingDay = scan.nextFloat();
            s.setNoOfWorkingDay(noOfWorkingDay);

            return s;
        } else {
            Teacher t = new Teacher();
            System.out.println("Teacher name: ");
            String fullName = scan.nextLine();
            t.setFullName(fullName);
            scan.nextLine();

            System.out.println("Teacher faculty: ");
            String faculty = scan.nextLine();
            t.setFaculty(faculty);

            System.out.println("Staff degree (1-BACHELOR, 2-MASTER, 3-DOCTOR): ");
            int degree = scan.nextInt();
            if (degree == 1) {
                t.setDegree(EDegree.BACHELOR);
            } else if (degree == 2) {
                t.setDegree(EDegree.MASTER);
            } else {
                t.setDegree(EDegree.DOCTOR);
            }

            System.out.println("Teaching Hours: ");
            int teachingHours = scan.nextInt();
            t.setTeachingHours(teachingHours);

            System.out.println("Salary ratio: ");
            float salaryRatio = scan.nextFloat();
            t.setSalaryRatio(salaryRatio);

            return t;
        }
    }

    static void display(ArrayList<Employee> list) {
        System.out.println("Results: ");
        for (Employee e : list) {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {


        EmployeeManagement employeeManagement = new EmployeeManagement();

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("University Staff Management");
            System.out.println("\t1.Add staff");
            System.out.println("\t2.Search staff by name");
            System.out.println("\t3.Search staff by department/faculty");
            System.out.println("\t4.Display all staff");
            System.out.println("\t5.Exit");
            System.out.println("Select function (1,2,3,4 or 5): ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    Employee emp = createNewEmployee();
                    float allowance = AllowanceCalulator.calculateAllowance(emp);
                    emp.setAllowance(allowance);
                    employeeManagement.addEmployee(emp);
                    break;
                }
                case 2: {
                    System.out.println("\tEnter name to seach: ");
                    scan = new Scanner(System.in);
                    String dept = scan.nextLine();
                    ArrayList<Employee> foundByName = employeeManagement.searchByName(dept);
                    display(foundByName);
                    break;
                }
                case 3: {
                    System.out.println("\tEnter department/faculty to seach: ");
                    scan = new Scanner(System.in);
                    String dept = scan.nextLine();
                    ArrayList<Employee> foundByDept = employeeManagement.searchByName(dept);
                    display(foundByDept);
                    break;
                }
                case 4: {
                    ArrayList<Employee> list = employeeManagement.listAll();
                    display(list);
                    break;
                }
                case 5: {
                    keepRunning = false;
                }
            }
        }
    }
}
