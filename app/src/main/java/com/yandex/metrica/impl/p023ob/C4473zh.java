package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.InterfaceC3467Ma;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.zh */
/* loaded from: classes2.dex */
public class C4473zh {

    /* renamed from: a */
    @NonNull
    private InterfaceExecutorC4297sn f47120a;

    /* renamed from: b */
    @NonNull
    private final C3566Q9 f47121b;

    /* renamed from: c */
    @NonNull
    private b f47122c;

    /* renamed from: d */
    @NonNull
    private C3842ba f47123d;

    /* renamed from: e */
    @NonNull
    private final C3570Qd f47124e;

    /* renamed from: f */
    @NonNull
    private final C3504Nm f47125f;

    /* renamed from: g */
    @NonNull
    private final C3594Rd f47126g;

    /* renamed from: h */
    @Nullable
    private String f47127h;

    /* renamed from: com.yandex.metrica.impl.ob.zh$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4447yh f47128a;

        public a(C4447yh c4447yh) {
            this.f47128a = c4447yh;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4473zh c4473zh = C4473zh.this;
            C4473zh.m21298a(c4473zh, this.f47128a, c4473zh.f47127h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.zh$b */
    public static class b {

        /* renamed from: a */
        @NonNull
        private final C3374Ih f47130a;

        public b() {
            this(new C3374Ih());
        }

        @NonNull
        /* renamed from: a */
        public List<C3349Hh> m21305a(@Nullable byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            if (C3658U2.m19214a(bArr)) {
                return arrayList;
            }
            try {
                return this.f47130a.m18318a(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                return arrayList;
            }
        }

        @VisibleForTesting
        public b(@NonNull C3374Ih c3374Ih) {
            this.f47130a = c3374Ih;
        }
    }

    public C4473zh(@NonNull Context context, @Nullable String str, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(null, InterfaceC3467Ma.b.m18577a(C3274Eh.class).mo18575a(context), new b(), new C3570Qd(), interfaceExecutorC4297sn, new C3842ba(), new C3504Nm(), new C3594Rd(context));
    }

    /* renamed from: a */
    public void m21303a(@NonNull C4447yh c4447yh) {
        ((C4271rn) this.f47120a).execute(new a(c4447yh));
    }

    /* renamed from: b */
    public boolean m21304b(@NonNull C3575Qi c3575Qi) {
        return this.f47127h == null ? c3575Qi.m18831L() != null : !r0.equals(c3575Qi.m18831L());
    }

    @VisibleForTesting
    public C4473zh(@Nullable String str, @NonNull C3566Q9 c3566q9, @NonNull b bVar, @NonNull C3570Qd c3570Qd, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C3842ba c3842ba, @NonNull C3504Nm c3504Nm, @NonNull C3594Rd c3594Rd) {
        this.f47127h = str;
        this.f47121b = c3566q9;
        this.f47122c = bVar;
        this.f47124e = c3570Qd;
        this.f47120a = interfaceExecutorC4297sn;
        this.f47123d = c3842ba;
        this.f47125f = c3504Nm;
        this.f47126g = c3594Rd;
    }

    /* renamed from: a */
    public static void m21298a(C4473zh c4473zh, C4447yh c4447yh, String str) {
        if (!c4473zh.f47126g.mo18965a() || str == null) {
            return;
        }
        c4473zh.f47124e.m18815a(str, new C3174Ah(c4473zh, (C3274Eh) c4473zh.f47121b.m18782b(), c4447yh));
    }

    /* renamed from: a */
    public void m21302a(@Nullable C3575Qi c3575Qi) {
        if (c3575Qi != null) {
            this.f47127h = c3575Qi.m18831L();
        }
    }
}
