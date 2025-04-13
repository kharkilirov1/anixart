package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6200b;
import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.p6 */
/* loaded from: classes3.dex */
public final class C5567p6 implements gg1 {

    /* renamed from: a */
    @NonNull
    private final C6264w f53390a;

    /* renamed from: b */
    @NonNull
    private final C6200b f53391b;

    /* renamed from: c */
    @NonNull
    private final a80 f53392c;

    /* renamed from: d */
    @NonNull
    private final sg1 f53393d = new sg1();

    public C5567p6(@NonNull C6264w c6264w, @NonNull C6200b c6200b, @NonNull a80 a80Var) {
        this.f53390a = c6264w;
        this.f53391b = c6200b;
        this.f53392c = a80Var;
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    /* renamed from: a */
    public final void mo24889a(@NonNull View view, @NonNull C5276ja c5276ja) {
        if (view.getTag() == null) {
            sg1 sg1Var = this.f53393d;
            String m25824b = c5276ja.m25824b();
            Objects.requireNonNull(sg1Var);
            view.setTag(sg1.m28248a(m25824b));
        }
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    /* renamed from: a */
    public final void mo24890a(@NonNull C5276ja c5276ja, @NonNull InterfaceC6027xh interfaceC6027xh) {
        a80 m25823a = c5276ja.m25823a();
        if (m25823a == null) {
            m25823a = this.f53392c;
        }
        this.f53391b.m30500a(c5276ja, m25823a, this.f53390a, interfaceC6027xh);
    }
}
