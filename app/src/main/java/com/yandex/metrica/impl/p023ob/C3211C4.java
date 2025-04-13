package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.yandex.metrica.CounterConfiguration;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.C4 */
/* loaded from: classes2.dex */
public class C3211C4 {

    /* renamed from: a */
    @Nullable
    private final String f42656a;

    /* renamed from: b */
    @NonNull
    private final String f42657b;

    /* renamed from: c */
    @Nullable
    private final Integer f42658c;

    /* renamed from: d */
    @Nullable
    private final String f42659d;

    /* renamed from: e */
    @NonNull
    private final CounterConfiguration.EnumC3079b f42660e;

    public C3211C4(@Nullable String str, @NonNull String str2, @Nullable Integer num, @Nullable String str3, @NonNull CounterConfiguration.EnumC3079b enumC3079b) {
        this.f42656a = str;
        this.f42657b = str2;
        this.f42658c = num;
        this.f42659d = str3;
        this.f42660e = enumC3079b;
    }

    @Nullable
    /* renamed from: a */
    public String m17919a() {
        return this.f42656a;
    }

    @NonNull
    /* renamed from: b */
    public String m17920b() {
        return this.f42657b;
    }

    @Nullable
    /* renamed from: c */
    public Integer m17921c() {
        return this.f42658c;
    }

    @Nullable
    /* renamed from: d */
    public String m17922d() {
        return this.f42659d;
    }

    @NonNull
    /* renamed from: e */
    public CounterConfiguration.EnumC3079b m17923e() {
        return this.f42660e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3211C4.class != obj.getClass()) {
            return false;
        }
        C3211C4 c3211c4 = (C3211C4) obj;
        String str = this.f42656a;
        if (str == null ? c3211c4.f42656a != null : !str.equals(c3211c4.f42656a)) {
            return false;
        }
        if (!this.f42657b.equals(c3211c4.f42657b)) {
            return false;
        }
        Integer num = this.f42658c;
        if (num == null ? c3211c4.f42658c != null : !num.equals(c3211c4.f42658c)) {
            return false;
        }
        String str2 = this.f42659d;
        if (str2 == null ? c3211c4.f42659d == null : str2.equals(c3211c4.f42659d)) {
            return this.f42660e == c3211c4.f42660e;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f42656a;
        int m4107f = C0576a.m4107f(this.f42657b, (str != null ? str.hashCode() : 0) * 31, 31);
        Integer num = this.f42658c;
        int hashCode = (m4107f + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f42659d;
        return this.f42660e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ClientDescription{mApiKey='");
        C0576a.m4100A(m24u, this.f42656a, '\'', ", mPackageName='");
        C0576a.m4100A(m24u, this.f42657b, '\'', ", mProcessID=");
        m24u.append(this.f42658c);
        m24u.append(", mProcessSessionID='");
        C0576a.m4100A(m24u, this.f42659d, '\'', ", mReporterType=");
        m24u.append(this.f42660e);
        m24u.append('}');
        return m24u.toString();
    }

    @NonNull
    /* renamed from: a */
    public static C3211C4 m17918a(@NonNull C3634T3 c3634t3) {
        return new C3211C4(c3634t3.m19136b().m17753c(), c3634t3.m19135a().m19232f(), c3634t3.m19135a().m19233g(), c3634t3.m19135a().m19234h(), CounterConfiguration.EnumC3079b.m17764a(c3634t3.m19136b().f42234b.getAsString("CFG_REPORTER_TYPE")));
    }
}
