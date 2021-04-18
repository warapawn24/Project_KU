package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsFee is a Querydsl query type for MsFee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsFee extends EntityPathBase<MsFee> {

    private static final long serialVersionUID = -119521460L;

    public static final QMsFee msFee = new QMsFee("msFee");

    public final StringPath feeNumber = createString("feeNumber");

    public final NumberPath<Float> feePrice = createNumber("feePrice", Float.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> termId = createNumber("termId", Long.class);

    public final NumberPath<Long> typeId = createNumber("typeId", Long.class);

    public QMsFee(String variable) {
        super(MsFee.class, forVariable(variable));
    }

    public QMsFee(Path<? extends MsFee> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsFee(PathMetadata metadata) {
        super(MsFee.class, metadata);
    }

}

