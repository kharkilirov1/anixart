package io.grpc.okhttp;

import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.framed.Header;
import okio.ByteString;

/* loaded from: classes3.dex */
class Headers {

    /* renamed from: a */
    public static final Header f59193a;

    /* renamed from: b */
    public static final Header f59194b;

    /* renamed from: c */
    public static final Header f59195c;

    /* renamed from: d */
    public static final Header f59196d;

    /* renamed from: e */
    public static final Header f59197e;

    /* renamed from: f */
    public static final Header f59198f;

    static {
        ByteString byteString = Header.f59425g;
        f59193a = new Header(byteString, "https");
        f59194b = new Header(byteString, "http");
        ByteString byteString2 = Header.f59423e;
        f59195c = new Header(byteString2, "POST");
        f59196d = new Header(byteString2, "GET");
        f59197e = new Header(GrpcUtil.f58663i.f58214a, "application/grpc");
        f59198f = new Header("te", "trailers");
    }
}
