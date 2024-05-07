package timeSpaceComplexity;

public class pairSum {
    public static void sort (int [] arr){
        int key = 0;
        for (int i = 1; i < arr.length; i++){
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static int pairSum (int [] arr, int num){
        sort(arr);
        int startindex = 0;
        int endindex = arr.length - 1;
        int numpair = 0;
        while (startindex < endindex){
            if (arr[startindex] + arr[endindex] < num){
                startindex += 1;
            }else if (arr[startindex] + arr[endindex] > num){
                endindex -= 1;
            }else{
                int elementAtstart = startindex;
                int elementAtend = endindex;
                if (elementAtstart == elementAtend){
                    int elementcount = elementAtend - elementAtstart + 1;
                    numpair += (elementcount*(elementcount - 1)/2);
                }else{
                    int tempstartindex = startindex + 1;
                    int tempendindex = endindex - 1;
                    while (tempstartindex <= tempendindex && arr[tempstartindex] == arr[elementAtstart]){
                        tempstartindex += 1;
                    }
                    while (tempstartindex <= tempendindex && arr[tempendindex] == arr[elementAtend]){
                        tempendindex -= 1;
                    }
                    int elementFromstart = tempstartindex - elementAtstart;
                    int elementFromend = elementAtend - tempendindex;
                    numpair += (elementFromstart*elementFromend);
                }
            }
        }
        return numpair;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4};
        System.out.println(pairSum(arr, 5));
    }
}
