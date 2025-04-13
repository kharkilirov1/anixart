package com.airbnb.lottie.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.utils.Logger;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ImageAssetManager {

    /* renamed from: e */
    public static final Object f7462e = new Object();

    /* renamed from: a */
    public final Context f7463a;

    /* renamed from: b */
    public String f7464b;

    /* renamed from: c */
    @Nullable
    public ImageAssetDelegate f7465c;

    /* renamed from: d */
    public final Map<String, LottieImageAsset> f7466d;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, LottieImageAsset> map) {
        this.f7464b = str;
        if (!TextUtils.isEmpty(str)) {
            if (this.f7464b.charAt(r4.length() - 1) != '/') {
                this.f7464b = C0576a.m4118q(new StringBuilder(), this.f7464b, JsonPointer.SEPARATOR);
            }
        }
        if (callback instanceof View) {
            this.f7463a = ((View) callback).getContext();
            this.f7466d = map;
            this.f7465c = imageAssetDelegate;
        } else {
            Logger.m4833a("LottieDrawable must be inside of a view for images to work.");
            this.f7466d = new HashMap();
            this.f7463a = null;
        }
    }

    /* renamed from: a */
    public final Bitmap m4728a(String str, @Nullable Bitmap bitmap) {
        synchronized (f7462e) {
            this.f7466d.get(str).f7228e = bitmap;
        }
        return bitmap;
    }
}
