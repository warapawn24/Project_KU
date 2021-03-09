package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTxOfficer is a Querydsl query type for TxOfficer
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTxOfficer extends EntityPathBase<TxOfficer> {

    private static final long serialVersionUID = -131538082L;

    public static final QTxOfficer txOfficer = new QTxOfficer("txOfficer");

    public final StringPath officerEmail = createString("officerEmail");

    public final NumberPath<Long> officerFail = createNumber("officerFail", Long.class);

    public final StringPath officerFname = createString("officerFname");

    public final NumberPath<Long> officerId = createNumber("officerId", Long.class);

    public final StringPath officerLname = createString("officerLname");

    public final DateTimePath<java.util.Date> officerLogindate = createDateTime("officerLogindate", java.util.Date.class);

    public final NumberPath<Long> officerLoginfirstchange = createNumber("officerLoginfirstchange", Long.class);

    public final NumberPath<Long> officerOtp = createNumber("officerOtp", Long.class);

    public final StringPath officerPassword = createString("officerPassword");

    public final StringPath officerRole = createString("officerRole");

    public final StringPath officerStatus = createString("officerStatus");

    public final StringPath officerUsername = createString("officerUsername");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public QTxOfficer(String variable) {
        super(TxOfficer.class, forVariable(variable));
    }

    public QTxOfficer(Path<? extends TxOfficer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTxOfficer(PathMetadata metadata) {
        super(TxOfficer.class, metadata);
    }

}

