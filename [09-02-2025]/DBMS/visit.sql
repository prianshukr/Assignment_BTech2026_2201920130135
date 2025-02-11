--Write an SQL query to find all customers who visited but never made a purchase.
SELECT DISTINCT v.customer_id
FROM Visits v
LEFT JOIN Purchases p 
ON v.customer_id = p.customer_id
WHERE p.customer_id IS NULL;
