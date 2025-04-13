package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class ResourceInfo extends GeneratedMessageLite<ResourceInfo, Builder> implements ResourceInfoOrBuilder {
    private static final ResourceInfo DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile Parser<ResourceInfo> PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String resourceType_ = "";
    private String resourceName_ = "";
    private String owner_ = "";
    private String description_ = "";

    /* renamed from: com.google.rpc.ResourceInfo$1 */
    public static /* synthetic */ class C24271 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24466a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24466a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24466a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24466a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24466a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24466a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24466a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24466a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ResourceInfo, Builder> implements ResourceInfoOrBuilder {
        public Builder() {
            super(ResourceInfo.DEFAULT_INSTANCE);
        }

        public Builder(C24271 c24271) {
            super(ResourceInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        ResourceInfo resourceInfo = new ResourceInfo();
        DEFAULT_INSTANCE = resourceInfo;
        GeneratedMessageLite.m13417F(ResourceInfo.class, resourceInfo);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"resourceType_", "resourceName_", "owner_", "description_"});
            case NEW_MUTABLE_INSTANCE:
                return new ResourceInfo();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ResourceInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (ResourceInfo.class) {
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
