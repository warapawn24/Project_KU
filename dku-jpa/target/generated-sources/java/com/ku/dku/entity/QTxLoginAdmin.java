package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxLoginAdmin is a Querydsl query type for TxLoginAdmin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxLoginAdmin extends EntityPathBase<TxLoginAdmin> {

    private static final long serialVersionUID = 1885667902L;

    public static final QTxLoginAdmin txLoginAdmin = new QTxLoginAdmin("txLoginAdmin");

    public final StringPath loginError = createString("loginError");

    public final StringPath loginForm = createString("loginForm");

    public final DateTimePath<java.util.Date> loginTime = createDateTime("loginTime", java.util.Date.class);

    public final NumberPath<Long> officerId = createNumber("officerId", Long.class);

    public final StringPath officerPassword = createString("officerPassword");

    public final StringPath officerUsername = createString("officerUsername");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public QTxLoginAdmin(String variable) {
        super(TxLoginAdmin.class, forVariable(variable));
    }

    public QTxLoginAdmin(Path<? extends TxLoginAdmin> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxLoginAdmin(PathMetadata metadata) {
        super(TxLoginAdmin.class, metadata);
    }

}

