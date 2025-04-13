package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzo implements DynamiteModule.VersionPolicy.IVersions {

    /* renamed from: a */
    public final int f15975a;

    public zzo(int i2) {
        this.f15975a = i2;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* renamed from: a */
    public final int mo8294a(Context context, String str, boolean z) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    /* renamed from: b */
    public final int mo8295b(Context context, String str) {
        return this.f15975a;
    }
}
