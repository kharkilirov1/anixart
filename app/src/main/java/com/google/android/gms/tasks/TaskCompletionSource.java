package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
public class TaskCompletionSource<TResult> {

    /* renamed from: a */
    public final zzw<TResult> f17240a = new zzw<>();

    /* renamed from: a */
    public void m9715a(@NonNull Exception exc) {
        this.f17240a.m9731t(exc);
    }

    /* renamed from: b */
    public void m9716b(@Nullable TResult tresult) {
        this.f17240a.m9732u(tresult);
    }

    /* renamed from: c */
    public boolean m9717c(@NonNull Exception exc) {
        zzw<TResult> zzwVar = this.f17240a;
        Objects.requireNonNull(zzwVar);
        Preconditions.m8132g(exc, "Exception must not be null");
        synchronized (zzwVar.f17292a) {
            if (zzwVar.f17294c) {
                return false;
            }
            zzwVar.f17294c = true;
            zzwVar.f17297f = exc;
            zzwVar.f17293b.m9730b(zzwVar);
            return true;
        }
    }

    /* renamed from: d */
    public boolean m9718d(@Nullable TResult tresult) {
        return this.f17240a.m9734w(tresult);
    }
}
