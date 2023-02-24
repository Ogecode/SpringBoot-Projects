package com.ogbonnaya.lombok;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Student {

    private String firstName;
    private   String lastName;
    private String email;
}
