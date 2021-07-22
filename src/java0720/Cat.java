package java0720;

public class Cat {
    public String name;
    public String gender;

    public Cat(String name, String gender) {//构造方法
        this.name = name;
        this.gender = gender;
        this.eat("🐟");
    }
    public void eat(String food){
        System.out.println(name +"正在吃" + food);
    }
    public String toString(){
        return this.name + " , " + this.gender;
    }
}
