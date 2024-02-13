import {runLesson} from "./util/lesson";

const
    appTeacherLocation = "/appteacher/app",
    appContextRoot = location.pathname.replace(appTeacherLocation, '');

// Запуск приложения в контейнере
(document.getElementById("app-container") as HTMLIFrameElement).src =
    // Демка пока что запускается из обучатора. Остальные приложения запускаются непосредственно через сервер приложений
    appContextRoot === "/demo" ? "/appteacher/demo" : appContextRoot

// Загружаем и запускаем урок
fetch("/appteacher/lesson" + appContextRoot)
    .then(response => {
        if (response.ok){
            response.json().then(runLesson)
        }
        else {
            alert("Ошибка HTTP: " + response.status);
        }
    }
)