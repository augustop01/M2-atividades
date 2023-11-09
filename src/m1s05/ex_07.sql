CREATE TABLE campeoes(
                         ano int PRIMARY KEY,
                         sigla_times VARCHAR(3),
                         FOREIGN KEY(sigla_times) REFERENCES times(sigla)
);

INSERT INTO campeoes (ano, sigla_times) VALUES (1930, 'URU');
INSERT INTO campeoes (ano, sigla_times) VALUES (1950, 'URU');
INSERT INTO campeoes (ano, sigla_times) VALUES (1954, 'GER');
INSERT INTO campeoes (ano, sigla_times) VALUES (1958, 'BRA');
INSERT INTO campeoes (ano, sigla_times) VALUES (1962, 'BRA');
INSERT INTO campeoes (ano, sigla_times) VALUES (1966, 'ENG');
INSERT INTO campeoes (ano, sigla_times) VALUES (1970, 'BRA');
INSERT INTO campeoes (ano, sigla_times) VALUES (1974, 'GER');
INSERT INTO campeoes (ano, sigla_times) VALUES (1978, 'ARG');
INSERT INTO campeoes (ano, sigla_times) VALUES (1986, 'ARG');
INSERT INTO campeoes (ano, sigla_times) VALUES (1990, 'GER');
INSERT INTO campeoes (ano, sigla_times) VALUES (1994, 'BRA');
INSERT INTO campeoes (ano, sigla_times) VALUES (1998, 'FRA');
INSERT INTO campeoes (ano, sigla_times) VALUES (2002, 'BRA');
INSERT INTO campeoes (ano, sigla_times) VALUES (2010, 'ESP');
INSERT INTO campeoes (ano, sigla_times) VALUES (2014, 'GER');
INSERT INTO campeoes (ano, sigla_times) VALUES (2018, 'FRA');

SELECT * FROM campeoes;