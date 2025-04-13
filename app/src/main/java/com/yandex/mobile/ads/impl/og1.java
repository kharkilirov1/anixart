package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.auth.C2052a;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class og1 {

    /* renamed from: a */
    @NotNull
    private final SharedPreferences f53266a;

    /* renamed from: b */
    @NotNull
    private final mg1 f53267b;

    public og1(@NotNull SharedPreferences preferences, @NotNull mg1 viewSizeInfoParser) {
        Intrinsics.m32179h(preferences, "preferences");
        Intrinsics.m32179h(viewSizeInfoParser, "viewSizeInfoParser");
        this.f53266a = preferences;
        this.f53267b = viewSizeInfoParser;
    }

    @Nullable
    /* renamed from: a */
    public final String m27084a(@NotNull qg1 viewSizeKey) {
        Intrinsics.m32179h(viewSizeKey, "viewSizeKey");
        return this.f53266a.getString(viewSizeKey.m27720a() + '-' + viewSizeKey.m27721b(), null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public og1(@NotNull Context context) {
        this(u01.m28814a(new u01(), context, "ViewSizeInfoStorage"), new mg1());
        Intrinsics.m32179h(context, "context");
    }

    /* renamed from: a */
    public final void m27085a(@NotNull qg1 viewSizeKey, @NotNull lg1 viewSizeInfo) {
        Intrinsics.m32179h(viewSizeKey, "viewSizeKey");
        Intrinsics.m32179h(viewSizeInfo, "viewSizeInfo");
        String str = viewSizeKey.m27720a() + '-' + viewSizeKey.m27721b();
        Objects.requireNonNull(this.f53267b);
        String jSONObject = mg1.m26672a(viewSizeInfo).toString();
        Intrinsics.m32178g(jSONObject, "viewSizeInfoParser.toJson(viewSizeInfo).toString()");
        C2052a.m12278m(this.f53266a, str, jSONObject);
    }
}
