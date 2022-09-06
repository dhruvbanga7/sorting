
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp,n=7;
        int array[]={3,4,1,2,6,8,7};
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("The array after sorting is: \n");
        for(i=0;i<n;i++)
        {
            System.out.print(array[i]);
        }

	}

}
