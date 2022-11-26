package animals;

public class Herbivores extends Mammals {

    private String typeFood;

    public Herbivores(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed);
        this.typeFood = typeFood;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public void feed() {
        if (this.getName() == "газель"){
            System.out.println("пасётся в саванне");
        }else if (this.getName() == "жираф"){
            System.out.println("пасётся в саванне");
        }else {
            System.out.println("пасётся в степи");
        }

    }
    public void walk(){
        System.out.println("просто так не гуляет");
    }

    public void eat() {
        if (this.getName() == "газель"){
            System.out.println("питается травой");
        }else if (this.getName() == "жираф"){
            System.out.println("питается листьями");
        }else {
            System.out.println("питается овсом");
        }
    }

    public void sleep() {
        System.out.println("спит ночью");
    }

    public void go() {
        if (this.getName() == "газель"){
            System.out.println("скачет");
        }else if (this.getName() == "жираф"){
            System.out.println("ходит");
        }else {
            System.out.println("скачет");
        }
    }
}


