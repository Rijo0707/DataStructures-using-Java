import java.util.Scanner;

public class LinkedList {  
	
	Node head;
	
	static class Node{	//Node Class
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
			
		}
		
	}
	
	public static LinkedList create(LinkedList list,int data)	//create Linked List
	{
		Node new_node=new Node(data);
		new_node.next=null;
		
		if(list.head==null)
		{
			list.head=new_node;
		}
		else {
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	public static LinkedList insertBegin(LinkedList list,int ele)	//insert node at the beginning
	{
		Node new_node=new Node(ele);
		if(list.head==null)
		{
			list.head=new_node;
			new_node.next=null;
		}
		else
		{
			new_node.next=list.head;
			list.head=new_node;
			
		}
		System.out.println("Element inserted successfully");
		
		return list;
	}
	public static LinkedList insertSpecific(LinkedList list,int ele,int pos)	//Insert node at specific location
	{
		Node new_node=new Node(ele);
		if(pos<1)
			System.out.println("Invalid");
		Node temp=list.head;
		for(int i=0;i<pos;i++)
		{
			temp=temp.next;
		}
		new_node.next=temp.next;
		temp.next=new_node;
		return list;
	}
	public static LinkedList deleteBegin(LinkedList list)	//delete node at the beginning
	{
		Node temp=list.head;
		if(list.head!=null)
		{
			
			list.head=list.head.next;
			temp.next=null;
			
			
		}
		return list;
	}
	public static LinkedList deleteLast(LinkedList list)	//delete node at the end
	{
		if(list.head!=null&&list.head.next!=null)
		{
			Node secondLast=list.head;
			while(secondLast.next.next!=null)
			{
				secondLast=secondLast.next;
			}
			secondLast.next=null;
		}
		return list;
		
	}
	public static LinkedList deleteSpecific(LinkedList list,int pos)	//delete node at specific location
	
	{
		if(pos<0)
			System.out.println("Invalid");
		else if(pos==0)
		{
			list.head=list.head.next;
		}
		else
		{
			Node temp=list.head;
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		return list;
	}

	public static void printList(LinkedList list)	//traversing the list and printing the elements
	{
		Node currNode=list.head;
		if(list.head==null)
		{
			System.out.println("No element Present");
		}
		else
		{
			System.out.println("LinkedList: ");
			while(currNode!=null)
			{
				System.out.println(currNode.data+" ");
				currNode=currNode.next;
			}
			
		}
		
	}
	public static void lengthList(LinkedList list)	//Length of the list
	{
		Node currNode=list.head;
		int count=0;
		while(currNode!=null)
		{
			count++;
			currNode=currNode.next;
		}
		System.out.println("Length of List is: "+count);
	}
	public static void main(String[] args) {	//main function
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
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
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 2:
			{
				System.out.println("Enter the Element to be inserted");
				int ele=sc.nextInt();
				list=create(list,ele);
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
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 4:
			{
				
				list=deleteBegin(list);
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 5:
			{
				
				list=deleteLast(list);
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 6:
			{
				System.out.println("Enter the position where you want to delete the element");
				int pos=sc.nextInt();
				list=deleteSpecific(list,pos);
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
			case 7:
			{
				list.head=null;
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
				lengthList(list);
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

