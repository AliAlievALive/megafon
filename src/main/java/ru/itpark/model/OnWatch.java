package ru.itpark.model;

import ru.itpark.util.CardMountableTrio;
import ru.itpark.util.Button;

public class OnWatch {
    Top onWatchTop = new Top("Включайся!\nСмотри");
    Middle onWatchMiddle = new Middle("1200 минут" + "\nбезлимитный интернет" + "\n300 SMS",
            new String[][]{
                    {"https://...", "Кино и сериалы на МегаФон ТВ"},
                    {"https://...", "Кэшбэк до 30%"}
            });
    Bottom onWatchBottom = new Bottom("650 Р за 30 дней", new Button(true));

    @Override
    public String toString() {
        return onWatchTop.toString() + onWatchMiddle + onWatchBottom;
    }
}
