package com.epam.vnrvjiet.DeekshithBommidi.week6.Deekshith_CustomCollectionList;
import java.util.*;
public class CustomCollectionListMain {

	public static void main(String[] args) {
		CustomCollectionListFunctions<Object> listObject = new CustomCollectionListFunctions<Object>();
		Scanner sc=new Scanner(System.in);
		int isTrue=1,operation,index,option;
		Object element;
		while(isTrue==1)
		{
			System.out.println("Choose the Operation to be Performed:");
			System.out.println("\n1.Add Element to the List\n\n2.Fetch Element");
			System.out.println("\n3.Remove Element from the List\n\n4.Update the value of an Element\n\n5.Print the List\n\n6.Exit\n");
			System.out.print("\nEnter your Option:");
			operation=sc.nextInt();
			System.out.println();
			switch(operation)
			{
			case 1:System.out.print("\nEnter the element to be Added : ");
					element = sc.next();
					System.out.println();
					listObject.AddElement(element);
					break;
			case 2:System.out.print("\nEnter the index of the element be Fetched : ");
					index = sc.nextInt();
					System.out.println();
					listObject.FetchData(index);
					break;
			case 3:System.out.print("\nEnter the index of the element You are willing to remove : ");
					index = sc.nextInt();
					System.out.println();
					listObject.RemoveElement(index);
					break;
			case 4:System.out.print("Enter the index of the element to be updated");
					index=sc.nextInt();
					System.out.println();
					System.out.print("Enter the value to be updated");
					element=sc.next();
					System.out.println();
					listObject.SetElement(index,element);
					break;
			case 5:listObject.PrintData();break;
			case 6:isTrue=0;break;
			}
			if(isTrue!=0)
			{
				System.out.print("\n\nDo you want to continue?(0/1) : ");
				option=sc.nextInt();
				System.out.println();
				if(option==1)
					isTrue=1;
				else isTrue=0;
			}
		}
		sc.close();
	}

}
