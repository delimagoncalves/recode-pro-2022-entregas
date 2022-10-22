create database agencia_viagem;

use agencia_viagem;

create table Destino(
id_destino int not null auto_increment, 
estado varchar(2) not null,
cidade varchar(30) not null,
valor_diaria real not null,
primary key(id_Destino));

create table Cliente(
id_cliente int not null auto_increment, 
nome varchar(30) not null,
cpf varchar(11) not null,
data_nasc varchar(8) not null,
endereco varchar(50) not null,
tel_fixo varchar(10) not null,
tel_movel varchar(11)not null,
primary key(id_cliente));

create table Compra(
id_compra int not null auto_increment,
fk_id_cliente int not null,
fk_id_destino int not null,
valor_compra real not null,
quantidade_dias int not null,
primary key (id_compra),
foreign key (fk_id_cliente) references Cliente(id_cliente),
foreign key (fk_id_destino) references Destino(id_destino)
);

create table Passagem(
id_passagem int not null,
fk_id_destino int not null,
fk_id_compra int not null,
primary key (id_passagem),
foreign key(fk_id_destino)references Destino(id_destino),
foreign key(fk_id_compra) references Compra (id_compra)
);
