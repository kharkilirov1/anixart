package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;
import com.bumptech.glide.util.Preconditions;
import com.yandex.mobile.ads.C4632R;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class GifDrawable extends Drawable implements GifFrameLoader.FrameCallback, Animatable, Animatable2Compat {

    /* renamed from: b */
    public final GifState f8604b;

    /* renamed from: c */
    public boolean f8605c;

    /* renamed from: d */
    public boolean f8606d;

    /* renamed from: e */
    public boolean f8607e;

    /* renamed from: f */
    public boolean f8608f;

    /* renamed from: g */
    public int f8609g;

    /* renamed from: h */
    public int f8610h;

    /* renamed from: i */
    public boolean f8611i;

    /* renamed from: j */
    public Paint f8612j;

    /* renamed from: k */
    public Rect f8613k;

    public static final class GifState extends Drawable.ConstantState {

        /* renamed from: a */
        @VisibleForTesting
        public final GifFrameLoader f8614a;

        public GifState(GifFrameLoader gifFrameLoader) {
            this.f8614a = gifFrameLoader;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new GifDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new GifDrawable(this);
        }
    }

    public GifDrawable(Context context, GifDecoder gifDecoder, Transformation<Bitmap> transformation, int i2, int i3, Bitmap bitmap) {
        GifState gifState = new GifState(new GifFrameLoader(Glide.m4871b(context), gifDecoder, i2, i3, transformation, bitmap));
        this.f8608f = true;
        this.f8610h = -1;
        this.f8604b = gifState;
    }

    @Override // com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback
    /* renamed from: a */
    public void mo5202a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        GifFrameLoader.DelayTarget delayTarget = this.f8604b.f8614a.f8624i;
        if ((delayTarget != null ? delayTarget.f8631f : -1) == r0.f8616a.mo4930d() - 1) {
            this.f8609g++;
        }
        int i2 = this.f8610h;
        if (i2 == -1 || this.f8609g < i2) {
            return;
        }
        stop();
    }

    /* renamed from: b */
    public ByteBuffer m5203b() {
        return this.f8604b.f8614a.f8616a.mo4927a().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m5204c() {
        return this.f8604b.f8614a.f8627l;
    }

    /* renamed from: d */
    public final Paint m5205d() {
        if (this.f8612j == null) {
            this.f8612j = new Paint(2);
        }
        return this.f8612j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f8607e) {
            return;
        }
        if (this.f8611i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f8613k == null) {
                this.f8613k = new Rect();
            }
            Gravity.apply(C4632R.styleable.AppCompatTheme_windowActionModeOverlay, intrinsicWidth, intrinsicHeight, bounds, this.f8613k);
            this.f8611i = false;
        }
        Bitmap m5208a = this.f8604b.f8614a.m5208a();
        if (this.f8613k == null) {
            this.f8613k = new Rect();
        }
        canvas.drawBitmap(m5208a, (Rect) null, this.f8613k, m5205d());
    }

    /* renamed from: e */
    public final void m5206e() {
        Preconditions.m5343a(!this.f8607e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f8604b.f8614a.f8616a.mo4930d() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f8605c) {
            return;
        }
        this.f8605c = true;
        GifFrameLoader gifFrameLoader = this.f8604b.f8614a;
        if (gifFrameLoader.f8625j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (gifFrameLoader.f8618c.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = gifFrameLoader.f8618c.isEmpty();
        gifFrameLoader.f8618c.add(this);
        if (isEmpty && !gifFrameLoader.f8621f) {
            gifFrameLoader.f8621f = true;
            gifFrameLoader.f8625j = false;
            gifFrameLoader.m5209b();
        }
        invalidateSelf();
    }

    /* renamed from: f */
    public final void m5207f() {
        this.f8605c = false;
        GifFrameLoader gifFrameLoader = this.f8604b.f8614a;
        gifFrameLoader.f8618c.remove(this);
        if (gifFrameLoader.f8618c.isEmpty()) {
            gifFrameLoader.f8621f = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f8604b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8604b.f8614a.m5208a().getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8604b.f8614a.m5208a().getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f8605c;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8611i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        m5205d().setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m5205d().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Preconditions.m5343a(!this.f8607e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f8608f = z;
        if (!z) {
            m5207f();
        } else if (this.f8606d) {
            m5206e();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f8606d = true;
        this.f8609g = 0;
        if (this.f8608f) {
            m5206e();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f8606d = false;
        m5207f();
    }

    public GifDrawable(GifState gifState) {
        this.f8608f = true;
        this.f8610h = -1;
        this.f8604b = gifState;
    }
}
