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
int search(int key);

void main()
{
	int n,keytosearch,index;
	create();
	create();
	create();
	display();
	printf("\n enter element to search:");
	scanf("%d",&keytosearch);
	index = search(keytosearch);
	if(index>=0)
	{
		printf("%d found in the position%d\n",keytosearch,index+1);
	}
	else
	{
		printf("%d not found in the position%d\n",keytosearch);	
	}
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
int search(int key)
{
	int index;
	struct node *curnode;
	index=0;
	curnode=first;
	
	while(curnode!=NULL&&curnode->no!=key)
	{
		index++;
		curnode=curnode->next;
	}
	return(curnode!=NULL)?index:-1;
}
