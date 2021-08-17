package practice;

public class Duck {
    // name and age
    //todo make fields for class
    private String name;
    private int age;

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
        this.age = age;
    }

    //todo throw illegal argument exception
    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
        if (name == null){
            throw new IllegalArgumentException();
        }
    }
    //


}
