package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.yandex.metrica.push.common.CoreConstants;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Fg */
/* loaded from: classes2.dex */
public final class C3298Fg {

    /* renamed from: a */
    @NonNull
    public final String f42909a;

    /* renamed from: b */
    public final long f42910b;

    /* renamed from: c */
    public final long f42911c;

    /* renamed from: d */
    @NonNull
    public final a f42912d;

    /* renamed from: com.yandex.metrica.impl.ob.Fg$a */
    public enum a {
        UNKNOWN(CoreConstants.Transport.UNKNOWN),
        GP("gpl"),
        HMS("hms-content-provider");


        /* renamed from: a */
        public final String f42917a;

        a(String str) {
            this.f42917a = str;
        }
    }

    private C3298Fg(@NonNull byte[] bArr) throws C3883d {
        C3771Yf m19476a = C3771Yf.m19476a(bArr);
        this.f42909a = m19476a.f44584b;
        this.f42910b = m19476a.f44586d;
        this.f42911c = m19476a.f44585c;
        this.f42912d = m18101a(m19476a.f44587e);
    }

    @Nullable
    /* renamed from: a */
    public static C3298Fg m18102a(@NonNull byte[] bArr) throws C3883d {
        if (C3658U2.m19214a(bArr)) {
            return null;
        }
        return new C3298Fg(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3298Fg.class != obj.getClass()) {
            return false;
        }
        C3298Fg c3298Fg = (C3298Fg) obj;
        return this.f42910b == c3298Fg.f42910b && this.f42911c == c3298Fg.f42911c && this.f42909a.equals(c3298Fg.f42909a) && this.f42912d == c3298Fg.f42912d;
    }

    public int hashCode() {
        int hashCode = this.f42909a.hashCode() * 31;
        long j2 = this.f42910b;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f42911c;
        return this.f42912d.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReferrerInfo{installReferrer='");
        C0576a.m4100A(m24u, this.f42909a, '\'', ", referrerClickTimestampSeconds=");
        m24u.append(this.f42910b);
        m24u.append(", installBeginTimestampSeconds=");
        m24u.append(this.f42911c);
        m24u.append(", source=");
        m24u.append(this.f42912d);
        m24u.append('}');
        return m24u.toString();
    }

    /* renamed from: a */
    public byte[] m18103a() {
        C3771Yf c3771Yf = new C3771Yf();
        c3771Yf.f44584b = this.f42909a;
        c3771Yf.f44586d = this.f42910b;
        c3771Yf.f44585c = this.f42911c;
        int ordinal = this.f42912d.ordinal();
        int i2 = 2;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal != 2) {
            i2 = 0;
        }
        c3771Yf.f44587e = i2;
        return AbstractC3909e.m19777a(c3771Yf);
    }

    public C3298Fg(@NonNull String str, long j2, long j3, @NonNull a aVar) {
        this.f42909a = str;
        this.f42910b = j2;
        this.f42911c = j3;
        this.f42912d = aVar;
    }

    @NonNull
    /* renamed from: a */
    private a m18101a(int i2) {
        if (i2 == 1) {
            return a.GP;
        }
        if (i2 != 2) {
            return a.UNKNOWN;
        }
        return a.HMS;
    }
}
