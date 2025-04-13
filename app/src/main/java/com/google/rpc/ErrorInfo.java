package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes2.dex */
public final class ErrorInfo extends GeneratedMessageLite<ErrorInfo, Builder> implements ErrorInfoOrBuilder {
    private static final ErrorInfo DEFAULT_INSTANCE;
    public static final int DOMAIN_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<ErrorInfo> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> metadata_ = MapFieldLite.f24269c;
    private String reason_ = "";
    private String domain_ = "";

    /* renamed from: com.google.rpc.ErrorInfo$1 */
    public static /* synthetic */ class C24211 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24459a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24459a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24459a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24459a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24459a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24459a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24459a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24459a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ErrorInfo, Builder> implements ErrorInfoOrBuilder {
        public Builder() {
            super(ErrorInfo.DEFAULT_INSTANCE);
        }

        public Builder(C24211 c24211) {
            super(ErrorInfo.DEFAULT_INSTANCE);
        }
    }

    public static final class MetadataDefaultEntryHolder {

        /* renamed from: a */
        public static final MapEntryLite<String, String> f24460a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.f24409l;
            f24460a = new MapEntryLite<>(fieldType, "", fieldType, "");
        }
    }

    static {
        ErrorInfo errorInfo = new ErrorInfo();
        DEFAULT_INSTANCE = errorInfo;
        GeneratedMessageLite.m13417F(ErrorInfo.class, errorInfo);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"reason_", "domain_", "metadata_", MetadataDefaultEntryHolder.f24460a});
            case NEW_MUTABLE_INSTANCE:
                return new ErrorInfo();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ErrorInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (ErrorInfo.class) {
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
