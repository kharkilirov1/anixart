package com.google.android.gms.common.internal;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public abstract class zzc<TListener> {

    /* renamed from: a */
    @Nullable
    public TListener f15795a;

    /* renamed from: b */
    public boolean f15796b = false;

    /* renamed from: c */
    public final /* synthetic */ BaseGmsClient f15797c;

    public zzc(BaseGmsClient baseGmsClient, TListener tlistener) {
        this.f15797c = baseGmsClient;
        this.f15795a = tlistener;
    }

    /* renamed from: a */
    public abstract void mo8192a(TListener tlistener);

    /* renamed from: b */
    public abstract void mo8193b();

    /* renamed from: c */
    public final void m8198c() {
        synchronized (this) {
            this.f15795a = null;
        }
        synchronized (this.f15797c.f15667q) {
            this.f15797c.f15667q.remove(this);
        }
    }
}
