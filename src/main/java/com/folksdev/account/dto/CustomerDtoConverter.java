package com.folksdev.account.dto;

import com.folksdev.account.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {

    public AccountCostumerDto convertToAccountCustomer(Customer from) {
        if (from == null) {
            return new AccountCostumerDto("","", "");
        }
        return new AccountCostumerDto(from.getId(), from.getName(), from.getSurname());
    }
}
