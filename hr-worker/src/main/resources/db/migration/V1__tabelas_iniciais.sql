create table TB_WORKER
(
COD_WORKER bigint generated by default as identity primary key,
  NAME         VARCHAR(255),
  DAILY_INCOME double precision not null
);
