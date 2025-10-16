package com.juaracoding.yjmspringbootrestapi.dto.response;

import com.juaracoding.yjmspringbootrestapi.dto.rel.RelAksesDTO;

public class ResUsersDTO {

    private Long id;

    private String username;

    private String role;

    private RelAksesDTO akses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public RelAksesDTO getAkses() {
        return akses;
    }

    public void setAkses(RelAksesDTO akses) {
        this.akses = akses;
    }
}
