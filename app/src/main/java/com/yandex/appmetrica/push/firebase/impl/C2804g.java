package com.yandex.appmetrica.push.firebase.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseOptions;
import com.yandex.metrica.push.common.utils.CoreUtils;

/* renamed from: com.yandex.appmetrica.push.firebase.impl.g */
/* loaded from: classes2.dex */
public class C2804g {

    /* renamed from: a */
    @Nullable
    private final String f30852a;

    /* renamed from: b */
    @Nullable
    private final String f30853b;

    /* renamed from: c */
    @Nullable
    private final String f30854c;

    /* renamed from: d */
    @Nullable
    private final String f30855d;

    public C2804g(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f30852a = str;
        this.f30853b = str2;
        this.f30854c = str3;
        this.f30855d = str4;
    }

    /* renamed from: a */
    public boolean m16558a() {
        return TextUtils.isEmpty(this.f30853b) && TextUtils.isEmpty(this.f30854c);
    }

    /* renamed from: b */
    public boolean m16559b() {
        return (TextUtils.isEmpty(this.f30853b) || TextUtils.isEmpty(this.f30854c)) ? false : true;
    }

    @NonNull
    /* renamed from: c */
    public FirebaseOptions m16560c() {
        FirebaseOptions.Builder builder = new FirebaseOptions.Builder();
        String str = this.f30853b;
        Preconditions.m8130e(str, "ApplicationId must be set.");
        builder.f22281b = str;
        builder.f22282c = this.f30854c;
        if (CoreUtils.isNotEmpty(this.f30852a)) {
            String str2 = this.f30852a;
            Preconditions.m8130e(str2, "ApiKey must be set.");
            builder.f22280a = str2;
        }
        if (CoreUtils.isNotEmpty(this.f30855d)) {
            builder.f22283d = this.f30855d;
        }
        return new FirebaseOptions(builder.f22281b, builder.f22280a, null, null, builder.f22282c, null, builder.f22283d);
    }
}
