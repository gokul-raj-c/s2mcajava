import java.util.*;

class Employee {
    int basic;
    Employee() {  
        basic = 10000;
    }
    void calculateSalary() {
        System.out.println("General Salary Package: " + basic);
    }
}

class Manager extends Employee {
    int manager;
    Manager(int msal) {
        manager = msal;
        
    }
    void calculateSalary() {
        System.out.println("Salary for Manager is: " + manager);
    }
}

class Programmer extends Employee {
    int pgmers;
    Programmer(int psal) {
        pgmers = psal;
      
    }
    void calculateSalary() {
        System.out.println("Salary for Programmer is: " + pgmers);
    }
}

class pgm141 {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);

        
        System.out.println("Enter the salary of Manager:");
        int msal = s1.nextInt();
        
        System.out.println("Enter the salary of Programmer:");
        int psal = s1.nextInt();
        
        Employee emp = new Employee();
        emp.calculateSalary();
        
        Manager mn = new Manager(msal);
        mn.calculateSalary();
        
        Programmer pg = new Programmer(psal);
        pg.calculateSalary();
        
        s1.close();
    }
}
