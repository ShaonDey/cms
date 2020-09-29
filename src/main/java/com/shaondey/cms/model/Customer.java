package com.shaondey.cms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    @JsonProperty(value = "id")
    private int customerId;
    @JsonProperty(value = "firstName")
    private String customerFirstName;
    @JsonProperty(value = "lastName")
    private String customerLastName;
    @JsonProperty(value = "email")
    private String customerEmail;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
