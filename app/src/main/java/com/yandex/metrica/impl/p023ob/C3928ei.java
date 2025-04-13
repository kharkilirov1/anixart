package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.ei */
/* loaded from: classes2.dex */
public class C3928ei {

    /* renamed from: a */
    @NonNull
    private final Context f45058a;

    /* renamed from: b */
    @NonNull
    private final C4136mi f45059b;

    /* renamed from: c */
    @NonNull
    private final C3673Uh f45060c;

    /* renamed from: d */
    @Nullable
    private RunnableC4058ji f45061d;

    /* renamed from: e */
    @Nullable
    private RunnableC4058ji f45062e;

    /* renamed from: f */
    @Nullable
    private C3575Qi f45063f;

    public C3928ei(@NonNull Context context) {
        this(context, new C4136mi(), new C3673Uh(context));
    }

    /* renamed from: a */
    public synchronized void m19821a(@NonNull C3575Qi c3575Qi) {
        this.f45063f = c3575Qi;
        RunnableC4058ji runnableC4058ji = this.f45061d;
        if (runnableC4058ji == null) {
            C4136mi c4136mi = this.f45059b;
            Context context = this.f45058a;
            Objects.requireNonNull(c4136mi);
            this.f45061d = new RunnableC4058ji(context, c3575Qi, new C3598Rh(), new C4084ki(c4136mi), new C3723Wh("open", "http"), new C3723Wh("port_already_in_use", "http"), "Http");
        } else {
            runnableC4058ji.m20148a(c3575Qi);
        }
        this.f45060c.m19254a(c3575Qi, this);
    }

    /* renamed from: b */
    public synchronized void m19823b() {
        RunnableC4058ji runnableC4058ji = this.f45061d;
        if (runnableC4058ji != null) {
            runnableC4058ji.m20154b();
        }
        RunnableC4058ji runnableC4058ji2 = this.f45062e;
        if (runnableC4058ji2 != null) {
            runnableC4058ji2.m20154b();
        }
    }

    @VisibleForTesting
    public C3928ei(@NonNull Context context, @NonNull C4136mi c4136mi, @NonNull C3673Uh c3673Uh) {
        this.f45058a = context;
        this.f45059b = c4136mi;
        this.f45060c = c3673Uh;
    }

    /* renamed from: b */
    public synchronized void m19824b(@NonNull C3575Qi c3575Qi) {
        this.f45063f = c3575Qi;
        this.f45060c.m19254a(c3575Qi, this);
        RunnableC4058ji runnableC4058ji = this.f45061d;
        if (runnableC4058ji != null) {
            runnableC4058ji.m20156b(c3575Qi);
        }
        RunnableC4058ji runnableC4058ji2 = this.f45062e;
        if (runnableC4058ji2 != null) {
            runnableC4058ji2.m20156b(c3575Qi);
        }
    }

    /* renamed from: a */
    public synchronized void m19820a() {
        RunnableC4058ji runnableC4058ji = this.f45061d;
        if (runnableC4058ji != null) {
            runnableC4058ji.m20147a();
        }
        RunnableC4058ji runnableC4058ji2 = this.f45062e;
        if (runnableC4058ji2 != null) {
            runnableC4058ji2.m20147a();
        }
    }

    /* renamed from: a */
    public synchronized void m19822a(@NonNull File file) {
        RunnableC4058ji runnableC4058ji = this.f45062e;
        if (runnableC4058ji == null) {
            C4136mi c4136mi = this.f45059b;
            Context context = this.f45058a;
            C3575Qi c3575Qi = this.f45063f;
            Objects.requireNonNull(c4136mi);
            this.f45062e = new RunnableC4058ji(context, c3575Qi, new C3698Vh(file), new C4110li(c4136mi), new C3723Wh("open", "https"), new C3723Wh("port_already_in_use", "https"), "Https");
        } else {
            runnableC4058ji.m20148a(this.f45063f);
        }
    }
}
