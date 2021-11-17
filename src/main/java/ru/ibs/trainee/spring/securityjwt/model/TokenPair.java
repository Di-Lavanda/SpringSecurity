package ru.ibs.trainee.spring.securityjwt.model;

import lombok.Data;

@Data
public class TokenPair {
    String accessToken;
    String refreshToken;
}
