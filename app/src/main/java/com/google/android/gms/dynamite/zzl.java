package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzl implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo8293a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int mo8294a;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int mo8295b = iVersions.mo8295b(context, str);
        selectionResult.f15969a = mo8295b;
        int i2 = 0;
        if (mo8295b != 0) {
            mo8294a = iVersions.mo8294a(context, str, false);
            selectionResult.f15970b = mo8294a;
        } else {
            mo8294a = iVersions.mo8294a(context, str, true);
            selectionResult.f15970b = mo8294a;
        }
        int i3 = selectionResult.f15969a;
        if (i3 != 0) {
            i2 = i3;
        } else if (mo8294a == 0) {
            selectionResult.f15971c = 0;
            return selectionResult;
        }
        if (mo8294a >= i2) {
            selectionResult.f15971c = 1;
        } else {
            selectionResult.f15971c = -1;
        }
        return selectionResult;
    }
}
