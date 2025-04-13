package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* renamed from: com.yandex.mobile.ads.impl.ak */
/* loaded from: classes3.dex */
public final class C4813ak {

    /* renamed from: a */
    private boolean f48597a;

    public C4813ak() {
        this(0);
    }

    /* renamed from: a */
    public final synchronized void m22531a() throws InterruptedException {
        while (!this.f48597a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void m22533b() {
        boolean z = false;
        while (!this.f48597a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final synchronized void m22534c() {
        this.f48597a = false;
    }

    /* renamed from: d */
    public final synchronized boolean m22535d() {
        return this.f48597a;
    }

    /* renamed from: e */
    public final synchronized boolean m22536e() {
        if (this.f48597a) {
            return false;
        }
        this.f48597a = true;
        notifyAll();
        return true;
    }

    public C4813ak(int i2) {
    }

    /* renamed from: a */
    public final synchronized boolean m22532a(long j2) throws InterruptedException {
        if (j2 <= 0) {
            return this.f48597a;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = j2 + elapsedRealtime;
        if (j3 < elapsedRealtime) {
            m22531a();
        } else {
            while (!this.f48597a && elapsedRealtime < j3) {
                wait(j3 - elapsedRealtime);
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        return this.f48597a;
    }
}
