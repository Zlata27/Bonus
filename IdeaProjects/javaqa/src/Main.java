public class Main {
    public static void main(String[] args) {

    int eaters = 5; // сколько людей будут есть

    int water = 200; // миллилитров воды
    int potatoes = 1; // картофелин
    int chicken = 1; // куриных бёдер
    int spices = 1; // ложек специй

    System.out.println("Сварили суп. На одного человека вышло:");
    System.out.println((water / eaters) + " миллилитров воды");
    System.out.println((potatoes / eaters) + " картофелин(а)");
    System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
    System.out.println((spices / eaters) + " ложек(ка) специй");

    }
}
