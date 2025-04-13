package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* loaded from: classes2.dex */
public class GetTokenResult {

    /* renamed from: a */
    @Nullable
    public String f22322a;

    /* renamed from: b */
    public Map<String, Object> f22323b;

    @KeepForSdk
    public GetTokenResult(@Nullable String str, @NonNull Map<String, Object> map) {
        this.f22322a = str;
        this.f22323b = map;
    }
}
