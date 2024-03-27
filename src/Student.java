public class Student extends Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printIntro() {
        System.out.println(name + "의 키는 " + getHeight() + "cm 이고, 몸무게는 " + getWeight() + "이므로 BMI수치는 " + getBMI() + "입니다.");
    }

    @Override
    public void say() {
        System.out.println("안녕");
    }
}