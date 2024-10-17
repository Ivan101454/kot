package by.ivan101454.kot.service;

import by.ivan101454.kot.dto.Question;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Slf4j
@Service
public class ExerciseService {

    public List<Question> createQuestions() {
        return List.of(
                Question.builder().number(1)
                        .questionText("abhängen")
                        .answerText("von")
                        .answerExampleText("Alles hängt vom Wetter").build(),
                Question.builder().number(2)
                        .questionText("anfangen")
                        .answerText("mit")
                        .answerExampleText("Wann fangt ihr mit dem Project an").build(),
                Question.builder().number(3)
                        .questionText("beginnen")
                        .answerText("mit")
                        .answerExampleText("Wann beginnt ihr mit der Arbeit").build());

    }

    public Optional<Question> findQuestionById(int id) {
        List<Question> questions = createQuestions();
        Optional<Question> question = questions.stream().filter(e -> e.getNumber() == id).findFirst();
        return question;
    }

    public List<Question> findAllQuestion() {
        log.info("create question");
        return createQuestions();
    }

    public boolean checkAnswers(List<String> answers) {
        long size = answers.size();
        long count = createQuestions().stream().filter(e -> Objects.equals(e.getAnswerText(), answers.get(e.getNumber()-1).trim())).count();
        return size == count;
    }


}
