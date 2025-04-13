package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Arrays;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public final class AuthProxyOptions implements Api.ApiOptions.Optional {

    /* renamed from: b */
    public final Bundle f15047b;

    static {
        new Bundle();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthProxyOptions)) {
            return false;
        }
        Bundle bundle = this.f15047b;
        Bundle bundle2 = ((AuthProxyOptions) obj).f15047b;
        if (bundle == null || bundle2 == null) {
            if (bundle == bundle2) {
                return true;
            }
        } else if (bundle.size() == bundle2.size()) {
            Set<String> keySet = bundle.keySet();
            if (keySet.containsAll(bundle2.keySet())) {
                for (String str : keySet) {
                    if (!Objects.m8123a(bundle.get(str), bundle2.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15047b});
    }
}
