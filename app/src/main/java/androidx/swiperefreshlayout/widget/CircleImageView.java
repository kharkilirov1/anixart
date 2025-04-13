package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
class CircleImageView extends ImageView {

    /* renamed from: b */
    public Animation.AnimationListener f6044b;

    /* renamed from: c */
    public int f6045c;

    public class OvalShadow extends OvalShape {

        /* renamed from: b */
        public Paint f6046b;

        /* renamed from: c */
        public final /* synthetic */ CircleImageView f6047c;

        /* renamed from: a */
        public final void m4163a(int i2) {
            float f2 = i2 / 2;
            this.f6046b.setShader(new RadialGradient(f2, f2, this.f6047c.f6045c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f6047c.getWidth() / 2;
            float height = this.f6047c.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f6046b);
            canvas.drawCircle(width, height, r0 - this.f6047c.f6045c, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f2, float f3) {
            super.onResize(f2, f3);
            m4163a((int) f2);
        }
    }

    public CircleImageView(Context context, int i2) {
        super(context);
        float f2 = getContext().getResources().getDisplayMetrics().density;
        this.f6045c = (int) (3.5f * f2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        ViewCompat.m2212m0(this, f2 * 4.0f);
        shapeDrawable.getPaint().setColor(i2);
        ViewCompat.m2204i0(this, shapeDrawable);
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f6044b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f6044b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
        }
    }
}
