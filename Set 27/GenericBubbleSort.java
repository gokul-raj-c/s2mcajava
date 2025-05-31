 
public class GenericBubbleSort  
{ 
public static <T extends Number & Comparable<T>> void bubbleSort(T[] array)  
{ 
int n = array.length; 
T temp; 
for (int i = 0; i < n - 1; i++)  
{ 
for (int j = 0; j < n - 1 - i; j++)  
{ 
if (array[j].compareTo(array[j + 1]) > 0)  
{ 
temp = array[j]; 
array[j] = array[j + 1]; 
array[j + 1] = temp; 
} 
} 
} 
} 
public static <T> void printArray(T[] array)  
{ 
for (T num : array) 
{ 
System.out.print(num + " "); 
} 
System.out.println(); 
} 
public static void main(String[] args)  
{ 
Integer[] intArr = {5, 2, 9, 1, 3}; 
System.out.println("Before sorting:"); 
printArray(intArr); 
bubbleSort(intArr); 
System.out.println("After sorting:"); 
printArray(intArr); 
}
} 




    