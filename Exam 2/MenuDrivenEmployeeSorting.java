import java.util.*;
import java.time.LocalDate;
class Employee {
    String name;
    String job;
    double salary;
    LocalDate doj;
    Employee(String name, String job, double salary, LocalDate doj) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.doj = doj;
    }
    public String toString() {
        return name + " | " + job + " | " + salary + " | " + doj;
    }
}
public class MenuDrivenEmployeeSorting {
    static List<Employee> empList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1.Add Employee");
            System.out.println("2.Salary Ascending");
            System.out.println("3.Salary Descending");
            System.out.println("4.DOJ Ascending");
            System.out.println("5.DOJ Descending");
            System.out.println("6.Display");
            System.out.println("7.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    empList.sort(Comparator.comparingDouble(e -> e.salary));
                    display();
                    break;
                case 3:
                    empList.sort((a, b) -> Double.compare(b.salary, a.salary));
                    display();
                    break;
                case 4:
                    empList.sort(Comparator.comparing(e -> e.doj));
                    display();
                    break;
                case 5:
                    empList.sort((a, b) -> b.doj.compareTo(a.doj));
                    display();
                    break;
                case 6:
                    display();
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 7);
    }
    static void addEmployee() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Job: ");
        String job = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter DOJ (yyyy-mm-dd): ");
        LocalDate doj = LocalDate.parse(sc.nextLine());
        empList.add(new Employee(name, job, salary, doj));
    }
    static void display() {
        if (empList.isEmpty()) {
            System.out.println("No Records");
            return;
        }
        for (Employee e : empList) {
            System.out.println(e);
        }
    }
}