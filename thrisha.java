import java.util.Arrays;

public class thrisha {

    static int accountNum = 12345;
    static String accountHolderName = "thrisha";
    static int accountBalance = 5000;
    static Boolean accountType = true;

    static int patientId = 12;
    static String patientName = "browine";
    static int patientAge = 2;
    static String bloodGroup = "B+";
    static String diseaseHistory = "Diabetes, fever";

    static int productId = 123456;
    static String productName = "Earphones";
    static int productPrice = 999;
    static boolean productAvailability = true;

    static String RestaurantName = "Bhavarchi";
    static String[] DishesList = {"Pizza", "Burger", "Pasta", "Sushi", "Salad"};
    static int[] DishesAveragePrices = {299, 99, 149, 229, 250};
      
    static int studentId = 1234;
    static String studentName = "Thrisha katukuri";
    static int studentAge = 20;
    static String studentCourse = "Full-Stack JAVA";
    static int studentFeeAmount = 40000;

    static int[] employeeID = {1001, 1002, 1003, 1004, 1005}; // Employee IDs
    static String[] employeename = {"Krishnaveni", "Thrisha", "Venni", "Jashu", "Bannu"};
    static double[] employeesalary = {800000, 100000, 30000, 61000, 120000}; 
    static String[] employeedepartment = {"IT", "HR", "Finance", "Operations", "Marketing"};

    static String movieName = "thrisha";
    static int movieDuration = 3;
    static int ticketPrice = 300;
    static Boolean Seats = true;

    static String userName = "brownie";
    static int age = 20;
    static int weight = 35;
    static int height = 5;
    static int steps = 7865;



public static void  displayBankDetails(){
    System.out.println("--------------------BankDetails--------------------");
    System.out.println("account Num               :" + accountNum);
    System.out.println("account Holder            :" + accountHolderName);
    System.out.println("account Balance           :" + accountBalance);
    System.out.println("account Type              :" + (accountType ? "savings" : "current"));
}

public static void displayPatientDetails() {
    System.out.println("--------------------PatientDetails--------------------");
    System.out.println("Patient ID                : " + patientId);
    System.out.println("Patient Name              : " + patientName);
    System.out.println("Age                       : " + patientAge);
    System.out.println("Blood Group               : " + bloodGroup);
    System.out.println("Disease History           : " + diseaseHistory);

}
public static void  Product() {
    System.out.println("--------------------ProductCatalog--------------------");
    System.out.println("product ID                 : " + productId);
    System.out.println("product Name               : " + productName);
    System.out.println("product Price              : " + productPrice);
    System.out.println("product Availability       : " + (productAvailability ? "avaialable" : "not-available"));
}
public static void  Restaurant(){
    System.out.println("--------------------RestaurantDetails--------------------");
    System.out.println(" RestaurantName            :" + RestaurantName);
        System.out.println("Dishes List            : " + Arrays.toString(DishesList));
        System.out.println("Dishes Average Prices  : " + Arrays.toString(DishesAveragePrices));
}
public static void students(){
    System.out.println("--------------------StudentsDetails--------------------");
    System.out.println("studentId                  :" + studentId);
    System.out.println("studentName                :" + studentName);
    System.out.println("studentAge                 :" + studentAge);
    System.out.println("studentCourse              :" + studentCourse);
    System.out.println("studentFeeAmount           :" + studentFeeAmount);
}
public static double[] calculateAnnualSalaries() {
    double[] annualSalaries = new double[employeesalary.length];
    for (int i = 0; i < employeesalary.length; i++) {
        annualSalaries[i] = employeesalary[i] * 12;
    }
    return annualSalaries;
}

public static void displayAnnualIncome() {
    double[] annualSalaries = calculateAnnualSalaries();
    for (int i = 0; i < employeename.length; i++) {
    System.out.println("--------------------EmployeeDetails--------------------");
        System.out.println("Employee ID              : " + employeeID[i]);
        System.out.println("Employee Name            : " + employeename[i]);
        System.out.println("Employee Salary          : " + employeesalary[i]);
        System.out.println("Employee Department      : " + employeedepartment[i]);
        System.out.println("Annual Salary            : " + annualSalaries[i]);
    }
}
public static void  movieBook(){
    System.out.println("--------------------ticketsDetails--------------------");
    System.out.println(" movieName                   :" + movieName);
        System.out.println("movieDuration            : " + movieDuration + "hours");
        System.out.println("ticketPrice              : " + ticketPrice);
        System.out.println("Seats                    : " + (Seats ? 12 : 0) + "seats");

}
public static double calculateBMI() {
    return weight / (height * height);
}
public static void fitness() {
    System.out.println("--------------------FitnessDetails--------------------");
    System.out.println("userName                     :" + userName );
    System.out.println("age                          :" + age);
    System.out.println("weight                       :" + weight);
    System.out.println("height                       :" + height);
    System.out.println("steps                        :" + steps);


    double bmi = calculateBMI();
    System.out.printf("BMI              : %.2f\n", bmi);
    System.out.print("BMI Category     : ");
    if (bmi < 18.5) {
        System.out.println("Underweight");
    } else if (bmi >= 18.5 && bmi < 24.9) {
        System.out.println("Normal weight");
    } else if (bmi >= 25 && bmi < 29.9) {
        System.out.println("Overweight");
    } else {
        System.out.println("Obese");
    }
}

public static void main(String[] args) {
    displayBankDetails();
    displayPatientDetails();
    Product();
    Restaurant();
    students();
  displayAnnualIncome() ;
  movieBook();
  fitness();
}}
