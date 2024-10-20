package by.ivan101454.kot.service;

import by.ivan101454.kot.dto.ExerciseDto;
import by.ivan101454.kot.dto.QuestionDto;
import by.ivan101454.kot.entity.Exercise;
import by.ivan101454.kot.mapper.ExerciseCreateEditMapper;
import by.ivan101454.kot.repository.ExerciseImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class ExerciseService {
    ExerciseImpl exerciseImpl;
    ExerciseCreateEditMapper exerciseCreateEditMapper;

    public List<QuestionDto> createQuestions() {
        return List.of(
                QuestionDto.builder().number(1)
                        .questionText("abhängen")
                        .answerText("von")
                        .answerExampleText("Alles hängt vom Wetter").build(),
                QuestionDto.builder().number(2)
                        .questionText("anfangen")
                        .answerText("mit")
                        .answerExampleText("Wann fangt ihr mit dem Project an").build(),
                QuestionDto.builder().number(3)
                        .questionText("beginnen")
                        .answerText("mit")
                        .answerExampleText("Wann beginnt ihr mit der Arbeit").build());

    }
    public Optional<Exercise> findExerciseById(Long id) {
        return exerciseImpl.findById(id);
    }

    public List<Exercise> findAllExerciseBySection(int numberOfSection) {
        return exerciseImpl.findAllBySectionNumber(numberOfSection);
    }

    public void createExercise(Exercise exercise) {
        exerciseImpl.save(exercise);
    }

    public void createExercises(List<Exercise> exercisesList) {
        exerciseImpl.saveAll(exercisesList);
    }

    public void deleteExercise(Long idExercise) {
        exerciseImpl.deleteById(idExercise);
    }

    public Optional<Exercise> updateExercise(Long idExercise, ExerciseDto exerciseDto) {
        return Optional.of(exerciseImpl.findById(idExercise).map(e -> exerciseCreateEditMapper.map(exerciseDto, e))
                .map(exerciseImpl::save)).orElseThrow(() -> new RuntimeException("Нет обновления"));
    }


//    public Optional<Question> findQuestionById(int id) {
//        List<Question> questions = createQuestions();
//        Optional<Question> question = questions.stream().filter(e -> e.getNumber() == id).findFirst();
//        return question;
//    }
//
//    public List<Question> findAllQuestion() {
//        log.info("create question");
//        return createQuestions();
//    }
//
//    public boolean checkAnswers(List<String> answers) {
//        long size = answers.size();
//        long count = createQuestions().stream().filter(e -> Objects.equals(e.getAnswerText(), answers.get(e.getNumber()-1).trim())).count();
//        return size == count;
//    }


}
