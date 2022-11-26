package animals;

public class Flightless extends Birds {

    private String movementType;

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public void walk() {
        System.out.println("гуляет в поисках пропитания");
    }


    public void eat() {
        if (this.getName() == "страус"){
            System.out.println("питается насекомыми и травой");
        }else if (this.getName() == "пингвин"){
            System.out.println("питается рыбой");
        }else {
            System.out.println("питается насекомыми");
        }
    }

    public void sleep() {
        System.out.println("спит ночью");
    }

    public void go() {
        if (this.getName() == "страус"){
            System.out.println("бегает и весьма быстро");
        }else if (this.getName() == "пингвин"){
            System.out.println("ходит безобразно, но плавает изумительно");
        }else {
            System.out.println("и бегает и ходит");
        }
    }

}


