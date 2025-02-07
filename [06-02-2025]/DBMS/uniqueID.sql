--Given two tables, Employees and EmployeeUNI, write an SQL query to retrieve the unique ID of each employee. If an employee does not have a unique ID, return NULL.
select a.unique_id,e.name from Employees as e Left Join  EmployeeUNI as a on a.id=e.id;
