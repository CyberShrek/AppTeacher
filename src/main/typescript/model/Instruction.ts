export interface Instruction {
    selector: string
    text: string
    eventName: keyof DocumentEventMap
}