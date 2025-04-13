package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.banner.C4637e;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName
/* renamed from: com.yandex.mobile.ads.impl.jd */
/* loaded from: classes3.dex */
public final class C5280jd {
    @NotNull
    /* renamed from: a */
    public static final SizeInfo m25868a(@NotNull SizeInfo sizeInfo) {
        Intrinsics.m32179h(sizeInfo, "<this>");
        return sizeInfo.m21917d() != 2 ? new SizeInfo(sizeInfo.m21919e(), sizeInfo.m21915c(), 2) : sizeInfo;
    }

    /* renamed from: b */
    public static final boolean m25869b(@NotNull SizeInfo sizeInfo) {
        Intrinsics.m32179h(sizeInfo, "<this>");
        return !(-1 == sizeInfo.m21919e() && -2 == sizeInfo.m21915c()) && 1 == sizeInfo.m21917d();
    }

    @Nullable
    /* renamed from: a */
    public static final SizeInfo m25867a(@NotNull C4637e c4637e) {
        SizeInfo m21805F;
        Intrinsics.m32179h(c4637e, "<this>");
        AdResponse<String> m28620h = c4637e.m28620h();
        if (m28620h != null && (m21805F = m28620h.m21805F()) != null) {
            if (!((m21805F.m21919e() == 0 && m21805F.m21915c() == 0) ? false : true)) {
                m21805F = null;
            }
            if (m21805F != null) {
                return m21805F;
            }
        }
        return c4637e.m28622j();
    }
}
