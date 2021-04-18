package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsRunningNumber is a Querydsl query type for MsRunningNumber
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsRunningNumber extends EntityPathBase<MsRunningNumber> {

    private static final long serialVersionUID = 13403694L;

    public static final QMsRunningNumber msRunningNumber = new QMsRunningNumber("msRunningNumber");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public QMsRunningNumber(String variable) {
        super(MsRunningNumber.class, forVariable(variable));
    }

    public QMsRunningNumber(Path<? extends MsRunningNumber> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsRunningNumber(PathMetadata metadata) {
        super(MsRunningNumber.class, metadata);
    }

}

