package com.yandex.div.internal.util;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import p000a.C0000a;

/* loaded from: classes2.dex */
public abstract class NamedRunnable implements Runnable {

    /* renamed from: b */
    @NonNull
    public final String f33888b;

    public NamedRunnable(@NonNull String str) {
        this.f33888b = str;
    }

    @WorkerThread
    /* renamed from: a */
    public abstract void mo17391a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread currentThread = Thread.currentThread();
        StringBuilder m27x = C0000a.m27x(name, "-");
        m27x.append(this.f33888b);
        currentThread.setName(m27x.toString());
        try {
            mo17391a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
