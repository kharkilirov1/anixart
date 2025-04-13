package com.google.api;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes.dex */
public final class BackendRule extends GeneratedMessageLite<BackendRule, Builder> implements BackendRuleOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final BackendRule DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile Parser<BackendRule> PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private int authenticationCase_ = 0;
    private String selector_ = "";
    private String address_ = "";
    private String protocol_ = "";

    /* renamed from: com.google.api.BackendRule$1 */
    public static /* synthetic */ class C14951 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20338a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20338a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20338a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20338a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20338a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20338a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20338a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20338a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum AuthenticationCase {
        /* JADX INFO: Fake field, exist only in values array */
        JWT_AUDIENCE(7),
        /* JADX INFO: Fake field, exist only in values array */
        DISABLE_AUTH(8),
        /* JADX INFO: Fake field, exist only in values array */
        AUTHENTICATION_NOT_SET(0);

        AuthenticationCase(int i2) {
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BackendRule, Builder> implements BackendRuleOrBuilder {
        public Builder() {
            super(BackendRule.DEFAULT_INSTANCE);
        }

        public Builder(C14951 c14951) {
            super(BackendRule.DEFAULT_INSTANCE);
        }
    }

    public enum PathTranslation implements Internal.EnumLite {
        PATH_TRANSLATION_UNSPECIFIED(0),
        CONSTANT_ADDRESS(1),
        APPEND_PATH_TO_ADDRESS(2),
        UNRECOGNIZED(-1);


        /* renamed from: b */
        public final int f20345b;

        /* renamed from: com.google.api.BackendRule$PathTranslation$1 */
        public class C14961 implements Internal.EnumLiteMap<PathTranslation> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* renamed from: a */
            public PathTranslation mo11029a(int i2) {
                return PathTranslation.m11027a(i2);
            }
        }

        public static final class PathTranslationVerifier implements Internal.EnumVerifier {
            @Override // com.google.protobuf.Internal.EnumVerifier
            /* renamed from: a */
            public boolean mo11030a(int i2) {
                return PathTranslation.m11027a(i2) != null;
            }
        }

        PathTranslation(int i2) {
            this.f20345b = i2;
        }

        /* renamed from: a */
        public static PathTranslation m11027a(int i2) {
            if (i2 == 0) {
                return PATH_TRANSLATION_UNSPECIFIED;
            }
            if (i2 == 1) {
                return CONSTANT_ADDRESS;
            }
            if (i2 != 2) {
                return null;
            }
            return APPEND_PATH_TO_ADDRESS;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        /* renamed from: x */
        public final int mo11028x() {
            if (this != UNRECOGNIZED) {
                return this.f20345b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        BackendRule backendRule = new BackendRule();
        DEFAULT_INSTANCE = backendRule;
        GeneratedMessageLite.m13417F(BackendRule.class, backendRule);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007Ȼ\u0000\b:\u0000\tȈ", new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"});
            case NEW_MUTABLE_INSTANCE:
                return new BackendRule();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BackendRule> parser = PARSER;
                if (parser == null) {
                    synchronized (BackendRule.class) {
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
