SELECT * FROM (SELECT name FROM users order by exp desc) AS foo limit 1 offset 1
