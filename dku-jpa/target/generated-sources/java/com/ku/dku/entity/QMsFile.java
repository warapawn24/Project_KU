package com.ku.dku.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMsFile is a Querydsl query type for MsFile
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMsFile extends EntityPathBase<MsFile> {

    private static final long serialVersionUID = 589806198L;

    public static final QMsFile msFile = new QMsFile("msFile");

    public final ArrayPath<byte[], Byte> fileData = createArray("fileData", byte[].class);

    public final StringPath fileName = createString("fileName");

    public final StringPath fileType = createString("fileType");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> txStudentId = createNumber("txStudentId", Long.class);

    public QMsFile(String variable) {
        super(MsFile.class, forVariable(variable));
    }

    public QMsFile(Path<? extends MsFile> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMsFile(PathMetadata metadata) {
        super(MsFile.class, metadata);
    }

}

