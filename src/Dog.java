public class Dog {
    String klish;
    String poroda;
    int skorost;

    void run() {
        String result = "";
        for (int i = 0; i < skorost; i++) {
            result += "Бегу";

            if (i == skorost - 1) {
                result += ".";
            } else result += ",";
        }
        System.out.println(result);

    }

    String info() {
        return "Кличка: " + klish + "  Порода: " + poroda + "  Скорость: " + skorost;

    }


}
