package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.WrappedDrawable;
import com.yandex.metrica.YandexMetricaDefaultValues;

/* loaded from: classes.dex */
class AppCompatProgressBarHelper {

    /* renamed from: c */
    public static final int[] f1196c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final ProgressBar f1197a;

    /* renamed from: b */
    public Bitmap f1198b;

    @RequiresApi
    public static class Api23Impl {
    }

    public AppCompatProgressBarHelper(ProgressBar progressBar) {
        this.f1197a = progressBar;
    }

    /* renamed from: a */
    public void mo752a(AttributeSet attributeSet, int i2) {
        TintTypedArray m951r = TintTypedArray.m951r(this.f1197a.getContext(), attributeSet, f1196c, i2, 0);
        Drawable m959h = m951r.m959h(0);
        if (m959h != null) {
            ProgressBar progressBar = this.f1197a;
            if (m959h instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) m959h;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable m753b = m753b(animationDrawable.getFrame(i3), true);
                    m753b.setLevel(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                    animationDrawable2.addFrame(m753b, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                m959h = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(m959h);
        }
        Drawable m959h2 = m951r.m959h(1);
        if (m959h2 != null) {
            this.f1197a.setProgressDrawable(m753b(m959h2, false));
        }
        m951r.f1582b.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    /* renamed from: b */
    public Drawable m753b(Drawable drawable, boolean z) {
        if (drawable instanceof WrappedDrawable) {
            WrappedDrawable wrappedDrawable = (WrappedDrawable) drawable;
            Drawable mo1891b = wrappedDrawable.mo1891b();
            if (mo1891b != null) {
                wrappedDrawable.mo1890a(m753b(mo1891b, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id2 = layerDrawable.getId(i2);
                    drawableArr[i2] = m753b(layerDrawable.getDrawable(i2), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                    if (Build.VERSION.SDK_INT >= 23) {
                        layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
                        layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
                        layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
                        layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
                        layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
                        layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
                        layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
                        layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
                        layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1198b == null) {
                    this.f1198b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
