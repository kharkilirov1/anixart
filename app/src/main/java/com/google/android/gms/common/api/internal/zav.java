package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zav implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zaaa f15602b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f15602b.f15449i.lock();
        try {
            zaaa.m8012e(this.f15602b);
        } finally {
            this.f15602b.f15449i.unlock();
        }
    }
}
