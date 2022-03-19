public class Employee {

    //Data
    String firstName, lastName;
    int id, floor;
    double salary;

    //Func
    public Employee(String firstName, String lastName, int id, int floor, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.floor = floor;
        this.salary = salary;
    }

    public void raiseUpSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void changeFloor(int newFloor) {
        this.floor = newFloor;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", floor=" + floor +
                ", salary=" + salary +
                '}';
    }
}





