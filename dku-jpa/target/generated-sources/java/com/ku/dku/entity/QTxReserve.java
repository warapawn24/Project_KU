package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxReserve is a Querydsl query type for TxReserve
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxReserve extends EntityPathBase<TxReserve> {

    private static final long serialVersionUID = -1780721948L;

    public static final QTxReserve txReserve = new QTxReserve("txReserve");

    public final NumberPath<Long> buildingId = createNumber("buildingId", Long.class);

    public final NumberPath<Long> buildingTypeId = createNumber("buildingTypeId", Long.class);

    public final NumberPath<Long> feeId = createNumber("feeId", Long.class);

    public final NumberPath<Long> officerId = createNumber("officerId", Long.class);

    public final DateTimePath<java.util.Date> receiptDate = createDateTime("receiptDate", java.util.Date.class);

    public final NumberPath<Integer> receiptNumber = createNumber("receiptNumber", Integer.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final DatePath<java.util.Date> reserveDate = createDate("reserveDate", java.util.Date.class);

    public final NumberPath<Integer> reserveRoomstatus = createNumber("reserveRoomstatus", Integer.class);

    public final StringPath reserveStatus = createString("reserveStatus");

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public final DatePath<java.util.Date> setPaymentDue = createDate("setPaymentDue", java.util.Date.class);

    public final DatePath<java.util.Date> setPaymentstart = createDate("setPaymentstart", java.util.Date.class);

    public final StringPath studentFname = createString("studentFname");

    public final NumberPath<Long> studentId = createNumber("studentId", Long.class);

    public final StringPath studentLname = createString("studentLname");

    public final NumberPath<Long> termId = createNumber("termId", Long.class);

    public final NumberPath<Integer> year = createNumber("year", Integer.class);

    public QTxReserve(String variable) {
        super(TxReserve.class, forVariable(variable));
    }

    public QTxReserve(Path<? extends TxReserve> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxReserve(PathMetadata metadata) {
        super(TxReserve.class, metadata);
    }

}

