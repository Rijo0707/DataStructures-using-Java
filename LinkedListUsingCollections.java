import java.util.*;
import java.util.LinkedList;

public class LinkedListUsingCollections {
	
	public static LinkedList<Integer> create(LinkedList<Integer> list,int ele)
	{
		list.add(ele);
		return list;
	}
	public static LinkedList<Integer> insertBegin(LinkedList<Integer> list,int ele)
	{
		list.addFirst(ele);
		return list;
		
	}
	public static LinkedList<Integer> insertLast(LinkedList<Integer> list,int ele)
	{
		list.addLast(ele);
		return list;
		
	}
	public static LinkedList<Integer> insertSpecific(LinkedList<Integer> list,int ele,int pos)
	{
		list.add(pos, ele);
		return list;
		
	}
	public static LinkedList<Integer> deleteBegin(LinkedList<Integer> list)
	{
		if(list.peekFirst()==null)
			System.out.println("List is empty");
		else
			list.removeFirst();
		return list;
		
	}
	public static LinkedList<Integer> deleteLast(LinkedList<Integer> list)
	{
		if(list.peekFirst()==null)
			System.out.println("List is empty");
		else
			list.removeLast();
		return list;
		
	}
	public static LinkedList<Integer> deleteSpecific(LinkedList<Integer> list,int pos)
	{
		if(list.peekFirst()==null)
			System.out.println("List is empty");
		else
			list.remove(pos);
		return list;
		
	}
	public static void deleteList(LinkedList<Integer> list)
	{
		list.clear();
	}
	
	public static void printList(LinkedList<Integer> list)
	{
		if(list.peekFirst()==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Iterator<Integer> it=list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}
		
		
	}
	public static int lengthList(LinkedList<Integer> list)
	{
		int count=0;
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			count++;
			it.next();
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {	//main function
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("***************Linked List***************\n\n ");
		System.out.println("Create list: Enter the number of elements you want to add to the list: \n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter the "+(i+1)+" element: ");
			int ele=sc.nextInt();
			list=create(list,ele);
		}
		char ch='y';
		while(ch=='y')
		{
			System.out.println("\n\nSelect the relevant option: \n"
					+ "1: Insert at the begining\n"
					+ "2: Insert at the end\n"
					+ "3: Insert at the specific location\n"
					+ "4: Delete at the begining\n"
					+ "5: Delete at the end\n"
					+ "6: Delete at the specific location\n"
					+ "7: Delete List\n"
					+ "8: Print List\n"
					+ "9: Length of List\n"
					+ "To Exit press 0");
			int option=sc.nextInt();
			switch(option) {
			case 1:
			{
				System.out.println("Enter the Element to be inserted");
				int ele=sc.nextInt();
				list=insertBegin(list,ele);
				System.out.println("Element added\n");
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 2:
			{
				System.out.println("Enter the Element to be inserted");
				int ele=sc.nextInt();
				list=create(list,ele);
				System.out.println("Element added\n");
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 3:
			{
				System.out.println("Enter the Element to be inserted");
				int ele=sc.nextInt();
				System.out.println("Enter the position where you want to insert the element");
				int pos=sc.nextInt();
				list=insertSpecific(list,ele,pos);
				System.out.println("Element added\n");
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 4:
			{
				
				list=deleteBegin(list);
				System.out.println("Element deleted\n");
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 5:
			{
				
				list=deleteLast(list);
				System.out.println("Element deleted\n");
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 6:
			{
				System.out.println("Enter the position where you want to delete the element");
				int pos=sc.nextInt();
				list=deleteSpecific(list,pos);
				System.out.println("Element deleted\n");
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 7:
			{
				deleteList(list);
				System.out.println("List Deleted!");
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			
			case 8:
			{
				
				printList(list);
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
				
			}
			case 9:
			{
				int l=lengthList(list);
				System.out.println("The length of list is: "+l);
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
				
			}
			case 0:
				break;
				
			}
		}
		

		
		sc.close();
	}
}

