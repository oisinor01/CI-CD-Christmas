package ie.atu;

import java.sql.SQLOutput;

public class Employee {
    String EmployeeName;
    int EmployeeNumber;

    public void setEmployeeName(String EmployeeName){
        this.EmployeeName=EmployeeName;

//        if (EmployeeName > 5){
//            System.out.println("Error name must be 12 digits long");
//        }


    }

    public void setEmployeeNumber(int EmployeeNumber){

        this.EmployeeNumber=EmployeeNumber;

        if (EmployeeNumber != 12){
            System.out.println("Error number must be 12 digits long");
        }
    }

    public String EmployeeName(String oisin) {

        return EmployeeName;
    }

    public int EmployeeNumber(String s){

        return EmployeeNumber;

    }


}




