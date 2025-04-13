package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class JwtLocation extends GeneratedMessageLite<JwtLocation, Builder> implements JwtLocationOrBuilder {
    private static final JwtLocation DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile Parser<JwtLocation> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private Object in_;
    private int inCase_ = 0;
    private String valuePrefix_ = "";

    /* renamed from: com.google.api.JwtLocation$1 */
    public static /* synthetic */ class C15121 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20378a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20378a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20378a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20378a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20378a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20378a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20378a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20378a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<JwtLocation, Builder> implements JwtLocationOrBuilder {
        public Builder() {
            super(JwtLocation.DEFAULT_INSTANCE);
        }

        public Builder(C15121 c15121) {
            super(JwtLocation.DEFAULT_INSTANCE);
        }
    }

    public enum InCase {
        /* JADX INFO: Fake field, exist only in values array */
        HEADER(1),
        /* JADX INFO: Fake field, exist only in values array */
        QUERY(2),
        /* JADX INFO: Fake field, exist only in values array */
        IN_NOT_SET(0);

        InCase(int i2) {
        }
    }

    static {
        JwtLocation jwtLocation = new JwtLocation();
        DEFAULT_INSTANCE = jwtLocation;
        GeneratedMessageLite.m13417F(JwtLocation.class, jwtLocation);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            case NEW_MUTABLE_INSTANCE:
                return new JwtLocation();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<JwtLocation> parser = PARSER;
                if (parser == null) {
                    synchronized (JwtLocation.class) {
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
