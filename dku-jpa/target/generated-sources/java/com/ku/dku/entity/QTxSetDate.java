package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxSetDate is a Querydsl query type for TxSetDate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxSetDate extends EntityPathBase<TxSetDate> {

    private static final long serialVersionUID = -893294248L;

    public static final QTxSetDate txSetDate = new QTxSetDate("txSetDate");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final DatePath<java.util.Date> setReserveDue = createDate("setReserveDue", java.util.Date.class);

    public final DatePath<java.util.Date> setReserveStart = createDate("setReserveStart", java.util.Date.class);

    public final StringPath setStatus = createString("setStatus");

    public QTxSetDate(String variable) {
        super(TxSetDate.class, forVariable(variable));
    }

    public QTxSetDate(Path<? extends TxSetDate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxSetDate(PathMetadata metadata) {
        super(TxSetDate.class, metadata);
    }

}

