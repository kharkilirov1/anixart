package com.google.firestore.p012v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class Cursor extends GeneratedMessageLite<Cursor, Builder> implements CursorOrBuilder {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final Cursor DEFAULT_INSTANCE;
    private static volatile Parser<Cursor> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private Internal.ProtobufList<Value> values_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.firestore.v1.Cursor$1 */
    public static /* synthetic */ class C21921 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23511a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23511a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23511a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23511a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23511a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23511a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23511a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23511a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Cursor, Builder> implements CursorOrBuilder {
        public Builder() {
            super(Cursor.DEFAULT_INSTANCE);
        }

        public Builder(C21921 c21921) {
            super(Cursor.DEFAULT_INSTANCE);
        }
    }

    static {
        Cursor cursor = new Cursor();
        DEFAULT_INSTANCE = cursor;
        GeneratedMessageLite.m13417F(Cursor.class, cursor);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", Value.class, "before_"});
            case NEW_MUTABLE_INSTANCE:
                return new Cursor();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Cursor> parser = PARSER;
                if (parser == null) {
                    synchronized (Cursor.class) {
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
