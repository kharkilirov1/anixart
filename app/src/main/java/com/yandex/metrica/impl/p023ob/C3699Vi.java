package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Vi */
/* loaded from: classes2.dex */
public class C3699Vi {

    /* renamed from: a */
    @Nullable
    public final a f44314a;

    /* renamed from: b */
    @Nullable
    public final a f44315b;

    /* renamed from: com.yandex.metrica.impl.ob.Vi$a */
    public static class a {

        /* renamed from: a */
        public final int f44316a;

        /* renamed from: b */
        public final long f44317b;

        public a(int i2, long j2) {
            this.f44316a = i2;
            this.f44317b = j2;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("Item{refreshEventCount=");
            m24u.append(this.f44316a);
            m24u.append(", refreshPeriodSeconds=");
            m24u.append(this.f44317b);
            m24u.append('}');
            return m24u.toString();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vi$b */
    public enum b {
        WIFI,
        CELL
    }

    public C3699Vi(@Nullable a aVar, @Nullable a aVar2) {
        this.f44314a = aVar;
        this.f44315b = aVar2;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ThrottlingConfig{cell=");
        m24u.append(this.f44314a);
        m24u.append(", wifi=");
        m24u.append(this.f44315b);
        m24u.append('}');
        return m24u.toString();
    }
}
