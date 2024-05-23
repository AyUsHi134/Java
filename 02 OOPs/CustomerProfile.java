public class CustomerProfile {
    
    //state
    private String name;
    private Address homeAddress;
    private Address workAddress; 
    
    //creating
    public CustomerProfile(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    //operations

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString() {
        return String.format("name - [%s], home address - [%s] , work address - [%s]", name,homeAddress,workAddress);
    }
     
    public static void main(String[] args) {
        Address address = new Address("line 1", "Lucknow", "226022");
        CustomerProfile customer = new CustomerProfile("Ayushi", address);
        
        Address workAddress = new Address("line 1 for work", "Delhi", "12056");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
        
    }
    
}

   
