// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int i,l=0,u=N-1,m=(l+u)/2,flag=-1,j;
        int p[]=new int[N];
        int s[]=new int[N];
        
        for(i=0;i<N;i++)
        {
            p[i]=sc.nextInt();
            s[i]=0;
        }
        s[0]=p[0];
        for(i=0;i<N-1;i++)
        {
            s[i+1]=s[i]+p[i+1];
            
        }
        int Q=sc.nextInt();
        int b[]=new int[Q];
        for(i=0;i<Q;i++)
        {
            b[i]=sc.nextInt();
        }
        /*
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
                
        */
        for (i = 0; i <N-1; i++)
        {
            
            int mi = i;
            for (j = i+1; j < N; j++)
            {
                if (p[j] < p[mi])
                    mi = j;
            int temp = p[mi];
            p[mi] = p[i];
            p[i] = temp;
            }
        }
        for(i=0;i<Q;i++)
        {
           
            l=0;
            u=N-1;
            flag=-1;
            
            
                while(l<=u)
                {
                    
                    m=(l+u)/2;
                    if(p[m]==b[i])
                    {
                        flag=m;
                        l=m+1;
                    }
                    else if(p[m]>b[i])
                    {
                        
                        u=m-1;
                    }
                    else if(p[m]<b[i])
                    {
                        l=m+1;
                        
                    }
                    
                }
        
            int k;
            int y;
            if(flag==-1)
            {
                if(b[i]>p[N-1]){
                    k=N;
                    y=s[N-1];
                    
                }
                else{
                    k=0;
                    y=0;
                }
            }
            else    
            {
                k=flag+1;
                y=s[flag];
             
            }
            
            System.out.println(k+" "+y);
        }
        

    }
}


