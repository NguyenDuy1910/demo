

package com.example.models;

public class Authenticator {

    public String authenticate(String username, String password) {
        if (("itphutran".equalsIgnoreCase(username))
                && ("password".equals(password))) {
            return "success";
        } else {
            return "failure";
        }
    }
}