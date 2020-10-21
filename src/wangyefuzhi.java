public class wangyefuzhi {

    public static void main(String args[]){
        //判断对称
        int arr[] = {1,2,2,1,1};
        boolean flag = false;
        for(int i=0; i < arr.length/2; i++){
            if(arr[i] == arr[arr.length -1-i]){
                flag = true;
            }else
                flag = false;

        }
        //输出结果
        if(flag)
            System.out.println("对称");
        else
            System.out.println("不对称");

    }
}

