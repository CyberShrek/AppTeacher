package org.vniizht.appteacher.model;

// Обучающая инструкция, которую должен выполнить пользователь
public abstract class Instruction {

    // CSS-селектор элемента, для которого назначена инструкция
    String selector;

    // Текст инструкции
    String text;

    // Имя события элемента, которое должен совершить пользователь.
    // См. https://developer.mozilla.org/ru/docs/Web/Events
    String eventName;

}
