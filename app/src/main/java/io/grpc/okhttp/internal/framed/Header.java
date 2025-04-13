package io.grpc.okhttp.internal.framed;

import okio.ByteString;

/* loaded from: classes3.dex */
public final class Header {

    /* renamed from: d */
    public static final ByteString f59422d = ByteString.m34572c(okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8);

    /* renamed from: e */
    public static final ByteString f59423e = ByteString.m34572c(okhttp3.internal.http2.Header.TARGET_METHOD_UTF8);

    /* renamed from: f */
    public static final ByteString f59424f = ByteString.m34572c(okhttp3.internal.http2.Header.TARGET_PATH_UTF8);

    /* renamed from: g */
    public static final ByteString f59425g = ByteString.m34572c(okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8);

    /* renamed from: h */
    public static final ByteString f59426h = ByteString.m34572c(okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: a */
    public final ByteString f59427a;

    /* renamed from: b */
    public final ByteString f59428b;

    /* renamed from: c */
    public final int f59429c;

    static {
        ByteString.m34572c(":host");
        ByteString.m34572c(":version");
    }

    public Header(String str, String str2) {
        this(ByteString.m34572c(str), ByteString.m34572c(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return this.f59427a.equals(header.f59427a) && this.f59428b.equals(header.f59428b);
    }

    public int hashCode() {
        return this.f59428b.hashCode() + ((this.f59427a.hashCode() + 527) * 31);
    }

    public String toString() {
        return String.format("%s: %s", this.f59427a.m34586p(), this.f59428b.m34586p());
    }

    public Header(ByteString byteString, String str) {
        this(byteString, ByteString.m34572c(str));
    }

    public Header(ByteString byteString, ByteString byteString2) {
        this.f59427a = byteString;
        this.f59428b = byteString2;
        this.f59429c = byteString.mo34576d() + 32 + byteString2.mo34576d();
    }
}
