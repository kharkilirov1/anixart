package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.bk0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class wj0 {

    /* renamed from: a */
    @NonNull
    private final C5724s3 f56144a;

    /* renamed from: b */
    @NonNull
    private final C4912cb f56145b = new C4912cb();

    /* renamed from: c */
    @NonNull
    private final e20 f56146c = new e20();

    /* renamed from: d */
    @NonNull
    private final g20 f56147d = new g20();

    /* renamed from: e */
    @NonNull
    private final q10 f56148e;

    /* renamed from: com.yandex.mobile.ads.impl.wj0$a */
    public interface InterfaceC5975a {
    }

    public wj0(@NonNull Context context, @NonNull C5724s3 c5724s3) {
        this.f56144a = c5724s3;
        this.f56148e = new q10(context);
    }

    /* renamed from: a */
    public final void m29489a(@NonNull kh0 kh0Var, @NonNull sp0 sp0Var, @NonNull bk0.C4874b c4874b) {
        qi0 m26128c = kh0Var.m26128c();
        LinkedHashSet m24799a = this.f56147d.m24799a(m26128c.m27736d());
        Objects.requireNonNull(this.f56148e);
        HashSet hashSet = new HashSet();
        List<C5600pp> m27734c = m26128c.m27734c();
        if (m27734c != null) {
            Iterator<C5600pp> it = m27734c.iterator();
            while (it.hasNext()) {
                List<z10> m27360b = it.next().m27360b();
                if (m27360b != null) {
                    hashSet.addAll(m27360b);
                }
            }
        }
        m24799a.addAll(hashSet);
        this.f56144a.m28055b(EnumC5668r3.f54175h);
        this.f56148e.m27596a(m24799a, new vj0(this, kh0Var, sp0Var, c4874b));
    }
}
