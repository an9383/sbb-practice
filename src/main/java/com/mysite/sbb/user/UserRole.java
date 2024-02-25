package com.mysite.sbb.user;

public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("RELO_USER");

    private String value;

    UserRole(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
