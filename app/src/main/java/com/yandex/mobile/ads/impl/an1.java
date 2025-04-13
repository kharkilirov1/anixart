package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class an1 {
    /* renamed from: a */
    public static float m22555a(View view) {
        return view.getZ();
    }

    /* renamed from: b */
    public static boolean m22556b(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return true;
    }

    /* renamed from: c */
    public static String m22557c(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }
}
