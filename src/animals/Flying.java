package animals;

public class Flying extends Birds {

    private String movementType;

    public Flying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = movementType;
    }

    public void fly() {
        System.out.println();
    }


    public void eat() {
        if (this.getName() == "чайка"){
            System.out.println("питается рыбой");
        }else if (this.getName() == "альбатрос"){
            System.out.println("питается рыбой");
        }else {
            System.out.println("питается мелкими млекомитающими и птицами");
        }
    }

    public void sleep() {
        System.out.println("спит ночью");
    }

    public void go() {
        if (this.getName() == "чайка"){
            System.out.println("летает и плавает в озёрах");
        }else if (this.getName() == "альбатрос"){
            System.out.println("летает и плавает в морях");
        }else {
            System.out.println("летает высоко, высматривая добычу");
        }
    }

}
