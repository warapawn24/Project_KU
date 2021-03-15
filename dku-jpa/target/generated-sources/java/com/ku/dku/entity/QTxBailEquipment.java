package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxBailEquipment is a Querydsl query type for TxBailEquipment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxBailEquipment extends EntityPathBase<TxBailEquipment> {

    private static final long serialVersionUID = -59948492L;

    public static final QTxBailEquipment txBailEquipment = new QTxBailEquipment("txBailEquipment");

    public final StringPath bailEquipment = createString("bailEquipment");

    public final NumberPath<Long> bailId = createNumber("bailId", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public QTxBailEquipment(String variable) {
        super(TxBailEquipment.class, forVariable(variable));
    }

    public QTxBailEquipment(Path<? extends TxBailEquipment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxBailEquipment(PathMetadata metadata) {
        super(TxBailEquipment.class, metadata);
    }

}

