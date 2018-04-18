package com.revature.commons.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String password;
    private String backupPassword;
    private Role role;
    private String homePhone;
    private String mobilePhone;
    private String token;
}
