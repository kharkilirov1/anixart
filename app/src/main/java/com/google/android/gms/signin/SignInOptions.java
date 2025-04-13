package com.google.android.gms.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {

    /* renamed from: b */
    @NonNull
    public static final SignInOptions f17203b = new SignInOptions();

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        Objects.requireNonNull((SignInOptions) obj);
        return com.google.android.gms.common.internal.Objects.m8123a(null, null) && com.google.android.gms.common.internal.Objects.m8123a(null, null) && com.google.android.gms.common.internal.Objects.m8123a(null, null) && com.google.android.gms.common.internal.Objects.m8123a(null, null) && com.google.android.gms.common.internal.Objects.m8123a(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }
}
