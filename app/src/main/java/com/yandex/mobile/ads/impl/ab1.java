package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.models.p026ad.JavaScriptResource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ab1 implements qf1 {

    /* renamed from: a */
    @NonNull
    private final String f48476a;

    /* renamed from: b */
    @Nullable
    private final JavaScriptResource f48477b;

    /* renamed from: c */
    @Nullable
    private final String f48478c;

    /* renamed from: d */
    @NonNull
    private final Map<String, List<String>> f48479d;

    public ab1(@NonNull String str, @Nullable JavaScriptResource javaScriptResource, @Nullable String str2, @NonNull HashMap hashMap) {
        this.f48476a = str;
        this.f48477b = javaScriptResource;
        this.f48478c = str2;
        this.f48479d = hashMap;
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    @NonNull
    /* renamed from: a */
    public final Map<String, List<String>> mo22451a() {
        return Collections.unmodifiableMap(this.f48479d);
    }

    @Nullable
    /* renamed from: b */
    public final JavaScriptResource m22452b() {
        return this.f48477b;
    }

    @Nullable
    /* renamed from: c */
    public final String m22453c() {
        return this.f48478c;
    }

    @NonNull
    /* renamed from: d */
    public final String m22454d() {
        return this.f48476a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ab1.class != obj.getClass()) {
            return false;
        }
        ab1 ab1Var = (ab1) obj;
        if (!this.f48476a.equals(ab1Var.f48476a)) {
            return false;
        }
        JavaScriptResource javaScriptResource = this.f48477b;
        if (javaScriptResource == null ? ab1Var.f48477b != null : !javaScriptResource.equals(ab1Var.f48477b)) {
            return false;
        }
        String str = this.f48478c;
        if (str == null ? ab1Var.f48478c == null : str.equals(ab1Var.f48478c)) {
            return this.f48479d.equals(ab1Var.f48479d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f48476a.hashCode() * 31;
        JavaScriptResource javaScriptResource = this.f48477b;
        int hashCode2 = (hashCode + (javaScriptResource != null ? javaScriptResource.hashCode() : 0)) * 31;
        String str = this.f48478c;
        return this.f48479d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
