package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.C0055R;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {

    /* renamed from: d */
    public final SeekBar f1205d;

    /* renamed from: e */
    public Drawable f1206e;

    /* renamed from: f */
    public ColorStateList f1207f;

    /* renamed from: g */
    public PorterDuff.Mode f1208g;

    /* renamed from: h */
    public boolean f1209h;

    /* renamed from: i */
    public boolean f1210i;

    public AppCompatSeekBarHelper(SeekBar seekBar) {
        super(seekBar);
        this.f1207f = null;
        this.f1208g = null;
        this.f1209h = false;
        this.f1210i = false;
        this.f1205d = seekBar;
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    /* renamed from: a */
    public void mo752a(AttributeSet attributeSet, int i2) {
        super.mo752a(attributeSet, i2);
        Context context = this.f1205d.getContext();
        int[] iArr = C0055R.styleable.f297h;
        TintTypedArray m951r = TintTypedArray.m951r(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f1205d;
        ViewCompat.m2194d0(seekBar, seekBar.getContext(), iArr, attributeSet, m951r.f1582b, i2, 0);
        Drawable m959h = m951r.m959h(0);
        if (m959h != null) {
            this.f1205d.setThumb(m959h);
        }
        Drawable m958g = m951r.m958g(1);
        Drawable drawable = this.f1206e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1206e = m958g;
        if (m958g != null) {
            m958g.setCallback(this.f1205d);
            DrawableCompat.m1840l(m958g, ViewCompat.m2231w(this.f1205d));
            if (m958g.isStateful()) {
                m958g.setState(this.f1205d.getDrawableState());
            }
            m756c();
        }
        this.f1205d.invalidate();
        if (m951r.m967p(3)) {
            this.f1208g = DrawableUtils.m852d(m951r.m961j(3, -1), this.f1208g);
            this.f1210i = true;
        }
        if (m951r.m967p(2)) {
            this.f1207f = m951r.m954c(2);
            this.f1209h = true;
        }
        m951r.f1582b.recycle();
        m756c();
    }

    /* renamed from: c */
    public final void m756c() {
        Drawable drawable = this.f1206e;
        if (drawable != null) {
            if (this.f1209h || this.f1210i) {
                Drawable m1845q = DrawableCompat.m1845q(drawable.mutate());
                this.f1206e = m1845q;
                if (this.f1209h) {
                    DrawableCompat.m1842n(m1845q, this.f1207f);
                }
                if (this.f1210i) {
                    DrawableCompat.m1843o(this.f1206e, this.f1208g);
                }
                if (this.f1206e.isStateful()) {
                    this.f1206e.setState(this.f1205d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public void m757d(Canvas canvas) {
        if (this.f1206e != null) {
            int max = this.f1205d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1206e.getIntrinsicWidth();
                int intrinsicHeight = this.f1206e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1206e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f1205d.getWidth() - this.f1205d.getPaddingLeft()) - this.f1205d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1205d.getPaddingLeft(), this.f1205d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1206e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
