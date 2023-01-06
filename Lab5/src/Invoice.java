public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return  this.amount - this.getCustomerDiscount() * this.amount / 100 ;
    }

    public String toString(){
        StringBuilder description = new StringBuilder();
        description.append("Invoice [id = ")
                .append(this.id)
                .append((", customer = "))
                .append(this.getCustomerName())
                .append("(")
                .append(this.getCustomerID())
                .append(")")
                .append("(")
                .append(this.getCustomerDiscount())
                .append("%), amount = ")
                .append(this.amount);
        return description.toString();
    }
}
