package com.project.coches.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseCustomerDto {
    private String cardId;
    private String fullName;
    private String email;
    private String password;
}
