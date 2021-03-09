package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxBail is a Querydsl query type for TxBail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxBail extends EntityPathBase<TxBail> {

    private static final long serialVersionUID = 794700922L;

    public static final QTxBail txBail = new QTxBail("txBail");

    public final NumberPath<Long> bailAccouctnum = createNumber("bailAccouctnum", Long.class);

    public final StringPath bailBank = createString("bailBank");

    public final NumberPath<Float> bailCollateral = createNumber("bailCollateral", Float.class);

    public final DateTimePath<java.util.Date> bailDate = createDateTime("bailDate", java.util.Date.class);

    public final NumberPath<Float> bailElectricbill = createNumber("bailElectricbill", Float.class);

    public final StringPath bailEquipment = createString("bailEquipment");

    public final StringPath baillNote = createString("baillNote");

    public final NumberPath<Float> bailOther = createNumber("bailOther", Float.class);

    public final StringPath bailPhone = createString("bailPhone");

    public final NumberPath<Float> bailPrice = createNumber("bailPrice", Float.class);

    public final StringPath bailStatus = createString("bailStatus");

    public final NumberPath<Float> bailTotal = createNumber("bailTotal", Float.class);

    public final StringPath bailType = createString("bailType");

    public final NumberPath<Float> bailWater = createNumber("bailWater", Float.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public final StringPath studentFname = createString("studentFname");

    public final NumberPath<Long> studentId = createNumber("studentId", Long.class);

    public final StringPath studentLname = createString("studentLname");

    public final StringPath termName = createString("termName");

    public final NumberPath<Long> year = createNumber("year", Long.class);

    public QTxBail(String variable) {
        super(TxBail.class, forVariable(variable));
    }

    public QTxBail(Path<? extends TxBail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxBail(PathMetadata metadata) {
        super(TxBail.class, metadata);
    }

}

