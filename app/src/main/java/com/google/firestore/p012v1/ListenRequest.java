package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes2.dex */
public final class ListenRequest extends GeneratedMessageLite<ListenRequest, Builder> implements ListenRequestOrBuilder {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final ListenRequest DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile Parser<ListenRequest> PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private MapFieldLite<String, String> labels_ = MapFieldLite.f24269c;
    private String database_ = "";

    /* renamed from: com.google.firestore.v1.ListenRequest$1 */
    public static /* synthetic */ class C22101 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23541a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23541a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23541a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23541a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23541a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23541a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23541a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23541a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ListenRequest, Builder> implements ListenRequestOrBuilder {
        public Builder() {
            super(ListenRequest.DEFAULT_INSTANCE);
        }

        public Builder(C22101 c22101) {
            super(ListenRequest.DEFAULT_INSTANCE);
        }
    }

    public static final class LabelsDefaultEntryHolder {

        /* renamed from: a */
        public static final MapEntryLite<String, String> f23542a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.f24409l;
            f23542a = new MapEntryLite<>(fieldType, "", fieldType, "");
        }
    }

    public enum TargetChangeCase {
        /* JADX INFO: Fake field, exist only in values array */
        ADD_TARGET(2),
        /* JADX INFO: Fake field, exist only in values array */
        REMOVE_TARGET(3),
        /* JADX INFO: Fake field, exist only in values array */
        TARGETCHANGE_NOT_SET(0);

        TargetChangeCase(int i2) {
        }
    }

    static {
        ListenRequest listenRequest = new ListenRequest();
        DEFAULT_INSTANCE = listenRequest;
        GeneratedMessageLite.m13417F(ListenRequest.class, listenRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", Target.class, "labels_", LabelsDefaultEntryHolder.f23542a});
            case NEW_MUTABLE_INSTANCE:
                return new ListenRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ListenRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (ListenRequest.class) {
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
