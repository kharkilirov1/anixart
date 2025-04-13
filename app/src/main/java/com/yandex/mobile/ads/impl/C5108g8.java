package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.core.identifiers.p024ad.huawei.C4664a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.yandex.mobile.ads.impl.g8 */
/* loaded from: classes3.dex */
final class C5108g8 {

    /* renamed from: a */
    @NonNull
    private final ExecutorService f50520a = Executors.newSingleThreadExecutor(new dh0("YandexMobileAds.AdvertisingId"));

    /* renamed from: b */
    @NonNull
    private final C5891ux f50521b;

    /* renamed from: c */
    @NonNull
    private final C4664a f50522c;

    /* renamed from: d */
    @NonNull
    private final C5767sx f50523d;

    /* renamed from: com.yandex.mobile.ads.impl.g8$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC5009e8 f50524b;

        public a(InterfaceC5009e8 interfaceC5009e8) {
            this.f50524b = interfaceC5009e8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C4796a8 m24817a = C5108g8.m24817a(C5108g8.this);
            if (m24817a.m22397a() == null && m24817a.m22398b() == null) {
                ((C4908c8) this.f50524b).m23069a();
            } else {
                ((C4908c8) this.f50524b).m23070a(m24817a);
            }
        }
    }

    public C5108g8(@NonNull Context context) {
        this.f50521b = new C5891ux(context);
        this.f50523d = C5823tx.m28765a(context);
        this.f50522c = new C4664a(context);
    }

    /* renamed from: a */
    public final void m24818a(@NonNull InterfaceC5009e8 interfaceC5009e8) {
        this.f50520a.execute(new a(interfaceC5009e8));
    }

    /* renamed from: a */
    public static C4796a8 m24817a(C5108g8 c5108g8) {
        C6061y7 m29145a = c5108g8.f50521b.m29145a();
        C6061y7 m21974a = c5108g8.f50522c.m21974a();
        c5108g8.f50523d.m28368b(m29145a);
        return new C4796a8(m29145a, m21974a, c5108g8.f50523d.m28367a(m29145a));
    }
}
