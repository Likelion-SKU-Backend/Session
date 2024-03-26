import java.util.ArrayList;

public class Main{
    public static void main (String[] args){
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        student1.setName("홍길동");
        student1.setHeight(175);
        student1.setWeight(75);

        student2.setName("이서경");
        student2.setHeight(180);
        student2.setWeight(78);

        student3.setName("이영희");
        student3.setHeight(155);
        student3.setWeight(49);

        student4.setName("김멋사");
        student4.setHeight(182);
        student4.setWeight(82);

        int key = 0;

        for(int i=1; i<students.size(); i++){
            if(students.get(key).getBMI() < students.get(i).getBMI()){
                key = i;
            }
        }

        students.remove(key);

        for(int i=0; i<students.size(); i++){
            students.get(i).printIntro();
            students.get(i).say();
        }
    }
}
