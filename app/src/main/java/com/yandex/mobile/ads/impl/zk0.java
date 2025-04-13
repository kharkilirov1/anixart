package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.exo.offline.C4778c;
import com.yandex.mobile.ads.exo.offline.DownloadRequest;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zk0 {

    /* renamed from: a */
    @NotNull
    private final C4778c f57224a;

    /* renamed from: b */
    @NotNull
    private final CopyOnWriteArrayList<String> f57225b;

    /* renamed from: c */
    @NotNull
    private final CopyOnWriteArrayList<be1> f57226c;

    public zk0(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        Context appContext = context.getApplicationContext();
        int i2 = ie1.f51286c;
        Intrinsics.m32178g(appContext, "appContext");
        this.f57224a = ie1.m25529b(appContext);
        this.f57225b = new CopyOnWriteArrayList<>();
        this.f57226c = new CopyOnWriteArrayList<>();
    }

    /* renamed from: a */
    public final void m30207a() {
        Iterator<String> it = this.f57225b.iterator();
        while (it.hasNext()) {
            this.f57224a.m22300a(it.next());
        }
        this.f57226c.clear();
    }

    /* renamed from: a */
    public final void m30208a(@NotNull String url, @NotNull be1 videoCacheListener) {
        Intrinsics.m32179h(url, "url");
        Intrinsics.m32179h(videoCacheListener, "videoCacheListener");
        Uri parse = Uri.parse(url);
        String valueOf = String.valueOf(g10.m24763a());
        DownloadRequest m22272a = new DownloadRequest.C4774b(parse, valueOf).m22272a();
        this.f57226c.add(videoCacheListener);
        this.f57225b.add(valueOf);
        this.f57224a.m22299a(new ki1(valueOf, videoCacheListener));
        this.f57224a.m22297a(m22272a);
        this.f57224a.m22296a();
    }
}
