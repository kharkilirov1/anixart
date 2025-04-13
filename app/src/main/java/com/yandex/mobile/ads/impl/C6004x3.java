package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.x3 */
/* loaded from: classes3.dex */
public final class C6004x3 {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f56350a;

    /* renamed from: b */
    @NonNull
    private final C6104z3 f56351b;

    /* renamed from: c */
    @NonNull
    private final C5710rt f56352c;

    /* renamed from: d */
    @NonNull
    private final he1 f56353d;

    public C6004x3(@NonNull C6107z5 c6107z5, @NonNull C5710rt c5710rt, @NonNull he1 he1Var) {
        this.f56352c = c5710rt;
        this.f56353d = he1Var;
        this.f56350a = c6107z5.m30057b();
        this.f56351b = c6107z5.m30058c();
    }

    /* renamed from: a */
    public final void m29660a(@NonNull Player player, boolean z) {
        boolean m25146b = this.f56353d.m25146b();
        int currentAdGroupIndex = player.getCurrentAdGroupIndex();
        if (currentAdGroupIndex == -1) {
            AdPlaybackState m30045a = this.f56351b.m30045a();
            long contentPosition = player.getContentPosition();
            long mo5646m = player.mo5646m();
            if (mo5646m == -9223372036854775807L || contentPosition == -9223372036854775807L) {
                currentAdGroupIndex = -1;
            } else {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                currentAdGroupIndex = m30045a.m6927d(timeUnit.toMicros(contentPosition), timeUnit.toMicros(mo5646m));
            }
        }
        boolean m22385c = this.f56350a.m22385c();
        if (m25146b || z || currentAdGroupIndex == -1 || m22385c) {
            return;
        }
        AdPlaybackState m30045a2 = this.f56351b.m30045a();
        if (m30045a2.m6925b(currentAdGroupIndex).f12609b == Long.MIN_VALUE) {
            this.f56353d.m25145a();
        } else {
            this.f56352c.m27983a(m30045a2, currentAdGroupIndex);
        }
    }
}
