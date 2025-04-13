package com.google.type;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* loaded from: classes2.dex */
public final class PostalAddress extends GeneratedMessageLite<PostalAddress, Builder> implements PostalAddressOrBuilder {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    private static final PostalAddress DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile Parser<PostalAddress> PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private int revision_;
    private String regionCode_ = "";
    private String languageCode_ = "";
    private String postalCode_ = "";
    private String sortingCode_ = "";
    private String administrativeArea_ = "";
    private String locality_ = "";
    private String sublocality_ = "";
    private Internal.ProtobufList<String> addressLines_ = GeneratedMessageLite.m13422t();
    private Internal.ProtobufList<String> recipients_ = GeneratedMessageLite.m13422t();
    private String organization_ = "";

    /* renamed from: com.google.type.PostalAddress$1 */
    public static /* synthetic */ class C24401 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24510a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24510a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24510a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24510a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24510a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24510a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24510a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24510a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<PostalAddress, Builder> implements PostalAddressOrBuilder {
        public Builder() {
            super(PostalAddress.DEFAULT_INSTANCE);
        }

        public Builder(C24401 c24401) {
            super(PostalAddress.DEFAULT_INSTANCE);
        }
    }

    static {
        PostalAddress postalAddress = new PostalAddress();
        DEFAULT_INSTANCE = postalAddress;
        GeneratedMessageLite.m13417F(PostalAddress.class, postalAddress);
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
                return GeneratedMessageLite.m13425y(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"});
            case NEW_MUTABLE_INSTANCE:
                return new PostalAddress();
            case NEW_BUILDER:
                return new Builder(null);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<PostalAddress> parser = PARSER;
                if (parser == null) {
                    synchronized (PostalAddress.class) {
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
