import java.util.* ;
public class Assignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number of entries: ");
		int num = sc.nextInt();
		int[] array = new int[num];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<num; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
	
		for (int i=0; i<num; i++)   
		{  
		System.out.print(array[i]);
		
		}  
		}  
		}  
