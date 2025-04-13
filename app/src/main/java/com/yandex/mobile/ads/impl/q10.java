package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.u10;
import com.yandex.mobile.ads.impl.vm0;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class q10 {

    /* renamed from: a */
    @NonNull
    private final u10 f53895a;

    /* renamed from: b */
    @NonNull
    private final vm0.InterfaceC5930c f53896b;

    /* renamed from: com.yandex.mobile.ads.impl.q10$a */
    public static class C5615a {

        /* renamed from: b */
        @NonNull
        private final u10 f53898b;

        /* renamed from: c */
        @NonNull
        private final AtomicInteger f53899c;

        /* renamed from: d */
        @NonNull
        private final Set<z10> f53900d;

        /* renamed from: e */
        @NonNull
        private final i20 f53901e;

        /* renamed from: a */
        @NonNull
        private final Handler f53897a = new Handler(Looper.getMainLooper());

        /* renamed from: f */
        @NonNull
        private final vd0 f53902f = new vd0();

        /* renamed from: com.yandex.mobile.ads.impl.q10$a$a */
        public class a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ String f53903b;

            /* renamed from: c */
            public final /* synthetic */ Map f53904c;

            /* renamed from: d */
            public final /* synthetic */ z10 f53905d;

            /* renamed from: e */
            public final /* synthetic */ int f53906e;

            /* renamed from: f */
            public final /* synthetic */ int f53907f;

            public a(String str, HashMap hashMap, z10 z10Var, int i2, int i3) {
                this.f53903b = str;
                this.f53904c = hashMap;
                this.f53905d = z10Var;
                this.f53906e = i2;
                this.f53907f = i3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C5615a.this.f53898b.m28819a(this.f53903b, new C7016a(), this.f53906e, this.f53907f);
            }

            /* renamed from: com.yandex.mobile.ads.impl.q10$a$a$a, reason: collision with other inner class name */
            public class C7016a implements u10.InterfaceC5836d {
                public C7016a() {
                }

                @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5821a
                /* renamed from: a */
                public final void mo22923a(@NonNull qh1 qh1Var) {
                    n60.m26809b("Failed to download a native ads image:", qh1Var);
                    a aVar = a.this;
                    C5615a.m27598a(C5615a.this, aVar.f53904c);
                }

                @Override // com.yandex.mobile.ads.impl.u10.InterfaceC5836d
                /* renamed from: a */
                public final void mo25927a(u10.C5835c c5835c, boolean z) {
                    String m30042d = a.this.f53905d.m30042d();
                    Bitmap m28834b = c5835c.m28834b();
                    if (m28834b != null) {
                        if (m30042d != null) {
                            a.this.f53904c.put(m30042d, m28834b);
                        }
                        a aVar = a.this;
                        C5615a.m27598a(C5615a.this, aVar.f53904c);
                    }
                }
            }
        }

        public C5615a(@NonNull u10 u10Var, @NonNull HashSet hashSet, @NonNull i20 i20Var) {
            this.f53898b = u10Var;
            this.f53900d = hashSet;
            this.f53901e = i20Var;
            this.f53899c = new AtomicInteger(hashSet.size());
        }

        /* renamed from: a */
        public final void m27599a() {
            HashMap hashMap = new HashMap();
            for (z10 z10Var : this.f53900d) {
                String m30042d = z10Var.m30042d();
                int m30034a = z10Var.m30034a();
                int m30043e = z10Var.m30043e();
                boolean z = true;
                n60.m26812e("Loading image ... %s", m30042d);
                int m30034a2 = z10Var.m30034a();
                int m30043e2 = z10Var.m30043e();
                Objects.requireNonNull(this.f53902f);
                Runtime runtime = Runtime.getRuntime();
                float maxMemory = Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
                float f2 = (m30034a2 * m30043e2 * 4) + 1048576.0f;
                if (maxMemory < f2) {
                    n60.m26811d("Not enough free memory to create bitmap. FreeMemory = " + maxMemory + ", RequiredMemory = " + f2, new Object[0]);
                    z = false;
                }
                if (z) {
                    this.f53897a.post(new a(m30042d, hashMap, z10Var, m30043e, m30034a));
                } else if (this.f53899c.decrementAndGet() == 0) {
                    this.f53901e.mo25427a(hashMap);
                }
            }
        }

        /* renamed from: a */
        public static void m27598a(C5615a c5615a, Map map) {
            if (c5615a.f53899c.decrementAndGet() == 0) {
                c5615a.f53901e.mo25427a(map);
            }
        }
    }

    public q10(Context context) {
        vm0 m29239c = vm0.m29239c(context);
        this.f53895a = m29239c.m29240a();
        this.f53896b = m29239c.m29241b();
    }

    /* renamed from: a */
    public final void m27596a(@NonNull HashSet hashSet, @NonNull i20 i20Var) {
        if (hashSet.size() == 0) {
            i20Var.mo25427a(Collections.emptyMap());
        } else {
            new C5615a(this.f53895a, hashSet, i20Var).m27599a();
        }
    }

    /* renamed from: a */
    public final void m27595a(@NonNull HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Bitmap bitmap = (Bitmap) entry.getValue();
            if (bitmap != null) {
                this.f53896b.mo23081a(str, bitmap);
            }
        }
    }
}
