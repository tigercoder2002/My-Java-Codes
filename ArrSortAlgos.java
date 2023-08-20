// Array Sorting Algorithms.
import java.util.*;
class ArrSortAlgos{
    int arr[];
    ArrSortAlgos(int a[]){
        arr=a;
    }
    /*void printArr(){
        System.out.print("\f");
        for(int num: arr)
            System.out.print(num+" ");
    }*/
    void bubSort(){     // Bubble Sort.
        for(int i=0/*,flag=1*/;i<arr.length/* && flag==1*/;i++){
           // flag=0;
           for(int j=0;j<(arr.length-i-1);j++)
                if(arr[j]>arr[j+1]){    // if(arr[j]<arr[j+1]) for Descending.
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    // flag=1;
                }
            }
    }
    void seleSort(){     // Selection Sort.
        for(int i=0;i<arr.length;i++){
            int minind=i;    // maxind for Descending.
            for(int j=(i+1);j<arr.length;j++)
                if(arr[minind]>arr[j])  // if(arr[maxind]<arr[j]) for Descending.
                    minind=j;
            int temp=arr[i];
            arr[i]=arr[minind];
            arr[minind]=temp;
        }
    }
    void inseSort(){    // Insertion Sort.
        for(int i=1;i<arr.length;i++)
            for(int j=i;(j>0) && (arr[j]<arr[j-1]);j--){    // && (arr[j]>arr[j-1]) for Descending.
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
    }
    void mergeSort(int l, int r){   // Merge Sort.
        if(l>=r)
            return;
        int mid=(l+r)/2;
        mergeSort(l,mid);
        mergeSort((mid+1),r);
        int m=mid-l+1, n=r-mid;
        int[] larr=new int[m], rarr=new int[n];
        for(int i=0;i<m;larr[i]=arr[l+i],i++);
        for(int i=0;i<n;rarr[i]=arr[mid+i+1],i++);
        int i=0,j=0;
        for(;(i<m) && (j<n);arr[l]=(larr[i]<=rarr[j])?larr[i++]:rarr[j++],l++);             // Condition (larr[i]>=rarr[j]) for Descending.
        for(;i<m;arr[l]=larr[i],l++,i++);
        for(;j<n;arr[l]=rarr[j],l++,j++);
    }
    void quickSort(int l, int r){   // Quick Sort.
        if(l>=r)
            return;
        int pind=l;
        for(int i=(l+1);i<=r;pind+=(arr[i]<arr[l])?1:0,i++);
        int temp=arr[l];
        arr[l]=arr[pind];
        arr[pind]=temp;
        for(int i=l,j=r;(i<pind) && (j>pind);){
            for(;arr[i]<arr[pind];i++);
            for(;arr[j]>arr[pind];j--);
            if((i<pind) && (j>pind)){
                temp=arr[i];
                arr[i++]=arr[j];
                arr[j--]=temp;
            }
        }
        quickSort(l,(pind-1));
        quickSort((pind+1),r);
    }
    void countSort(){   // Count Sort.
        int max=arr[0];
        for(int num: arr)
            max=Math.max(max,num);
        int counts[]=new int[max+1];
        for(int num: arr)
            counts[num]++;
        for(int i=0,j=0;i<=max;i++)         
            for(int k=1;k<=counts[i];arr[j++]=i,k++);       // k<=counts[max-i] and arr[j++]=max-i for Descending.
    }
    void radixSort(){   // Radix Sort.
        int max=arr[0];
        for(int num: arr)
            max=Math.max(max,num);
        for(int dig=1;max/dig>0;dig*=10){
            int[] counts=new int[10], a=new int[arr.length];
            for(int num: arr)
                counts[num/dig%10]++;
            for(int i=1;i<10;counts[i]+=counts[i-1],i++);
            for(int i=(arr.length-1);i>=0;a[counts[arr[i]/dig%10]-1]=arr[i],counts[arr[i]/dig%10]--,i--);
            arr=a.clone();
        }
    }
    void buckSort(){    // Bucket Sort.
        int min=arr[0], max=arr[0];
        for (int num: arr) {
            if (num<min)
                min=num;
            else if (num>max)
                max=num;
        }
        int range=max-min+1;
        int count=Math.min(range,arr.length);
        ArrayList<Integer>[] bucks= new ArrayList[count];
        for (int i=0;i<count;bucks[i]=new ArrayList<>(),i++);
        for (int num: arr) 
            bucks[(num-min)*(count-1)/range].add(num);
        for (int i=0;i<count;i++)
            for(int j=0;j<bucks[i].size();j++)
                for(int k=(j+1);k<bucks[i].size();k++)
                    if(bucks[i].get(j)>bucks[i].get(k)){      // if(bucks[i].get(j)<bucks[i].get(k)) for Descending.
                        int temp=bucks[i].get(j);
                        bucks[i].set(j,bucks[i].get(k));
                        bucks[i].set(k,temp);
                    }
        int ind=0;
        for (ArrayList<Integer> buck: bucks)
            for (Integer num: buck)
                arr[ind++]=num;
    }
}
            
            

                
            