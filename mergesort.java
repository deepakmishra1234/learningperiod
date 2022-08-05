package datastructure.phase1;

public class mergesort 
{
	void merge(int arr[], int l, int n, int a)
    {      
        int n1 = n - l + 1;
        int n2 = a - n;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        
        for (int j=0; j<n2; ++j)
            R[j] = arr[n + 1+ j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }    
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {            
            int m = (l+r)/2;

            sort(arr, l, m);           
            sort(arr , m+1, r);       
            merge(arr, l, m, r); 
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    public static void main(String args[])
    {
        int arr[] = {11,4,7,8,9,3};

        System.out.println("Given Array");
        printArray(arr);

        mergesort ob = new mergesort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

}
