public class Main {
    public final static int EMPLOYEE_NUMBER = 10;
    private static final Employee[] employees = new Employee[EMPLOYEE_NUMBER];
    public static void main(String[] args) {
        employees[0] = new Employee("Евгений Васильев", 65_000, 1);
        employees[1] = new Employee("Леонтий Хирсамов", 30_000, 2);
        employees[2] = new Employee("Евгений Салий", 390_000, 3);
        employees[3] = new Employee("Валерия Никитьева", 125_000, 4);
        employees[4] = new Employee("Василий Бойко", 60_500, 1);
        employees[5] = new Employee("Вячеслав Олегов", 100_000, 5);
        employees[6] = new Employee("Кристина Олегова", 310_300, 5);
        employees[7] = new Employee("Мирон Капустин", 89_000, 2);
        employees[8] = new Employee("Евгений Герасимов", 99_999, 3);
        employees[9] = new Employee("Екатерина Петрова", 75_000, 4);

        printEmployees();

        System.out.println("Сумма всех зарплат: " + getSalarySum());

        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary());

        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary());

        System.out.println("Средняя зарплата сотрудников: " + getAverageSalary());

        printEmployeeFullName();
    }
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static int getSalarySum() {
        int sum = 0;

        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }
    private static Employee getEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee: employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }
    private static Employee getEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee: employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
    private static double getAverageSalary() {
        return (double) getSalarySum() / employees.length;
    }
    public static void printEmployeeFullName() {
        for (Employee employee: employees) {
            System.out.println("Фамилия и имя сотрудника: " + employee.getFullName());
        }
    }
}