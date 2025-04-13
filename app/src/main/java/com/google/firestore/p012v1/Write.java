package com.google.firestore.p012v1;

import com.google.firestore.p012v1.DocumentTransform;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Write extends GeneratedMessageLite<Write, Builder> implements WriteOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final Write DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile Parser<Write> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private Precondition currentDocument_;
    private Object operation_;
    private DocumentMask updateMask_;
    private int operationCase_ = 0;
    private Internal.ProtobufList<DocumentTransform.FieldTransform> updateTransforms_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firestore.v1.Write$1 */
    public static /* synthetic */ class C22281 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23635a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23635a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23635a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23635a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23635a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23635a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23635a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23635a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Write, Builder> implements WriteOrBuilder {
        public Builder() {
            super(Write.DEFAULT_INSTANCE);
        }

        public Builder(C22281 c22281) {
            super(Write.DEFAULT_INSTANCE);
        }
    }

    public enum OperationCase {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);

        OperationCase(int i2) {
        }
    }

    static {
        Write write = new Write();
        DEFAULT_INSTANCE = write;
        GeneratedMessageLite.m13417F(Write.class, write);
    }

    /* renamed from: I */
    public static Write m12820I(byte[] bArr) throws InvalidProtocolBufferException {
        return (Write) GeneratedMessageLite.m13414C(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    /* renamed from: p */
    public final Object mo11020p(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\t\u0004\t\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", Document.class, "updateMask_", "currentDocument_", DocumentTransform.class, "updateTransforms_", DocumentTransform.FieldTransform.class});
            case NEW_MUTABLE_INSTANCE:
                return new Write();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Write> parser = PARSER;
                if (parser == null) {
                    synchronized (Write.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
