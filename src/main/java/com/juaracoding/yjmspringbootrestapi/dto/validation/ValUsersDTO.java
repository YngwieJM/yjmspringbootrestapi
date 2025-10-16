package com.juaracoding.yjmspringbootrestapi.dto.validation;

import com.juaracoding.yjmspringbootrestapi.dto.rel.RelAksesDTO;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class ValUsersDTO {

//    @NotNull
//    @Pattern(regexp = "^[0-9]+$", message = "Id must be a number")
//    private Long id;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z]{5,20}$", message = "Username must be 5-20 alphabetic characters")
    private String username;

    @NotNull
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
             message = "Password must be at least 8 characters long, include uppercase, lowercase, number, and special character")
    private String password;

    @NotNull
    @Pattern(regexp = "^(Admin|User)$", message = "Role must be either Admin or User")
    private String role;

    private RelAksesDTO akses;
}
