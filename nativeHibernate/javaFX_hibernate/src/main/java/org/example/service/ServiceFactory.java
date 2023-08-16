package org.example.service;

import org.example.service.custom.impl.CustomerServiceImpl;

public class ServiceFactory {
    @SuppressWarnings("unchecked")
    public static <T> T getService(ServiceType type) {
        switch (type) {
            case CUSTOMER:
                return (T) new CustomerServiceImpl();
            default:
                return null;
        }
    }
}
