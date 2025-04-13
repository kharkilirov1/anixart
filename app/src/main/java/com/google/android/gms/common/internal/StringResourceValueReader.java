package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.swiftsoft.anixartd.C2507R;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class StringResourceValueReader {

    /* renamed from: a */
    public final Resources f15744a;

    /* renamed from: b */
    public final String f15745b;

    public StringResourceValueReader(@NonNull Context context) {
        java.util.Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        this.f15744a = resources;
        this.f15745b = resources.getResourcePackageName(C2507R.string.common_google_play_services_unknown_issue);
    }

    @Nullable
    @KeepForSdk
    /* renamed from: a */
    public String m8136a(@NonNull String str) {
        int identifier = this.f15744a.getIdentifier(str, "string", this.f15745b);
        if (identifier == 0) {
            return null;
        }
        return this.f15744a.getString(identifier);
    }
}
