package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zabs {

    /* renamed from: a */
    public final ApiKey<?> f15537a;

    /* renamed from: b */
    public final Feature f15538b;

    public /* synthetic */ zabs(ApiKey apiKey, Feature feature) {
        this.f15537a = apiKey;
        this.f15538b = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof zabs)) {
            zabs zabsVar = (zabs) obj;
            if (Objects.m8123a(this.f15537a, zabsVar.f15537a) && Objects.m8123a(this.f15538b, zabsVar.f15538b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15537a, this.f15538b});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m8124a("key", this.f15537a);
        toStringHelper.m8124a("feature", this.f15538b);
        return toStringHelper.toString();
    }
}
