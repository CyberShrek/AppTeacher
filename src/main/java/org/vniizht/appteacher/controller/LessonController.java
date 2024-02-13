package org.vniizht.appteacher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.vniizht.appteacher.model.Lesson;
import org.vniizht.appteacher.model.LessonImpl;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LessonController {

    // Возвращает урок для приложения по его context root
    @GetMapping("/lesson/{contextRoot}")
    Lesson getLesson(@PathVariable String contextRoot){
        return lessonMap.get(contextRoot);
    }

    // Пока что временно, чисто для демонстрации, храним уроки здесь в HashMap.
    // Ключ - это context root приложения, которому приписан урок
    private final Map<String, Lesson> lessonMap = new HashMap<>();

    LessonController(){
        Lesson demoLesson = new LessonImpl();
        demoLesson.addInstruction(".button-1", "Нажми на меня", "click");
        demoLesson.addInstruction(".button-2", "Теперь на меня", "click");
        demoLesson.addInstruction(".button-3", "И на меня", "click");
        demoLesson.addInstruction(".button-4", "На меня тоже нужно нажать", "click");
        demoLesson.addInstruction(".button-5", "А по мне нажимать не надо! Меня нужно почесать!", "mousemove");
        demoLesson.addInstruction(".button-5", "А по мне нажимать не надо! Меня нужно почесать!", "mousemove");
        demoLesson.addInstruction(".button-5", "А по мне нажимать не надо! Меня нужно почесать!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши меня!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши меня!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши меня!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши меня!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши меня!", "mousemove");
        demoLesson.addInstruction(".button-5", "Ещё!", "mousemove");
        demoLesson.addInstruction(".button-5", "Ещё!", "mousemove");
        demoLesson.addInstruction(".button-5", "Ещё!", "mousemove");
        demoLesson.addInstruction(".button-5", "Ещё!", "mousemove");
        demoLesson.addInstruction(".button-5", "Ещё!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши меня!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши меня!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши меня!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши меня!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши меня!", "mousemove");
        demoLesson.addInstruction(".button-5", "Ещё!", "mousemove");
        demoLesson.addInstruction(".button-5", "Ещё!", "mousemove");
        demoLesson.addInstruction(".button-5", "Ещё!", "mousemove");
        demoLesson.addInstruction(".button-5", "Ещё!", "mousemove");
        demoLesson.addInstruction(".button-5", "Ещё!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши!", "mousemove");
        demoLesson.addInstruction(".button-5", "Чеши!", "mousemove");
        demoLesson.addInstruction(".date-input", "Хватит её чесать! Попробуй выбрать у меня какую-нибудь красивую дату!", "change");
        demoLesson.addInstruction(".date-input", "Я просил красивую дату!", "change");
        demoLesson.addInstruction(".date-input", "Почти получилось! Но всё равно не то!", "change");
        demoLesson.addInstruction(".date-input", "Выбери симметричную дату!", "change");
        demoLesson.addInstruction(".date-input", "Какая красивая дата! Жаль, что я пока её не вижу", "change");

        lessonMap.put("demo", demoLesson);
    }
}
