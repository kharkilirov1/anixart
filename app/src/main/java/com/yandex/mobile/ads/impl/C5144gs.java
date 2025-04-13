package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.gs */
/* loaded from: classes3.dex */
public final class C5144gs {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f50718a;

    /* renamed from: b */
    @NonNull
    private final C5424m3 f50719b;

    /* renamed from: c */
    @NonNull
    private final C5003e4 f50720c;

    /* renamed from: d */
    @NonNull
    private final C6104z3 f50721d;

    /* renamed from: e */
    @NonNull
    private final C5914ve f50722e;

    /* renamed from: f */
    @NonNull
    private final C5603ps f50723f;

    /* renamed from: g */
    @NonNull
    private final C6108z6 f50724g = new C6108z6();

    /* renamed from: h */
    @NonNull
    private final Handler f50725h = new Handler(Looper.getMainLooper());

    public C5144gs(@NonNull C5914ve c5914ve, @NonNull C6107z5 c6107z5, @NonNull C5003e4 c5003e4, @NonNull C5603ps c5603ps) {
        this.f50719b = c6107z5.m30056a();
        this.f50718a = c6107z5.m30057b();
        this.f50721d = c6107z5.m30058c();
        this.f50720c = c5003e4;
        this.f50722e = c5914ve;
        this.f50723f = c5603ps;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m24963a(final int i2, final int i3, final long j2) {
        if (SystemClock.elapsedRealtime() - j2 >= 200) {
            VideoAd m26562a = this.f50719b.m26562a(new C5264j3(i2, i3));
            if (m26562a == null) {
                n60.m26810c("Unexpected prepared ad", new Object[0]);
                return;
            } else {
                this.f50718a.m22383a(m26562a, d40.f49560b);
                this.f50720c.onAdPrepared(m26562a);
                return;
            }
        }
        Player m27369a = this.f50723f.m27369a();
        if (m27369a == null || m27369a.getDuration() == -9223372036854775807L) {
            this.f50725h.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.no1
                @Override // java.lang.Runnable
                public final void run() {
                    C5144gs.this.m24963a(i2, i3, j2);
                }
            }, 20L);
            return;
        }
        VideoAd m26562a2 = this.f50719b.m26562a(new C5264j3(i2, i3));
        if (m26562a2 == null) {
            n60.m26810c("Unexpected prepared ad", new Object[0]);
        } else {
            this.f50718a.m22383a(m26562a2, d40.f49560b);
            this.f50720c.onAdPrepared(m26562a2);
        }
    }

    /* renamed from: a */
    public final void m24967a(int i2, int i3) {
        m24963a(i2, i3, SystemClock.elapsedRealtime());
    }

    /* renamed from: a */
    private void m24964a(int i2, int i3, @NonNull IOException iOException) {
        AdPlaybackState m30045a = this.f50721d.m30045a();
        int i4 = i2 - m30045a.f12606f;
        AdPlaybackState.AdGroup[] adGroupArr = m30045a.f12607g;
        AdPlaybackState.AdGroup[] adGroupArr2 = (AdPlaybackState.AdGroup[]) Util.m7719R(adGroupArr, adGroupArr.length);
        adGroupArr2[i4] = adGroupArr2[i4].m6939h(4, i3);
        this.f50721d.m30046a(new AdPlaybackState(m30045a.f12602b, adGroupArr2, m30045a.f12604d, m30045a.f12605e, m30045a.f12606f));
        VideoAd m26562a = this.f50719b.m26562a(new C5264j3(i2, i3));
        if (m26562a != null) {
            this.f50718a.m22383a(m26562a, d40.f49564f);
            Objects.requireNonNull(this.f50724g);
            this.f50720c.onError(m26562a, C6108z6.m30065c(iOException));
            return;
        }
        n60.m26810c("Unexpected prepared ad error", new Object[0]);
    }

    /* renamed from: b */
    public final void m24968b(int i2, int i3, @NonNull IOException iOException) {
        if (this.f50723f.m27372b() && this.f50722e.m29220b()) {
            try {
                m24964a(i2, i3, iOException);
                return;
            } catch (RuntimeException e2) {
                n60.m26810c("Unexpected exception while handling prepare error - %s", e2);
                return;
            }
        }
        n60.m26813f("Ignoring ad prepare error after release", new Object[0]);
    }
}
