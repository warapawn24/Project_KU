package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxUtilityBill is a Querydsl query type for TxUtilityBill
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxUtilityBill extends EntityPathBase<TxUtilityBill> {

    private static final long serialVersionUID = 1300072891L;

    public static final QTxUtilityBill txUtilityBill = new QTxUtilityBill("txUtilityBill");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public final StringPath studentFname = createString("studentFname");

    public final NumberPath<Long> studentId = createNumber("studentId", Long.class);

    public final StringPath studentLname = createString("studentLname");

    public final StringPath utilityDate = createString("utilityDate");

    public final StringPath utilityDuedate = createString("utilityDuedate");

    public final NumberPath<Float> utilityElectricbill = createNumber("utilityElectricbill", Float.class);

    public final NumberPath<Float> utilityFines = createNumber("utilityFines", Float.class);

    public final StringPath utilityStartdate = createString("utilityStartdate");

    public final StringPath utilityStatus = createString("utilityStatus");

    public final NumberPath<Float> utilityTotal = createNumber("utilityTotal", Float.class);

    public final NumberPath<Float> utilityWater = createNumber("utilityWater", Float.class);

    public QTxUtilityBill(String variable) {
        super(TxUtilityBill.class, forVariable(variable));
    }

    public QTxUtilityBill(Path<? extends TxUtilityBill> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxUtilityBill(PathMetadata metadata) {
        super(TxUtilityBill.class, metadata);
    }

}

