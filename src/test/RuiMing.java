package test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * Created by zxoho on 2020/3/14 0014
 * Description:
 */
public class RuiMing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入四位数：");
        int a[] = new int[4];
        for(int i = 0; i<4; i++)
            a[i] = scanner.nextInt();
        for(int i = 0; i<4; i++)
            a[i] = (a[i]+5) % 10;
        int temp = a[0];
        a[0] = a[3];
        a[3] = temp;
        temp = a[1];
        a[1] = a[2];
        a[2] = temp;
        for(int i = 0; i<4; i++)
            System.out.print(a[i]);

    }




    }




