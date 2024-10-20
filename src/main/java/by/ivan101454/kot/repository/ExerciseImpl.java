package by.ivan101454.kot.repository;

import by.ivan101454.kot.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseImpl extends JpaRepository<Exercise, Long>  {
    List<Exercise> findAllBySectionNumber(int sectionNumber);

}
