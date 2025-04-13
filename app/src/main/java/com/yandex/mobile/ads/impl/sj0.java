package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6198a;
import com.yandex.mobile.ads.nativeads.C6214i;
import com.yandex.mobile.ads.nativeads.C6232r;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class sj0 {

    /* renamed from: a */
    @NonNull
    private final rj0 f54693a = new rj0();

    /* renamed from: b */
    @NonNull
    private final C5058f6 f54694b = new C5058f6();

    /* renamed from: c */
    @NonNull
    private final C6214i f54695c = new C6214i();

    @NonNull
    /* renamed from: a */
    public final ArrayList m28281a(@NonNull Context context, @NonNull kh0 kh0Var, @NonNull w10 w10Var, @NonNull di0 di0Var, @NonNull C5461mv c5461mv) {
        ArrayList arrayList = new ArrayList();
        List<eh0> m27736d = kh0Var.m26128c().m27736d();
        yl0 m23891d = di0Var.m23891d();
        for (eh0 eh0Var : m27736d) {
            xl0 mo29951a = m23891d.mo29951a(eh0Var);
            C6232r c6232r = new C6232r(context, eh0Var, w10Var, mo29951a);
            zl0 m24320a = this.f54694b.m24320a(eh0Var);
            Objects.requireNonNull(this.f54695c);
            C6198a m30557a = C6214i.m30557a(context, kh0Var, m24320a, mo29951a, di0Var, c5461mv, eh0Var);
            Objects.requireNonNull(this.f54693a);
            arrayList.add(rj0.m27935a().mo27742a(context, eh0Var, c6232r, w10Var, m30557a));
        }
        return arrayList;
    }
}
