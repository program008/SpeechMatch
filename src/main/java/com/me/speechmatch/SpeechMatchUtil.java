package main.java.com.me.speechmatch;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 语音正则匹配
 * Created by tao.liu on 2017/8/2.
 */
public class SpeechMatchUtil {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        while(!input.equals("exit")){
            System.out.println("开始匹配："+input);
            //启动舞蹈
            String reg = "^(?!.*(不))^.*(退出|关闭|返回).*$";
            boolean b = match(reg, input);
            System.out.println("匹配结果:"+b);
            input = in.nextLine();
            System.out.println();
        }
    }

    public static boolean match(String regular,String strText){
        Pattern pattern = Pattern.compile(regular);
        return pattern.matcher(strText).find();
    }
}
