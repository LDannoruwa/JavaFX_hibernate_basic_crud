package org.example.dao;

import org.example.dao.custom.impl.CustomerDaoImpl;

public class DaoFactory {
    @SuppressWarnings("unchecked")
    public static <T> T getDao(DAOType type) {
        switch (type) {
            case CUSTOMER:
                return (T) new CustomerDaoImpl();
            default:
                return null;
        }

    }
}
