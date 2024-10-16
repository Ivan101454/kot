package by.ivan101454.kot.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Question {
    private int number;
    private String questionText;
    private String answerText;
    private String answerExampleText;
}
