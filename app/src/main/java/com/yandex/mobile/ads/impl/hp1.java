package com.yandex.mobile.ads.impl;

import com.yandex.div.core.images.LoadReference;
import kotlin.jvm.internal.Ref;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp1 implements LoadReference {

    /* renamed from: a */
    public final /* synthetic */ int f51118a;

    /* renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f51119b;

    public /* synthetic */ hp1(Ref.ObjectRef objectRef, int i2) {
        this.f51118a = i2;
        this.f51119b = objectRef;
    }

    @Override // com.yandex.div.core.images.LoadReference
    public final void cancel() {
        switch (this.f51118a) {
            case 0:
                C5297jp.m25922b(this.f51119b);
                break;
            default:
                C5297jp.m25919a(this.f51119b);
                break;
        }
    }
}
