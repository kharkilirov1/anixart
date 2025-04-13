package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;

/* loaded from: classes2.dex */
public final class Document extends GeneratedMessageLite<Document, Builder> implements DocumentOrBuilder {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final Document DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Document> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private Timestamp createTime_;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.f24269c;
    private String name_ = "";
    private Timestamp updateTime_;

    /* renamed from: com.google.firestore.v1.Document$1 */
    public static /* synthetic */ class C21941 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23513a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23513a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23513a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23513a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23513a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23513a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23513a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23513a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Document, Builder> implements DocumentOrBuilder {
        public Builder() {
            super(Document.DEFAULT_INSTANCE);
        }

        public Builder(C21941 c21941) {
            super(Document.DEFAULT_INSTANCE);
        }
    }

    public static final class FieldsDefaultEntryHolder {

        /* renamed from: a */
        public static final MapEntryLite<String, Value> f23514a = new MapEntryLite<>(WireFormat.FieldType.f24409l, "", WireFormat.FieldType.f24411n, Value.m12803P());
    }

    static {
        Document document = new Document();
        DEFAULT_INSTANCE = document;
        GeneratedMessageLite.m13417F(Document.class, document);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003\t\u0004\t", new Object[]{"name_", "fields_", FieldsDefaultEntryHolder.f23514a, "createTime_", "updateTime_"});
            case NEW_MUTABLE_INSTANCE:
                return new Document();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Document> parser = PARSER;
                if (parser == null) {
                    synchronized (Document.class) {
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
