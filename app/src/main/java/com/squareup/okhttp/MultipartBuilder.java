package com.squareup.okhttp;

import java.util.ArrayList;
import java.util.UUID;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class MultipartBuilder {

    /* renamed from: a */
    public static final byte[] f24879a;

    /* renamed from: b */
    public static final byte[] f24880b;

    /* renamed from: c */
    public static final byte[] f24881c;

    public static final class MultipartRequestBody extends RequestBody {
    }

    static {
        MediaType.m13921a("multipart/mixed");
        MediaType.m13921a("multipart/alternative");
        MediaType.m13921a("multipart/digest");
        MediaType.m13921a("multipart/parallel");
        MediaType.m13921a("multipart/form-data");
        f24879a = new byte[]{58, 32};
        f24880b = new byte[]{13, 10};
        f24881c = new byte[]{45, 45};
    }

    public MultipartBuilder() {
        String uuid = UUID.randomUUID().toString();
        new ArrayList();
        new ArrayList();
        ByteString.m34572c(uuid);
    }
}
