package com.spring.Security.Exception.payload;

import lombok.*;
import org.springframework.http.HttpStatus;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Response
{
    private String msg;
    private boolean success;
    private HttpStatus status;
}
