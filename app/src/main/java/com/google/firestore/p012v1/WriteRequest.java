package com.google.firestore.p012v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

/* loaded from: classes2.dex */
public final class WriteRequest extends GeneratedMessageLite<WriteRequest, Builder> implements WriteRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final WriteRequest DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile Parser<WriteRequest> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private MapFieldLite<String, String> labels_ = MapFieldLite.f24269c;
    private String database_ = "";
    private String streamId_ = "";
    private Internal.ProtobufList<Write> writes_ = GeneratedMessageLite.m13422t();
    private ByteString streamToken_ = ByteString.f23981c;

    /* renamed from: com.google.firestore.v1.WriteRequest$1 */
    public static /* synthetic */ class C22291 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23642a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23642a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23642a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23642a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23642a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23642a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23642a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23642a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WriteRequest, Builder> implements WriteRequestOrBuilder {
        public Builder() {
            super(WriteRequest.DEFAULT_INSTANCE);
        }

        public Builder(C22291 c22291) {
            super(WriteRequest.DEFAULT_INSTANCE);
        }
    }

    public static final class LabelsDefaultEntryHolder {

        /* renamed from: a */
        public static final MapEntryLite<String, String> f23643a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.f24409l;
            f23643a = new MapEntryLite<>(fieldType, "", fieldType, "");
        }
    }

    static {
        WriteRequest writeRequest = new WriteRequest();
        DEFAULT_INSTANCE = writeRequest;
        GeneratedMessageLite.m13417F(WriteRequest.class, writeRequest);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", Write.class, "streamToken_", "labels_", LabelsDefaultEntryHolder.f23643a});
            case NEW_MUTABLE_INSTANCE:
                return new WriteRequest();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<WriteRequest> parser = PARSER;
                if (parser == null) {
                    synchronized (WriteRequest.class) {
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
