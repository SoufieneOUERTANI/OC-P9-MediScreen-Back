package com.ouertani.mediscreen.config;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ErrorResponse
{
    private int status;
    private String message;

}