public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Максим", "Минск", 1988,
                "бренд-менеджер(ом).");
        Human human2 = new Human("Аня", "Москва", 1993,
                "методист(ом) образовательных программ.");
        Human human3 = new Human("Катя", "Калининград", 1992,
                "продакт-менеджер(ом).");
        Human human4 = new Human("Артём", "Москва", 1995,
                "директор(ом) по развитию бизнеса.");
        Human human5 = new Human(null, null, -1234, null);



        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);


    }
}