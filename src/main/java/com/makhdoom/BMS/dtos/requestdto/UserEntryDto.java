package com.makhdoom.BMS.dtos.requestdto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntryDto {

    String name;
    String email;
    String password;
    String mobileNumber;
}
