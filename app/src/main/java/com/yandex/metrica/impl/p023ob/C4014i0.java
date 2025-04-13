package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.impl.p023ob.C4429y;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.i0 */
/* loaded from: classes2.dex */
public final class C4014i0 {

    /* renamed from: a */
    private Context f45307a;

    /* renamed from: b */
    private final C4429y.b f45308b;

    /* renamed from: c */
    private final C4429y f45309c;

    /* renamed from: d */
    private final IReporter f45310d;

    /* renamed from: com.yandex.metrica.impl.ob.i0$a */
    public static final class a implements C4429y.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C4429y.b
        /* renamed from: a */
        public final void mo17912a(@NotNull Activity activity, @NotNull C4429y.a aVar) {
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                C4014i0.this.f45310d.resumeSession();
            } else {
                if (ordinal != 2) {
                    return;
                }
                C4014i0.this.f45310d.pauseSession();
            }
        }
    }

    @JvmOverloads
    public C4014i0(@NotNull C4429y c4429y) {
        this(c4429y, null, 2);
    }

    @JvmOverloads
    public C4014i0(@NotNull C4429y c4429y, @NotNull IReporter iReporter) {
        this.f45309c = c4429y;
        this.f45310d = iReporter;
        this.f45308b = new a();
    }

    /* renamed from: a */
    public final synchronized void m20042a(@NotNull Context context) {
        if (this.f45307a == null) {
            Context applicationContext = context.getApplicationContext();
            this.f45309c.m21169a(applicationContext);
            this.f45309c.m21170a(this.f45308b, C4429y.a.RESUMED, C4429y.a.PAUSED);
            this.f45307a = applicationContext;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4014i0(com.yandex.metrica.impl.p023ob.C4429y r1, com.yandex.metrica.IReporter r2, int r3) {
        /*
            r0 = this;
            r2 = r3 & 2
            if (r2 == 0) goto Le
            com.yandex.metrica.impl.ob.W0 r2 = com.yandex.metrica.impl.p023ob.C3524Oh.m18679a()
            java.lang.String r3 = "YandexMetricaSelfReportFacade.getReporter()"
            kotlin.jvm.internal.Intrinsics.m32178g(r2, r3)
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4014i0.<init>(com.yandex.metrica.impl.ob.y, com.yandex.metrica.IReporter, int):void");
    }
}
