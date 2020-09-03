
set foreign_key_checks = 0;

delete from tb_pessoa_juridica;
delete from tb_cliente;

set foreign_key_checks = 1;

alter table tb_pessoa_juridica auto_increment = 1;
alter table tb_cliente auto_increment = 1;

INSERT INTO tb_pessoa_juridica (razao_social, nome_fantasia, nr_cnpj, num_ie, nom_logradouro, num_logradouro, nom_bairro, cod_municipio, nom_mucipio, cod_uf, num_cep)
VALUES('JAPAUTO COMERCIO DE MOTOCICLETAS LTDA', 'JAPAUTO - ALPHAVILLE', 52834181000155, 206019381116, 'ALAMEDA ARAGUAIA', 1800, 'ALPHAVILLE INDUSTRIAL', 3505708, 'BARUERI', 'SP', 6455000);

INSERT INTO tb_pessoa_juridica (razao_social, nome_fantasia, nr_cnpj, num_ie, nom_logradouro, num_logradouro, nom_bairro, cod_municipio, nom_mucipio, cod_uf, num_cep)
VALUES('Benício e Leandro Assessoria Jurídica ME', 'Benício e Leandro Assessoria Jurídica ME', 63946452000180, 441540341705, 'Rua João Fantinato', 595, 'Jardim Hedy', 3505708, 'Mogi Guaçu', 'SP', 13841041);

INSERT INTO tb_pessoa_juridica (razao_social, nome_fantasia, nr_cnpj, num_ie, nom_logradouro, num_logradouro, nom_bairro, cod_municipio, nom_mucipio, cod_uf, num_cep)
VALUES('Benício e Leandro Assessoria Jurídica ME', 'Benício e Leandro Assessoria Jurídica ME', 41083000000180, 41083000000180, 'Rua João Fantinato', 595, 'Jardim Hedy', 3505708, 'Mogi Guaçu', 'SP', 13841041);

INSERT INTO tb_pessoa_juridica (razao_social, nome_fantasia, nr_cnpj, num_ie, nom_logradouro, num_logradouro, nom_bairro, cod_municipio, nom_mucipio, cod_uf, num_cep)
VALUES('Arthur e Lucca Eletrônica ME', 'Arthur e Lucca Eletrônica ME', 22584088000179, 22584088000179, 'Rua João Fantinato', 595, 'Jardim Hedy', 3505708, 'Mogi Guaçu', 'SP', 13841041);

INSERT INTO tb_pessoa_juridica (razao_social, nome_fantasia, nr_cnpj, num_ie, nom_logradouro, num_logradouro, nom_bairro, cod_municipio, nom_mucipio, cod_uf, num_cep)
VALUES('Louise e Benjamin Advocacia Ltda', 'Louise e Benjamin Advocacia Ltda', 37629509000108, 783430797176, 'Rua Arábia', 916, 'Jardim Hedy', 3505708, 'Taboão da Serra', 'SP', 13841041);

INSERT INTO tb_pessoa_juridica (razao_social, nome_fantasia, nr_cnpj, num_ie, nom_logradouro, num_logradouro, nom_bairro, cod_municipio, nom_mucipio, cod_uf, num_cep)
VALUES('Sarah e Aurora Entregas Expressas ME', 'Sarah e Aurora Entregas Expressas ME', 98798551000147, 629912379780, 'Rua Arábia', 916, 'Jardim Hedy', 3505708, 'Taboão da Serra', 'SP', 13841041);

INSERT INTO tb_cliente(id_pj, dt_cadastro) value (1,utc_timestamp);


