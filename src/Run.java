import java.util.ArrayList;

class Run {
//    Stwórz klasę Drinker, w której zapamiętamy imię naszego bohatera, wagę oraz płeć.
//    Stwórz klasę Alcohol,
//    która będzie zawierała nazwę oraz moc alkoholu – procentową zawartość alkoholu w napoju (wartość z [0 − 1]).
//    Klasa Drinker ma zawierać metodę: double drink(int quantity, Alcohol alcohol) ,
//    która zwraca liczbę promili alkoholu we krwi. Tę wartość liczymy ze wzoru Erika Widmarka.
//    Następnie w metodzie main stwórz wybranego bohatera oraz przykładowe alkohole.
//    Dla każdego alkoholu wywołaj metodę drink z jednym ze stworzonych alkoholi.
//    Przykładowy wynik programu:
//    Man (80kg) will have 0.07h blood-alcohol content after drinking 100ml of Beer.
//    Man (80kg) will have 0.57h blood-alcohol content after drinking 100ml of Vodka.
//    Man (80kg) will have 0.20h blood-alcohol content after drinking 100ml of Wine.
//    Man (80kg) will have 1.00h blood-alcohol content after drinking 100ml of Hooch.
//            Rozwinięcie:
//    Napisz program w taki sposób by ilość alkoholu się kumulowała

    public static void main(String[] args) {
        ArrayList<Alcohol> toDrink = new ArrayList<>();

        Drinker notRadek = new Drinker("Not Radek", Sex.MAN, 70);
        Alcohol vodka40 = new Alcohol("Vodka 40%", 0.15);
        Alcohol beer = new Alcohol("Beer", 0.05);
        Alcohol hooch = new Alcohol("Hooch", 0.7);

        toDrink.add(vodka40);
        toDrink.add(beer);


        drinkAlko(notRadek, toDrink);

        notRadek.toSober();

        toDrink.add(hooch);
        drinkAlko(notRadek, toDrink);
    }

    static void drinkAlko(Drinker drinker, ArrayList<Alcohol> toDrink) {
        toDrink.forEach(a -> {
            int drink = 700;
//            System.out.print(drinker.getName() + " (" + drinker.getSex() + ") " + drinker.getWeight() + " kg " + drink
//                    + " ml " + a.getName() + " ma " + a.getPower() * 100 + " % alko.");
//            System.out.format("masz we krwi %.2f ‰ alko.\n", drinker.drink(drink, a));
//            System.out.println("Masz " + drinker.getPureAlko() + " gr alko " + "Spalisz za: " + drinker.getPureAlko() / 10 +
//                    " godzin. Idź spać.");
            System.out.printf("%s (%s) + %.1f kg %s ml %s ma %.2f %% alko.%n",
                    drinker.getName(),
                    drinker.getSex(),
                    drinker.getWeight(),
                    drink,
                    a.getName(),
                    a.getPower()*100);
        });
    }
}
