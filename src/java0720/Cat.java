package java0720;

public class Cat {
    public String name;
    public String gender;
    static{
        //静态代码块只在程序启动（更准确的说是类加载的时候）执行一次
        System.out.println("这是一个静态代码块");
    }

    {
        System.out.println("这是一个普通代码块");
    }



    public Cat(String name, String gender) {//构造方法
        this.name = name;
        this.gender = gender;
        //this.eat("🐟");
    }
//    public void eat(String food){
//        System.out.println(name +"正在吃" + food);
//    }
    @Override
    public String toString(){
        return this.name + " , " + this.gender;
    }
}
