package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxSetDateBail is a Querydsl query type for TxSetDateBail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxSetDateBail extends EntityPathBase<TxSetDateBail> {

    private static final long serialVersionUID = 1323071258L;

    public static final QTxSetDateBail txSetDateBail = new QTxSetDateBail("txSetDateBail");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final DatePath<java.util.Date> setBailDue = createDate("setBailDue", java.util.Date.class);

    public final DatePath<java.util.Date> setBailStart = createDate("setBailStart", java.util.Date.class);

    public final DatePath<java.util.Date> setPaymentDue = createDate("setPaymentDue", java.util.Date.class);

    public final DatePath<java.util.Date> setPaymentStart = createDate("setPaymentStart", java.util.Date.class);

    public final StringPath setStatus = createString("setStatus");

    public final NumberPath<Long> termId = createNumber("termId", Long.class);

    public final NumberPath<Integer> year = createNumber("year", Integer.class);

    public QTxSetDateBail(String variable) {
        super(TxSetDateBail.class, forVariable(variable));
    }

    public QTxSetDateBail(Path<? extends TxSetDateBail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxSetDateBail(PathMetadata metadata) {
        super(TxSetDateBail.class, metadata);
    }

}

