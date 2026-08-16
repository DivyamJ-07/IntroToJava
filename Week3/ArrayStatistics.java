
public class ArrayStatistics
 {
    public int sum(int [] arr)
    {   
        int s=0;
        for(int i=0; i<arr.length;i++)
        {
            s=arr[i];
        }
        return s;
    }
    public double average(int[] arr)
    {
        return(double)sum(arr)/arr.length;
    }
    public int minimum(int[] arr)
    {
        int min=arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(min<arr[i])
                {
                    min=arr[i];
                }
        }
        return min;
    }
    public int maximum(int[] arr)
    {
        int max=arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(max>arr[i])
                {
                    max=arr[i];
                }
        }
        return max;
    }
    public int countEven(int[] arr)
    {
        int even=0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
        }
        return even;
    }
    public void printSignCounts(int[] arr)
    {
        int p=0,n=0,z=0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]>0)
            {p++;}
            if(arr[i]<0)
            {n++;}
            if(arr[i]==0)
            {z++;}
        }
        System.out.println("Positive: "+p+"Negative: "+n+"Zero: ");
    }
}
   
