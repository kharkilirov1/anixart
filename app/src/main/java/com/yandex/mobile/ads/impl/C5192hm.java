package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.hm */
/* loaded from: classes3.dex */
public final class C5192hm {

    /* renamed from: k */
    public static final /* synthetic */ int f50966k = 0;

    /* renamed from: a */
    public final Uri f50967a;

    /* renamed from: b */
    public final long f50968b;

    /* renamed from: c */
    public final int f50969c;

    /* renamed from: d */
    @Nullable
    public final byte[] f50970d;

    /* renamed from: e */
    public final Map<String, String> f50971e;

    /* renamed from: f */
    public final long f50972f;

    /* renamed from: g */
    public final long f50973g;

    /* renamed from: h */
    @Nullable
    public final String f50974h;

    /* renamed from: i */
    public final int f50975i;

    /* renamed from: j */
    @Nullable
    public final Object f50976j;

    /* renamed from: com.yandex.mobile.ads.impl.hm$a */
    public static final class a {

        /* renamed from: a */
        @Nullable
        private Uri f50977a;

        /* renamed from: b */
        private long f50978b;

        /* renamed from: c */
        private int f50979c;

        /* renamed from: d */
        @Nullable
        private byte[] f50980d;

        /* renamed from: e */
        private Map<String, String> f50981e;

        /* renamed from: f */
        private long f50982f;

        /* renamed from: g */
        private long f50983g;

        /* renamed from: h */
        @Nullable
        private String f50984h;

        /* renamed from: i */
        private int f50985i;

        /* renamed from: j */
        @Nullable
        private Object f50986j;

        public /* synthetic */ a(C5192hm c5192hm, int i2) {
            this(c5192hm);
        }

        /* renamed from: a */
        public final a m25240a(Uri uri) {
            this.f50977a = uri;
            return this;
        }

        /* renamed from: b */
        public final a m25247b(String str) {
            this.f50977a = Uri.parse(str);
            return this;
        }

        /* renamed from: c */
        public final a m25248c(long j2) {
            this.f50978b = j2;
            return this;
        }

        public a() {
            this.f50979c = 1;
            this.f50981e = Collections.emptyMap();
            this.f50983g = -1L;
        }

        /* renamed from: a */
        public final a m25243a(@Nullable byte[] bArr) {
            this.f50980d = bArr;
            return this;
        }

        /* renamed from: b */
        public final a m25245b() {
            this.f50979c = 2;
            return this;
        }

        /* renamed from: a */
        public final a m25242a(Map<String, String> map) {
            this.f50981e = map;
            return this;
        }

        /* renamed from: b */
        public final a m25246b(long j2) {
            this.f50982f = j2;
            return this;
        }

        /* renamed from: a */
        public final a m25239a(long j2) {
            this.f50983g = j2;
            return this;
        }

        /* renamed from: a */
        public final a m25241a(@Nullable String str) {
            this.f50984h = str;
            return this;
        }

        private a(C5192hm c5192hm) {
            this.f50977a = c5192hm.f50967a;
            this.f50978b = c5192hm.f50968b;
            this.f50979c = c5192hm.f50969c;
            this.f50980d = c5192hm.f50970d;
            this.f50981e = c5192hm.f50971e;
            this.f50982f = c5192hm.f50972f;
            this.f50983g = c5192hm.f50973g;
            this.f50984h = c5192hm.f50974h;
            this.f50985i = c5192hm.f50975i;
            this.f50986j = c5192hm.f50976j;
        }

        /* renamed from: a */
        public final a m25238a(int i2) {
            this.f50985i = i2;
            return this;
        }

        /* renamed from: a */
        public final C5192hm m25244a() {
            if (this.f50977a != null) {
                return new C5192hm(this.f50977a, this.f50978b, this.f50979c, this.f50980d, this.f50981e, this.f50982f, this.f50983g, this.f50984h, this.f50985i, this.f50986j, 0);
            }
            throw new IllegalStateException("The uri must be set.");
        }
    }

    static {
        C5411ls.m26526a("goog.exo.datasource");
    }

    public /* synthetic */ C5192hm(Uri uri, long j2, int i2, byte[] bArr, Map map, long j3, long j4, String str, int i3, Object obj, int i4) {
        this(uri, j2, i2, bArr, map, j3, j4, str, i3, obj);
    }

    /* renamed from: a */
    public final boolean m25236a(int i2) {
        return (this.f50975i & i2) == i2;
    }

    /* renamed from: b */
    public final String m25237b() {
        int i2 = this.f50969c;
        if (i2 == 1) {
            return "GET";
        }
        if (i2 == 2) {
            return "POST";
        }
        if (i2 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        String str;
        StringBuilder m26356a = l60.m26356a("DataSpec[");
        int i2 = this.f50969c;
        if (i2 == 1) {
            str = "GET";
        } else if (i2 == 2) {
            str = "POST";
        } else {
            if (i2 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        m26356a.append(str);
        m26356a.append(" ");
        m26356a.append(this.f50967a);
        m26356a.append(", ");
        m26356a.append(this.f50972f);
        m26356a.append(", ");
        m26356a.append(this.f50973g);
        m26356a.append(", ");
        m26356a.append(this.f50974h);
        m26356a.append(", ");
        return C0000a.m18o(m26356a, this.f50975i, "]");
    }

    private C5192hm(Uri uri, long j2, int i2, @Nullable byte[] bArr, Map<String, String> map, long j3, long j4, @Nullable String str, int i3, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        boolean z = true;
        C5220ia.m25473a(j2 + j3 >= 0);
        C5220ia.m25473a(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        C5220ia.m25473a(z);
        this.f50967a = uri;
        this.f50968b = j2;
        this.f50969c = i2;
        this.f50970d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f50971e = Collections.unmodifiableMap(new HashMap(map));
        this.f50972f = j3;
        this.f50973g = j4;
        this.f50974h = str;
        this.f50975i = i3;
        this.f50976j = obj;
    }

    /* renamed from: a */
    public final a m25234a() {
        return new a(this, 0);
    }

    /* renamed from: a */
    public final C5192hm m25235a(long j2) {
        return this.f50973g == j2 ? this : new C5192hm(this.f50967a, this.f50968b, this.f50969c, this.f50970d, this.f50971e, 0 + this.f50972f, j2, this.f50974h, this.f50975i, this.f50976j);
    }
}
