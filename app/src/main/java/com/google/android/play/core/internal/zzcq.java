package com.google.android.play.core.internal;

import com.yandex.mobile.ads.C4632R;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzcq<T> implements zzcs, zzco {

    /* renamed from: c */
    public static final Object f20143c = new Object();

    /* renamed from: a */
    public volatile zzcs<T> f20144a;

    /* renamed from: b */
    public volatile Object f20145b = f20143c;

    public zzcq(zzcs<T> zzcsVar) {
        this.f20144a = zzcsVar;
    }

    /* renamed from: a */
    public static <P extends zzcs<T>, T> zzco<T> m10898a(P p) {
        if (p instanceof zzco) {
            return (zzco) p;
        }
        Objects.requireNonNull(p);
        return new zzcq(p);
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final T mo10658u() {
        T t = (T) this.f20145b;
        Object obj = f20143c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f20145b;
                if (t == obj) {
                    t = this.f20144a.mo10658u();
                    Object obj2 = this.f20145b;
                    if (obj2 != obj && obj2 != t) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(valueOf.length() + C4632R.styleable.AppCompatTheme_windowActionBarOverlay + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f20145b = t;
                    this.f20144a = null;
                }
            }
        }
        return t;
    }
}
