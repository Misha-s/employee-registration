package com.tomato.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

//    @NotNull //"" except null, anything can be accepted
//    @NotEmpty //" "  except null and empty String anything can be accepted
//    @NotBlank // " " "" null  except null, empty String and only space anything can be accepted

    @NotBlank
    @Size(max = 30, min = 2)
    private String firstName;

    @NotBlank
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
