package com.yandex.mobile.ads.exo.drm;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.impl.InterfaceC5646ql;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.exo.drm.e */
/* loaded from: classes2.dex */
public interface InterfaceC4718e {

    /* renamed from: com.yandex.mobile.ads.exo.drm.e$a */
    public static class a extends IOException {

        /* renamed from: a */
        public final int f48019a;

        public a(Throwable th, int i2) {
            super(th);
            this.f48019a = i2;
        }
    }

    /* renamed from: a */
    void mo22106a(@Nullable InterfaceC4719f.a aVar);

    /* renamed from: a */
    boolean mo22108a(String str);

    /* renamed from: b */
    void mo22110b(@Nullable InterfaceC4719f.a aVar);

    /* renamed from: c */
    int mo22111c();

    /* renamed from: d */
    boolean mo22112d();

    @Nullable
    /* renamed from: e */
    Map<String, String> mo22113e();

    /* renamed from: f */
    UUID mo22114f();

    @Nullable
    /* renamed from: g */
    a mo22115g();

    @Nullable
    /* renamed from: h */
    InterfaceC5646ql mo22116h();
}
