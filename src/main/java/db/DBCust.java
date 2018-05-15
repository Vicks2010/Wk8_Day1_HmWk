package db;

import models.Cust;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DBCust {

    private static Session session;
    private static Transaction transaction;

    public static void save(Cust cust){
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(cust);
            transaction.commit();
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
    public static List<Cust>getCusts(){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Cust> results = null;
        try{
            String hql = "from Cust";
            results = session.createQuery(hql).list();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return results;
    }

}

