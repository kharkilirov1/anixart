package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzk implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo8293a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.f15969a = iVersions.mo8295b(context, str);
        int mo8294a = iVersions.mo8294a(context, str, true);
        selectionResult.f15970b = mo8294a;
        int i2 = selectionResult.f15969a;
        if (i2 == 0) {
            if (mo8294a == 0) {
                selectionResult.f15971c = 0;
                return selectionResult;
            }
            i2 = 0;
        }
        if (mo8294a >= i2) {
            selectionResult.f15971c = 1;
        } else {
            selectionResult.f15971c = -1;
        }
        return selectionResult;
    }
}
