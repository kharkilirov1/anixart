package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class DebugInfo extends GeneratedMessageLite<DebugInfo, Builder> implements DebugInfoOrBuilder {
    private static final DebugInfo DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 2;
    private static volatile Parser<DebugInfo> PARSER = null;
    public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> stackEntries_ = GeneratedMessageLite.m13422t();
    private String detail_ = "";

    /* renamed from: com.google.rpc.DebugInfo$1 */
    public static /* synthetic */ class C24201 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24458a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24458a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24458a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24458a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24458a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24458a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24458a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24458a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DebugInfo, Builder> implements DebugInfoOrBuilder {
        public Builder() {
            super(DebugInfo.DEFAULT_INSTANCE);
        }

        public Builder(C24201 c24201) {
            super(DebugInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        DebugInfo debugInfo = new DebugInfo();
        DEFAULT_INSTANCE = debugInfo;
        GeneratedMessageLite.m13417F(DebugInfo.class, debugInfo);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"stackEntries_", "detail_"});
            case NEW_MUTABLE_INSTANCE:
                return new DebugInfo();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<DebugInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (DebugInfo.class) {
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
