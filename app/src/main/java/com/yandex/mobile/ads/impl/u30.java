package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.p025ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class u30 implements InstreamAdPlayerListener {

    /* renamed from: a */
    @NonNull
    private final Object f55355a = new Object();

    /* renamed from: b */
    @NonNull
    private final f90 f55356b = new f90();

    /* renamed from: c */
    @NonNull
    private final HashMap f55357c = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m28852c(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdCompleted(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m28853d(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdPaused(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m28854e(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdPrepared(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m28855f(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdResumed(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m28856g(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdSkipped(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m28857h(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdStarted(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m28858i(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdStopped(videoAd);
        }
    }

    /* renamed from: a */
    public final void m28871a(@NonNull VideoAd videoAd, @NonNull InstreamAdPlayerListener instreamAdPlayerListener) {
        synchronized (this.f55355a) {
            Set set = (Set) this.f55357c.get(videoAd);
            if (set == null) {
                set = new HashSet();
                this.f55357c.put(videoAd, set);
            }
            set.add(instreamAdPlayerListener);
        }
    }

    /* renamed from: b */
    public final void m28872b(@NonNull VideoAd videoAd, @NonNull InstreamAdPlayerListener instreamAdPlayerListener) {
        synchronized (this.f55355a) {
            Set set = (Set) this.f55357c.get(videoAd);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (instreamAdPlayerListener.equals((InstreamAdPlayerListener) it.next())) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdBufferingFinished(@NonNull VideoAd videoAd) {
        HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new dq1(m28847a, videoAd, 5));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdBufferingStarted(@NonNull VideoAd videoAd) {
        HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new dq1(m28847a, videoAd, 0));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdCompleted(@NonNull VideoAd videoAd) {
        HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new dq1(m28847a, videoAd, 7));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdPaused(@NonNull VideoAd videoAd) {
        HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new dq1(m28847a, videoAd, 2));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdPrepared(@NonNull VideoAd videoAd) {
        HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new dq1(m28847a, videoAd, 1));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdResumed(@NonNull VideoAd videoAd) {
        HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new dq1(m28847a, videoAd, 8));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdSkipped(@NonNull VideoAd videoAd) {
        HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new dq1(m28847a, videoAd, 6));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdStarted(@NonNull VideoAd videoAd) {
        HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new dq1(m28847a, videoAd, 4));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onAdStopped(@NonNull VideoAd videoAd) {
        HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new dq1(m28847a, videoAd, 3));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onError(@NonNull VideoAd videoAd, @NonNull InstreamAdPlayerError instreamAdPlayerError) {
        HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new sq1(m28847a, videoAd, instreamAdPlayerError, 9));
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
    public final void onVolumeChanged(@NonNull final VideoAd videoAd, final float f2) {
        final HashSet m28847a = m28847a(videoAd);
        if (m28847a != null) {
            this.f55356b.m24373a(new Runnable() { // from class: com.yandex.mobile.ads.impl.eq1
                @Override // java.lang.Runnable
                public final void run() {
                    u30.m28849a(m28847a, videoAd, f2);
                }
            });
        }
    }

    /* renamed from: a */
    public final void m28870a() {
        this.f55356b.m24372a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28848a(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdBufferingFinished(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m28851b(Set set, VideoAd videoAd) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onAdBufferingStarted(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28849a(Set set, VideoAd videoAd, float f2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onVolumeChanged(videoAd, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28850a(Set set, VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InstreamAdPlayerListener) it.next()).onError(videoAd, instreamAdPlayerError);
        }
    }

    @Nullable
    /* renamed from: a */
    private HashSet m28847a(@NonNull VideoAd videoAd) {
        HashSet hashSet;
        synchronized (this.f55355a) {
            Set set = (Set) this.f55357c.get(videoAd);
            hashSet = set != null ? new HashSet(set) : null;
        }
        return hashSet;
    }
}
