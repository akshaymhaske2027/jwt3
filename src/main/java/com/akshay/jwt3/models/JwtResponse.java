package com.akshay.jwt3.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponse {

    private String jwtToken;

    private  String username;
}
