# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table t_post (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  title                         varchar(255),
  message                       varchar(255),
  created_at                    timestamp not null,
  constraint pk_t_post primary key (id)
);


# --- !Downs

drop table if exists t_post;

