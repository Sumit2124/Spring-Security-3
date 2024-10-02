package com.spring.Security.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse
{
    private String jwtToken;
    private String username;
}
