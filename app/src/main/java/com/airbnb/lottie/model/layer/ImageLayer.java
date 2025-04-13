package com.airbnb.lottie.model.layer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.io.IOException;

/* loaded from: classes.dex */
public class ImageLayer extends BaseLayer {

    /* renamed from: w */
    public final Paint f7660w;

    /* renamed from: x */
    public final Rect f7661x;

    /* renamed from: y */
    public final Rect f7662y;

    /* renamed from: z */
    @Nullable
    public BaseKeyframeAnimation<ColorFilter, ColorFilter> f7663z;

    public ImageLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f7660w = new LPaint(3);
        this.f7661x = new Rect();
        this.f7662y = new Rect();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: d */
    public void mo4691d(RectF rectF, Matrix matrix, boolean z) {
        super.mo4691d(rectF, matrix, z);
        if (m4754q() != null) {
            rectF.set(0.0f, 0.0f, Utils.m4853c() * r3.getWidth(), Utils.m4853c() * r3.getHeight());
            this.f7640m.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        this.f7648u.m4724c(t, lottieValueCallback);
        if (t == LottieProperty.f7231C) {
            if (lottieValueCallback == null) {
                this.f7663z = null;
            } else {
                this.f7663z = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /* renamed from: j */
    public void mo4747j(@NonNull Canvas canvas, Matrix matrix, int i2) {
        Bitmap m4754q = m4754q();
        if (m4754q == null || m4754q.isRecycled()) {
            return;
        }
        float m4853c = Utils.m4853c();
        this.f7660w.setAlpha(i2);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f7663z;
        if (baseKeyframeAnimation != null) {
            this.f7660w.setColorFilter(baseKeyframeAnimation.mo4707e());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f7661x.set(0, 0, m4754q.getWidth(), m4754q.getHeight());
        this.f7662y.set(0, 0, (int) (m4754q.getWidth() * m4853c), (int) (m4754q.getHeight() * m4853c));
        canvas.drawBitmap(m4754q, this.f7661x, this.f7662y, this.f7660w);
        canvas.restore();
    }

    @Nullable
    /* renamed from: q */
    public final Bitmap m4754q() {
        ImageAssetManager imageAssetManager;
        LottieImageAsset lottieImageAsset;
        String str = this.f7642o.f7670g;
        LottieDrawable lottieDrawable = this.f7641n;
        if (lottieDrawable.getCallback() == null) {
            imageAssetManager = null;
        } else {
            ImageAssetManager imageAssetManager2 = lottieDrawable.f7176j;
            if (imageAssetManager2 != null) {
                Drawable.Callback callback = lottieDrawable.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                if (!((context == null && imageAssetManager2.f7463a == null) || imageAssetManager2.f7463a.equals(context))) {
                    lottieDrawable.f7176j = null;
                }
            }
            if (lottieDrawable.f7176j == null) {
                lottieDrawable.f7176j = new ImageAssetManager(lottieDrawable.getCallback(), lottieDrawable.f7177k, lottieDrawable.f7178l, lottieDrawable.f7169c.f7142d);
            }
            imageAssetManager = lottieDrawable.f7176j;
        }
        if (imageAssetManager == null || (lottieImageAsset = imageAssetManager.f7466d.get(str)) == null) {
            return null;
        }
        Bitmap bitmap = lottieImageAsset.f7228e;
        if (bitmap != null) {
            return bitmap;
        }
        ImageAssetDelegate imageAssetDelegate = imageAssetManager.f7465c;
        if (imageAssetDelegate != null) {
            Bitmap m4639a = imageAssetDelegate.m4639a(lottieImageAsset);
            if (m4639a == null) {
                return m4639a;
            }
            imageAssetManager.m4728a(str, m4639a);
            return m4639a;
        }
        String str2 = lottieImageAsset.f7227d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                imageAssetManager.m4728a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e2) {
                Logger.m4834b("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(imageAssetManager.f7464b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            Bitmap m4855e = Utils.m4855e(BitmapFactory.decodeStream(imageAssetManager.f7463a.getAssets().open(imageAssetManager.f7464b + str2), null, options), lottieImageAsset.f7224a, lottieImageAsset.f7225b);
            imageAssetManager.m4728a(str, m4855e);
            return m4855e;
        } catch (IOException e3) {
            Logger.m4834b("Unable to open asset.", e3);
            return null;
        }
    }
}
