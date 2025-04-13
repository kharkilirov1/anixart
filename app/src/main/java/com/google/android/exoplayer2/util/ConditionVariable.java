package com.google.android.exoplayer2.util;

/* loaded from: classes.dex */
public class ConditionVariable {

    /* renamed from: a */
    public final Clock f14622a = Clock.f14615a;

    /* renamed from: b */
    public boolean f14623b;

    /* renamed from: a */
    public synchronized void m7534a() throws InterruptedException {
        while (!this.f14623b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized void m7535b() {
        boolean z = false;
        while (!this.f14623b) {
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
    public synchronized boolean m7536c() {
        boolean z;
        z = this.f14623b;
        this.f14623b = false;
        return z;
    }

    /* renamed from: d */
    public synchronized boolean m7537d() {
        return this.f14623b;
    }

    /* renamed from: e */
    public synchronized boolean m7538e() {
        if (this.f14623b) {
            return false;
        }
        this.f14623b = true;
        notifyAll();
        return true;
    }
}
