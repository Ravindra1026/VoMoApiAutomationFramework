package com.Votermood.modules;

import com.Votermood.pojos.Auth;
import com.Votermood.pojos.AuthResponse;
import com.google.gson.Gson;

public class PayloadManager {

    // converting the java object to String
    Gson gson;
    public String createPayloadLoginAsString(){
        Auth login = new Auth();
        login.setType("mobileNumber");
        login.setMobileNumber("9876543210");
        login.setPassword("Test@123");
        login.setRememberMe(false);

        System.out.println(login);

        gson = new Gson();

        String jsonStringPayload  = gson.toJson(login);
        System.out.println(jsonStringPayload);
        return jsonStringPayload;

    }

    public AuthResponse loginResponseJava (String responseString){
        gson = new Gson();
        AuthResponse loginResponse = gson.fromJson(responseString, AuthResponse.class);
        return  loginResponse;

    }

}
