package com.makhdoom.BMS.dto.requestdto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntryDto {

    String name;
    String password;
    String mobileNumber;
}
