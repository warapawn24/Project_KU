package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsPublicRelation is a Querydsl query type for MsPublicRelation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsPublicRelation extends EntityPathBase<MsPublicRelation> {

    private static final long serialVersionUID = -1691030529L;

    public static final QMsPublicRelation msPublicRelation = new QMsPublicRelation("msPublicRelation");

    public final StringPath description = createString("description");

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath relationName = createString("relationName");

    public QMsPublicRelation(String variable) {
        super(MsPublicRelation.class, forVariable(variable));
    }

    public QMsPublicRelation(Path<? extends MsPublicRelation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsPublicRelation(PathMetadata metadata) {
        super(MsPublicRelation.class, metadata);
    }

}

