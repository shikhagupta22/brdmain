package com.nucleus.securityhandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class AuthSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler 
{
    protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response)
    {
        // Get the role of logged in user
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String role = auth.getAuthorities().toString();

        String targetUrl = "";
        if(role.contains("ROLE_CHECKER")) {
            targetUrl = "/welcomechecker";
        } else if(role.contains("ROLE_MAKER"))
        {
            targetUrl = "/welcomemaker";
        }
        return targetUrl;
    }

}
