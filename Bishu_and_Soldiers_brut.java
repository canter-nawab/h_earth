// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int i,l=0,u=N-1,m=(l+u)/2,flag=-1,j,s=0;
        int p[]=new int[N];
        
        for(i=0;i<N;i++)
        {
            p[i]=sc.nextInt();
        }
        int Q=sc.nextInt();
        int b[]=new int[Q];
        for(i=0;i<Q;i++)
        {
            b[i]=sc.nextInt();
        }
        
        for(i=0;i<Q;i++)
        {
            s=0;
            l=0;
            u=N-1;
            flag=-1;
            s=0;
            
            if(p[u]<=b[i])
            {
                flag=N-1;
            }
            else
            {
                while(l<=u)
                {
                    
                    m=(l+u)/2;
                    if(p[m]>b[i])
                        u=m-1;
                    else if(p[m]<b[i])
                    {
                        l=m+1;
                    }
                    else if(p[m]==b[i])
                    {
                        flag=m;
                        break;
                    }
                }
            }
            if(flag!=-1)
            {
                for(j=0;j<=flag;j++)
                {
                    s=s+p[j];
                }
            }
            System.out.println((flag+1)+" "+s);
        }
                
        /*for(i=0;i<Q;i++)
        {
            if()
        }
        */

    }
}


