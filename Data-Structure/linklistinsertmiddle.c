#include<stdio.h>
#include<stdlib.h>

struct node
{
	int no;
	struct node *next;

};
struct node *first=NULL;
struct node *last=NULL;
void create();
void display();
void insertdesiredlocation(int,int);
void main()
{

	create();
	create();
	create();
	display();
	insertdesiredlocation(34,2);
	display();

}
void create()
{
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("enter value of linklist:-");
	scanf("%d",&newnode->no);
	newnode->next=NULL;
	if(first==NULL)
	{
		first=newnode;
		last=newnode;
	}
	else
	{
		last->next=newnode;
		last=newnode;
	}
}
void display()
{
	struct node *temp;
	printf("dispaly called");
	for(temp=first;temp!=NULL;temp=temp->next)
	{
		printf("\nthe element of link list are %d:\n",temp->no);
	}
}
void insertdesiredlocation(int data,int pos)
{
	int i;
	struct node *newnode,*temp;
	newnode=(struct node*)malloc(sizeof(struct node));
	if(newnode==NULL)
	{
		printf("unable to allocate memory");
	}else
	{
		newnode->no=data;
		newnode->next=NULL;
		temp=first;
		
		for(i=2;i<=pos-1;i++)
		{
			temp=temp->next;
			if(temp==NULL)
			{
				break;
			}
		}
		newnode ->next = temp ->next;   
        temp ->next = newnode; 
		
	}
}
