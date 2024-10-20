package by.ivan101454.kot.mapper;

import by.ivan101454.kot.dto.QuestionDto;
import by.ivan101454.kot.entity.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class QuestionReadMapper implements Mapper<Question, QuestionDto> {

    @Override
    public QuestionDto map(Question object) {
        return new QuestionDto(
                object.getNumber(),
                object.getQuestionText(),
                object.getAnswerText(),
                object.getAnswerExampleText()
        );
    }
}
