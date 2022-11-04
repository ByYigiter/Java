import java.time.LocalDate;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYears;

    public static void main(String[] args) {
        Employee employee =new Employee("Ali",1500,45,2009);
        Employee employee1 =new Employee();

        double tax= employee1.tax(employee.salary);// ************static olmayanlar obje userinden ancak ulasabilirler.**********

        double bonus =employee1.bonus(employee.workHours);

        double raise =raiseSalary(employee.hireYears,employee.salary);// static ile olmayn farkı belli olsun diye yaptım

        double sumSalary = employee.salary-tax+bonus+raise;
        System.out.println("sumSalary \t\t\t\t: " + sumSalary);

    }

    private static double raiseSalary(int hireYears ,double salary) {
        LocalDate now =LocalDate.now();
        int year = now.getYear()-hireYears;
        double raise=0;
        if (year>9&&year<20){
            raise =salary*0.10;
        }else if(year<10){
            raise =salary*0.05;
        }
        System.out.println("salary raise \t\t\t: " + raise);
    return raise;
    }

    private  double bonus(int workHours) {
        double bonus =0;
        if (workHours>40){
            bonus = (workHours-40)*30;
            System.out.println("Bonus Fees \t\t\t\t: " + bonus);
        }
        return bonus;
    }

    public Employee(String name, double salary, int workHours,int hireYears) {
        this.name = name;
        this.salary= salary;
        this.workHours= workHours;
        this.hireYears=hireYears;
        System.out.println("-Name: "+name+" \n-Salary: "+salary+" \n-Hours a Week: "+workHours+" \n-Starting Year: "+hireYears);
    }
    public Employee(){

    }
    public  double tax(double salary){
        double tax=0;
        if(salary>=1000){tax =salary*0.03;
            System.out.println("amount of tax applied\t: "+ tax);

        }
        return tax;
    }

}
