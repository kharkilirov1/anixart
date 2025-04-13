package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.k2 */
/* loaded from: classes2.dex */
public class C4068k2 extends C3634T3 {

    /* renamed from: c */
    public C3332H0 f45593c;

    /* renamed from: d */
    public C3546Pe f45594d;

    /* renamed from: e */
    private boolean f45595e;

    /* renamed from: f */
    @Nullable
    private final String f45596f;

    public C4068k2(@NonNull C3659U3 c3659u3, @NonNull CounterConfiguration counterConfiguration) {
        this(c3659u3, counterConfiguration, null);
    }

    /* renamed from: a */
    public void m20220a(C3455Ln c3455Ln) {
        this.f45593c = new C3332H0(c3455Ln);
    }

    /* renamed from: c */
    public Bundle m20222c() {
        Bundle bundle = new Bundle();
        CounterConfiguration m19136b = m19136b();
        synchronized (m19136b) {
            bundle.putParcelable("COUNTER_CFG_OBJ", m19136b);
        }
        C3659U3 m19135a = m19135a();
        synchronized (m19135a) {
            bundle.putParcelable("PROCESS_CFG_OBJ", m19135a);
        }
        return bundle;
    }

    @Nullable
    /* renamed from: d */
    public String m20223d() {
        return this.f45593c.m18183a();
    }

    @Nullable
    /* renamed from: e */
    public String m20224e() {
        return this.f45596f;
    }

    /* renamed from: f */
    public boolean mo19628f() {
        return this.f45595e;
    }

    /* renamed from: g */
    public void m20225g() {
        this.f45595e = true;
    }

    /* renamed from: h */
    public void m20226h() {
        this.f45595e = false;
    }

    public C4068k2(@NonNull C3659U3 c3659u3, @NonNull CounterConfiguration counterConfiguration, @Nullable String str) {
        super(c3659u3, counterConfiguration);
        this.f45595e = true;
        this.f45596f = str;
    }

    /* renamed from: a */
    public void m20219a(InterfaceC3425Ki interfaceC3425Ki) {
        if (interfaceC3425Ki != null) {
            CounterConfiguration m19136b = m19136b();
            String m18333e = ((C3375Ii) interfaceC3425Ki).m18333e();
            synchronized (m19136b) {
                m19136b.f42234b.put("CFG_UUID", m18333e);
            }
        }
    }

    /* renamed from: a */
    public void m20221a(C3546Pe c3546Pe) {
        this.f45594d = c3546Pe;
    }
}
