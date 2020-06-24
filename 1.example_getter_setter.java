class Cat {

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Мяу!");
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
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

public class Main {

    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", 5, 4);
        String barsikName = barsik.getName();
        int barsikAge = barsik.getAge();
        int barsikWeight = barsik.getWeight();

        System.out.println("Имя кота: " + barsikName);
        System.out.println("Возраст кота: " + barsikAge);
        System.out.println("Вес кота: " + barsikWeight);
        System.out.println();

        System.out.println("Изначальное имя кота: " + barsik.getName());
        barsik.setName("Бурбон");
        System.out.println("Новое имя кота: " + barsik.getName());
        System.out.println();

        System.out.println("Начальный возраст кота: " + barsik.getAge());
        barsik.setAge(-100);
        System.out.println("Новый возраст кота: " + barsik.getAge());

    }
}
