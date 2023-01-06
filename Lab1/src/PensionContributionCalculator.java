public class PensionContributionCalculator {
    public static void main(String[] args) {
        int salary_ceiling = 6000;
        double employee_rate_55_and_below = 0.2;
        double employer_rate_55_and_below = 0.17;
        double employee_rate_55_to_60 = 0.13;
        double employer_rate_55_to_60 = 0.13;
        double employee_rate_60_to_65 = 0.075;
        double employer_rate_60_to_65 = 0.09;
        double employee_rate_65_and_above = 0.05;
        double employer_rate_65_and_above = 0.075;

        int salary = 3000;
        int age = 30;

        double employeeContribution = 0;
        double employerContribution ;
        double totalCOntribution;

        if (salary > salary_ceiling) {
            salary = salary_ceiling;
        }
        if (age < 55) {
            employeeContribution = salary * employee_rate_55_and_below;
            employerContribution = salary * employer_rate_55_and_below;
        } else if (age < 60) {
            employeeContribution = salary * employee_rate_55_to_60;
            employerContribution = salary * employer_rate_55_to_60;
        } else if (age < 65) {
            employeeContribution = salary * employee_rate_60_to_65;
            employerContribution = salary * employer_rate_60_to_65;
        } else {
            employeeContribution = salary * employee_rate_65_and_above;
            employerContribution = salary * employer_rate_65_and_above;
        }
        totalCOntribution = employeeContribution + employerContribution;


        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.printf("The employee contribution is: %.2f%n", employeeContribution);
        System.out.printf("The employer contribution is: %.2f%n", employerContribution);
        System.out.printf("Total contribution is: %.2f%n", totalCOntribution);
    }
}
