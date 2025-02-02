SELECT Students.Student_ID, Students.Name, Students.Age, Departments.Dept_Name
FROM Students
INNER JOIN Departments ON Students.Dept_ID = Departments.Dept_ID;
