package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.C3130i;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.qg */
/* loaded from: classes2.dex */
public class C4238qg {

    /* renamed from: a */
    private final Map<String, C4212pg> f46239a = new HashMap();

    /* renamed from: b */
    @NonNull
    private final C4316tg f46240b;

    /* renamed from: c */
    @NonNull
    private final InterfaceExecutorC4297sn f46241c;

    /* renamed from: com.yandex.metrica.impl.ob.qg$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f46242a;

        public a(Context context) {
            this.f46242a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4316tg c4316tg = C4238qg.this.f46240b;
            Context context = this.f46242a;
            Objects.requireNonNull(c4316tg);
            C4095l3.m20318a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qg$b */
    public static class b {

        /* renamed from: a */
        private static final C4238qg f46244a = new C4238qg(C3755Y.m19410g().m19413c(), new C4316tg());
    }

    @VisibleForTesting
    public C4238qg(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4316tg c4316tg) {
        this.f46241c = interfaceExecutorC4297sn;
        this.f46240b = c4316tg;
    }

    @NonNull
    /* renamed from: b */
    private C4212pg m20591b(@NonNull Context context, @NonNull String str) {
        Objects.requireNonNull(this.f46240b);
        if (C4095l3.m20332k() == null) {
            ((C4271rn) this.f46241c).execute(new a(context));
        }
        C4212pg c4212pg = new C4212pg(this.f46241c, context, str);
        this.f46239a.put(str, c4212pg);
        return c4212pg;
    }

    @NonNull
    /* renamed from: a */
    public static C4238qg m20589a() {
        return b.f46244a;
    }

    @NonNull
    /* renamed from: a */
    public C4212pg m20593a(@NonNull Context context, @NonNull String str) {
        C4212pg c4212pg = this.f46239a.get(str);
        if (c4212pg == null) {
            synchronized (this.f46239a) {
                c4212pg = this.f46239a.get(str);
                if (c4212pg == null) {
                    C4212pg m20591b = m20591b(context, str);
                    m20591b.m20556d(str);
                    c4212pg = m20591b;
                }
            }
        }
        return c4212pg;
    }

    @NonNull
    /* renamed from: a */
    public C4212pg m20592a(@NonNull Context context, @NonNull C3130i c3130i) {
        C4212pg c4212pg = this.f46239a.get(c3130i.apiKey);
        if (c4212pg == null) {
            synchronized (this.f46239a) {
                c4212pg = this.f46239a.get(c3130i.apiKey);
                if (c4212pg == null) {
                    C4212pg m20591b = m20591b(context, c3130i.apiKey);
                    m20591b.m20555a(c3130i);
                    c4212pg = m20591b;
                }
            }
        }
        return c4212pg;
    }
}
