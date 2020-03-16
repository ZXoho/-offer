package test;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by zxoho on 2020/3/14 0014
 * Description:从控制台输入年月日，要求输出这是这一年的第几天
 */
public class GetDate {

    public static void main(String[] args) {
        GetDate date = new GetDate();
        date.function2();
    }

    public void function1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年：");
        int year = scanner.nextInt();
        System.out.println("请输入月：");
        int month = scanner.nextInt();
        System.out.println("请输入日：");
        int day = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        System.out.println("这是一年中的第"+calendar.get(Calendar.DAY_OF_YEAR)+"天");
    }

    public void function2(){
        int year,month,day,a=0,b=0;
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入年份");
        year=reader.nextInt();
        System.out.println("请输入月份");
        month=reader.nextInt();
        System.out.println("请输入日");
        day=reader.nextInt();
        for(int i=1;i<month;i++)
        {
            switch(i)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    a=31;
                    break;
                case 2:
                    if(year%4==0&&year%100!=0||year%400==0)
                        a=29;
                    else
                        a=28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    a=30;
                    break;
            }
            b=b+a;
        }
        b=b+day;
        System.out.println("这是这一年的第"+b+"天" );

    }

}
