package animals;

public abstract class Mammals extends Animals {

    private String livingEnvironment;

    private int speed;

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "default";
        }
        if (speed != 0) {
            this.speed = speed;
        } else {
            this.speed = 1;
        };
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void walk();

    public abstract void eat();

    public abstract void sleep();

    public abstract void go() ;

}
