UPDATE times SET grupo = 'A' WHERE nome = 'QATAR' OR nome = 'EQUADOR' OR nome = 'SENEGAL' OR nome = 'HOLANDA';
UPDATE times SET grupo = 'B' WHERE nome = 'INGLATERRA' OR nome = 'IRÃ' OR nome = 'ESTADOS UNIDOS' OR nome = 'PAÍS DE GALES';
UPDATE times SET grupo = 'C' WHERE nome = 'ARGENTINA' OR nome = 'ARÁBIA SAUDITA' OR nome = 'MÉXICO' OR nome = 'POLÔNIA';
UPDATE times SET grupo = 'D' WHERE nome = 'FRANÇA' OR nome = 'DINAMARCA' OR nome = 'TUNÍSIA' OR nome = 'AUSTRÁLIA';
UPDATE times SET grupo = 'E' WHERE nome = 'ESPANHA' OR nome = 'ALEMANHA' OR nome = 'JAPAO' OR nome = 'COSTA RICA';
UPDATE times SET grupo = 'F' WHERE nome = 'BÉLGICA' OR nome = 'CANADÁ' OR nome = 'MARROCOS' OR nome = 'CROÁCIA';
UPDATE times SET grupo = 'G' WHERE nome = 'BRASIL' OR nome = 'SÉRVIA' OR nome = 'SUÍÇA' OR nome = 'CAMARÕES';
UPDATE times SET grupo = 'H' WHERE nome = 'PORTUGAL' OR nome = 'GANA' OR nome = 'URUGUAI' OR nome = 'CORÉIA DO SUL';

SELECT * FROM public.times ORDER BY grupo ASC;