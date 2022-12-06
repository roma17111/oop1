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
        Human human6 = new Human("Владимир", "Казань", 2001, null);


        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);

        Flower flower1 = new Flower("Роза обыкновенная", "Голландия", 35.59);
        Flower flower2 = new Flower("Хризантема", null, 15.00, 5);
        Flower flower3 = new Flower("Пион", "англия", 69.90, 1);
        Flower flower4 = new Flower("Гипсофила", "Турция", 19.50, 10);


        System.out.println(flower1);
        System.out.println(flower2);
        System.out.println(flower3);
        System.out.println(flower4);


    }
}