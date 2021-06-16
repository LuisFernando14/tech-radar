package com.deiva.deiva.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class AddUserDto {

    @JsonProperty(required = true)
    @NotBlank
    @NotEmpty
    private String name;

    @JsonProperty(required = true)
    @NotBlank
    @NotEmpty
    private String email;

    private String token;

    public AddUserDto(@NotBlank @NotEmpty String name, @NotBlank @NotEmpty String email) {
        this.name = name;
        this.email = email;
    }

    public AddUserDto(@NotBlank @NotEmpty String name, @NotBlank @NotEmpty String email, String token) {
        this.name = name;
        this.email = email;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
