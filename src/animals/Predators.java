package animals;

public class Predators extends Mammals {

    private String typeFood;

    public Predators(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment, speed);
        this.typeFood = typeFood;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public void hunt(){
        System.out.println("охотятся на насекомых, земноводных, рыб, млекопитающих и всё, что шевелится");
    }

    public void walk() {
        System.out.println("как будто гуляет, но на самом деле высматривает добычу");
    }

    public void eat() {
        if (this.getName() == "гиена"){
            System.out.println("питается в основно падалью");
        }else if (this.getName() == "тигр"){
            System.out.println("питается всеми видами млекопитающих");
        }else {
            System.out.println("питается ягодами, корешками, мелкими и иногда крупными млекопитающими");
        }
    }

    public void sleep() {
        if (this.getName() == "гиена"){
            System.out.println("спит днем");
        }else if (this.getName() == "тигр"){
            System.out.println("спит днем");
        }else {
            System.out.println("спит ночью");
        }
    }

    public void go() {
        System.out.println("перемещается преимущественно на 4-х лапах");
    }

}
