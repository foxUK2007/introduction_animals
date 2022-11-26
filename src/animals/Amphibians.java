package animals;

public class Amphibians extends Animals {

    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public void hunt() {
        if (this.getName() == "лягушка"){
            System.out.println("охотится на насекомых");
        }else {
            System.out.println("охотится на земноводных, мелких млекопитяющих и насекомых");
        }
    }

    public void eat() {
        System.out.println("есть то, на что охотится");
    }

    public void sleep() {
        System.out.println("спит иногда");
    }

    public void go() {
        if (this.getName() == "лягушка"){
            System.out.println("перемещается прыжками");
        }else {
            System.out.println("ползает");
        }

    }
}



