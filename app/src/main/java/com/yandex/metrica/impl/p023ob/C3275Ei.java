package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import java.util.Collections;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Ei */
/* loaded from: classes2.dex */
public class C3275Ei {

    /* renamed from: a */
    public final long f42815a;

    /* renamed from: b */
    @NonNull
    public final String f42816b;

    /* renamed from: c */
    @NonNull
    public final List<Integer> f42817c;

    /* renamed from: d */
    @NonNull
    public final List<Integer> f42818d;

    /* renamed from: e */
    public final long f42819e;

    /* renamed from: f */
    public final int f42820f;

    /* renamed from: g */
    public final long f42821g;

    /* renamed from: h */
    public final long f42822h;

    /* renamed from: i */
    public final long f42823i;

    /* renamed from: j */
    public final long f42824j;

    public C3275Ei(long j2, @NonNull String str, @NonNull List<Integer> list, @NonNull List<Integer> list2, long j3, int i2, long j4, long j5, long j6, long j7) {
        this.f42815a = j2;
        this.f42816b = str;
        this.f42817c = Collections.unmodifiableList(list);
        this.f42818d = Collections.unmodifiableList(list2);
        this.f42819e = j3;
        this.f42820f = i2;
        this.f42821g = j4;
        this.f42822h = j5;
        this.f42823i = j6;
        this.f42824j = j7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3275Ei.class != obj.getClass()) {
            return false;
        }
        C3275Ei c3275Ei = (C3275Ei) obj;
        if (this.f42815a == c3275Ei.f42815a && this.f42819e == c3275Ei.f42819e && this.f42820f == c3275Ei.f42820f && this.f42821g == c3275Ei.f42821g && this.f42822h == c3275Ei.f42822h && this.f42823i == c3275Ei.f42823i && this.f42824j == c3275Ei.f42824j && this.f42816b.equals(c3275Ei.f42816b) && this.f42817c.equals(c3275Ei.f42817c)) {
            return this.f42818d.equals(c3275Ei.f42818d);
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f42815a;
        int hashCode = (this.f42818d.hashCode() + ((this.f42817c.hashCode() + C0576a.m4107f(this.f42816b, ((int) (j2 ^ (j2 >>> 32))) * 31, 31)) * 31)) * 31;
        long j3 = this.f42819e;
        int i2 = (((hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f42820f) * 31;
        long j4 = this.f42821g;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f42822h;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f42823i;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f42824j;
        return i5 + ((int) ((j7 >>> 32) ^ j7));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SocketConfig{secondsToLive=");
        m24u.append(this.f42815a);
        m24u.append(", token='");
        C0576a.m4100A(m24u, this.f42816b, '\'', ", ports=");
        m24u.append(this.f42817c);
        m24u.append(", portsHttp=");
        m24u.append(this.f42818d);
        m24u.append(", firstDelaySeconds=");
        m24u.append(this.f42819e);
        m24u.append(", launchDelaySeconds=");
        m24u.append(this.f42820f);
        m24u.append(", openEventIntervalSeconds=");
        m24u.append(this.f42821g);
        m24u.append(", minFailedRequestIntervalSeconds=");
        m24u.append(this.f42822h);
        m24u.append(", minSuccessfulRequestIntervalSeconds=");
        m24u.append(this.f42823i);
        m24u.append(", openRetryIntervalSeconds=");
        m24u.append(this.f42824j);
        m24u.append('}');
        return m24u.toString();
    }
}
