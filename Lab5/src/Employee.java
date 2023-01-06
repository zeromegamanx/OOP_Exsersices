public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private  int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return this.firstName + this.lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return this.salary * 12;
    }

    public int raiseSalary(int percent){
        return (this.salary * percent / 100) + this.salary;
    }

    public String toString(){
        StringBuilder description = new StringBuilder();
        description.append("Employee")
                .append("[")
                .append("id = ")
                .append(this.id)
                .append(", ")
                .append("name = ")
                .append(this.firstName)
                .append(" ")
                .append(this.lastName)
                .append(", ")
                .append("salary = ")
                .append(this.salary)
                .append("]");
        return description.toString();
    }
}
