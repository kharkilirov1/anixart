package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaf extends zag {

    /* renamed from: b */
    public final /* synthetic */ Intent f15761b;

    /* renamed from: c */
    public final /* synthetic */ LifecycleFragment f15762c;

    public zaf(Intent intent, LifecycleFragment lifecycleFragment) {
        this.f15761b = intent;
        this.f15762c = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    /* renamed from: a */
    public final void mo8184a() {
        Intent intent = this.f15761b;
        if (intent != null) {
            this.f15762c.startActivityForResult(intent, 2);
        }
    }
}
