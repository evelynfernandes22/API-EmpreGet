create table cliente(
                        id bigint not null auto_increment,
                        nome varchar(60) not null,
                        rg varchar(09) not null,
                        cpf varchar(11) not null,
                        telefone varchar(20) not null,
                        email varchar(255) not null,
                        data_do_cadastro datetime not null,
                        
                        end_logradouro varchar(255) not null,
                        end_numero varchar(30) not null,
                        end_complemento varchar(60),
                        end_cep varchar(10) not null,                        
                        end_cidade varchar(40) not null,
                        end_bairro varchar(30) not null,
                        end_estado varchar(30) not null,
                        end_pais varchar(30) not null,

                        primary key (id)
);