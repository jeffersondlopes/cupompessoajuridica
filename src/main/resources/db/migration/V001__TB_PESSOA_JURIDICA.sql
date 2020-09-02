
create table tb_pessoa_juridica (id bigint not null auto_increment,
								 razao_social varchar(255),
	                             nome_fantasia varchar(255),
	                             nr_cnpj bigint,
	                             num_ie bigint not null,

	                             nom_logradouro varchar(255),
	                             num_logradouro bigint,
	                             nom_bairro varchar(255),
	                             cod_municipio bigint,
	                             nom_mucipio varchar(255),

	                             cod_uf varchar(255),
	                             num_cep bigint,
	                             primary key (id)) engine=InnoDB default charset=utf8;