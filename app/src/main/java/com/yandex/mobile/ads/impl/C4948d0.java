package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.sv0;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.d0 */
/* loaded from: classes3.dex */
public final class C4948d0 {

    /* renamed from: a */
    @NonNull
    private final C5841u4 f49494a = new C5841u4();

    /* renamed from: b */
    @NonNull
    private final WeakReference<InterfaceC4832b0> f49495b;

    /* renamed from: c */
    @NonNull
    private final vv0 f49496c;

    /* renamed from: d */
    @NonNull
    private final C5101g2 f49497d;

    /* renamed from: e */
    @Nullable
    private final C5940vt f49498e;

    /* renamed from: f */
    @Nullable
    private int f49499f;

    /* renamed from: g */
    @Nullable
    private sv0.InterfaceC5763a f49500g;

    /* renamed from: h */
    private long f49501h;

    public C4948d0(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull InterfaceC4832b0 interfaceC4832b0, @Nullable FalseClick falseClick) {
        this.f49497d = c5101g2;
        this.f49495b = new WeakReference<>(interfaceC4832b0);
        this.f49496c = C5730s8.m28078a(context);
        this.f49498e = falseClick != null ? new C5940vt(context, c5101g2, falseClick) : null;
    }

    /* renamed from: a */
    public final void m23732a(@Nullable int i2) {
        StringBuilder m26356a = l60.m26356a("finishActivityInteraction, type = ");
        m26356a.append(C4895c0.m22957b(i2));
        n60.m26809b(m26356a.toString(), new Object[0]);
        if (this.f49501h == 0 || this.f49499f != i2) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f49501h;
        String str = currentTimeMillis < 1000 ? "<1" : (currentTimeMillis <= 1000 || currentTimeMillis > 2000) ? (currentTimeMillis <= 2000 || currentTimeMillis > 3000) ? (currentTimeMillis <= 3000 || currentTimeMillis > 5000) ? (currentTimeMillis <= 5000 || currentTimeMillis > 10000) ? (currentTimeMillis <= 10000 || currentTimeMillis > 15000) ? (currentTimeMillis <= 15000 || currentTimeMillis > 20000) ? ">20" : "15-20" : "10-15" : "5-10" : "3-5" : "2-3" : "1-2";
        HashMap hashMap = new HashMap();
        hashMap.put("type", C4895c0.m22956a(i2));
        hashMap.put("ad_type", this.f49497d.m24775b().m24033a());
        hashMap.put("block_id", this.f49497d.m24779c());
        hashMap.put("ad_unit_id", this.f49497d.m24779c());
        hashMap.put("interval", str);
        hashMap.putAll(this.f49494a.m28881a(this.f49497d.m24765a()));
        sv0.InterfaceC5763a interfaceC5763a = this.f49500g;
        if (interfaceC5763a != null) {
            hashMap.putAll(interfaceC5763a.mo22529a());
        }
        this.f49496c.mo23876a(new sv0(sv0.EnumC5764b.f54823K.m28361a(), hashMap));
        n60.m26811d("trackActivityInteractionInterval, type = %s, interval = %s", C4895c0.m22956a(i2), str);
        InterfaceC4832b0 interfaceC4832b0 = this.f49495b.get();
        if (interfaceC4832b0 != null) {
            interfaceC4832b0.onReturnedToApplication();
        }
        C5940vt c5940vt = this.f49498e;
        if (c5940vt != null) {
            c5940vt.m29262a(currentTimeMillis);
        }
        this.f49501h = 0L;
        this.f49499f = 0;
    }

    /* renamed from: b */
    public final void m23734b(@NonNull int i2) {
        StringBuilder m26356a = l60.m26356a("startActivityInteraction, type = ");
        m26356a.append(C4895c0.m22957b(i2));
        n60.m26809b(m26356a.toString(), new Object[0]);
        this.f49501h = System.currentTimeMillis();
        this.f49499f = i2;
    }

    /* renamed from: a */
    public final void m23733a(@Nullable sv0.InterfaceC5763a interfaceC5763a) {
        this.f49500g = interfaceC5763a;
    }
}
