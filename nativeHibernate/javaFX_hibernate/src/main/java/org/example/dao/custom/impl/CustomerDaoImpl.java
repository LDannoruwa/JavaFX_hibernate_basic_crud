package org.example.dao.custom.impl;

import org.example.dao.custom.CustomerDao;
import org.example.entity.Customer;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDaoImpl implements CustomerDao {
    private  final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private final Session session = HibernateUtil.getSessionFactory().openSession();
    @Override
    public boolean save(Customer customer) throws Exception {
        Transaction transaction = session.beginTransaction();

        session.persist(customer);

        transaction.commit();

        return true;
    }
}
