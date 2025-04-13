package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.pc */
/* loaded from: classes3.dex */
public final class C5586pc {
    /* renamed from: a */
    public static boolean m27307a(@NotNull z10 imageValue) {
        C5683rc m26791a;
        Intrinsics.m32179h(imageValue, "imageValue");
        n21 m30041c = imageValue.m30041c();
        if (m30041c == null || (m26791a = m30041c.m26791a()) == null) {
            return false;
        }
        return (m26791a.m27901a() != null && m26791a.m27904d() != null && Intrinsics.m32174c(m26791a.m27901a(), m26791a.m27904d())) || (m26791a.m27902b() != null && m26791a.m27903c() != null && Intrinsics.m32174c(m26791a.m27902b(), m26791a.m27903c()));
    }

    @Nullable
    /* renamed from: a */
    public static String m27306a(@NotNull RectF viewRect, @NotNull z10 imageValue) {
        C5683rc m26791a;
        n21 m30041c;
        f21 m26792b;
        float width;
        int m24296c;
        Intrinsics.m32179h(viewRect, "viewRect");
        Intrinsics.m32179h(imageValue, "imageValue");
        n21 m30041c2 = imageValue.m30041c();
        if (m30041c2 == null || (m26791a = m30041c2.m26791a()) == null || (m30041c = imageValue.m30041c()) == null || (m26792b = m30041c.m26792b()) == null) {
            return null;
        }
        float width2 = viewRect.width();
        float height = viewRect.height();
        float m30043e = imageValue.m30043e();
        float m30034a = imageValue.m30034a();
        float m24296c2 = m26792b.m24296c();
        float m24295b = m26792b.m24295b();
        if (width2 == 0.0f) {
            return null;
        }
        if (height == 0.0f) {
            return null;
        }
        if (m30043e == 0.0f) {
            return null;
        }
        if (m30034a == 0.0f) {
            return null;
        }
        if (m24296c2 == 0.0f) {
            return null;
        }
        if (m24295b == 0.0f) {
            return null;
        }
        if (viewRect.width() / viewRect.height() > ((float) (m26792b.m24296c() / m26792b.m24295b()))) {
            width = viewRect.height();
            m24296c = m26792b.m24295b();
        } else {
            width = viewRect.width();
            m24296c = m26792b.m24296c();
        }
        if (width / m24296c <= 1.0f) {
            if (width2 / height > m24296c2 / m24295b) {
                if (Intrinsics.m32174c(m26791a.m27903c(), m26791a.m27902b())) {
                    return m26791a.m27903c();
                }
                return null;
            }
            if (Intrinsics.m32174c(m26791a.m27904d(), m26791a.m27901a())) {
                return m26791a.m27904d();
            }
            return null;
        }
        if (width2 / height > m30043e / m30034a) {
            if (Intrinsics.m32174c(m26791a.m27903c(), m26791a.m27902b())) {
                return m26791a.m27903c();
            }
            return null;
        }
        if (Intrinsics.m32174c(m26791a.m27904d(), m26791a.m27901a())) {
            return m26791a.m27904d();
        }
        return null;
    }
}
