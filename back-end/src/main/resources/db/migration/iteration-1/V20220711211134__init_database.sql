create table article
(
    id               bigint auto_increment comment 'ID'
        primary key,
    user_id          bigint        not null comment '用户ID',
    title            varchar(500)  not null comment '标题',
    content          text          null comment '内容',
    like_count       int default 0 null comment '点赞数',
    view_count       int default 0 null comment '浏览量',
    collection_count int default 0 null comment '收藏次数',
    create_time      datetime      null comment '创建时间',
    create_by        varchar(35)   null comment '创建人',
    update_time      datetime      null comment '更新时间',
    update_by        varchar(35)   null comment '更新人'
)
    comment '文章表';

create table classification
(
    id          bigint auto_increment comment 'ID'
        primary key,
    parent_id   bigint       not null comment '父分类ID',
    description varchar(255) not null comment '分类描述',
    name        varchar(50)  not null comment '分类名称',
    create_time datetime     null comment '创建时间',
    create_by   varchar(35)  null comment '创建人',
    update_time datetime     null comment '更新时间',
    update_by   varchar(35)  null comment '更新人'
)
    comment '分类表';

create table comment
(
    id          bigint auto_increment comment 'ID'
        primary key,
    parent_id   bigint      null comment '父评论ID',
    article_id  bigint      not null comment '文章ID',
    user_id     bigint      not null comment '用户ID（评论人）',
    content     varchar(50) null comment '评论内容',
    like_count  int         null comment '点赞数',
    create_time datetime    null comment '创建时间',
    create_by   varchar(35) null comment '创建人',
    update_time datetime    null comment '更新时间',
    update_by   varchar(35) null comment '更新人'
)
    comment '评论表';

create table relation_article_classification
(
    id                bigint auto_increment comment 'ID'
        primary key,
    article_id        bigint      not null comment '文章ID',
    classification_id bigint      not null comment '分类ID',
    create_time       datetime    null comment '创建时间',
    create_by         varchar(35) null comment '创建人',
    update_time       datetime    null comment '更新时间',
    update_by         varchar(35) null comment '更新人'
)
    comment '文章-分类-关系表';

create table tag
(
    id          bigint auto_increment comment 'ID'
        primary key,
    name        varchar(35)  not null comment '标签名称',
    description varchar(255) null comment '描述',
    create_time datetime     null comment '创建时间',
    create_by   varchar(35)  null comment '创建人',
    update_time datetime     null comment '创建时间',
    update_by   varchar(35)  null comment '更新人'
)
    comment '标签表';

create table relation_article_tag
(
    id          bigint auto_increment comment 'ID'
        primary key,
    article_id  bigint      not null comment '文章ID',
    tag_id      bigint      not null comment '标签ID',
    create_time datetime    null comment '创建时间',
    create_by   varchar(35) null comment '创建人',
    update_time datetime    null comment '更新时间',
    update_by   varchar(35) null comment '更新人'
)
    comment '文章-标签-关系表';

create table user
(
    id                bigint auto_increment comment 'ID'
        primary key,
    name              varchar(35)  not null comment '用户名',
    password          varchar(50)  not null comment '密码',
    sex               tinyint      null comment '性别',
    photo             varchar(255) null comment '头像',
    age               tinyint      null comment '年龄',
    telephone         varchar(50)  not null comment '手机号',
    email             varchar(50)  null comment '邮箱',
    nickname          varchar(35)  null comment '昵称',
    registration_time datetime     null comment '注册时间',
    create_time       datetime     null comment '创建时间',
    create_by         varchar(35)  null comment '创建人',
    update_time       datetime     null comment '更新时间',
    update_by         varchar(35)  null comment '更新人'
)
    comment '用户表';

create table user_friend
(
    id          bigint auto_increment comment 'ID'
        primary key,
    user_id     bigint      not null comment '用户ID',
    friend_id   bigint      not null comment '好友ID',
    note        varchar(50) null comment '好友备注',
    status      varchar(50) null comment '好友状态',
    create_time datetime    null comment '创建时间',
    create_by   varchar(35) null comment '创建人',
    update_time datetime    null comment '更新时间',
    update_by   varchar(35) null comment '更新人'
)
    comment '好友表';
