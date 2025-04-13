package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.C6152d;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ze1 implements VideoPlayerListener {

    /* renamed from: a */
    @NonNull
    private final Object f57123a = new Object();

    /* renamed from: b */
    @NonNull
    private final f90 f57124b = new f90();

    /* renamed from: c */
    @NonNull
    private final HashSet f57125c = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m30154b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m30155c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m30156d(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m30157e(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoResumed();
        }
    }

    /* renamed from: a */
    public final void m30164a(@NonNull C6152d c6152d) {
        synchronized (this.f57123a) {
            this.f57125c.add(c6152d);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        HashSet hashSet;
        synchronized (this.f57123a) {
            hashSet = new HashSet(this.f57125c);
        }
        this.f57124b.m24373a(new uq1(hashSet, 1));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        HashSet hashSet;
        synchronized (this.f57123a) {
            hashSet = new HashSet(this.f57125c);
        }
        this.f57124b.m24373a(new uq1(hashSet, 4));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        HashSet hashSet;
        synchronized (this.f57123a) {
            hashSet = new HashSet(this.f57125c);
        }
        this.f57124b.m24373a(new uq1(hashSet, 2));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        HashSet hashSet;
        synchronized (this.f57123a) {
            hashSet = new HashSet(this.f57125c);
        }
        this.f57124b.m24373a(new uq1(hashSet, 0));
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        HashSet hashSet;
        synchronized (this.f57123a) {
            hashSet = new HashSet(this.f57125c);
        }
        this.f57124b.m24373a(new uq1(hashSet, 3));
    }

    /* renamed from: a */
    public final void m30163a() {
        this.f57125c.clear();
        this.f57124b.m24372a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m30153a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((VideoPlayerListener) it.next()).onVideoCompleted();
        }
    }
}
