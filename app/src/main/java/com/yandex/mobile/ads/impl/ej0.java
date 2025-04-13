package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6212h;
import com.yandex.mobile.ads.nativeads.C6216j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class ej0 implements lh0 {

    /* renamed from: a */
    @NonNull
    private final ei0 f49984a = new ei0();

    @Override // com.yandex.mobile.ads.impl.lh0
    /* renamed from: a */
    public final void mo22365a(@NonNull Context context, @NonNull kh0 kh0Var, @NonNull w10 w10Var, @NonNull C6216j c6216j, @NonNull di0 di0Var, @NonNull th0 th0Var) {
        ArrayList arrayList = new ArrayList();
        List<eh0> m27736d = kh0Var.m26128c().m27736d();
        if (m27736d != null) {
            Iterator<eh0> it = m27736d.iterator();
            while (it.hasNext()) {
                C6212h m24177a = this.f49984a.m24177a(context, kh0Var, w10Var, c6216j, di0Var, it.next());
                if (m24177a != null) {
                    arrayList.add(m24177a);
                }
            }
        }
        if (arrayList.isEmpty()) {
            th0Var.mo25215a(AbstractC5524o4.f53149a);
        } else {
            th0Var.mo25218a(arrayList);
        }
    }
}
