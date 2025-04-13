package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class LogDescriptor extends GeneratedMessageLite<LogDescriptor, Builder> implements LogDescriptorOrBuilder {
    private static final LogDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<LogDescriptor> PARSER;
    private String name_ = "";
    private Internal.ProtobufList<LabelDescriptor> labels_ = GeneratedMessageLite.m13422t();
    private String description_ = "";
    private String displayName_ = "";

    /* renamed from: com.google.api.LogDescriptor$1 */
    public static /* synthetic */ class C15161 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20396a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20396a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20396a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20396a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20396a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20396a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20396a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20396a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LogDescriptor, Builder> implements LogDescriptorOrBuilder {
        public Builder() {
            super(LogDescriptor.DEFAULT_INSTANCE);
        }

        public Builder(C15161 c15161) {
            super(LogDescriptor.DEFAULT_INSTANCE);
        }
    }

    static {
        LogDescriptor logDescriptor = new LogDescriptor();
        DEFAULT_INSTANCE = logDescriptor;
        GeneratedMessageLite.m13417F(LogDescriptor.class, logDescriptor);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "labels_", LabelDescriptor.class, "description_", "displayName_"});
            case NEW_MUTABLE_INSTANCE:
                return new LogDescriptor();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<LogDescriptor> parser = PARSER;
                if (parser == null) {
                    synchronized (LogDescriptor.class) {
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
