package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzaf implements zzae {

    /* renamed from: b */
    public final Object f17244b;

    /* renamed from: c */
    public final int f17245c;

    /* renamed from: d */
    public final zzw<Void> f17246d;

    /* renamed from: e */
    @GuardedBy
    public int f17247e;

    /* renamed from: f */
    @GuardedBy
    public int f17248f;

    /* renamed from: g */
    @GuardedBy
    public int f17249g;

    /* renamed from: h */
    @GuardedBy
    public Exception f17250h;

    /* renamed from: i */
    @GuardedBy
    public boolean f17251i;

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: a */
    public final void mo7337a(@NonNull Exception exc) {
        synchronized (this.f17244b) {
            this.f17248f++;
            this.f17250h = exc;
            m9726b();
        }
    }

    @GuardedBy
    /* renamed from: b */
    public final void m9726b() {
        if (this.f17247e + this.f17248f + this.f17249g == this.f17245c) {
            if (this.f17250h == null) {
                if (this.f17251i) {
                    this.f17246d.m9733v();
                    return;
                } else {
                    this.f17246d.m9732u(null);
                    return;
                }
            }
            zzw<Void> zzwVar = this.f17246d;
            int i2 = this.f17248f;
            int i3 = this.f17245c;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i3);
            sb.append(" underlying tasks failed");
            zzwVar.m9731t(new ExecutionException(sb.toString(), this.f17250h));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* renamed from: c */
    public final void mo9695c() {
        synchronized (this.f17244b) {
            this.f17249g++;
            this.f17251i = true;
            m9726b();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        synchronized (this.f17244b) {
            this.f17247e++;
            m9726b();
        }
    }
}
