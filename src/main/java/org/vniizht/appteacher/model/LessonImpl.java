package org.vniizht.appteacher.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class LessonImpl extends Lesson {

    public LessonImpl(){
        instructions = new ArrayList<>();
    }

    @Override
    public void addInstruction(String selector, String text, String eventName) {
        instructions.add(new InstructionImpl(selector, text, eventName));
    }
}
