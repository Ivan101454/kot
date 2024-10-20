package by.ivan101454.kot.dto;

import by.ivan101454.kot.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@Builder
@AllArgsConstructor
public class ExerciseDto {
    private int number;
    private int sectionNumber;
    private int page;
    private String description;
    private List<QuestionDto> questions;
}
