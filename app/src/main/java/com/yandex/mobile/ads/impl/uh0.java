package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.gk0;
import com.yandex.mobile.ads.impl.uh0;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class uh0 {

    /* renamed from: a */
    @NonNull
    private final ExecutorService f55494a = Executors.newSingleThreadExecutor(new dh0("YandexMobileAds.BaseController"));

    /* renamed from: b */
    @NonNull
    private final C5101g2 f55495b;

    /* renamed from: c */
    @NonNull
    private final wh0 f55496c;

    /* renamed from: d */
    @NonNull
    private final gk0 f55497d;

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.uh0$a */
    public class RunnableC5862a implements Runnable {

        /* renamed from: b */
        @NonNull
        private final di0 f55498b;

        /* renamed from: c */
        @NonNull
        private final WeakReference<Context> f55499c;

        /* renamed from: d */
        @NonNull
        private final AdResponse<?> f55500d;

        /* renamed from: e */
        @Nullable
        private final qi0 f55501e;

        /* renamed from: f */
        @NonNull
        private final th0 f55502f;

        public RunnableC5862a(Context context, @NonNull AdResponse<?> adResponse, @NonNull qi0 qi0Var, @Nullable di0 di0Var, @NonNull th0 th0Var) {
            this.f55500d = adResponse;
            this.f55501e = qi0Var;
            this.f55498b = di0Var;
            this.f55499c = new WeakReference<>(context);
            this.f55502f = th0Var;
        }

        /* renamed from: a */
        private void m29000a(@NonNull final Context context, @NonNull C5101g2 c5101g2, @NonNull final kh0 kh0Var, @NonNull final th0 th0Var) {
            uh0.this.f55497d.m24909a(context, c5101g2, kh0Var, new gk0.InterfaceC5132a() { // from class: com.yandex.mobile.ads.impl.gq1
                @Override // com.yandex.mobile.ads.impl.gk0.InterfaceC5132a
                /* renamed from: a */
                public final void mo24910a(w10 w10Var) {
                    uh0.RunnableC5862a.this.m29001a(context, kh0Var, th0Var, w10Var);
                }
            });
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = this.f55499c.get();
            if (context != null) {
                try {
                    qi0 qi0Var = this.f55501e;
                    if (qi0Var == null) {
                        this.f55502f.mo25215a(AbstractC5524o4.f53152d);
                        return;
                    }
                    boolean z = true;
                    Collection[] collectionArr = {qi0Var.m27736d()};
                    int i2 = 0;
                    while (true) {
                        if (i2 < 1) {
                            Collection collection = collectionArr[i2];
                            if (collection == null || collection.isEmpty()) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        this.f55502f.mo25215a(AbstractC5524o4.f53160l);
                    } else {
                        m29000a(context, uh0.this.f55495b, new kh0(this.f55501e, this.f55500d, uh0.this.f55495b), this.f55502f);
                    }
                } catch (Exception e2) {
                    n60.m26808a(e2, e2.toString(), new Object[0]);
                    this.f55502f.mo25215a(AbstractC5524o4.f53152d);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m29001a(Context context, kh0 kh0Var, th0 th0Var, w10 w10Var) {
            uh0.this.f55496c.m29483a(context, kh0Var, w10Var, this.f55498b, th0Var);
        }
    }

    public uh0(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull C5724s3 c5724s3) {
        this.f55495b = c5101g2;
        this.f55496c = new wh0(c5101g2);
        this.f55497d = new gk0(context, c5724s3);
    }

    /* renamed from: a */
    public final void m28999a(@NonNull Context context, @NonNull AdResponse<?> adResponse, @Nullable qi0 qi0Var, @NonNull di0 di0Var, @NonNull th0 th0Var) {
        this.f55494a.execute(new RunnableC5862a(context, adResponse, qi0Var, di0Var, th0Var));
    }

    /* renamed from: a */
    public final void m28998a() {
        this.f55497d.m24908a();
    }
}
