public class Person {
    private float height;
    private float weight;

    public float getBMI(){
        float h = height / 100;
        return  weight / (h * h);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void say(){
        System.out.println("응애");
    }
}