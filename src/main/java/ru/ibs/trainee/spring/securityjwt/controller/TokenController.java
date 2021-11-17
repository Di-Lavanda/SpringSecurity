package ru.ibs.trainee.spring.securityjwt.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ibs.trainee.spring.securityjwt.jwt.JwtProvider;
import ru.ibs.trainee.spring.securityjwt.model.TokenPair;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static ru.ibs.trainee.spring.securityjwt.jwt.JwtProvider.BEARER_PREFIX;

@AllArgsConstructor
@RestController
@RequestMapping("/update")
public class TokenController {

    @Autowired
    JwtProvider jwtProvider;

    @GetMapping("/token")
    public TokenPair refreshTokens(Authentication authentication, HttpServletResponse response) throws IOException{
        TokenPair tokenPair = new TokenPair();
        tokenPair.setAccessToken(jwtProvider.createToken(authentication).replace(BEARER_PREFIX,""));
        tokenPair.setRefreshToken(jwtProvider.createRefreshToken(authentication).replace(BEARER_PREFIX,""));
        response.setContentType("text/json");
        return tokenPair;
    }
}
