SELECT * FROM campeoes ORDER BY ano ASC;
SELECT * FROM campeoes WHERE ano = (SELECT MAX(ano) FROM campeoes);
SELECT sigla_times, COUNT(*) FROM campeoes GROUP BY sigla_times ORDER BY COUNT(*) DESC;