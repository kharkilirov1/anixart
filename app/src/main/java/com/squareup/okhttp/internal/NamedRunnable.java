package com.squareup.okhttp.internal;

/* loaded from: classes2.dex */
public abstract class NamedRunnable implements Runnable {

    /* renamed from: b */
    public final String f24956b;

    public NamedRunnable(String str, Object... objArr) {
        this.f24956b = String.format(str, objArr);
    }

    /* renamed from: a */
    public abstract void mo13883a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f24956b);
        try {
            mo13883a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
