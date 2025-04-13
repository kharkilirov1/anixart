package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.Rating;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.la */
/* loaded from: classes3.dex */
public final class C5390la {

    /* renamed from: a */
    @NotNull
    private final w10 f52316a;

    /* renamed from: b */
    @NotNull
    private final oc0 f52317b;

    /* renamed from: c */
    @NotNull
    private final zj0 f52318c;

    /* renamed from: d */
    @NotNull
    private final nj0 f52319d;

    public C5390la(@NotNull w10 imageProvider, @NotNull oc0 mediaViewAdapterCreator, @NotNull zj0 nativeMediaContent, @NotNull nj0 nativeForcePauseObserver) {
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(mediaViewAdapterCreator, "mediaViewAdapterCreator");
        Intrinsics.m32179h(nativeMediaContent, "nativeMediaContent");
        Intrinsics.m32179h(nativeForcePauseObserver, "nativeForcePauseObserver");
        this.f52316a = imageProvider;
        this.f52317b = mediaViewAdapterCreator;
        this.f52318c = nativeMediaContent;
        this.f52319d = nativeForcePauseObserver;
    }

    @Nullable
    /* renamed from: a */
    public static C4981dn m26400a(@Nullable TextView textView) {
        C5539oi c5539oi = textView != null ? new C5539oi(textView) : null;
        if (c5539oi != null) {
            return new C4981dn(c5539oi);
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static C4981dn m26401b(@Nullable View view) {
        vt0 vt0Var = view instanceof Rating ? new vt0(view) : null;
        if (vt0Var != null) {
            return new C4981dn(vt0Var);
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public final na0 m26404a(@Nullable ImageView imageView, @Nullable MediaView mediaView) {
        h20 h20Var = imageView != null ? new h20(imageView, this.f52316a) : null;
        nc0 m27068a = mediaView != null ? this.f52317b.m27068a(mediaView, this.f52316a, this.f52318c, this.f52319d) : null;
        if (h20Var == null && m27068a == null) {
            return null;
        }
        return new na0(h20Var, m27068a);
    }

    @Nullable
    /* renamed from: a */
    public final n10 m26403a(@Nullable ImageView imageView) {
        C5511nu c5511nu = imageView != null ? new C5511nu(imageView, this.f52316a) : null;
        if (c5511nu != null) {
            return new n10(c5511nu);
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public final InterfaceC5330ka<?> m26402a(@Nullable View view, @NotNull String type) {
        Intrinsics.m32179h(type, "type");
        int hashCode = type.hashCode();
        if (hashCode != -1034364087) {
            if (hashCode != -891985903) {
                if (hashCode == 100313435) {
                    if (!type.equals("image")) {
                        return null;
                    }
                    if ((view instanceof ImageView ? (ImageView) view : null) != null) {
                        return new n10(new h20((ImageView) view, this.f52316a));
                    }
                    return null;
                }
                if (hashCode != 103772132 || !type.equals("media")) {
                    return null;
                }
                if ((view instanceof MediaView ? (MediaView) view : null) != null) {
                    return m26404a((ImageView) null, (MediaView) view);
                }
                return null;
            }
            if (!type.equals("string")) {
                return null;
            }
        } else if (!type.equals("number")) {
            return null;
        }
        if ((view instanceof TextView ? (TextView) view : null) != null) {
            return new C4981dn(new a61((TextView) view));
        }
        return null;
    }

    @NotNull
    /* renamed from: a */
    public static C4981dn m26399a(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        return new C4981dn(new C5406lo(view));
    }
}
