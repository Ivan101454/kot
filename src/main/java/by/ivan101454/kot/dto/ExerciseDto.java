package by.ivan101454.kot.dto;

import lombok.Value;

import java.util.List;

@Value
public class ExerciseDto {
    private int id;
    private List<Question> questions;
}
