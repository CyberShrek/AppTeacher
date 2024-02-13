package org.vniizht.appteacher.model;

import java.util.ArrayList;
import java.util.List;

// Урок, содержащий всё необходимое для освоения функционала приложения.
public abstract class Lesson {

    // Пока что здесь просто список инструкций
    public List<Instruction> instructions;

    public abstract void addInstruction(String selector, String text, String eventName);
}
