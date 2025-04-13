package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class Wrappers {

    /* renamed from: b */
    public static Wrappers f15915b = new Wrappers();

    /* renamed from: a */
    @Nullable
    public PackageManagerWrapper f15916a = null;

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static PackageManagerWrapper m8251a(@NonNull Context context) {
        PackageManagerWrapper packageManagerWrapper;
        Wrappers wrappers = f15915b;
        synchronized (wrappers) {
            if (wrappers.f15916a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                wrappers.f15916a = new PackageManagerWrapper(context);
            }
            packageManagerWrapper = wrappers.f15916a;
        }
        return packageManagerWrapper;
    }
}
