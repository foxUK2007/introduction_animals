import animals.*;

public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("газель", 5, "саванна", 30, "трава");
        Herbivores giraffe = new Herbivores("жираф", 2, "саванна", 10, "листья баобаба");
        Herbivores horse = new Herbivores("лошадь", 4, "ферма", 50, "овес");

        Predators hyena = new Predators("гиена", 3, "саванна", 15, "млекопитающие");
        Predators tiger = new Predators("тигр", 4, "джунгли", 50, "млекопитающие");
        Predators beer = new Predators("медведь", 6, "лес", 30, "ягоды и мелкие млекопитающие");

        Amphibians frog = new Amphibians("лягушка", 1, "пруд");
        Amphibians snake = new Amphibians("уж", 4, "пруд");

        Flightless ostrich = new Flightless("страус", 8, "саванна", "ходит");
        Flightless penguin = new Flightless("пингвин", 4, "антарктика", "ходит");
        Flightless dodo = new Flightless("птица додо", 3, "лес", "ходит");

        Flying gull = new Flying("чайка", 1, "море", "летит");
        Flying albatross = new Flying("альбатрос", 4, "антарктика", "летит");
        Flying falcon = new Flying("сокол", 2, "степь", "летит");


        System.out.println();
        System.out.println(" Травоядные ");
        System.out.println();

        printHerbivores(gazelle);
        printHerbivores(giraffe);
        printHerbivores(horse);

        System.out.println();
        System.out.println(" Хищники ");
        System.out.println();

        printPredators(hyena);
        printPredators(tiger);
        printPredators(beer);

        System.out.println();
        System.out.println(" Земноводные ");
        System.out.println();

        printAmphibians(frog);
        printAmphibians(snake);

        System.out.println();
        System.out.println(" Нелетающие ");
        System.out.println();

        printFlightless(ostrich);
        printFlightless(penguin);
        printFlightless(dodo);

        System.out.println();
        System.out.println(" Летающие ");
        System.out.println();

        printFlying(gull);
        printFlying(albatross);
        printFlying(falcon);

    }

    public static void printHerbivores(Herbivores herbivores) {
        System.out.println(
                "животное: " + herbivores.getName() +
                        ". возраст: " + herbivores.getAge() +
                        ". среда проживания: " + herbivores.getLivingEnvironment() +
                        ". скорость перемещения: " + herbivores.getSpeed()
        );
        herbivores.feed();
        herbivores.eat();
        herbivores.go();
        herbivores.walk();
        herbivores.sleep();

    }

    public static void printPredators(Predators predators) {
        System.out.println(
                "животное: " + predators.getName() +
                        ". возраст: " + predators.getAge() +
                        ". среда проживания: " + predators.getLivingEnvironment() +
                        ". скорость перемещения: " + predators.getSpeed()
        );

        predators.eat();
        predators.go();
        predators.walk();
        predators.sleep();

    }

    public static void printAmphibians(Amphibians amphibians) {
        System.out.println(
                "животное: " + amphibians.getName() +
                        ". возраст: " + amphibians.getAge() +
                        ". среда проживания: " + amphibians.getLivingEnvironment()

        );
        amphibians.go();
        amphibians.eat();
        amphibians.hunt();

    }

    public static void printFlightless(Flightless flightless) {
        System.out.println(
                "птица: " + flightless.getName() +
                        ". возраст: " + flightless.getAge() +
                        ". среда проживания: " + flightless.getLivingEnvironment()

        );

        flightless.eat();
        flightless.go();
        flightless.walk();
        flightless.sleep();

    }

    public static void printFlying(Flying flying) {
        System.out.println(
                "птица: " + flying.getName() +
                        ". возраст: " + flying.getAge() +
                        ". среда проживания: " + flying.getLivingEnvironment()

        );

        flying.eat();
        flying.go();
        flying.sleep();

    }
}
