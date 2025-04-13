package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f49729b;

    /* renamed from: c */
    public final /* synthetic */ Set f49730c;

    /* renamed from: d */
    public final /* synthetic */ VideoAd f49731d;

    public /* synthetic */ dq1(Set set, VideoAd videoAd, int i2) {
        this.f49729b = i2;
        this.f49730c = set;
        this.f49731d = videoAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49729b) {
            case 0:
                u30.m28851b(this.f49730c, this.f49731d);
                break;
            case 1:
                u30.m28854e(this.f49730c, this.f49731d);
                break;
            case 2:
                u30.m28853d(this.f49730c, this.f49731d);
                break;
            case 3:
                u30.m28858i(this.f49730c, this.f49731d);
                break;
            case 4:
                u30.m28857h(this.f49730c, this.f49731d);
                break;
            case 5:
                u30.m28848a(this.f49730c, this.f49731d);
                break;
            case 6:
                u30.m28856g(this.f49730c, this.f49731d);
                break;
            case 7:
                u30.m28852c(this.f49730c, this.f49731d);
                break;
            default:
                u30.m28855f(this.f49730c, this.f49731d);
                break;
        }
    }
}
