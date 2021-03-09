package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsRepairYear is a Querydsl query type for MsRepairYear
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsRepairYear extends EntityPathBase<MsRepairYear> {

    private static final long serialVersionUID = 989605604L;

    public static final QMsRepairYear msRepairYear = new QMsRepairYear("msRepairYear");

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Integer> year = createNumber("year", Integer.class);

    public QMsRepairYear(String variable) {
        super(MsRepairYear.class, forVariable(variable));
    }

    public QMsRepairYear(Path<? extends MsRepairYear> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsRepairYear(PathMetadata metadata) {
        super(MsRepairYear.class, metadata);
    }

}

