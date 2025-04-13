package com.squareup.okhttp.internal.framed;

import okio.ByteString;

/* loaded from: classes2.dex */
public final class Header {

    /* renamed from: d */
    public static final ByteString f25068d = ByteString.m34572c(okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8);

    /* renamed from: e */
    public static final ByteString f25069e = ByteString.m34572c(okhttp3.internal.http2.Header.TARGET_METHOD_UTF8);

    /* renamed from: f */
    public static final ByteString f25070f = ByteString.m34572c(okhttp3.internal.http2.Header.TARGET_PATH_UTF8);

    /* renamed from: g */
    public static final ByteString f25071g = ByteString.m34572c(okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8);

    /* renamed from: h */
    public static final ByteString f25072h = ByteString.m34572c(okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: i */
    public static final ByteString f25073i = ByteString.m34572c(":host");

    /* renamed from: j */
    public static final ByteString f25074j = ByteString.m34572c(":version");

    /* renamed from: a */
    public final ByteString f25075a;

    /* renamed from: b */
    public final ByteString f25076b;

    /* renamed from: c */
    public final int f25077c;

    public Header(String str, String str2) {
        this(ByteString.m34572c(str), ByteString.m34572c(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return this.f25075a.equals(header.f25075a) && this.f25076b.equals(header.f25076b);
    }

    public int hashCode() {
        return this.f25076b.hashCode() + ((this.f25075a.hashCode() + 527) * 31);
    }

    public String toString() {
        return String.format("%s: %s", this.f25075a.m34586p(), this.f25076b.m34586p());
    }

    public Header(ByteString byteString, String str) {
        this(byteString, ByteString.m34572c(str));
    }

    public Header(ByteString byteString, ByteString byteString2) {
        this.f25075a = byteString;
        this.f25076b = byteString2;
        this.f25077c = byteString.mo34576d() + 32 + byteString2.mo34576d();
    }
}
