/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int n, int target, int* returnSize) {
    int* a=(int*)malloc(2*sizeof(int));
    *returnSize=2;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
                a[0]=i;
                a[1]=j;
            }
        }
    }
    return a;
}