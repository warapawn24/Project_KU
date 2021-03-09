package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLkStatus is a Querydsl query type for LkStatus
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLkStatus extends EntityPathBase<LkStatus> {

    private static final long serialVersionUID = -2803835L;

    public static final QLkStatus lkStatus = new QLkStatus("lkStatus");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath statusName = createString("statusName");

    public QLkStatus(String variable) {
        super(LkStatus.class, forVariable(variable));
    }

    public QLkStatus(Path<? extends LkStatus> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLkStatus(PathMetadata metadata) {
        super(LkStatus.class, metadata);
    }

}

