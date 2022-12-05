import java.util.Scanner;
/**
 * 在这里给出对类 sum 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class digitssum
{
    public static void main(String args[]){
        int num, digit=0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        while(num>0){
            digit=digit+num%10; /*将最后一位数累加 */
            num=num/10; /*去掉最后一位数 */
        }
        System.out.println(digit);
    }
}
