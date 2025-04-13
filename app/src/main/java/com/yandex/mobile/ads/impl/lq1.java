package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.mobile.ads.impl.wm0;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f52511b;

    /* renamed from: c */
    public final /* synthetic */ Object f52512c;

    /* renamed from: d */
    public final /* synthetic */ Object f52513d;

    /* renamed from: e */
    public final /* synthetic */ Object f52514e;

    /* renamed from: f */
    public final /* synthetic */ Object f52515f;

    public /* synthetic */ lq1(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f52511b = i2;
        this.f52512c = obj;
        this.f52513d = obj2;
        this.f52514e = obj3;
        this.f52515f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52511b) {
            case 0:
                ((wm0) this.f52512c).m29497a((Context) this.f52513d, (List) this.f52514e, (wm0.InterfaceC5980b) this.f52515f);
                break;
            case 1:
                C5297jp.m25921a((Ref.ObjectRef) this.f52512c, (C5297jp) this.f52513d, (String) this.f52514e, (DivImageDownloadCallback) this.f52515f);
                break;
            case 2:
                C5297jp.m25920a((Ref.ObjectRef) this.f52512c, (C5297jp) this.f52513d, (String) this.f52514e, (ImageView) this.f52515f);
                break;
            default:
                m60.m26580a((m60) this.f52512c, (qg1) this.f52513d, (lg1) this.f52514e, (C5101g2) this.f52515f);
                break;
        }
    }
}
