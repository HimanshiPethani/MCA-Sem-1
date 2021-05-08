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
void insertatbegin(int);
void insertend(int);
void deletebegin();
void deleteend();
void main()
{
	create();
	create();
	create();
	display();
	insertatbegin(5);
	display();
	insertend(50);
	display();
	deletebegin();
	display();
	deleteend();
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
void insertatbegin(int data)
{
	struct node *newnode1;
	newnode1=(struct node*)malloc(sizeof(struct node));
	newnode1->no=data;
	newnode1->next=first;
	first=newnode1;
	printf("done \n");
}
void insertend(int item)
{
	 struct node *ptr = (struct node*)malloc(sizeof(struct node));     
        struct node *temp;  
        if(ptr == NULL)  
        {  
            printf("\nOVERFLOW");     
        }  
        else  
        {  
            ptr->no = item;  
            if(first == NULL)  
            {  
                ptr -> next = NULL;  
                first = ptr;  
               
            }  
            else  
            {  
                temp = first;  
                while (temp -> next != NULL)  
                {  
                    temp = temp -> next;  
                }  
                temp->next = ptr;  
                ptr->next = NULL;  
                
              
            }  
        }  
}
void deletebegin()
{
	 struct node *ptr;  
        if(first == NULL)  
        {  
            printf("\nList is empty");  
        }  
        else   
        {  
            ptr = first;  
            first = ptr->next;  
            free(ptr);  
            printf("\n Node deleted from the begining ...");  
        }  
}
void deleteend()
{
	struct node *ptr,*ptr1;  
        if(first == NULL)  
        {  
            printf("\nlist is empty");  
        }  
        else if(first -> next == NULL)  
        {  
            first = NULL;  
            free(first);  
            printf("\nOnly node of the list deleted ...");  
        }  
              
        else  
        {  
            ptr = first;   
            while(ptr->next != NULL)  
                {  
                    ptr1 = ptr;  
                    ptr = ptr ->next;  
                }  
                ptr1->next = NULL;  
                free(ptr);  
                printf("\n Deleted Node from the last ...");  
            }     
}

