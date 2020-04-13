package webadv.s99201105.p02;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        String userAccount = "17206118";
        String userPassword = "Nchu0805";
        String userName = "陈晓军";
        String account=null;
        String password=null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("账号：");
        account = scanner.nextLine().trim();
        System.out.println("密码：");
        password = scanner.nextLine().trim();
        System.out.println("***********************************************************");
        if(account.equals(userAccount) && password.equals(userPassword)){
            System.out.println("登录成功！");
            System.out.println("用户名："+userName);
            System.out.println("账号："+userAccount);
            System.out.println("密码："+sha256hex(userPassword));
        }else{
            System.out.println("账号或密码错误");
        }

    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

