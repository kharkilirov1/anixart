package com.yandex.mobile.ads.exo.offline;

import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5352kq;

/* renamed from: com.yandex.mobile.ads.exo.offline.b */
/* loaded from: classes2.dex */
public final class C4777b {

    /* renamed from: a */
    public final DownloadRequest f48203a;

    /* renamed from: b */
    public final int f48204b;

    /* renamed from: c */
    public final long f48205c;

    /* renamed from: d */
    public final long f48206d;

    /* renamed from: e */
    public final long f48207e;

    /* renamed from: f */
    public final int f48208f;

    /* renamed from: g */
    public final int f48209g;

    /* renamed from: h */
    public final C5352kq f48210h;

    public C4777b(DownloadRequest downloadRequest, int i2, long j2, long j3, int i3) {
        this(downloadRequest, i2, j2, j3, -1L, i3, 0, new C5352kq());
    }

    public C4777b(DownloadRequest downloadRequest, int i2, long j2, long j3, long j4, int i3, int i4, C5352kq c5352kq) {
        C5220ia.m25469a(c5352kq);
        C5220ia.m25473a((i4 == 0) == (i2 != 4));
        if (i3 != 0) {
            C5220ia.m25473a((i2 == 2 || i2 == 0) ? false : true);
        }
        this.f48203a = downloadRequest;
        this.f48204b = i2;
        this.f48205c = j2;
        this.f48206d = j3;
        this.f48207e = j4;
        this.f48208f = i3;
        this.f48209g = i4;
        this.f48210h = c5352kq;
    }
}
