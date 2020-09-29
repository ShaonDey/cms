package com.shaondey.cms.api;

import com.shaondey.cms.model.Customer;
import com.shaondey.cms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "add")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(value = "/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {
        return customerService.getCustomer(customerId);
    }

//    @GetMapping(value = "get")
//    public Customer getCustomer(@RequestParam(name = "customerId", required = true, defaultValue = "2")  int customerId) {
//        return customerService.getCustomer(customerId);
//    }

//    @RequestMapping(method = RequestMethod.GET, params = "customerId")
//    public Customer getCustomer(int customerId) {
//            return customerService.getCustomer(customerId);
//    }

}
