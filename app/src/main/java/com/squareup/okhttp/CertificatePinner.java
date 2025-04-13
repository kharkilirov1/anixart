package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class CertificatePinner {

    /* renamed from: b */
    public static final CertificatePinner f24806b = new CertificatePinner(new Builder(), null);

    /* renamed from: a */
    public final Map<String, Set<ByteString>> f24807a;

    public static final class Builder {

        /* renamed from: a */
        public final Map<String, Set<ByteString>> f24808a = new LinkedHashMap();
    }

    public CertificatePinner(Builder builder, C24611 c24611) {
        Map<String, Set<ByteString>> map = builder.f24808a;
        byte[] bArr = Util.f24976a;
        this.f24807a = Collections.unmodifiableMap(new LinkedHashMap(map));
    }
}
