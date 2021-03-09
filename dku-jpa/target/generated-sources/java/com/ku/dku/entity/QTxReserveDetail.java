package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxReserveDetail is a Querydsl query type for TxReserveDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxReserveDetail extends EntityPathBase<TxReserveDetail> {

    private static final long serialVersionUID = -1348493227L;

    public static final QTxReserveDetail txReserveDetail = new QTxReserveDetail("txReserveDetail");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> reserveId = createNumber("reserveId", Long.class);

    public final StringPath studentFname = createString("studentFname");

    public final NumberPath<Long> studentId = createNumber("studentId", Long.class);

    public final StringPath studentLname = createString("studentLname");

    public QTxReserveDetail(String variable) {
        super(TxReserveDetail.class, forVariable(variable));
    }

    public QTxReserveDetail(Path<? extends TxReserveDetail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxReserveDetail(PathMetadata metadata) {
        super(TxReserveDetail.class, metadata);
    }

}

