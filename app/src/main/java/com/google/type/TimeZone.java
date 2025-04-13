package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class TimeZone extends GeneratedMessageLite<TimeZone, Builder> implements TimeZoneOrBuilder {
    private static final TimeZone DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<TimeZone> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String id_ = "";
    private String version_ = "";

    /* renamed from: com.google.type.TimeZone$1 */
    public static /* synthetic */ class C24431 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24517a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24517a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24517a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24517a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24517a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24517a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24517a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24517a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TimeZone, Builder> implements TimeZoneOrBuilder {
        public Builder() {
            super(TimeZone.DEFAULT_INSTANCE);
        }

        public Builder(C24431 c24431) {
            super(TimeZone.DEFAULT_INSTANCE);
        }
    }

    static {
        TimeZone timeZone = new TimeZone();
        DEFAULT_INSTANCE = timeZone;
        GeneratedMessageLite.m13417F(TimeZone.class, timeZone);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "version_"});
            case NEW_MUTABLE_INSTANCE:
                return new TimeZone();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<TimeZone> parser = PARSER;
                if (parser == null) {
                    synchronized (TimeZone.class) {
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
