import java.util.Objects;

public class Employee {
    private int salary;
    private int department;
    private Nickname nickname;
    private static int counter = 1;
    private final int id;


    public Employee(Nickname nickname, int department, int salary) {
        this.nickname = nickname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }

    public int getSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return this.department;
    }


    public Nickname getNickname() {
        return this.nickname;
    }

    public String toString() {
        return "ФИО - " + getNickname() + ", номер отдела - " + getDepartment() + ", зарпата " + getSalary() + ", id сотрудника - " + id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(nickname, employee.nickname) && Objects.equals(salary, employee.salary) && Objects.equals(department, employee.department);
    }
    public int hashCode() {
        return Objects.hash(nickname);
    }



}