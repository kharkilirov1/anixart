package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class ResourceReference extends GeneratedMessageLite<ResourceReference, Builder> implements ResourceReferenceOrBuilder {
    public static final int CHILD_TYPE_FIELD_NUMBER = 2;
    private static final ResourceReference DEFAULT_INSTANCE;
    private static volatile Parser<ResourceReference> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String type_ = "";
    private String childType_ = "";

    /* renamed from: com.google.api.ResourceReference$1 */
    public static /* synthetic */ class C15361 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20448a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20448a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20448a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20448a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20448a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20448a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20448a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20448a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ResourceReference, Builder> implements ResourceReferenceOrBuilder {
        public Builder() {
            super(ResourceReference.DEFAULT_INSTANCE);
        }

        public Builder(C15361 c15361) {
            super(ResourceReference.DEFAULT_INSTANCE);
        }
    }

    static {
        ResourceReference resourceReference = new ResourceReference();
        DEFAULT_INSTANCE = resourceReference;
        GeneratedMessageLite.m13417F(ResourceReference.class, resourceReference);
    }

    /* renamed from: I */
    public static ResourceReference m11083I() {
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"type_", "childType_"});
            case NEW_MUTABLE_INSTANCE:
                return new ResourceReference();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ResourceReference> parser = PARSER;
                if (parser == null) {
                    synchronized (ResourceReference.class) {
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
