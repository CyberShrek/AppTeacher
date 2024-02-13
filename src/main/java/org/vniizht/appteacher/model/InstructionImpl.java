package org.vniizht.appteacher.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class InstructionImpl extends Instruction {
    public InstructionImpl(String selector, String text, String eventName) {
        this.selector = selector;
        this.text = text;
        this.eventName = eventName;
    }
}
