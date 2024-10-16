package by.ivan101454.kot.controller;

import by.ivan101454.kot.dto.Question;
import by.ivan101454.kot.service.ExerciseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/deutsch/162")
@RequiredArgsConstructor
public class ExerciseController {
    private final ExerciseService exerciseService;

    //    @GetMapping(path = "/{number}")
//    public String getQuestion(Model model, @PathVariable(name = "1") int number) {
//        model.addAttribute("question", exerciseService.findQuestionById(number));
//        return "verbmitprap162";
//    }
    @GetMapping(path = "/tasks")
    public String getQuestions(Model model) {
        List<Question> allQuestion = exerciseService.findAllQuestion();
        model.addAttribute("questions", allQuestion);
        return "verbmitprap162";
    }

    @PostMapping(path = "/answer")
//    public  String postAnswer(@ModelAttribute Answer answer) {
//        System.out.println(answer.getAnswerText());
//        return "redirect:/deutsch/162/tasks";
//    }
    public String postAnswer(@RequestParam List<String> answers) {
        if (exerciseService.checkAnswers(answers)) {
            return "redirect:/deutsch/162/congratulation";
        } else return "redirect:/deutsch/162/tasks";
    }
    @GetMapping("/congratulation")
    public String getWin() {
        return "congratulation";
    }
}
