--Write an SQL query to find the second highest salary from this table. If there is no second highest salary, return NULL.
SELECT DISTINCT salary 
FROM Employees 
ORDER BY salary DESC 
LIMIT 1 OFFSET 1;
