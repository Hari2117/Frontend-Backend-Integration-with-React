package com.taskmanager.security;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class JwtTokenProvider {

private final String SECRET = "taskmanager-secret";
private final long EXPIRATION = 86400000;

public String generateToken(String username){

return Jwts.builder()
.setSubject(username)
.setIssuedAt(new Date())
.setExpiration(new Date(System.currentTimeMillis()+EXPIRATION))
.signWith(SignatureAlgorithm.HS256,SECRET)
.compact();
}

public String getUsername(String token){

return Jwts.parser()
.setSigningKey(SECRET)
.parseClaimsJws(token)
.getBody()
.getSubject();
}

}