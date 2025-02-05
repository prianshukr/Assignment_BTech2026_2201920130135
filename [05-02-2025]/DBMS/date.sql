--Retrieve the sale_id and sale_date from the Sales table, formatting the sale_date as 'YYYY-MM-DD'.
SELECT sale_id, DATE_FORMAT(sale_date, '%Y-%m-%d') AS formatted_date 
FROM Sales;
