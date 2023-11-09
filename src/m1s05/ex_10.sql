SELECT DISTINCT(UPPER(nome)) FROM times INNER JOIN campeoes ON times.sigla = campeoes.sigla_times;

SELECT DISTINCT(LOWER(nome)) FROM times LEFT JOIN campeoes ON times.sigla = campeoes.sigla_times
WHERE campeoes.sigla_times IS NULL;