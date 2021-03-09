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

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final DateTimePath<java.util.Date> reserveDate = createDateTime("reserveDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> reserveDuedate = createDateTime("reserveDuedate", java.util.Date.class);

    public final NumberPath<Integer> reserveRoomstatus = createNumber("reserveRoomstatus", Integer.class);

    public final StringPath reserveStatus = createString("reserveStatus");

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

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

