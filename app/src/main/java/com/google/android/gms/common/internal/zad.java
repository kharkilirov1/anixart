package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zad extends zag {

    /* renamed from: b */
    public final /* synthetic */ Intent f15758b;

    /* renamed from: c */
    public final /* synthetic */ Activity f15759c;

    /* renamed from: d */
    public final /* synthetic */ int f15760d;

    public zad(Intent intent, Activity activity, int i2) {
        this.f15758b = intent;
        this.f15759c = activity;
        this.f15760d = i2;
    }

    @Override // com.google.android.gms.common.internal.zag
    /* renamed from: a */
    public final void mo8184a() {
        Intent intent = this.f15758b;
        if (intent != null) {
            this.f15759c.startActivityForResult(intent, this.f15760d);
        }
    }
}
