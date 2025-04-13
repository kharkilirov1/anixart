package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class DataSpec {

    /* renamed from: a */
    public final Uri f14362a;

    /* renamed from: b */
    public final long f14363b;

    /* renamed from: c */
    public final int f14364c;

    /* renamed from: d */
    @Nullable
    public final byte[] f14365d;

    /* renamed from: e */
    public final Map<String, String> f14366e;

    /* renamed from: f */
    public final long f14367f;

    /* renamed from: g */
    public final long f14368g;

    /* renamed from: h */
    @Nullable
    public final String f14369h;

    /* renamed from: i */
    public final int f14370i;

    /* renamed from: j */
    @Nullable
    public final Object f14371j;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        ExoPlayerLibraryInfo.m5824a("goog.exo.datasource");
    }

    public DataSpec(Uri uri, long j2, long j3) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j2, j3, null, 0, null);
    }

    /* renamed from: b */
    public static String m7433b(int i2) {
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

    /* renamed from: a */
    public Builder m7434a() {
        return new Builder(this, null);
    }

    /* renamed from: c */
    public boolean m7435c(int i2) {
        return (this.f14370i & i2) == i2;
    }

    /* renamed from: d */
    public DataSpec m7436d(long j2) {
        long j3 = this.f14368g;
        return m7437e(j2, j3 != -1 ? j3 - j2 : -1L);
    }

    /* renamed from: e */
    public DataSpec m7437e(long j2, long j3) {
        return (j2 == 0 && this.f14368g == j3) ? this : new DataSpec(this.f14362a, this.f14363b, this.f14364c, this.f14365d, this.f14366e, this.f14367f + j2, j3, this.f14369h, this.f14370i, this.f14371j);
    }

    public String toString() {
        String m7433b = m7433b(this.f14364c);
        String valueOf = String.valueOf(this.f14362a);
        long j2 = this.f14367f;
        long j3 = this.f14368g;
        String str = this.f14369h;
        int i2 = this.f14370i;
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str, valueOf.length() + m7433b.length() + 70), "DataSpec[", m7433b, " ", valueOf);
        m4122u.append(", ");
        m4122u.append(j2);
        m4122u.append(", ");
        m4122u.append(j3);
        m4122u.append(", ");
        m4122u.append(str);
        m4122u.append(", ");
        m4122u.append(i2);
        m4122u.append("]");
        return m4122u.toString();
    }

    public DataSpec(Uri uri, long j2, int i2, @Nullable byte[] bArr, Map<String, String> map, long j3, long j4, @Nullable String str, int i3, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        boolean z = true;
        Assertions.m7513a(j2 + j3 >= 0);
        Assertions.m7513a(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        Assertions.m7513a(z);
        this.f14362a = uri;
        this.f14363b = j2;
        this.f14364c = i2;
        this.f14365d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f14366e = Collections.unmodifiableMap(new HashMap(map));
        this.f14367f = j3;
        this.f14368g = j4;
        this.f14369h = str;
        this.f14370i = i3;
        this.f14371j = obj;
    }

    public static final class Builder {

        /* renamed from: a */
        @Nullable
        public Uri f14372a;

        /* renamed from: b */
        public long f14373b;

        /* renamed from: c */
        public int f14374c;

        /* renamed from: d */
        @Nullable
        public byte[] f14375d;

        /* renamed from: e */
        public Map<String, String> f14376e;

        /* renamed from: f */
        public long f14377f;

        /* renamed from: g */
        public long f14378g;

        /* renamed from: h */
        @Nullable
        public String f14379h;

        /* renamed from: i */
        public int f14380i;

        /* renamed from: j */
        @Nullable
        public Object f14381j;

        public Builder() {
            this.f14374c = 1;
            this.f14376e = Collections.emptyMap();
            this.f14378g = -1L;
        }

        /* renamed from: a */
        public DataSpec m7438a() {
            Assertions.m7519g(this.f14372a, "The uri must be set.");
            return new DataSpec(this.f14372a, this.f14373b, this.f14374c, this.f14375d, this.f14376e, this.f14377f, this.f14378g, this.f14379h, this.f14380i, this.f14381j);
        }

        public Builder(DataSpec dataSpec, C11581 c11581) {
            this.f14372a = dataSpec.f14362a;
            this.f14373b = dataSpec.f14363b;
            this.f14374c = dataSpec.f14364c;
            this.f14375d = dataSpec.f14365d;
            this.f14376e = dataSpec.f14366e;
            this.f14377f = dataSpec.f14367f;
            this.f14378g = dataSpec.f14368g;
            this.f14379h = dataSpec.f14369h;
            this.f14380i = dataSpec.f14370i;
            this.f14381j = dataSpec.f14371j;
        }
    }
}
