package java0726;


public class Test1 {
    public static int fac(int N){
        if(N < 2){
            return N;
        }
        return fac(N - 1) * N;

    }

    public static void main(String[] args) {
        int ret = fac(5);
        System.out.println(ret);
    }
}
