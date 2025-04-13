package com.airbnb.epoxy;

import android.util.Log;
import p000a.C0000a;

/* loaded from: classes.dex */
class DebugTimer implements Timer {

    /* renamed from: a */
    public final String f6890a;

    /* renamed from: b */
    public long f6891b = -1;

    /* renamed from: c */
    public String f6892c = null;

    public DebugTimer(String str) {
        this.f6890a = str;
    }

    @Override // com.airbnb.epoxy.Timer
    /* renamed from: a */
    public void mo4511a(String str) {
        if (this.f6891b != -1) {
            throw new IllegalStateException("Timer was already started");
        }
        this.f6891b = System.nanoTime();
        this.f6892c = str;
    }

    @Override // com.airbnb.epoxy.Timer
    public void stop() {
        if (this.f6891b == -1) {
            throw new IllegalStateException("Timer was not started");
        }
        Log.d(this.f6890a, String.format(C0000a.m20q(new StringBuilder(), this.f6892c, ": %.3fms"), Float.valueOf((System.nanoTime() - this.f6891b) / 1000000.0f)));
        this.f6891b = -1L;
        this.f6892c = null;
    }
}
