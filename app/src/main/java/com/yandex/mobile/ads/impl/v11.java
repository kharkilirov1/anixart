package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.instream.player.p025ad.C6154a;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v11 {

    /* renamed from: a */
    @NotNull
    private final i40 f55724a;

    /* renamed from: b */
    @NotNull
    private final C6154a f55725b;

    public v11(@NotNull i40 viewHolderManager) {
        Intrinsics.m32179h(viewHolderManager, "viewHolderManager");
        this.f55724a = viewHolderManager;
        this.f55725b = new C6154a();
    }

    /* renamed from: a */
    public final void m29169a() {
        ub1 ub1Var;
        ub1 ub1Var2;
        InstreamAdView m25051b;
        InstreamAdView m25051b2;
        h40 m25440a = this.f55724a.m25440a();
        if (m25440a == null || (m25051b2 = m25440a.m25051b()) == null) {
            ub1Var = null;
        } else {
            Objects.requireNonNull(this.f55725b);
            ub1Var = C6154a.m30403a(m25051b2);
        }
        TextView m28939k = ub1Var != null ? ub1Var.m28939k() : null;
        if (m28939k != null) {
            m28939k.setVisibility(8);
        }
        h40 m25440a2 = this.f55724a.m25440a();
        if (m25440a2 == null || (m25051b = m25440a2.m25051b()) == null) {
            ub1Var2 = null;
        } else {
            Objects.requireNonNull(this.f55725b);
            ub1Var2 = C6154a.m30403a(m25051b);
        }
        View m28940l = ub1Var2 != null ? ub1Var2.m28940l() : null;
        if (m28940l != null) {
            m28940l.setVisibility(0);
            m28940l.setEnabled(true);
        }
    }

    /* renamed from: a */
    public final void m29170a(long j2, long j3) {
        ub1 ub1Var;
        InstreamAdView m25051b;
        h40 m25440a = this.f55724a.m25440a();
        if (m25440a == null || (m25051b = m25440a.m25051b()) == null) {
            ub1Var = null;
        } else {
            Objects.requireNonNull(this.f55725b);
            ub1Var = C6154a.m30403a(m25051b);
        }
        TextView m28939k = ub1Var != null ? ub1Var.m28939k() : null;
        int i2 = ((int) ((j2 - j3) / 1000)) + 1;
        if (m28939k != null) {
            m28939k.setText(String.valueOf(i2));
            m28939k.setVisibility(0);
        }
    }
}
