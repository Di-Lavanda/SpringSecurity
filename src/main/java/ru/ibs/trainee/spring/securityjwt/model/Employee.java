package ru.ibs.trainee.spring.securityjwt.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Employee {
    private final Integer id;
    private final String name;
}
