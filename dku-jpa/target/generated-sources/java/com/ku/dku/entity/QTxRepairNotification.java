package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxRepairNotification is a Querydsl query type for TxRepairNotification
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxRepairNotification extends EntityPathBase<TxRepairNotification> {

    private static final long serialVersionUID = 1570594288L;

    public static final QTxRepairNotification txRepairNotification = new QTxRepairNotification("txRepairNotification");

    public final StringPath officerUsername = createString("officerUsername");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final DateTimePath<java.util.Date> repairDate = createDateTime("repairDate", java.util.Date.class);

    public final StringPath repairDivision = createString("repairDivision");

    public final DateTimePath<java.util.Date> repairDuedate = createDateTime("repairDuedate", java.util.Date.class);

    public final StringPath repairList = createString("repairList");

    public final StringPath repairPhone = createString("repairPhone");

    public final StringPath repairStatus = createString("repairStatus");

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public final StringPath studentFname = createString("studentFname");

    public final NumberPath<Long> studentId = createNumber("studentId", Long.class);

    public final StringPath studentLname = createString("studentLname");

    public final NumberPath<Integer> year = createNumber("year", Integer.class);

    public final NumberPath<Integer> yearNumber = createNumber("yearNumber", Integer.class);

    public QTxRepairNotification(String variable) {
        super(TxRepairNotification.class, forVariable(variable));
    }

    public QTxRepairNotification(Path<? extends TxRepairNotification> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxRepairNotification(PathMetadata metadata) {
        super(TxRepairNotification.class, metadata);
    }

}

