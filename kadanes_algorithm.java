lass Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){

        // Your code here
        long sum=0,max=arr[0];
        int i=0;
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
            max=Math.max(sum,max);
            if(sum<0)
                sum=0;
        }
        return max;
    }

}
