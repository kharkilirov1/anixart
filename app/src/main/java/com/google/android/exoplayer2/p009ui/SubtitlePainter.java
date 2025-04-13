package com.google.android.exoplayer2.p009ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
final class SubtitlePainter {

    /* renamed from: A */
    public int f14254A;

    /* renamed from: B */
    public int f14255B;

    /* renamed from: C */
    public int f14256C;

    /* renamed from: D */
    public int f14257D;

    /* renamed from: E */
    public StaticLayout f14258E;

    /* renamed from: F */
    public StaticLayout f14259F;

    /* renamed from: G */
    public int f14260G;

    /* renamed from: H */
    public int f14261H;

    /* renamed from: I */
    public int f14262I;

    /* renamed from: J */
    public Rect f14263J;

    /* renamed from: a */
    public final float f14264a;

    /* renamed from: b */
    public final float f14265b;

    /* renamed from: c */
    public final float f14266c;

    /* renamed from: d */
    public final float f14267d;

    /* renamed from: e */
    public final float f14268e;

    /* renamed from: f */
    public final TextPaint f14269f;

    /* renamed from: g */
    public final Paint f14270g;

    /* renamed from: h */
    public final Paint f14271h;

    /* renamed from: i */
    @Nullable
    public CharSequence f14272i;

    /* renamed from: j */
    @Nullable
    public Layout.Alignment f14273j;

    /* renamed from: k */
    @Nullable
    public Bitmap f14274k;

    /* renamed from: l */
    public float f14275l;

    /* renamed from: m */
    public int f14276m;

    /* renamed from: n */
    public int f14277n;

    /* renamed from: o */
    public float f14278o;

    /* renamed from: p */
    public int f14279p;

    /* renamed from: q */
    public float f14280q;

    /* renamed from: r */
    public float f14281r;

    /* renamed from: s */
    public int f14282s;

    /* renamed from: t */
    public int f14283t;

    /* renamed from: u */
    public int f14284u;

    /* renamed from: v */
    public int f14285v;

    /* renamed from: w */
    public int f14286w;

    /* renamed from: x */
    public float f14287x;

    /* renamed from: y */
    public float f14288y;

    /* renamed from: z */
    public float f14289z;

    public SubtitlePainter(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f14268e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14267d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f14264a = round;
        this.f14265b = round;
        this.f14266c = round;
        TextPaint textPaint = new TextPaint();
        this.f14269f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f14270g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f14271h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    public final void m7409a(Canvas canvas, boolean z) {
        if (!z) {
            Objects.requireNonNull(this.f14263J);
            Objects.requireNonNull(this.f14274k);
            canvas.drawBitmap(this.f14274k, (Rect) null, this.f14263J, this.f14271h);
            return;
        }
        StaticLayout staticLayout = this.f14258E;
        StaticLayout staticLayout2 = this.f14259F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f14260G, this.f14261H);
        if (Color.alpha(this.f14284u) > 0) {
            this.f14270g.setColor(this.f14284u);
            canvas.drawRect(-this.f14262I, 0.0f, staticLayout.getWidth() + this.f14262I, staticLayout.getHeight(), this.f14270g);
        }
        int i2 = this.f14286w;
        if (i2 == 1) {
            this.f14269f.setStrokeJoin(Paint.Join.ROUND);
            this.f14269f.setStrokeWidth(this.f14264a);
            this.f14269f.setColor(this.f14285v);
            this.f14269f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i2 == 2) {
            TextPaint textPaint = this.f14269f;
            float f2 = this.f14265b;
            float f3 = this.f14266c;
            textPaint.setShadowLayer(f2, f3, f3, this.f14285v);
        } else if (i2 == 3 || i2 == 4) {
            boolean z2 = i2 == 3;
            int i3 = z2 ? -1 : this.f14285v;
            int i4 = z2 ? this.f14285v : -1;
            float f4 = this.f14265b / 2.0f;
            this.f14269f.setColor(this.f14282s);
            this.f14269f.setStyle(Paint.Style.FILL);
            float f5 = -f4;
            this.f14269f.setShadowLayer(this.f14265b, f5, f5, i3);
            staticLayout2.draw(canvas);
            this.f14269f.setShadowLayer(this.f14265b, f4, f4, i4);
        }
        this.f14269f.setColor(this.f14282s);
        this.f14269f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f14269f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }
}
