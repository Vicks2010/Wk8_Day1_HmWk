package models;

public class Cust {

    private int id;
    private String firstname;
    private String lastname;
    private int ordernumber;

    public Cust (String firstname, String lastname, int order) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.ordernumber = ordernumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }
}

