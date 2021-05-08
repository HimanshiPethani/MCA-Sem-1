1].	

	create table s
			( 	sno char(10)primary key, 
				sname varchar(20)not null,
				s_status int(10)not null,
				scity varchar(30)not null
			);

			select * from s;


			insert into s(sno ,sname, s_status,scity)
			values('s1','smith',20,'londan'),
			('s2','jones',10,'paris'),
			('s3','blake',10,'paris'),
			('s4','clark',20,'london'),
			('s5','adams',30,'india');

			drop table p;

			create table p(
				pno char(20)primary key,
				pname varchar(20)not null,
				pcolor varchar(20)not null,
				weight float(20)not null,
				pcity varchar(30)not null
				
			);


			insert into p(pno, pname,pcolor,weight,pcity)
			values
			('p1','nut','red',12.0,'london'),
			('p2','blot','green',17.0,'paris'),
			('p3','screw','blue',17.0,'india'),
			('p4','screw','red',14.0,'london'),
			('p5','cam','blue',12.0,'paris'),
			('p6','cam','red',19.0,'london');

			select * from p;

			create table sp(
			sno char(10)not null,
			pno char (20)not null,
			primary key(sno,pno),
			FOREIGN KEY(sno) REFERENCES s(sno),
			FOREIGN KEY(pno) REFERENCES p(pno),
			qty int(5) not null
			);

			insert into sp(sno,pno,qty)
			values
			('s1','p1',300),
			('s1','p2',200),
			('s1','p3',400),
			('s1','p5',100),
			('s1','p6',100),
			('s2','p1',300),
			('s2','p2',400),
			('s3','p2',200),
			('s4','p2',200),
			('s4','p4',300),
			('s4','p5',400);

			select * from sp;
2].

			/* 1.show all parts located at londan city  */
			select * from p where city="london";

			/*
			2.show maximum weight part name*/

			select pname from p where weight=(select max(weight)from p);

			/*3.show all parts name ,part number for part color=red*/

			select pname,pno from p where color="red";

			/*4.Show suppler name , suppler city who supply part qty more then 200.*/

			select sname,city from s,sp where s.sno=sp.sno and sp.qty>200;

			/*5. Show second highest weight*/

			select max(weight) from p where weight < (select max(weight) from p);
			
3].			

			/*6. Show suppler no and qty for part supply for highest weight part.*/
			select sp.sno, sp.qty from sp, p where sp.pno = p.pno and p.weight =(select max(weight) from p);

			/*7. Show suppler name and qty for part color is "Red" supply.*/

			Select s.sname, sp.qty from sp,p,s where p.color="Red" and sp.pno = p.pno and sp.sno= s.sno;


			/*8.show suppler name,part city and
			qty for suppler status is less then 
			30 shipment supply.*/


			select s.sname,p.city,sp.qty from 
			s,p,sp where sp.pno=p.pno and 
			sp.sno=s.sno and s.s_status<30;

			 
			/*9.show each part suppers total qty supply.*/


			 select s.sname,sum(sp.qty) from sp,s where sp.sno=s.sno group by sp.sno;




			/*10.show each part total qty supply.*/


			select sp.pno, p.pname,sum(sp.qty) from p,sp where sp.pno=p.pno group by p.pno;

4].

		/*11.show each part names total qty supply*/


		select p.pname,sum(sp.qty) from p,sp where sp.pno=p.pno group by p.pname;

		/*12.show each suppers whose suppler number is less then s4 give total qty supply by each suppler*/

		 
		select s.sname, s.sno,sum(sp.qty) from sp,s where sp.sno=s.sno 
		group by sp.sno having sp.sno<"s4";

		/*13.show each suppers whose suppler status is 20 give total qty supply by each suppler*/


		select s.sno,s.sname ,sum(sp.qty) from sp,s where sp.sno=s.sno 
		and s.s_status=20 group by sp.sno;



5].
		create table dept(
		dept_id char(3)primary key,
		dept_name varchar(30) not null,
		dept_loction varchar(50) not null
		)

		create table emp(
		emp_id char(3) primary key,
		emp_name varchar(20) not null,
		dept_id char(3) not null,

		FOREIGN KEY (dept_id) REFERENCES dept(dept_id),
		emp_boss_id char(3) not null,
		emp_salary int(20) not null
		)

		drop table emp;

		insert into dept(dept_id,dept_name,dept_loction)
		values("d1","bca","ahemdabad"),
		("d2","bba","ahemdabad"),
		("d3","bsc","ahemdabad");
		select * from dept

		insert into emp(emp_id,emp_name,dept_id,emp_boss_id,emp_salary)
		values("e1","boss smith","d1","eb1",200000),
		("e2","king","d1","eb1",100000),
		("e3","jones","d1","eb1",50000),
		("e4","boss blake","d2","eb2",150000),
		("e5","clark","d2","eb2",250000),
		("e6","adams","d2","eb2",60000),
		("e7","boss ford","d3","eb3",170000),
		("e8","ward","d3","eb3",80000),
		("e9","allen","d3","eb3",100000);

		select * from emp;

		select emp.emp_name,dept.dept_name,bossemp.emp_name as "boss name",
		bossdept.dept_name as "boss department" from emp,dept,emp as bossemp,dept as bossdept
		where emp.emp_boss_id=bossemp.emp_id and emp.emp_dept_id= dept.dept_id and bossemp.emp_dept_id=emp.emp_dept_id;



		select emp.emp_name,dept.dept_name,bossemp.emp_name,bossdept.dept_name from emp,dept,emp as bossemp,dept as bossdept
		where emp.emp_dept_id=dept.dept_id and emp.emp_boss_id=bossemp.emp_boss_id and bossemp.emp_dept_id=emp.emp_dept_id and emp.emp_salary>bossemp.emp_salary;
		
		

6].
	6.1).show employee name,employee department name,boss name,boss department name.
	ans:-
		select emp.emp_name,dept.dept_name,bossemp.emp_name as "boss name",
		bossdept.dept_name as "boss department" from emp,dept,emp as bossemp,dept as bossdept
		where emp.emp_boss_id=bossemp.emp_id and emp.emp_dept_id= dept.dept_id and bossemp.emp_dept_id=emp.emp_dept_id;
		
	6.2).show employee name,employee department name,boss name,boss department name where employee salary greater then boss salary.
	ans:-
		select emp.emp_name,dept.dept_name,bossemp.emp_name,bossdept.dept_name from emp,dept,emp as bossemp,dept as bossdept
		where emp.emp_dept_id=dept.dept_id and emp.emp_boss_id=bossemp.emp_boss_id and bossemp.emp_dept_id=emp.emp_dept_id and emp.emp_salary>bossemp.emp_salary;
		
		
7].
	7.3).Show Department name and that department maximum salary.
	ans:-
		select d.dept_name,max(e.emp_salary)from dept d inner join emp e on d.dept_id = e.emp_dept_id group by d.dept_id
	
	7.4).show employee department name,that department total employee count.
	ans:-
		SELECT dept_name AS 'Department Name',COUNT(*) AS 'No of Employees' FROM dept INNER JOIN emp ON emp.emp_dept_id = dept.dept_id GROUP BY dept.dept_id, dept_name ORDER BY dept_name;
	

8].
		create table account
		(
		acc_no int(10)not null,
		amount decimal(10,2)not null
		);
		
9].
		CREATE TRIGGER accounttrigger BEFORE INSERT ON account
		FOR EACH ROW SET @sum = @sum + NEW.amount

		set @sum = 0;

		insert into account(acc_no,amount)
		values(1,30000),
		(2,60000),
		(3,40000),
		(4,80000);

		 select @sum AS "Total amount inserted";

10].

		CREATE TRIGGER creditdebit BEFORE INSERT ON 
		account FOR EACH ROW PRECEDES amt_totl1
		 SET 
		@deposits = @deposits + IF(NEW.amount>0,-NEW.amount,0);

		set @sum=0;
		set @deposits=0;
		set @withdrawals=0;
		select @sum;
		select * from account;

		insert into account values(101,27000);

11].
		Create Deadlock status.
		
		file 1:- show full processlist;
			lock table s write;
			lock table p write;
			unlock tables;
			
		file 2:- use db2;
			select * from p;
			show full processlist;
			lock table s write;
			lock table p write;
			unlock tables;


