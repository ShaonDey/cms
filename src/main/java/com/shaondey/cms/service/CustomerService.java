package com.shaondey.cms.service;

import com.shaondey.cms.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {
    private int nextCustomerIdCount = 1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer) {
        customer.setCustomerId(nextCustomerIdCount);
        customerList.add(customer);
        nextCustomerIdCount++;
        return customer;
    }

    public List<Customer> getCustomers() {
        return customerList;
    }

    public Customer getCustomer(int customerId) {
        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {
        customerList.stream().forEach(c -> {
            if (c.getCustomerId() == customerId) {
                c.setCustomerFirstName(customer.getCustomerFirstName());
                c.setCustomerLastName(customer.getCustomerLastName());
                c.setCustomerEmail(customer.getCustomerEmail());
            }
        });

        return getCustomer(customerId);
    }

    public void deleteCustomer(int customerId) {
        customerList.removeIf(c -> c.getCustomerId() == customerId);
    }
}
