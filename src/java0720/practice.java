package java0720;

public class practice {
//    //输入今天是星期几，求若干天后是星期几
//    public static void main(String args[]){
//        System.out.println("输入今天是星期几（数字）：");
//        Scanner reader=new Scanner(System.in);
//        int day = reader.nextInt();
//        System.out.println("请输入几天后（数字）：");
//        int flag=reader.nextInt();
//
//        int week=(flag + day) % 7;
//
//        switch(week){
//            case 1:System.out.println(flag+"天后星期一。");break;
//            case 2:System.out.println(flag+"天后星期二。");break;
//            case 3:System.out.println(flag+"天后星期三。");break;
//            case 4:System.out.println(flag+"天后星期四。");break;
//            case 5:System.out.println(flag+"天后星期五。");break;
//            case 6:System.out.println(flag+"天后星期六。");break;
//            case 7:System.out.println(flag+"天后星期日。");break;
//        }
//
//        reader.close();
//    }

    public static void main(String[] args) {
        //计算一个整数二进制位中1的个数(包含负数）
//        int num = -1;
//        int count = 0;
//        while(num != 0){
//            num &=(num - 1);
//            count++;
//
//        }
//        System.out.println(count);
        //字符串反转
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcdefg");
        System.out.println(stringBuffer.reverse());
    }


}
