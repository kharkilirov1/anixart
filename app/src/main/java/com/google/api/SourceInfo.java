package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class SourceInfo extends GeneratedMessageLite<SourceInfo, Builder> implements SourceInfoOrBuilder {
    private static final SourceInfo DEFAULT_INSTANCE;
    private static volatile Parser<SourceInfo> PARSER = null;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Any> sourceFiles_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.SourceInfo$1 */
    public static /* synthetic */ class C15381 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20450a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20450a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20450a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20450a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20450a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20450a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20450a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20450a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SourceInfo, Builder> implements SourceInfoOrBuilder {
        public Builder() {
            super(SourceInfo.DEFAULT_INSTANCE);
        }

        public Builder(C15381 c15381) {
            super(SourceInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        SourceInfo sourceInfo = new SourceInfo();
        DEFAULT_INSTANCE = sourceInfo;
        GeneratedMessageLite.m13417F(SourceInfo.class, sourceInfo);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sourceFiles_", Any.class});
            case NEW_MUTABLE_INSTANCE:
                return new SourceInfo();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<SourceInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (SourceInfo.class) {
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
