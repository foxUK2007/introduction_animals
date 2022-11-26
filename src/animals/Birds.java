package animals;

public abstract class Birds extends Animals {

    private String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public void hunt(){
        System.out.println("охотятся на насекомых, земноводных, рыб, млекопитающих");
    }
    public abstract void eat();

    public abstract void sleep();

    public abstract void go() ;

}


