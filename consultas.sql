/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 26/12/2018 
 * Objetivo sucinto do programa: Criar um banco de dados que armazena informação de uma pessoa
 * Referência ao enunciado/origem do exercício: https://www.youtube.com/watch?v=NCG9niOlm40
 */
 
 /*Cria o banco de dados*/
 create database cadastro;
 /*Deleta banco de dados*/
 drop database cadastro;
 
 /*Usa tabela top*/
use cadastro;

drop database teste;

/*Cria tabela*/
CREATE TABLE pessoas(
	id int NOT NULL auto_increment,
	nome varchar(30) NOT NULL,
	nascimento date,
	sexo enum('M','F'),
	peso decimal(5,2),
	altura decimal(3,2),
	nacionalidade varchar(20) DEFAULT 'Brasil',
    PRIMARY KEY(id)
) DEFAULT CHARSET = utf8;

/*Insere registro em cada um na tabela*/
INSERT INTO pessoas
(nome, nascimento, sexo, peso, altura, nacionalidade)
values
('Carlos', '1982-04-14', 'M', '180.5', '2.00', 'India'),
('Luiza', '2001-04-14', 'F', '60.5', '1.66', 'Brasil'),
('Neuza', '1920-08-1', 'F', '70.5', '1.56', 'Brasil'),
('Isabela', '1981-12-31', 'F', '65.5', '1.60', 'Orlanda'),
('Teresa', '1974-04-1', 'F', '83.5', '1.60', 'Brasil'),
('Julio', '1989-04-14', 'M', '90.5', '1.90', 'Brasil');

/*Apaga todos os registros de uma tabela*/
TRUNCATE TABLE pessoas;

/*Mostro todos os valores da tabela*/
desc pessoas;

/*Adiciona mas uma coluna a uma tabela existene*/
alter table pessoas
add column profissao varchar(10);

/*Mostra a tabela inteira*/
select * from pessoas;

/*Remove profissão*/
alter table pessoas
drop column profissao;

/*Adiciona mas uma coluna a uma tabela existente depois de nome*/
alter table pessoas
add column profissao varchar(10) after nome;

/*Adicionar como primeiro*/
ALTER TABLE pessoas
add column codigo int FIRST;

/*Modifica o tamanho que cabe em profissão deixa vazio sem ser null*/
alter table pessoas
modify column profissao varchar(20) not null default '';

/*Renomear a coluna e colocar todas as constrants e tipos*/
alter table pessoas
change column profissao prof varchar(20);

/*Novo nome da tabel em desc*/
desc gafanhotos;

/*Modificar o nome da tabela inteira*/
alter table pessoas
rename to gafanhotos;


/*
NOVO TABELA
*/

/*Criar uma nova tabela se ele não existir*/
CREATE TABLE IF NOT EXISTS cursos(

	nome varchar(30) NOT NULL UNIQUE,
    descricao text,
    carga int unsigned,
    totaulas int,
    ano year default '2016'

) DEFAULT CHARSET = utf8;

describe cursos;

ALTER TABLE cursos
add column idcursos int first;

ALTER TABLE cursos
add primary key (idcursos);

/*Apagar a tabela inteira*/
drop table cursos;

select * from gafanhotos;
select * from cursos;

insert into cursos value
('1','HTML4','Curso de HTML5','40','37','2014'),
('2','Algoritimo','Logica de Programação','20','15','2014'),
('3','Photoshop','Dica de Photoshop cc','10','8','2014'),
('4','PGP','Curso de PHP para iniciantes','40','20','2010'),
('5','Jarva','Introdução a linguagem Java','10','29','2000'),
('6','MySQL','Banco de dados MySQL','30','15','2016'),
('7','Word','Curso completo de Word','40','30','2016'),
('8','Sapateado','Danças Rítmicas','40','30','2018'),
('9','Cozinha Árabe','Aprenda a fazer Kibe','40','30','2018'),
('10','YouTuber ','Gerar polêmica e ganhar inscritos','5','2','2018');


/*Modificar os erros*/
/*Alterar uma linha*/
-- Modifica O NOME DO idcurso 1 de html4 para html5
update cursos
set nome = 'HTML5'
where idcursos = '1';

-- Para alterar os 2 ao mesmo tempo
UPDATE cursos
SET nome = 'PHP', ano = '2015'
where idcursos = '4';

-- limit = limitar quantas linhas podem ser afetadas no banco
UPDATE cursos
SET nome = 'Java',ano = '2015', carga = '40'
WHERE idcursos = '5'
LIMIT 1;

-- altera o ano do curso todo aqueles que tem 2018 do ano
UPDATE cursos
SET ano = '2018', carga = '26'
WHERE ano = '2050';

-- Vai deletar aqueles com idcurso = 8
DELETE FROM cursos
WHERE idcursos = '8';

-- Vai deletar varias linhas
DELETE FROM cursos
WHERE ano = '2018' 	
limit 2;

-- Apagar uma tabela inteira

TRUNCATE cursos;

-- abre as tabelas com registro
select * from gafanhotos;
select * from cursos;


-- Abre os dados da tabela
desc gafanhotos;
desc cursos;


-- Desativa os updates seguros
SET
SQL_SAFE_UPDATES = 0;

-- deles a baixo aula 11 

select * from cursos
-- Ordenar pelo nome
order by nome;

-- faz a ordenaçao inverso ou seja de baixo para cima descedente
select * from cursos
order by nome desc;

-- ascedente
select * from cursos
order by nome asc;

-- describe
desc cursos;

-- order quer que aparece pro usuario
select nome,carga, ano from cursos
order by nome;

-- order quer que aparece pro usuario
select nome,carga, ano from cursos
order by ano;

-- ordernar de 2 forma
select nome,carga, ano from cursos
order by ano, nome;

/*
Where = uma condição de que so aparece o do ano de 2016 ou outro adicionado tanto quanto nome ou totaulas
select * from cursos = selecione a tabela cursos exiba
ordery by = ordenar pelo nome
*/
select * from cursos
where ano = '2016'
order by nome;


/*Seleciona apenas o nome dos cursos de 2016*/
select nome,descricao,carga from cursos
where ano = '2016'
order by nome;

/*Seleciona de acordo com a condicao para mostrar na tela*/
select ano,nome,descricao,carga from cursos
where ano <> '2016'
order by ano, nome;

/*Entre um e outro*/
select ano,nome,descricao,carga from cursos
where ano between 2015 and 2017
order by ano desc, nome;

/*Entre um e outro de 2014 ate 2016*/
select ano,nome,descricao,carga from cursos
where ano between 2014 and 2016
order by ano desc, nome;

/*
Mostra apenas os escolhidos
que no caso foi ano
então mostra apenas os de 2014 e 2016 e 2020
*/
select nome, descricao, ano from cursos
where ano in (2014, 2016, 2020)
order by ano;

/*
Mostra todos os cursos onde
a carga de aula e maior que 35 
e o totaulas menor que 30
*/
select nome,carga,totaulas from cursos
where carga > 35 and totaulas < 30
order by nome,totaulas;

use cadastro;

/*
Mostra todos os cursos onde
a carga de aula e maior que 35 
e o totaulas menor que 30 usando or
que e diferente do and, o or e um ou outro
se o carga foi maior que 35 e maior que 30
vai pois uma das condição foi true
*/
select nome,carga,totaulas from cursos
where carga > 35 or totaulas < 30
order by nome,totaulas;

--  Todos os cursos que terminam com A
select * from cursos
where nome like '%A';

-- todos os cursos que começam com A
select * from cursos
where nome like 'A%';

-- todos que tem A no inicio ou A no fim
select * from cursos
where nome like '%A%';


-- todos que não tem A no inicio
select * from cursos
where nome not like 'A%';

-- todos que não tem A no fim
select * from cursos
where nome not like '%A';

-- todos que não tem A no fim e nem A no inicio
select * from cursos
where nome not like '%A%';

select * from cursos;
update cursos set nome = 'PáOO' where idcurso = '9';

 select * from cursos;
 
-- Pega aqueles que começam com ph e terminam com p
select * from cursos
where nome like 'ph%p';

-- Pega aqueles que começam com ph e terminam com p e mas um no final
select * from cursos
where nome like 'ph%p%';

-- Pega aqueles que começam com ph e terminam com p e mas um no final
select * from cursos
where nome like 'ph%p_';


select * from gafanhotos
where nome like '%silva_%';

select * from cursos;

-- Distinct vai chamar um de cada mesmo que se repita
select distinct carga from cursos;

select distinct nome from gafanhotos;

select distinct nacionalidade from gafanhotos
order by nacionalidade;

select distinct profissao from gafanhotos;

select distinct carga from cursos
order by carga;

-- Para a saber a quantidade de cursos cadastrados
select count(*) from cursos where carga > 40;

-- Para mostrar a maior de alguma cois usa max() e a menor usa min()
select max(carga) from cursos;
select min(carga) from cursos;

-- Para mostrar a maior de alguma cois usa max() e a menor usa min() enquanto o ano for tal
select max(carga) from cursos where ano = '2015';
select min(carga) from cursos where ano = '2016';

select max(totaulas) from cursos where ano ='2016';
select min(totaulas) from cursos where ano ='2015';

-- Para mostrar a maior de alguma cois usa max() e a menor usa min() e o nome antes
select nome, max(carga) from cursos;
select min(carga) from cursos;

select * from cursos where carga > 50;

select * from cursos;

-- soma oque foi pedido e mostra o total 
select sum(totaulas) from cursos;
select sum(carga) from cursos;

-- enquanto for tal ano soma o total de aulas ou carga nesse ano
select sum(totaulas) from cursos where ano="2015";
select sum(carga) from cursos where ano='2019';

-- tira a media
select AVG(totaulas) from cursos;
select AVG(carga) from cursos;

-- tira a media com condição
select avg(totaulas) from cursos where ano = '2016';
select avg(carga) from cursos where ano = '2016';

-- agrupa todos o resultado visual e parecido mas não igual ao distinc
select nome,carga from cursos
group by carga;

-- agrupa todos o resultado visual e parecido mas não igual ao distinc
select carga,COUNT(*) from cursos
group by carga;

select cursos.nome, gafanhoto.nome from cursos,gafanhotos;

/*
Exercicios do 1 ao 20 do site https://www.sqlteaching.com/
*/

/*
instrução select
*/
select * from family_members;

/*
instrução select procur
*/
SELECT name,species FROM family_members;


/*
procura tabela inteira onde species = a dog
*/
select id,name,gender,species,num_books_read
 from family_members where species='dog';
 
 /*
 procura tabela com condição where
 */
 select * from family_members where  num_books_read > 190;

 /*
  procura tabela com condição where

 */
 select * from family_members where  num_books_read >= 180;
 
 /*
  procura tabela com tabela com duas condição = true
 */
 select id,name,gender,species,height_cm
 from friends_of_pickles where  height_cm < 45 AND species = 'dog';

/*
  procura tabela com uma ou outra condição

*/
SELECT * FROM friends_of_pickles WHERE height_cm < 45 OR species = 'dog';

/*
  procura tabela com duas condição diferente de cat ou dog

*/
SELECT * FROM friends_of_pickles WHERE species NOT IN ('cat', 'dog');

/*
  procura tabela com distinct e condição
*/
select distinct species from friends_of_pickles where height_cm > 50;

/*
 ordenado de acordo com o tamnho em orde decresente
*/
select * from friends_of_pickles 
order by height_cm desc;

/*
Mostra oque se pede e o maximo de tamanho ordenado pelo tamanho afetando uma unica linha
*/
select id, name,gender,species,max (height_cm) height_cm from friends_of_pickles
order by height_cm 
limit 1;

/*
  conta a quantidade
*/
select count(*) from friends_of_pickles;

/*
   conta a quantidade com condição
*/
select count(*) from friends_of_pickles WHERE species = 'dog'

/*
   soma a quantidade de livros lido
*/
select sum(num_books_read) from family_members;

/*
   calcula media de livros lidos
*/
select avg(num_books_read) from family_members;

/*
  o maximo de livro lido
*/
select max(num_books_read) from family_members;

/*
  o maximo de livro lido e quem leu agrupado
*/
select max(height_cm),species from friends_of_pickles 
group by species;

/*
   comando select em condição
*/
select * from family_members  where num_books_read = (select max(num_books_read) from family_members);

/*
   condição onde não pode ser null
*/
select * from family_members where favorite_book not like 'null';

/*
  condição com simbolo de maior maior 
*/
select * from celebs_born 
where birthdate > '1980-01-9';

-- FIM

desc gafanhotos;

alter table gafanhotos add column cursopreferido int;

/*LIGAR O CURSOPREFERIDO A IDCURSO COMO CHAVE ESTRANGEIRA*/
alter table gafanhotos 
add foreign key(cursopreferido)
references cursos(idcurso);

select * from gafanhotos;
select * from cursos;

/*vai dar um update onde o aluno o aluno 6 vai preferir o curso 1*/
update gafanhotos set cursopreferido = '6' where id = '1';

delete from cursos where idcurso= '31';

select nome,cursopreferido from gafanhotos
where cursopreferido <= '6';

select nome,ano from cursos;

/*
Vai juntar cada gafanhoto com todos os cursos não e isso que eu quero pra da certo use on
*/
select gafanhotos.nome, gafanhotos.cursopreferido, cursos.nome, cursos.ano from gafanhotos join cursos;

/*RELACIONAR AS TABELAS ONDE MOSTRA QUEM PREFERE QUAL CURSO OU QUE*/
select gafanhotos.nome, gafanhotos.cursopreferido, cursos.nome, cursos.ano 
from gafanhotos join cursos
on cursos.idcurso = gafanhotos.cursopreferido;

select * from gafanhotos;

/*Relacionar tbm com apelidos
g = gafanhotos
c = cursos
*/
select g.nome, g.cursopreferido, c.nome, c.ano 
from gafanhotos as g inner join cursos as c
on c.idcurso = g.cursopreferido;

/*
Ordenado a partir de nomes de gafanhotos
*/
select g.nome, g.cursopreferido, c.nome, c.ano 
from gafanhotos as g right outer join cursos as c
on c.idcurso = g.cursopreferido
order by g.nome;

/*
Criar um terceira tabela para relacionar
e apontar para onde deseja
*/
CREATE TABLE gafanhotos_assiste_curso(

id int NOT NULL AUTO_INCREMENT,
data date,
idgafanhoto int,
idcurso int,
PRIMARY KEY(id),
/*Para marca as chaves estrangeiras de gafanhotos*/
FOREIGN KEY (idgafanhoto) REFERENCES gafanhotos(id),
FOREIGN KEY (idcurso) REFERENCES cursos(idcurso)

)default charset = utf8;
/*
Inserir os registros na tabela gafanhoto_assiste_curso
*/
insert into gafanhotos_assiste_curso values
(default,'2014-03-01', '1','2');

/*Assim geraria um bagunça danada*/
select * from gafanhotos g 
join gafanhotos_assiste_curso a;

/*
Mostra os gafanhotos cadastrado em gafanhotos_assiste_curso
e tbm os dados de gafanhotos_assiste_curso e  gafanhotos
*/
select * from gafanhotos g 
join gafanhotos_assiste_curso a
on g.id = a.idgafanhoto;
/*
Filtrando mostrando apenas os dados dos gafanhotos seria assim
*/
select g.id,g.nome, a.idgafanhoto,idcurso from gafanhotos g 
join gafanhotos_assiste_curso a
on g.id = a.idgafanhoto;

select g.nome,idcurso from gafanhotos g 
join gafanhotos_assiste_curso a
on g.id = a.idgafanhoto
order by g.nome;

/*
Para colocar o nome do curso puxando dados de 3 tabelas
usando 3 join 
*/
select g.nome, c.nome from gafanhotos g 
join gafanhotos_assiste_curso a
on g.id = a.idgafanhoto
join cursos c
on a.idcurso = c.idcurso
order by g.nome;

/*

Exercicios do 21 ao 31 do site https://www.sqlteaching.com/
*/

/*
Lesson 21: Inner joins
*/
select character.name,character_actor.actor_name
 from character join character_actor
on character.id = character_actor.character_id;

/*
Lesson 22: Multiple joins
*/
select c.name,a.name from character c 
join character_actor ca 
on c.id = ca.id
join actor a
on a.id = actor_id;

/*
Lesson 23: Joins with WHERE
*/
select character.name,tv_show.name from character join character_tv_show
on character.id =character_tv_show.character_id
join tv_show
on character_tv_show.tv_show_id = tv_show_id 
where character.name = 'Doogie Howser' and tv_show.name = 'Doogie Howser, M.D.' 
and character.name != 'Willow Rosenberg' and  tv_show.name != 'How I Met Your Mother';

/*
Lesson 24: Left joins
*/
select c.name, a.name from character c left join character_actor ca
on c.id = ca.character_id
left join actor a
on a.id = ca.actor_id;

/*
Lesson 25: Table alias
*/
select c.name, a.name 
from character as c 
left join character_actor AS ca
on c.id = ca.character_id
left join actor AS a
on a.id = ca.actor_id;

/*
Lesson 26: Column alias
*/
select c.name AS character,a.name AS actor
from character c 
left join character_actor ca
on c.id = ca.character_id
left join actor a
on a.id = ca.actor_id;

/*
Lesson 27: Self joins
*/
select epy.name AS employee_name,bos.name AS boss_name
from employees AS epy join employees AS bos 
on epy.boss_id = bos.id;

/*
Lesson 28: LIKE
*/
SELECT * FROM robots 
WHERE name LIKE "%200%";

/*
Lesson 29: CASE
*/
SELECT *, CASE WHEN species = 'human' THEN "talk"
WHEN species = 'cat'
THEN 'meow'
ELSE 'bark' END AS sound
FROM friends_of_pickles;

/*
Lesson 30: SUBSTR
*/
SELECT * FROM robots 
WHERE SUBSTR(location, -4,14) like '%NY';

/*
Lesson 31: COALESCE
*/
SELECT name, COALESCE(tank,gun,sword) as weapon FROM fighters; 






