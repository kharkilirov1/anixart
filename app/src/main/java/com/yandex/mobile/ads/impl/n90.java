package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer;

/* loaded from: classes3.dex */
public final class n90 {

    /* renamed from: a */
    @NonNull
    private final Context f52881a;

    /* renamed from: b */
    @NonNull
    private final m50 f52882b;

    /* renamed from: c */
    @NonNull
    private final C5898v1 f52883c;

    /* renamed from: d */
    @NonNull
    private final r90 f52884d;

    public n90(@NonNull Context context, @NonNull m50 m50Var, @NonNull C5898v1 c5898v1, @NonNull r90 r90Var) {
        this.f52881a = context.getApplicationContext();
        this.f52882b = m50Var;
        this.f52883c = c5898v1;
        this.f52884d = r90Var;
    }

    @NonNull
    /* renamed from: a */
    public final m90 m26824a(@NonNull InstreamAdPlayer instreamAdPlayer) {
        return new m90(this.f52881a, this.f52882b, new t30(instreamAdPlayer), this.f52883c, this.f52884d);
    }
}
