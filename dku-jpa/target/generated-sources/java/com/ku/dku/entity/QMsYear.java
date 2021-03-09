package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsYear is a Querydsl query type for MsYear
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsYear extends EntityPathBase<MsYear> {

    private static final long serialVersionUID = 590368055L;

    public static final QMsYear msYear = new QMsYear("msYear");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> year = createNumber("year", Long.class);

    public QMsYear(String variable) {
        super(MsYear.class, forVariable(variable));
    }

    public QMsYear(Path<? extends MsYear> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsYear(PathMetadata metadata) {
        super(MsYear.class, metadata);
    }

}

