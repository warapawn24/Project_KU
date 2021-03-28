package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxPost is a Querydsl query type for TxPost
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxPost extends EntityPathBase<TxPost> {

    private static final long serialVersionUID = 795131768L;

    public static final QTxPost txPost = new QTxPost("txPost");

    public final StringPath postCode = createString("postCode");

    public final DateTimePath<java.util.Date> postDate = createDateTime("postDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> postRecivedate = createDateTime("postRecivedate", java.util.Date.class);

    public final StringPath postStatus = createString("postStatus");

    public final StringPath postType = createString("postType");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final StringPath studentFname = createString("studentFname");

    public final NumberPath<Long> studentId = createNumber("studentId", Long.class);

    public final StringPath studentLname = createString("studentLname");

    public final NumberPath<Integer> year = createNumber("year", Integer.class);

    public QTxPost(String variable) {
        super(TxPost.class, forVariable(variable));
    }

    public QTxPost(Path<? extends TxPost> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxPost(PathMetadata metadata) {
        super(TxPost.class, metadata);
    }

}

