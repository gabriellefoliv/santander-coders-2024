package introaojava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class strings {

    public static void main(String[] args) {
        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String name = "Gabi";

        // ISO 8601
        LocalDate today = LocalDate.now();
        @SuppressWarnings("deprecation")
        Locale brasil = new Locale("pt", "BR");

        System.out.println(today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String dayOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;
        LocalDateTime now = LocalDateTime.now();

        if (now.getHour() > 0 && now.getHour() < 12) {
            saudacao = "Bom dia";
        } else if (now.getHour() >= 12 && now.getHour() < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }

        System.out.printf("Olá, %s. Hoje é %s. %s!\n", name, dayOfWeek, saudacao);

    }
}
