package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: e */
    public float f2702e;

    /* renamed from: f */
    public float f2703f;

    /* renamed from: g */
    public Path f2704g;

    /* renamed from: h */
    public ViewOutlineProvider f2705h;

    /* renamed from: i */
    public RectF f2706i;

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f2703f;
    }

    public float getRoundPercent() {
        return this.f2702e;
    }

    @RequiresApi
    public void setRound(float f2) {
        if (Float.isNaN(f2)) {
            this.f2703f = f2;
            float f3 = this.f2702e;
            this.f2702e = -1.0f;
            setRoundPercent(f3);
            return;
        }
        boolean z = this.f2703f != f2;
        this.f2703f = f2;
        if (f2 != 0.0f) {
            if (this.f2704g == null) {
                this.f2704g = new Path();
            }
            if (this.f2706i == null) {
                this.f2706i = new RectF();
            }
            if (this.f2705h == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f2703f);
                    }
                };
                this.f2705h = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.f2706i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2704g.reset();
            Path path = this.f2704g;
            RectF rectF = this.f2706i;
            float f4 = this.f2703f;
            path.addRoundRect(rectF, f4, f4, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi
    public void setRoundPercent(float f2) {
        boolean z = this.f2702e != f2;
        this.f2702e = f2;
        if (f2 != 0.0f) {
            if (this.f2704g == null) {
                this.f2704g = new Path();
            }
            if (this.f2706i == null) {
                this.f2706i = new RectF();
            }
            if (this.f2705h == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), (Math.min(r3, r4) * MotionButton.this.f2702e) / 2.0f);
                    }
                };
                this.f2705h = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f2702e) / 2.0f;
            this.f2706i.set(0.0f, 0.0f, width, height);
            this.f2704g.reset();
            this.f2704g.addRoundRect(this.f2706i, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }
}
