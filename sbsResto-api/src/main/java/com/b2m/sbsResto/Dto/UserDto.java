package com.b2m.sbsresto.dto;

import com.b2m.sbsresto.models.Equipe;
import com.b2m.sbsresto.models.Role;
import com.b2m.sbsresto.models.User;
import org.bongiorno.dto.support.AbstractDto;

import javax.persistence.Column;
import java.util.HashSet;
import java.util.Set;

public class UserDto extends AbstractDto {
    Long id;
    String firstName;
    String lastName;
    String username;
    String password;
    String numTelephone;
    String email;
    Equipe equipe;
    Boolean activated;

    private Set<Role> authorities = new HashSet<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Role> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Role> authorities) {
        this.authorities = authorities;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }
}