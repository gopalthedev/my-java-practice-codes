import java.util.Scanner;
public class SumOfThe_followingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int ans=0;
        for(int i=1;i<=n;i++){//this condition will implement like if input=5 output=3 1-2+3-4+5=3
            if(i%2==0){
                ans-=i;
            }
            else{
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}
