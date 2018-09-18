-- @AUTHOR: Maria Pereira
-- @CREATE: TABLE calculator 
-- @PARAMS: value1 and value2 - decimal (1-38) | op - varchar (3) aceita apenas 'sum', 'sub', 'mul', 'div', 'avg'
-- @SELECT: Apresenta toda a tabela
-- @INSERT INTO: Inserir valores a tabela
-- @ALTER TABLE: Testes a alterar tabela
-- @INSERT INTO: Testar valores incorrectos na VARCHAR op 

CREATE TABLE calculator (
	value1 DECIMAL,
	value2 DECIMAL,
	op VARCHAR (3)
		CONSTRAINT op_ CHECK (op in('sum', 'sub', 'mul', 'div', 'avg'))
);



SELECT * FROM calculator;

INSERT INTO calculator VALUES (1,2,'sum');
INSERT INTO calculator VALUES (1,2,'mul');
INSERT INTO calculator VALUES (1,2,'sub');
INSERT INTO calculator VALUES (1,2,'div');
INSERT INTO calculator VALUES (1,2,'avg');

INSERT INTO calculator VALUES (2,2,'sum');


ALTER TABLE calculator DROP COLUMN op;

INSERT INTO calculator VALUES (1,2,'adb');