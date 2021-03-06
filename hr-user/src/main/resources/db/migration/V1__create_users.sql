create table tb_user(
  COD_USER bigint generated by default as identity primary key,
  NAME          VARCHAR(255),
  EMAIL         VARCHAR(255),
  PASSWORD      VARCHAR(255)
);

create table tb_role(
  COD_ROLE bigint generated by default as identity primary key,
  NAME         VARCHAR(255)
);

create table tb_user_roles(
    COD_USER bigint,
    COD_ROLE bigint,
    foreign key (COD_USER) references tb_user (COD_USER),
    foreign key (COD_ROLE) references tb_role (COD_ROLE)
);

INSERT INTO tb_user (name, email, password) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO tb_user (name, email, password) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO tb_role (name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_roles (COD_USER, COD_ROLE) VALUES (1, 1);
INSERT INTO tb_user_roles (COD_USER, COD_ROLE) VALUES (2, 1);
INSERT INTO tb_user_roles (COD_USER, COD_ROLE) VALUES (2, 2);