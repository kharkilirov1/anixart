package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.player.p025ad.C6154a;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ns0 implements id1 {

    /* renamed from: a */
    @NonNull
    private final i40 f53086a;

    /* renamed from: b */
    @NonNull
    private final C6154a f53087b = new C6154a();

    /* renamed from: c */
    @NonNull
    private final is0 f53088c = new is0();

    public ns0(@NonNull i40 i40Var) {
        this.f53086a = i40Var;
    }

    @Override // com.yandex.mobile.ads.impl.id1
    /* renamed from: a */
    public final void mo22386a(long j2, long j3) {
        h40 m25440a = this.f53086a.m25440a();
        ProgressBar progressBar = null;
        InstreamAdView m25051b = m25440a != null ? m25440a.m25051b() : null;
        if (m25051b != null) {
            Objects.requireNonNull(this.f53087b);
            ub1 m30403a = C6154a.m30403a(m25051b);
            if (m30403a != null) {
                progressBar = m30403a.m28938j();
            }
        }
        ProgressBar progressBar2 = progressBar;
        if (progressBar2 != null) {
            this.f53088c.m25727a(progressBar2, j3, j2);
        }
    }
}
