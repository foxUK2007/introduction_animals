package animals;

public abstract class Animals {
  private String name;
  private int age;

    public Animals(String name, int age) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "default";
        }
        if (age != 0) {
            this.age = age;
        } else {
            this.age = 2;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            this.age = age;
        } else {
            this.age = 1;
        }
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();
}
