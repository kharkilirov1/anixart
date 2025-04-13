package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.utils.Logger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FontAssetManager {

    /* renamed from: d */
    public final AssetManager f7459d;

    /* renamed from: e */
    @Nullable
    public FontAssetDelegate f7460e;

    /* renamed from: a */
    public final MutablePair<String> f7456a = new MutablePair<>();

    /* renamed from: b */
    public final Map<MutablePair<String>, Typeface> f7457b = new HashMap();

    /* renamed from: c */
    public final Map<String, Typeface> f7458c = new HashMap();

    /* renamed from: f */
    public String f7461f = ".ttf";

    public FontAssetManager(Drawable.Callback callback, @Nullable FontAssetDelegate fontAssetDelegate) {
        this.f7460e = fontAssetDelegate;
        if (callback instanceof View) {
            this.f7459d = ((View) callback).getContext().getAssets();
        } else {
            Logger.m4833a("LottieDrawable must be inside of a view for images to work.");
            this.f7459d = null;
        }
    }
}
