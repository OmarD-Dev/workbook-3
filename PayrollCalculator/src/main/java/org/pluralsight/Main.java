package org.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        try {
            String readName= userInput(scanner,"Enter the name of the employee file to process:" );
            FileReader fileReader = new FileReader(readName);
            BufferedReader buffReader = new BufferedReader(fileReader);
            String input;

            String fileName= userInput(scanner,"Enter the name of the payroll file to create:");
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            buffReader.readLine(); // reads the current line & moves on to the next line
            bufferedWriter.write("id|name|pay");
            bufferedWriter.newLine();

            while ((input = buffReader.readLine()) != null) { // while loop starts from line 2 of employees.csv
                //System.out.println(input);
                String[] employeeTokens = (input.toString()).split("\\|");

                var employeeID = Integer.parseInt(employeeTokens[0]);
                var employeeName = employeeTokens[1];
                var hoursWorked = Double.parseDouble(employeeTokens[2]);
                var payRate = Double.parseDouble(employeeTokens[3]);

                Employee e = new Employee(employeeID, employeeName, hoursWorked, payRate);
                System.out.printf(
                        "\nEmployeeID: %d, \nEmployeeName: %s, \nEmployeePay: $%.2f \n",
                        e.getEmployeeId(), e.getName(), e.getCrossPay()
                );
                String employeePayroll= e.getEmployeeId() +"| " +e.getName()+" |"+e.getCrossPay();
                bufferedWriter.write(employeePayroll);
                bufferedWriter.newLine();
            }
            buffReader.close();
            bufferedWriter.close();



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String userInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        String fileName= scanner.nextLine() +".csv";
        return fileName;
    }
}