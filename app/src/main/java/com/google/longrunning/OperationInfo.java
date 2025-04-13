package com.google.longrunning;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class OperationInfo extends GeneratedMessageLite<OperationInfo, Builder> implements OperationInfoOrBuilder {
    private static final OperationInfo DEFAULT_INSTANCE;
    public static final int METADATA_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<OperationInfo> PARSER = null;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
    private String responseType_ = "";
    private String metadataType_ = "";

    /* renamed from: com.google.longrunning.OperationInfo$1 */
    public static /* synthetic */ class C23371 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23948a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23948a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23948a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23948a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23948a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23948a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23948a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23948a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<OperationInfo, Builder> implements OperationInfoOrBuilder {
        public Builder() {
            super(OperationInfo.DEFAULT_INSTANCE);
        }

        public Builder(C23371 c23371) {
            super(OperationInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        OperationInfo operationInfo = new OperationInfo();
        DEFAULT_INSTANCE = operationInfo;
        GeneratedMessageLite.m13417F(OperationInfo.class, operationInfo);
    }

    /* renamed from: I */
    public static OperationInfo m12973I() {
        return DEFAULT_INSTANCE;
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"responseType_", "metadataType_"});
            case NEW_MUTABLE_INSTANCE:
                return new OperationInfo();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<OperationInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (OperationInfo.class) {
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
