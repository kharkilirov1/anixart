package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.cc0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ce */
/* loaded from: classes3.dex */
public abstract class AbstractC4917ce implements bc0 {

    /* renamed from: a */
    private final ArrayList<bc0.InterfaceC4859c> f49211a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<bc0.InterfaceC4859c> f49212b = new HashSet<>(1);

    /* renamed from: c */
    private final cc0.C4914a f49213c = new cc0.C4914a();

    /* renamed from: d */
    private final InterfaceC4719f.a f49214d = new InterfaceC4719f.a();

    /* renamed from: e */
    @Nullable
    private Looper f49215e;

    /* renamed from: f */
    @Nullable
    private k61 f49216f;

    /* renamed from: g */
    @Nullable
    private uq0 f49217g;

    /* renamed from: a */
    public void mo23236a() {
    }

    /* renamed from: a */
    public final void m23237a(k61 k61Var) {
        this.f49216f = k61Var;
        Iterator<bc0.InterfaceC4859c> it = this.f49211a.iterator();
        while (it.hasNext()) {
            it.next().mo22801a(this, k61Var);
        }
    }

    /* renamed from: a */
    public abstract void mo23238a(@Nullable v71 v71Var);

    /* renamed from: b */
    public final cc0.C4914a m23240b(@Nullable bc0.C4858b c4858b) {
        return this.f49213c.m23206a(0, c4858b);
    }

    /* renamed from: b */
    public void mo23241b() {
    }

    /* renamed from: c */
    public final uq0 m23242c() {
        return (uq0) C5220ia.m25474b(this.f49217g);
    }

    /* renamed from: d */
    public final boolean m23243d() {
        return !this.f49212b.isEmpty();
    }

    /* renamed from: e */
    public abstract void mo23244e();

    /* renamed from: b */
    public final cc0.C4914a m23239b(int i2, @Nullable bc0.C4858b c4858b) {
        return this.f49213c.m23206a(i2, c4858b);
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: c */
    public final void mo22799c(bc0.InterfaceC4859c interfaceC4859c) {
        Objects.requireNonNull(this.f49215e);
        boolean isEmpty = this.f49212b.isEmpty();
        this.f49212b.add(interfaceC4859c);
        if (isEmpty) {
            mo23241b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: b */
    public final void mo22798b(bc0.InterfaceC4859c interfaceC4859c) {
        boolean z = !this.f49212b.isEmpty();
        this.f49212b.remove(interfaceC4859c);
        if (z && this.f49212b.isEmpty()) {
            mo23236a();
        }
    }

    /* renamed from: a */
    public final InterfaceC4719f.a m23235a(@Nullable bc0.C4858b c4858b) {
        return this.f49214d.m22177a(0, c4858b);
    }

    /* renamed from: a */
    public final InterfaceC4719f.a m23234a(int i2, @Nullable bc0.C4858b c4858b) {
        return this.f49214d.m22177a(i2, c4858b);
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: a */
    public final void mo22792a(Handler handler, cc0 cc0Var) {
        this.f49213c.m23208a(handler, cc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: a */
    public final void mo22796a(cc0 cc0Var) {
        this.f49213c.m23209a(cc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: a */
    public final void mo22791a(Handler handler, InterfaceC4719f interfaceC4719f) {
        this.f49214d.m22180a(handler, interfaceC4719f);
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: a */
    public final void mo22793a(InterfaceC4719f interfaceC4719f) {
        this.f49214d.m22185e(interfaceC4719f);
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: a */
    public final void mo22795a(bc0.InterfaceC4859c interfaceC4859c, @Nullable v71 v71Var, uq0 uq0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f49215e;
        C5220ia.m25473a(looper == null || looper == myLooper);
        this.f49217g = uq0Var;
        k61 k61Var = this.f49216f;
        this.f49211a.add(interfaceC4859c);
        if (this.f49215e == null) {
            this.f49215e = myLooper;
            this.f49212b.add(interfaceC4859c);
            mo23238a(v71Var);
        } else if (k61Var != null) {
            mo22799c(interfaceC4859c);
            interfaceC4859c.mo22801a(this, k61Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: a */
    public final void mo22794a(bc0.InterfaceC4859c interfaceC4859c) {
        this.f49211a.remove(interfaceC4859c);
        if (this.f49211a.isEmpty()) {
            this.f49215e = null;
            this.f49216f = null;
            this.f49217g = null;
            this.f49212b.clear();
            mo23244e();
            return;
        }
        mo22798b(interfaceC4859c);
    }
}
