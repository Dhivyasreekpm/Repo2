package Javademo1;

public class sortingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int[] {2,1,3,6,5,4,9,7};
	       
	       // System.out.println("Elements before sorting:"+arr);
	        
	       
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=i+1;j<arr.length;j++)
	            {
	                int tmp=0;
	                if(arr[i]>arr[j])
	                {
	                    tmp=arr[i];
	                    arr[i]= arr[j];
	                    arr[j]=tmp;
	                }
	            }
	            System.out.println("Elements after sorting:"+arr[i]);
	        }
	}

}
