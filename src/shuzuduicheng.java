import java.util.Scanner;
public class shuzuduicheng {
    public static void main(String[] args) {
        // 数据准备
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 键盘输入n个整数
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        boolean flag = true;   //假设元素对称
        // TODO： 计算判断数组中元素是否对称
        //
      for (int i=0;i<a.length/2;i++){
          if (a[i] == a[a.length-i])
              flag=true;
          else
              flag=false;

      }


        // 输出结果
        if (flag) {
            System.out.println("数组元素对称！");
        } else {
            System.out.println("数组元素不对称！");
        }
    }
}