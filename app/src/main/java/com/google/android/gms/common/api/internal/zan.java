package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zan extends zabw {

    /* renamed from: a */
    public final /* synthetic */ Dialog f15592a;

    /* renamed from: b */
    public final /* synthetic */ zao f15593b;

    public zan(zao zaoVar, Dialog dialog) {
        this.f15593b = zaoVar;
        this.f15592a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    /* renamed from: a */
    public final void mo8037a() {
        this.f15593b.f15595c.m8080n();
        if (this.f15592a.isShowing()) {
            this.f15592a.dismiss();
        }
    }
}
