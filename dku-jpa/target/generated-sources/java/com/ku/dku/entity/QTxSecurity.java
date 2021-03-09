package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxSecurity is a Querydsl query type for TxSecurity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxSecurity extends EntityPathBase<TxSecurity> {

    private static final long serialVersionUID = 1931702808L;

    public static final QTxSecurity txSecurity = new QTxSecurity("txSecurity");

    public final StringPath officerFname = createString("officerFname");

    public final StringPath officerLname = createString("officerLname");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final DateTimePath<java.util.Date> securityDate = createDateTime("securityDate", java.util.Date.class);

    public QTxSecurity(String variable) {
        super(TxSecurity.class, forVariable(variable));
    }

    public QTxSecurity(Path<? extends TxSecurity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxSecurity(PathMetadata metadata) {
        super(TxSecurity.class, metadata);
    }

}

