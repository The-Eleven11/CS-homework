import java.util.Scanner;
/**
 * 输入一个数，将其倒置输出
 * 
 * @杨嘉镒
 * @2022/12/5
 */
public class reverse
{
    public static void main(String args[]){
        int num, count=1, coun=1;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        int[] re = new int[num]; 
        while(num>0){   /*将各个数位分别放进数组 */
            re[count]=num%10;
            num=num/10;
            count++;
        }
        while (coun<count){ /*将数组从低到高输出 */
            System.out.print(re[coun]);
            coun++;
        }
    }
}
