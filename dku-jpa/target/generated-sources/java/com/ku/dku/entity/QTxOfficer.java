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

    public final NumberPath<Integer> officerFail = createNumber("officerFail", Integer.class);

    public final StringPath officerFname = createString("officerFname");

    public final StringPath officerLname = createString("officerLname");

    public final DateTimePath<java.util.Date> officerLogindate = createDateTime("officerLogindate", java.util.Date.class);

    public final NumberPath<Integer> officerLoginfirstchange = createNumber("officerLoginfirstchange", Integer.class);

    public final StringPath officerOtp = createString("officerOtp");

    public final StringPath officerPassword = createString("officerPassword");

    public final NumberPath<Long> officerRoleId = createNumber("officerRoleId", Long.class);

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

