package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapeGroup;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ShapeLayer extends BaseLayer {

    /* renamed from: w */
    public final ContentGroup f7693w;

    public ShapeLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        ContentGroup contentGroup = new ContentGroup(lottieDrawable, this, new ShapeGroup("__container", layer.f7664a, false));
        this.f7693w = contentGroup;
        contentGroup.mo4689b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: d */
    public void mo4691d(RectF rectF, Matrix matrix, boolean z) {
        super.mo4691d(rectF, matrix, z);
        this.f7693w.mo4691d(rectF, this.f7640m, z);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /* renamed from: j */
    public void mo4747j(@NonNull Canvas canvas, Matrix matrix, int i2) {
        this.f7693w.mo4692f(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /* renamed from: n */
    public void mo4751n(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        this.f7693w.mo4690c(keyPath, i2, list, keyPath2);
    }
}
