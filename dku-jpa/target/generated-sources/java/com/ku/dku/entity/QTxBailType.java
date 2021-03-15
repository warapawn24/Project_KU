package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxBailType is a Querydsl query type for TxBailType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxBailType extends EntityPathBase<TxBailType> {

    private static final long serialVersionUID = -1018731820L;

    public static final QTxBailType txBailType = new QTxBailType("txBailType");

    public final NumberPath<Long> bailId = createNumber("bailId", Long.class);

    public final StringPath bailType = createString("bailType");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public QTxBailType(String variable) {
        super(TxBailType.class, forVariable(variable));
    }

    public QTxBailType(Path<? extends TxBailType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxBailType(PathMetadata metadata) {
        super(TxBailType.class, metadata);
    }

}

