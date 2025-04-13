package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.AbstractC4213ph;
import com.yandex.metrica.impl.p023ob.C4352v0;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.U1 */
/* loaded from: classes2.dex */
public abstract class AbstractC3657U1<T extends AbstractC4213ph> extends AbstractC3732X1<T, C4352v0.a> {

    /* renamed from: o */
    @NonNull
    private final C4011hn f44124o;

    /* renamed from: p */
    @NonNull
    private final C4374vm f44125p;

    /* renamed from: q */
    @NonNull
    private final InterfaceC3529Om f44126q;

    public AbstractC3657U1(@NonNull T t) {
        this(new C4300t0(), new C4011hn(), new C4374vm(), new C3504Nm(), t);
    }

    /* renamed from: C */
    public abstract void mo18505C();

    /* renamed from: D */
    public abstract void mo18506D();

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: a */
    public void mo19115a(byte[] bArr) {
        super.mo19115a(bArr);
    }

    /* renamed from: c */
    public boolean m19194c(@NonNull byte[] bArr) {
        byte[] m20025a;
        try {
            Objects.requireNonNull(this.f44125p);
            byte[] m19267b = C3681V0.m19267b(bArr);
            if (m19267b == null || (m20025a = this.f44124o.m20025a(m19267b)) == null) {
                return false;
            }
            super.mo19115a(m20025a);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: p */
    public boolean mo19128p() {
        boolean mo19128p = super.mo19128p();
        m19111a(this.f44126q.mo18643a());
        return mo19128p;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3632T1
    /* renamed from: r */
    public boolean mo18432r() {
        C4352v0.a m19377B = m19377B();
        boolean z = m19377B != null && "accepted".equals(m19377B.f46665a);
        if (z) {
            mo18505C();
        } else if (m19126m()) {
            mo18506D();
        }
        return z;
    }

    public AbstractC3657U1(@NonNull InterfaceC3607S1 interfaceC3607S1, @NonNull C4011hn c4011hn, @NonNull C4374vm c4374vm, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull T t) {
        super(interfaceC3607S1, t);
        this.f44124o = c4011hn;
        this.f44125p = c4374vm;
        this.f44126q = interfaceC3529Om;
        t.m20558a(c4011hn);
    }
}
