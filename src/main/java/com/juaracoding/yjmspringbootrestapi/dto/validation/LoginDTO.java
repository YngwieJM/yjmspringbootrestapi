package com.juaracoding.yjmspringbootrestapi.dto.validation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class LoginDTO {
    @NotNull(message = "Username can't be Null")
    @NotBlank(message = "Username can't be Blank")
    @NotEmpty(message = "Username can't be Empty")
    private String username;

    @NotNull(message = "Password can't be Null")
    @NotBlank(message = "Password can't be Blank")
    @NotEmpty(message = "Password can't be Empty")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Password must be at least 8 characters long, include uppercase, lowercase, number, and special character")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
