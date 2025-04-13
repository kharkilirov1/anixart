package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s2 */
/* loaded from: classes3.dex */
public final class C5723s2 {

    /* renamed from: a */
    @NotNull
    private final List<C4790a3> f54481a;

    /* renamed from: b */
    private int f54482b;

    public C5723s2(@NotNull ArrayList adGroupPlaybackItems) {
        Intrinsics.m32179h(adGroupPlaybackItems, "adGroupPlaybackItems");
        this.f54481a = adGroupPlaybackItems;
    }

    @Nullable
    /* renamed from: a */
    public final C4790a3 m28041a(@NotNull hc1<VideoAd> videoAdInfo) {
        Object obj;
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Iterator<T> it = this.f54481a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.m32174c(((C4790a3) obj).m22368c(), videoAdInfo)) {
                break;
            }
        }
        return (C4790a3) obj;
    }

    @Nullable
    /* renamed from: b */
    public final hc1<VideoAd> m28043b() {
        C4790a3 m28040a = m28040a(this.f54482b);
        if (m28040a != null) {
            return m28040a.m22368c();
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public final i50 m28044c() {
        C4790a3 m28040a = m28040a(this.f54482b);
        if (m28040a != null) {
            return m28040a.m22366a();
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public final tf1 m28045d() {
        C4790a3 m28040a = m28040a(this.f54482b);
        if (m28040a != null) {
            return m28040a.m22369d();
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public final C4790a3 m28046e() {
        return m28040a(this.f54482b + 1);
    }

    @Nullable
    /* renamed from: f */
    public final C4790a3 m28047f() {
        int i2 = this.f54482b + 1;
        this.f54482b = i2;
        return m28040a(i2);
    }

    /* renamed from: a */
    public final void m28042a() {
        this.f54482b = this.f54481a.size();
    }

    /* renamed from: a */
    private final C4790a3 m28040a(int i2) {
        return (C4790a3) CollectionsKt.m32048y(this.f54481a, i2);
    }
}
