package com.epam.vnrvjiet.DeekshithBommidi.week6.Deekshith_CustomCollectionList;
import java.util.*;
public class CustomCollectionListFunctions<dataType> {

	private Object[] myArray = new Object[] {1,2,3,4,5,6,7,8,9,10};
	private int currentSize=10;
	
	
	public void AddElement(Object element)
	{
		EnsureCapacity();
		myArray[currentSize++]=element;
		System.out.println("New Element Added");
		PrintData();
	}
	private void EnsureCapacity()
	{
		if(currentSize>=myArray.length)
		{
			int oldCapacity=myArray.length;
			int newCapacity=(oldCapacity*3)/2+1;
			myArray= Arrays.copyOf(myArray , newCapacity);
		}
		
	}
	
	public void SetElement(int index, Object element)
	{
		try {
		if(index>=currentSize)
			throw new ArrayIndexOutOfBoundsException();
		myArray[index]=element;
		System.out.println("Element value at index" + index + "Updated to "+ element);
		}
		catch(Exception e)
		{
			System.out.println(e + " Cannot Set value for an Element Out of List");
		}
		PrintData();		
	}
	
	public void FetchData(int index)
	{
		try {
		if(index>=currentSize)
			throw new ArrayIndexOutOfBoundsException();
		Object elementValue = myArray[index];
		System.out.println("Element at index "+ index + " is "+ elementValue);
		}
		catch(Exception e)
		{
			System.out.println(e + " Cannot Fetch an Element Out of List");
		}
	}
	
	public void PrintData()
	{
		for(int count=0;count<currentSize;count++)
			System.out.print(myArray[count]+" ");
		System.out.println();
	}
	
	public void RemoveElement(int index)
	{
	
	try
	{
	if(index>currentSize || index<=0)
		throw new ArrayIndexOutOfBoundsException();
		
	for(int i=index;i<currentSize-1;i++)
	{
		myArray[i]=myArray[i+1];
	}
	currentSize--;
	if(currentSize<0)
		currentSize=0;
	System.out.println("Element at index "+index+" is Successfully Removed");
	PrintData();
	}
	catch(Exception e)
	{
		System.out.println(e + " Cannot Remove an Element Out of List");
	}
	
	}	
}
