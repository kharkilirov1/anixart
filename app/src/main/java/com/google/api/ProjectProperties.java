package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class ProjectProperties extends GeneratedMessageLite<ProjectProperties, Builder> implements ProjectPropertiesOrBuilder {
    private static final ProjectProperties DEFAULT_INSTANCE;
    private static volatile Parser<ProjectProperties> PARSER = null;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Property> properties_ = GeneratedMessageLite.m13422t();

    /* renamed from: com.google.api.ProjectProperties$1 */
    public static /* synthetic */ class C15291 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20428a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20428a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20428a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20428a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20428a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20428a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20428a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20428a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ProjectProperties, Builder> implements ProjectPropertiesOrBuilder {
        public Builder() {
            super(ProjectProperties.DEFAULT_INSTANCE);
        }

        public Builder(C15291 c15291) {
            super(ProjectProperties.DEFAULT_INSTANCE);
        }
    }

    static {
        ProjectProperties projectProperties = new ProjectProperties();
        DEFAULT_INSTANCE = projectProperties;
        GeneratedMessageLite.m13417F(ProjectProperties.class, projectProperties);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"properties_", Property.class});
            case NEW_MUTABLE_INSTANCE:
                return new ProjectProperties();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ProjectProperties> parser = PARSER;
                if (parser == null) {
                    synchronized (ProjectProperties.class) {
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
