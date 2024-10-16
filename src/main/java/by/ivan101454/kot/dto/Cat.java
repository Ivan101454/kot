package by.ivan101454.kot.dto;

import by.ivan101454.kot.enums.Color;
import lombok.Value;

@Value
public class Cat {
    private String name;
    private int age;
    private Color color;
}
