package by.ivan101454.kot.mapper;

import by.ivan101454.kot.dto.ExerciseDto;
import by.ivan101454.kot.dto.QuestionDto;
import by.ivan101454.kot.entity.Exercise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ExerciseReadDto implements Mapper<Exercise, ExerciseDto>{
    private final QuestionReadMapper questionReadMapper;

    @Override
    public ExerciseDto map(Exercise object) {

        return new ExerciseDto(
                object.getNumber(),
                object.getSectionNumber(),
                object.getPage(),
                object.getDescription(),
                object.getQuestions().stream().map(questionReadMapper::map).toList()
        );
    }
}
