package com.makhdoom.BMS.dtos.requestdto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserEntryDto {

    String name;
    String email;
    String password;
    String mobileNumber;
}
