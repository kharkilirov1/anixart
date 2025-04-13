package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.exo.offline.C4780e;
import com.yandex.mobile.ads.exo.offline.DownloadRequest;
import com.yandex.mobile.ads.exo.offline.InterfaceC4779d;
import com.yandex.mobile.ads.impl.C4809ag;
import com.yandex.mobile.ads.impl.pb0;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.yandex.mobile.ads.impl.mn */
/* loaded from: classes3.dex */
public final class C5450mn implements InterfaceC5409lq {

    /* renamed from: c */
    private static final SparseArray<Constructor<? extends InterfaceC4779d>> f52710c;

    /* renamed from: a */
    private final C4809ag.b f52711a;

    /* renamed from: b */
    private final Executor f52712b;

    static {
        SparseArray<Constructor<? extends InterfaceC4779d>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, m26694a(Class.forName("com.yandex.mobile.ads.exo.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, m26694a(Class.forName("com.yandex.mobile.ads.exo.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, m26694a(Class.forName("com.yandex.mobile.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f52710c = sparseArray;
    }

    public C5450mn(C4809ag.b bVar, ExecutorService executorService) {
        this.f52711a = (C4809ag.b) C5220ia.m25469a(bVar);
        this.f52712b = (Executor) C5220ia.m25469a(executorService);
    }

    /* renamed from: a */
    public final InterfaceC4779d m26695a(DownloadRequest downloadRequest) {
        int m28091a = s91.m28091a(downloadRequest.f48180b, downloadRequest.f48181c);
        if (m28091a != 0 && m28091a != 1 && m28091a != 2) {
            if (m28091a == 4) {
                return new C4780e(new pb0.C5575a().m27211a(downloadRequest.f48180b).m27212a(downloadRequest.f48184f).m27214a(), this.f52711a, this.f52712b);
            }
            throw new IllegalArgumentException(k60.m26036a("Unsupported type: ", m28091a));
        }
        Constructor<? extends InterfaceC4779d> constructor = f52710c.get(m28091a);
        if (constructor == null) {
            throw new IllegalStateException(k60.m26036a("Module missing for content type ", m28091a));
        }
        try {
            return constructor.newInstance(new pb0.C5575a().m27211a(downloadRequest.f48180b).m27213a(downloadRequest.f48182d).m27212a(downloadRequest.f48184f).m27214a(), this.f52711a, this.f52712b);
        } catch (Exception unused) {
            throw new IllegalStateException(k60.m26036a("Failed to instantiate downloader for content type ", m28091a));
        }
    }

    /* renamed from: a */
    private static Constructor<? extends InterfaceC4779d> m26694a(Class<?> cls) {
        try {
            return cls.asSubclass(InterfaceC4779d.class).getConstructor(pb0.class, C4809ag.b.class, Executor.class);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException("Downloader constructor missing", e2);
        }
    }
}
