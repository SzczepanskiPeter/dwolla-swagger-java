package io.swagger.client.auth;

import java.util.Map;

public class OAuth implements Authentication {

    private String authToken;

    public void setAuthToken(String token) {
        this.authToken = token;
    }

    public String getAuthToken() {
        return authToken;
    }

    @Override
    public void applyToParams(Map<String, String> queryParams, Map<String, String> headerParams) {
        headerParams.put("Authorization", "Bearer " + this.authToken);
    }
}
