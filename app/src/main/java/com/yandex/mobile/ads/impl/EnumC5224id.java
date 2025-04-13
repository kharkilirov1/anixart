package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.id */
/* loaded from: classes3.dex */
public enum EnumC5224id {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("constant"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("ratio"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("screen_based"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37("screen_orientation_based");


    /* renamed from: a */
    @NotNull
    private final String f51280a;

    /* renamed from: com.yandex.mobile.ads.impl.id$a */
    public static final class a {
        @Nullable
        /* renamed from: a */
        public static EnumC5224id m25525a(@Nullable String str) {
            for (EnumC5224id enumC5224id : EnumC5224id.values()) {
                if (Intrinsics.m32174c(enumC5224id.m25524a(), str)) {
                    return enumC5224id;
                }
            }
            return null;
        }
    }

    EnumC5224id(String str) {
        this.f51280a = str;
    }

    @NotNull
    /* renamed from: a */
    public final String m25524a() {
        return this.f51280a;
    }
}
