package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.C6149a;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.te */
/* loaded from: classes3.dex */
public final class C5797te {

    /* renamed from: a */
    @NonNull
    private final WeakReference<ViewGroup> f55091a;

    /* renamed from: b */
    @NonNull
    private final List<fc1> f55092b;

    /* renamed from: c */
    @NonNull
    private final InstreamAdBinder f55093c;

    /* renamed from: d */
    @NonNull
    private final C6149a f55094d;

    /* renamed from: e */
    @Nullable
    private InstreamAdView f55095e;

    public C5797te(@NonNull ViewGroup viewGroup, @NonNull List<fc1> list, @NonNull InstreamAdBinder instreamAdBinder) {
        this.f55093c = instreamAdBinder;
        this.f55094d = new C6149a(instreamAdBinder);
        this.f55091a = new WeakReference<>(viewGroup);
        this.f55092b = list;
    }

    /* renamed from: a */
    public final void m28635a() {
        ViewGroup viewGroup = this.f55091a.get();
        if (viewGroup != null) {
            if (this.f55095e == null) {
                this.f55095e = new InstreamAdView(viewGroup.getContext());
                viewGroup.addView(this.f55095e, new ViewGroup.LayoutParams(-1, -1));
            }
            this.f55094d.m30358a(this.f55095e, this.f55092b);
        }
    }

    /* renamed from: b */
    public final void m28639b() {
        InstreamAdView instreamAdView;
        ViewGroup viewGroup = this.f55091a.get();
        if (viewGroup != null && (instreamAdView = this.f55095e) != null) {
            viewGroup.removeView(instreamAdView);
        }
        this.f55095e = null;
        this.f55093c.setInstreamAdListener(null);
        this.f55093c.unbind();
        this.f55093c.invalidateAdPlayer();
        this.f55093c.invalidateVideoPlayer();
    }

    /* renamed from: a */
    public final void m28638a(@Nullable xc1 xc1Var) {
        this.f55093c.setVideoAdPlaybackListener(xc1Var);
    }

    /* renamed from: a */
    public final void m28636a(@Nullable qb1 qb1Var) {
        this.f55094d.m30356a(qb1Var);
    }

    /* renamed from: a */
    public final void m28637a(@Nullable rb1 rb1Var) {
        this.f55094d.m30357a(rb1Var);
    }
}
