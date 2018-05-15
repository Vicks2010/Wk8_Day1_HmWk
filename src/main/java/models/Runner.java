package models;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        args:
        {
        }

        Cust cust1 = new Cust(id1,"Cust1FirstName", "Cust1LastName", ordernumber1);
        Cust cust2 = new Cust(id2,"Cust2FirstName", "Cust2LastName", ordernumber2);

        DBCust.save(cust1);
        DBCust.save(cust2);

        List<Cust> custs = DBCust.getCusts();

//    }
//
//    public static void main(String[]args) {args: {}
//
//    Order order1 = new Order("productbought1");
//    Order order2 = new Order("productbought2");
//
//
//    DBOrder.save(Order1);
//    DBOrder.save(Order2);
//
//    List<Order> orders = DBOrder.getOrders();
    }
}