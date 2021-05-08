#include<stdio.h>

int main()
{
	int a[5][5],b[5][5],c[5][5],i,j,m,n;
	printf("enter row value:");
	scanf("%d",&m);
	
	printf("enter clumn value:");
	scanf("%d",&n);
	
	printf("\nEnter first matrix:\n");
	
	for(i=0;i<m;++i)
		for(j=0;j<n;++j)
			scanf("%d",&a[i][j]);
			
	printf("\nEnter second matrix:\n");
	
	for(i=0;i<m;++i)
		for(j=0;j<n;++j)
			scanf("%d",&b[i][j]);
	
	printf("\nMatrix after addition:\n");
	
	for(i=0;i<m;++i)
	{
		for(j=0;j<n;++j)
		{
			c[i][j]=a[i][j]+b[i][j];
			printf("%d ",c[i][j]);
		}
		
		printf("\n");
	}
	
		printf("\nMatrix after substraction:\n");
	
	for(i=0;i<m;++i)
	{
		for(j=0;j<n;++j)
		{
			c[i][j]=a[i][j]-b[i][j];
			printf("%d ",c[i][j]);
		}
		
		printf("\n");
	}
 
	return 0;
}
 

