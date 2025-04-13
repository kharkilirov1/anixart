package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class ApiKey<O extends Api.ApiOptions> {

    /* renamed from: a */
    public final int f15385a;

    /* renamed from: b */
    public final Api<O> f15386b;

    /* renamed from: c */
    @Nullable
    public final O f15387c;

    /* renamed from: d */
    @Nullable
    public final String f15388d;

    public ApiKey(Api<O> api, @Nullable O o, @Nullable String str) {
        this.f15386b = api;
        this.f15387c = o;
        this.f15388d = str;
        this.f15385a = Arrays.hashCode(new Object[]{api, o, str});
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.m8123a(this.f15386b, apiKey.f15386b) && Objects.m8123a(this.f15387c, apiKey.f15387c) && Objects.m8123a(this.f15388d, apiKey.f15388d);
    }

    public final int hashCode() {
        return this.f15385a;
    }
}
