package com.taskmanager.security;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class JwtAuthenticationFilter extends GenericFilter {

@Override
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
throws IOException, ServletException {

HttpServletRequest req = (HttpServletRequest) request;

String auth = req.getHeader("Authorization");

if(auth!=null && auth.startsWith("Bearer ")){

String token = auth.substring(7);

}

chain.doFilter(request,response);

}

}