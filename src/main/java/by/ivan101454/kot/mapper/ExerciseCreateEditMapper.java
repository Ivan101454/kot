package by.ivan101454.kot.mapper;

import by.ivan101454.kot.dto.ExerciseDto;
import by.ivan101454.kot.entity.Exercise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class ExerciseCreateEditMapper implements Mapper<ExerciseDto, Exercise>{

    @Override
    public Exercise map(ExerciseDto fromObject, Exercise toObject) {
        copy(fromObject, toObject);
        return toObject;
    }

    @Override
    public Exercise map(ExerciseDto object) {
        Exercise exercise = new Exercise();
        copy(object, exercise);
        return exercise;
    }

    public void copy(ExerciseDto object, Exercise exercise) {
        exercise.setNumber(object.getNumber());
        exercise.setSectionNumber(object.getSectionNumber());
        exercise.setPage(object.getPage());
        exercise.setDescription(object.getDescription());
    }




}
