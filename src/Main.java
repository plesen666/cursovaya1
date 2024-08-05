//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
       public static Employee createEmployee(String name, int unit, int salary) {
        Employee employee = new Employee(  name, unit, salary);
        return employee;
    }
public static int main (String[] args){

           Employee[] employees = new Employee[10];
           employees[0] = createEmployee( " Иванов И.И", 1, 10000);
           employees[1] = createEmployee( " Петров П.П", 2, 11100);
           employees[2] = createEmployee( " Сидоров С.С.", 3, 122000);
           employees[3] = createEmployee( " Иванова И.И", 4, 111300);
           employees[4] = createEmployee( " Северьянова И.И", 5, 55000);
           employees[5] = createEmployee( " Рублева З.А", 1, 60500);
           employees[6] = createEmployee( " Воснецова Т.И", 2, 22000);
           employees[7] = createEmployee( " Шейх Т.Д.", 3, 75000);
           employees[8] = createEmployee( " Ива Л.З", 4, 2750);
           employees[0] = createEmployee( " Иванов И.И", 5, 9000);
    for (int i = 0; i < employees.length; i++) {
        System.out.println(employees[i]);
    }
    System.out.println(" ");
    int total = calculateAllSalary(employees);
    System.out.println("Общая сумма зарплат: " + total);
    System.out.println(" ");
    Employee minSalaryEmployee = findEmployeeMinSalary(employees);
    System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);
    System.out.println(" ");
    Employee maxSalaryEmployee = findEmployeeMaxSalary(employees);
    System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);
    System.out.println(" ");
    double averageSalary = calculateAverageSalary(employees);
    System.out.println("Среднее значение зарплат: " + averageSalary);
    System.out.println(" ");
    printEmployeeFullNames(employees);
    return total;
}

    public static int calculateAllSalary(Employee[] employees) {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public static Employee findEmployeeMinSalary(Employee[] employees) {
        if (employees.length == 0) return null;
        Employee minSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryEmployee.getSalary())
                minSalaryEmployee = employees[i];
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeMaxSalary(Employee[] employees) {
        if (employees.length == 0) return null;
        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary())
                maxSalaryEmployee = employees[i];
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        if (employees.length == 0) return 0;
        return calculateAllSalary(employees) / employees.length;
    }
    public static void printEmployeeFullNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }}