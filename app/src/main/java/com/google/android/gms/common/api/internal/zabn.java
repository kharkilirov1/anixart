package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zabn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f15520b;

    /* renamed from: c */
    public final /* synthetic */ zabq f15521c;

    public zabn(zabq zabqVar, int i2) {
        this.f15521c = zabqVar;
        this.f15520b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15521c.m8053g(this.f15520b);
    }
}
