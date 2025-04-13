package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class ResourceDescriptor extends GeneratedMessageLite<ResourceDescriptor, Builder> implements ResourceDescriptorOrBuilder {
    private static final ResourceDescriptor DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile Parser<ResourceDescriptor> PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String type_ = "";
    private Internal.ProtobufList<String> pattern_ = GeneratedMessageLite.m13422t();
    private String nameField_ = "";
    private String plural_ = "";
    private String singular_ = "";

    /* renamed from: com.google.api.ResourceDescriptor$1 */
    public static /* synthetic */ class C15341 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20441a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20441a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20441a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20441a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20441a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20441a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20441a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20441a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ResourceDescriptor, Builder> implements ResourceDescriptorOrBuilder {
        public Builder() {
            super(ResourceDescriptor.DEFAULT_INSTANCE);
        }

        public Builder(C15341 c15341) {
            super(ResourceDescriptor.DEFAULT_INSTANCE);
        }
    }

    public enum History implements Internal.EnumLite {
        HISTORY_UNSPECIFIED(0),
        ORIGINALLY_SINGLE_PATTERN(1),
        FUTURE_MULTI_PATTERN(2),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f20447b;

        /* renamed from: com.google.api.ResourceDescriptor$History$1 */
        public class C15351 implements Internal.EnumLiteMap<History> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public History mo11029a(int i2) {
                return History.m11081a(i2);
            }
        }

        public static final class HistoryVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return History.m11081a(i2) != null;
            }
        }

        History(int i2) {
            this.f20447b = i2;
        }

        /* renamed from: a */
        public static History m11081a(int i2) {
            if (i2 == 0) {
                return HISTORY_UNSPECIFIED;
            }
            if (i2 == 1) {
                return ORIGINALLY_SINGLE_PATTERN;
            }
            if (i2 != 2) {
                return null;
            }
            return FUTURE_MULTI_PATTERN;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f20447b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        ResourceDescriptor resourceDescriptor = new ResourceDescriptor();
        DEFAULT_INSTANCE = resourceDescriptor;
        GeneratedMessageLite.m13417F(ResourceDescriptor.class, resourceDescriptor);
    }

    /* renamed from: I */
    public static ResourceDescriptor m11080I() {
        return DEFAULT_INSTANCE;
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ", new Object[]{"type_", "pattern_", "nameField_", "history_", "plural_", "singular_"});
            case NEW_MUTABLE_INSTANCE:
                return new ResourceDescriptor();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ResourceDescriptor> parser = PARSER;
                if (parser == null) {
                    synchronized (ResourceDescriptor.class) {
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
