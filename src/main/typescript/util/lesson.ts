import {Lesson} from "../model/Lesson";
import {Instruction} from "../model/Instruction";

export function runLesson(lesson: Lesson) {
    setTimeout(() => iterateInstructions(lesson.instructions), 500)
}

// Позволяет выполнять инструкции последовательно, переходя к следующей инструкции только после возвращения промиса у предыдущей
 function iterateInstructions(instructions: Instruction[]): Promise<void> {
    if (!instructions || instructions.length === 0) {
        return;
    }

    showInstructionInAppContainer(instructions.shift()).then(
        () => iterateInstructions(instructions)
    )

    // await iterateInstructions(instructions);
}


// Выводит сообщение под элементом в контейнере с приложением.
// После срабатывания указанного в инструкции события уничтожает сообщение и возвращает пустой промис.
function showInstructionInAppContainer(instruction: Instruction): Promise<void> {
    return new Promise<void>((resolve, reject) => {
        const iframeContent = (document.getElementById("app-container") as HTMLIFrameElement).contentDocument
        const element: HTMLElement = iframeContent?.querySelector(instruction.selector);
        if (element) {
            const messageElement = iframeContent.createElement('div');
            messageElement.textContent = instruction.text;
            messageElement.style.position = 'absolute';
            messageElement.style.top = `${element.offsetTop + element.offsetHeight}px`;
            messageElement.style.left = `${element.offsetLeft + element.offsetWidth / 2}px`;
            messageElement.style.transform = 'translateX(-50%)';
            messageElement.style.backgroundColor = 'white';
            messageElement.style.padding = '10px';
            messageElement.style.border = '1px solid black';
            iframeContent.body.appendChild(messageElement);
            element.addEventListener(instruction.eventName, () => {
                messageElement.remove()
                return resolve()
            })
        } else {
            return reject(`Элемент "${instruction.selector}" не найден.`)
        }})

}