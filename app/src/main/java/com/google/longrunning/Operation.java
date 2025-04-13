package com.google.longrunning;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.Status;

/* loaded from: classes2.dex */
public final class Operation extends GeneratedMessageLite<Operation, Builder> implements OperationOrBuilder {
    private static final Operation DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Operation> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private Any metadata_;
    private Object result_;
    private int resultCase_ = 0;
    private String name_ = "";

    /* renamed from: com.google.longrunning.Operation$1 */
    public static /* synthetic */ class C23361 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23946a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23946a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23946a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23946a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23946a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23946a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23946a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23946a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Operation, Builder> implements OperationOrBuilder {
        public Builder() {
            super(Operation.DEFAULT_INSTANCE);
        }

        public Builder(C23361 c23361) {
            super(Operation.DEFAULT_INSTANCE);
        }
    }

    public enum ResultCase {
        /* JADX INFO: Fake field, exist only in values array */
        ERROR(4),
        /* JADX INFO: Fake field, exist only in values array */
        RESPONSE(5),
        /* JADX INFO: Fake field, exist only in values array */
        RESULT_NOT_SET(0);

        ResultCase(int i2) {
        }
    }

    static {
        Operation operation = new Operation();
        DEFAULT_INSTANCE = operation;
        GeneratedMessageLite.m13417F(Operation.class, operation);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0007\u0004<\u0000\u0005<\u0000", new Object[]{"result_", "resultCase_", "name_", "metadata_", "done_", Status.class, Any.class});
            case NEW_MUTABLE_INSTANCE:
                return new Operation();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Operation> parser = PARSER;
                if (parser == null) {
                    synchronized (Operation.class) {
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
