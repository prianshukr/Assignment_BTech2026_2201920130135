SELECT email as Email
FROM Person
GROUP BY email
HAVING count(email) > 1 ;
