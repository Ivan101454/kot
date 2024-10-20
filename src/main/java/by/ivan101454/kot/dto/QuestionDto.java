package by.ivan101454.kot.dto;

import by.ivan101454.kot.entity.Exercise;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class QuestionDto {
    private int number;
    private String questionText;
    private String answerText;
    private String answerExampleText;
}
