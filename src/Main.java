public class Main {
    public static void allInfo(Employee[] employee) {
        for (int i = 0; i < employee.length && employee[i] != null; i++) {
            System.out.println(employee[i]);
        }
    }

    public static void salaryMonth(Employee[] employee) {
        int salary = 0;
        for (int i = 0; i < employee.length && employee[i] != null; i++) {
            salary = salary + employee[i].getSalary();
        }
        System.out.println("Cуммa затрат на ЗП в месяц - " + salary);
    }

    public static void outsideSalary(Employee[] employee) {
        int salary = 9999999;
        int name = -1;
        for (int i = 0; i < employee.length && employee[i] != null; i++) {
            if (employee[i].getSalary() < salary) {
                salary = employee[i].getSalary();
                name = i;
            }
        }
        System.out.println("Минимальная зарплата - " + salary + " у сотрудника " + employee[name].getNickname());
    }

    public static void maxSalary(Employee[] employee) {
        int salary = 0;
        int name = -1;
        for (int i = 0; i < employee.length && employee[i] != null; i++) {
            if (employee[i].getSalary() > salary) {
                salary = employee[i].getSalary();
                name = i;
            }
        }
        System.out.println("Максимальная зарплата - " + salary + " у сотрудника " + employee[name].getNickname());
    }
    public static void averageSalary(Employee[] employee) {
        int salary = 0;
        int average = 0;
        for (int i = 0; i < employee.length && employee[i] != null; i++) {
            salary = salary + employee[i].getSalary();
            average = i + 1;
        }
        salary = salary / average;
        System.out.println("Средня зп у сотрудника - " + salary);

    }
    public static void allNicname(Employee[] employee) {
        for (int i = 0; i < employee.length && employee[i] != null; i++) {
            System.out.println(employee[i].getNickname());
        }

    }


    public static void main(String[] args) {
        Nickname trofimov = new Nickname("Трофимов", "Алексей", "Андреевич");
        Nickname pupkin = new Nickname("Пупкин", "Василий", "Васильевич");
        Nickname zubenko = new Nickname("Зубенко", "Михаил", "Петрович");
        Nickname ivanov = new Nickname("Иванов", "Иван", "Иванович");
        Nickname petrov = new Nickname("Петров", "Петр", "Михайлович");
        Nickname zagibok = new Nickname("Загибок", "Загиб", "Загибович");
        Employee rabotyaga1 = new Employee(trofimov, 1, 150000);
        Employee rabotyaga2 = new Employee(pupkin, 2, 90000);
        Employee rabotyaga3 = new Employee(zubenko, 3, 75580);
        Employee rabotyaga4 = new Employee(ivanov, 4, 120500);
        Employee rabotyaga5 = new Employee(petrov, 5, 87030);
        Employee rabotyaga6 = new Employee(zagibok, 2, 80050);
        Employee[] employee = new Employee[10];
        employee[0] = rabotyaga1;
        employee[1] = rabotyaga2;
        employee[2] = rabotyaga3;
        employee[3] = rabotyaga4;
        employee[4] = rabotyaga5;
        employee[5] = rabotyaga6;
        allInfo(employee);
        salaryMonth(employee);
        outsideSalary(employee);
        maxSalary(employee);
        averageSalary(employee);
        allNicname(employee);


    }
}