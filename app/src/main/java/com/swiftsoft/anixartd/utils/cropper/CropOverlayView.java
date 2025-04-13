package com.swiftsoft.anixartd.utils.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.swiftsoft.anixartd.utils.cropper.CropImageView;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class CropOverlayView extends View {

    /* renamed from: A */
    public CropImageView.CropShape f30429A;

    /* renamed from: B */
    public final Rect f30430B;

    /* renamed from: C */
    public boolean f30431C;

    /* renamed from: b */
    public ScaleGestureDetector f30432b;

    /* renamed from: c */
    public boolean f30433c;

    /* renamed from: d */
    public final CropWindowHandler f30434d;

    /* renamed from: e */
    public CropWindowChangeListener f30435e;

    /* renamed from: f */
    public final RectF f30436f;

    /* renamed from: g */
    public Paint f30437g;

    /* renamed from: h */
    public Paint f30438h;

    /* renamed from: i */
    public Paint f30439i;

    /* renamed from: j */
    public Paint f30440j;

    /* renamed from: k */
    public Path f30441k;

    /* renamed from: l */
    public final float[] f30442l;

    /* renamed from: m */
    public final RectF f30443m;

    /* renamed from: n */
    public int f30444n;

    /* renamed from: o */
    public int f30445o;

    /* renamed from: p */
    public float f30446p;

    /* renamed from: q */
    public float f30447q;

    /* renamed from: r */
    public float f30448r;

    /* renamed from: s */
    public float f30449s;

    /* renamed from: t */
    public float f30450t;

    /* renamed from: u */
    public CropWindowMoveHandler f30451u;

    /* renamed from: v */
    public boolean f30452v;

    /* renamed from: w */
    public int f30453w;

    /* renamed from: x */
    public int f30454x;

    /* renamed from: y */
    public float f30455y;

    /* renamed from: z */
    public CropImageView.Guidelines f30456z;

    public interface CropWindowChangeListener {
        /* renamed from: a */
        void mo16425a(boolean z);
    }

    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public ScaleListener(C27771 c27771) {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        @TargetApi
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF m16447e = CropOverlayView.this.f30434d.m16447e();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f2 = focusY - currentSpanY;
            float f3 = focusX - currentSpanX;
            float f4 = focusX + currentSpanX;
            float f5 = focusY + currentSpanY;
            if (f3 >= f4 || f2 > f5 || f3 < 0.0f || f4 > CropOverlayView.this.f30434d.m16444b() || f2 < 0.0f || f5 > CropOverlayView.this.f30434d.m16443a()) {
                return true;
            }
            m16447e.set(f3, f2, f4, f5);
            CropOverlayView.this.f30434d.f30458a.set(m16447e);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30434d = new CropWindowHandler();
        this.f30436f = new RectF();
        this.f30441k = new Path();
        this.f30442l = new float[8];
        this.f30443m = new RectF();
        this.f30455y = this.f30453w / this.f30454x;
        this.f30430B = new Rect();
    }

    /* renamed from: e */
    public static Paint m16429e(float f2, int i2) {
        if (f2 <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i2);
        paint.setStrokeWidth(f2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    /* renamed from: a */
    public final boolean m16430a(RectF rectF) {
        float m16397q = BitmapUtils.m16397q(this.f30442l);
        float m16399s = BitmapUtils.m16399s(this.f30442l);
        float m16398r = BitmapUtils.m16398r(this.f30442l);
        float m16392l = BitmapUtils.m16392l(this.f30442l);
        if (!m16435g()) {
            this.f30443m.set(m16397q, m16399s, m16398r, m16392l);
            return false;
        }
        float[] fArr = this.f30442l;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[6];
        float f7 = fArr[7];
        if (fArr[7] < fArr[1]) {
            if (fArr[1] < fArr[3]) {
                f2 = fArr[6];
                f3 = fArr[7];
                f4 = fArr[2];
                f5 = fArr[3];
                f6 = fArr[4];
                f7 = fArr[5];
            } else {
                f2 = fArr[4];
                f3 = fArr[5];
                f4 = fArr[0];
                f5 = fArr[1];
                f6 = fArr[2];
                f7 = fArr[3];
            }
        } else if (fArr[1] > fArr[3]) {
            f2 = fArr[2];
            f3 = fArr[3];
            f4 = fArr[6];
            f5 = fArr[7];
            f6 = fArr[0];
            f7 = fArr[1];
        }
        float f8 = (f7 - f3) / (f6 - f2);
        float f9 = (-1.0f) / f8;
        float f10 = f3 - (f8 * f2);
        float f11 = f3 - (f2 * f9);
        float f12 = f5 - (f8 * f4);
        float f13 = f5 - (f4 * f9);
        float centerY = rectF.centerY() - rectF.top;
        float centerX = rectF.centerX();
        float f14 = rectF.left;
        float f15 = centerY / (centerX - f14);
        float f16 = -f15;
        float f17 = rectF.top;
        float f18 = f17 - (f14 * f15);
        float f19 = rectF.right;
        float f20 = f17 - (f16 * f19);
        float f21 = f8 - f15;
        float f22 = (f18 - f10) / f21;
        float max = Math.max(m16397q, f22 < f19 ? f22 : m16397q);
        float f23 = (f18 - f11) / (f9 - f15);
        if (f23 >= rectF.right) {
            f23 = max;
        }
        float max2 = Math.max(max, f23);
        float f24 = f9 - f16;
        float f25 = (f20 - f13) / f24;
        if (f25 >= rectF.right) {
            f25 = max2;
        }
        float max3 = Math.max(max2, f25);
        float f26 = (f20 - f11) / f24;
        if (f26 <= rectF.left) {
            f26 = m16398r;
        }
        float min = Math.min(m16398r, f26);
        float f27 = (f20 - f12) / (f8 - f16);
        if (f27 <= rectF.left) {
            f27 = min;
        }
        float min2 = Math.min(min, f27);
        float f28 = (f18 - f12) / f21;
        if (f28 <= rectF.left) {
            f28 = min2;
        }
        float min3 = Math.min(min2, f28);
        float max4 = Math.max(m16399s, Math.max((f8 * max3) + f10, (f9 * min3) + f11));
        float min4 = Math.min(m16392l, Math.min((f9 * max3) + f13, (f8 * min3) + f12));
        RectF rectF2 = this.f30443m;
        rectF2.left = max3;
        rectF2.top = max4;
        rectF2.right = min3;
        rectF2.bottom = min4;
        return true;
    }

    /* renamed from: b */
    public final void m16431b(boolean z) {
        try {
            CropWindowChangeListener cropWindowChangeListener = this.f30435e;
            if (cropWindowChangeListener != null) {
                cropWindowChangeListener.mo16425a(z);
            }
        } catch (Exception e2) {
            Log.e("AIC", "Exception in crop window changed", e2);
        }
    }

    /* renamed from: c */
    public final void m16432c(Canvas canvas) {
        if (this.f30439i != null) {
            Paint paint = this.f30437g;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF m16447e = this.f30434d.m16447e();
            m16447e.inset(strokeWidth, strokeWidth);
            float width = m16447e.width() / 3.0f;
            float height = m16447e.height() / 3.0f;
            if (this.f30429A != CropImageView.CropShape.OVAL) {
                float f2 = m16447e.left + width;
                float f3 = m16447e.right - width;
                canvas.drawLine(f2, m16447e.top, f2, m16447e.bottom, this.f30439i);
                canvas.drawLine(f3, m16447e.top, f3, m16447e.bottom, this.f30439i);
                float f4 = m16447e.top + height;
                float f5 = m16447e.bottom - height;
                canvas.drawLine(m16447e.left, f4, m16447e.right, f4, this.f30439i);
                canvas.drawLine(m16447e.left, f5, m16447e.right, f5, this.f30439i);
                return;
            }
            float width2 = (m16447e.width() / 2.0f) - strokeWidth;
            float height2 = (m16447e.height() / 2.0f) - strokeWidth;
            float f6 = m16447e.left + width;
            float f7 = m16447e.right - width;
            float sin = (float) (Math.sin(Math.acos((width2 - width) / width2)) * height2);
            canvas.drawLine(f6, (m16447e.top + height2) - sin, f6, (m16447e.bottom - height2) + sin, this.f30439i);
            canvas.drawLine(f7, (m16447e.top + height2) - sin, f7, (m16447e.bottom - height2) + sin, this.f30439i);
            float f8 = m16447e.top + height;
            float f9 = m16447e.bottom - height;
            float cos = (float) (Math.cos(Math.asin((height2 - height) / height2)) * width2);
            canvas.drawLine((m16447e.left + width2) - cos, f8, (m16447e.right - width2) + cos, f8, this.f30439i);
            canvas.drawLine((m16447e.left + width2) - cos, f9, (m16447e.right - width2) + cos, f9, this.f30439i);
        }
    }

    /* renamed from: d */
    public final void m16433d(RectF rectF) {
        if (rectF.width() < this.f30434d.m16446d()) {
            float m16446d = (this.f30434d.m16446d() - rectF.width()) / 2.0f;
            rectF.left -= m16446d;
            rectF.right += m16446d;
        }
        if (rectF.height() < this.f30434d.m16445c()) {
            float m16445c = (this.f30434d.m16445c() - rectF.height()) / 2.0f;
            rectF.top -= m16445c;
            rectF.bottom += m16445c;
        }
        if (rectF.width() > this.f30434d.m16444b()) {
            float width = (rectF.width() - this.f30434d.m16444b()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.f30434d.m16443a()) {
            float height = (rectF.height() - this.f30434d.m16443a()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        m16430a(rectF);
        if (this.f30443m.width() > 0.0f && this.f30443m.height() > 0.0f) {
            float max = Math.max(this.f30443m.left, 0.0f);
            float max2 = Math.max(this.f30443m.top, 0.0f);
            float min = Math.min(this.f30443m.right, getWidth());
            float min2 = Math.min(this.f30443m.bottom, getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (!this.f30452v || Math.abs(rectF.width() - (rectF.height() * this.f30455y)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.f30455y) {
            float abs = Math.abs((rectF.height() * this.f30455y) - rectF.width()) / 2.0f;
            rectF.left += abs;
            rectF.right -= abs;
        } else {
            float abs2 = Math.abs((rectF.width() / this.f30455y) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    /* renamed from: f */
    public final void m16434f() {
        float max = Math.max(BitmapUtils.m16397q(this.f30442l), 0.0f);
        float max2 = Math.max(BitmapUtils.m16399s(this.f30442l), 0.0f);
        float min = Math.min(BitmapUtils.m16398r(this.f30442l), getWidth());
        float min2 = Math.min(BitmapUtils.m16392l(this.f30442l), getHeight());
        if (min <= max || min2 <= max2) {
            return;
        }
        RectF rectF = new RectF();
        this.f30431C = true;
        float f2 = this.f30448r;
        float f3 = min - max;
        float f4 = f2 * f3;
        float f5 = min2 - max2;
        float f6 = f2 * f5;
        if (this.f30430B.width() > 0 && this.f30430B.height() > 0) {
            float f7 = this.f30430B.left;
            CropWindowHandler cropWindowHandler = this.f30434d;
            float f8 = (f7 / cropWindowHandler.f30468k) + max;
            rectF.left = f8;
            rectF.top = (r5.top / cropWindowHandler.f30469l) + max2;
            rectF.right = (r5.width() / this.f30434d.f30468k) + f8;
            rectF.bottom = (this.f30430B.height() / this.f30434d.f30469l) + rectF.top;
            rectF.left = Math.max(max, rectF.left);
            rectF.top = Math.max(max2, rectF.top);
            rectF.right = Math.min(min, rectF.right);
            rectF.bottom = Math.min(min2, rectF.bottom);
        } else if (!this.f30452v || min <= max || min2 <= max2) {
            rectF.left = max + f4;
            rectF.top = max2 + f6;
            rectF.right = min - f4;
            rectF.bottom = min2 - f6;
        } else if (f3 / f5 > this.f30455y) {
            rectF.top = max2 + f6;
            rectF.bottom = min2 - f6;
            float width = getWidth() / 2.0f;
            this.f30455y = this.f30453w / this.f30454x;
            float max3 = Math.max(this.f30434d.m16446d(), rectF.height() * this.f30455y) / 2.0f;
            rectF.left = width - max3;
            rectF.right = width + max3;
        } else {
            rectF.left = max + f4;
            rectF.right = min - f4;
            float height = getHeight() / 2.0f;
            float max4 = Math.max(this.f30434d.m16445c(), rectF.width() / this.f30455y) / 2.0f;
            rectF.top = height - max4;
            rectF.bottom = height + max4;
        }
        m16433d(rectF);
        this.f30434d.f30458a.set(rectF);
    }

    /* renamed from: g */
    public final boolean m16435g() {
        float[] fArr = this.f30442l;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    public int getAspectRatioX() {
        return this.f30453w;
    }

    public int getAspectRatioY() {
        return this.f30454x;
    }

    public CropImageView.CropShape getCropShape() {
        return this.f30429A;
    }

    public RectF getCropWindowRect() {
        return this.f30434d.m16447e();
    }

    public CropImageView.Guidelines getGuidelines() {
        return this.f30456z;
    }

    public Rect getInitialCropWindowRect() {
        return this.f30430B;
    }

    /* renamed from: h */
    public void m16436h() {
        if (this.f30431C) {
            setCropWindowRect(BitmapUtils.f30292b);
            m16434f();
            invalidate();
        }
    }

    /* renamed from: i */
    public void m16437i(float[] fArr, int i2, int i3) {
        if (fArr == null || !Arrays.equals(this.f30442l, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f30442l, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f30442l, 0, fArr.length);
            }
            this.f30444n = i2;
            this.f30445o = i3;
            RectF m16447e = this.f30434d.m16447e();
            if (m16447e.width() == 0.0f || m16447e.height() == 0.0f) {
                m16434f();
            }
        }
    }

    /* renamed from: j */
    public boolean m16438j(boolean z) {
        if (this.f30433c == z) {
            return false;
        }
        this.f30433c = z;
        if (!z || this.f30432b != null) {
            return true;
        }
        this.f30432b = new ScaleGestureDetector(getContext(), new ScaleListener(null));
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF m16447e = this.f30434d.m16447e();
        float max = Math.max(BitmapUtils.m16397q(this.f30442l), 0.0f);
        float max2 = Math.max(BitmapUtils.m16399s(this.f30442l), 0.0f);
        float min = Math.min(BitmapUtils.m16398r(this.f30442l), getWidth());
        float min2 = Math.min(BitmapUtils.m16392l(this.f30442l), getHeight());
        CropImageView.CropShape cropShape = this.f30429A;
        CropImageView.CropShape cropShape2 = CropImageView.CropShape.RECTANGLE;
        if (cropShape != cropShape2) {
            this.f30441k.reset();
            int i2 = Build.VERSION.SDK_INT;
            this.f30436f.set(m16447e.left, m16447e.top, m16447e.right, m16447e.bottom);
            this.f30441k.addOval(this.f30436f, Path.Direction.CW);
            canvas.save();
            if (i2 >= 26) {
                canvas.clipOutPath(this.f30441k);
            } else {
                canvas.clipPath(this.f30441k, Region.Op.XOR);
            }
            canvas.drawRect(max, max2, min, min2, this.f30440j);
            canvas.restore();
        } else if (m16435g()) {
            int i3 = Build.VERSION.SDK_INT;
            this.f30441k.reset();
            Path path = this.f30441k;
            float[] fArr = this.f30442l;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.f30441k;
            float[] fArr2 = this.f30442l;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.f30441k;
            float[] fArr3 = this.f30442l;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.f30441k;
            float[] fArr4 = this.f30442l;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.f30441k.close();
            canvas.save();
            if (i3 >= 26) {
                canvas.clipOutPath(this.f30441k);
            } else {
                canvas.clipPath(this.f30441k, Region.Op.INTERSECT);
            }
            canvas.clipRect(m16447e, Region.Op.XOR);
            canvas.drawRect(max, max2, min, min2, this.f30440j);
            canvas.restore();
        } else {
            canvas.drawRect(max, max2, min, m16447e.top, this.f30440j);
            canvas.drawRect(max, m16447e.bottom, min, min2, this.f30440j);
            canvas.drawRect(max, m16447e.top, m16447e.left, m16447e.bottom, this.f30440j);
            canvas.drawRect(m16447e.right, m16447e.top, min, m16447e.bottom, this.f30440j);
        }
        if (this.f30434d.m16448j()) {
            CropImageView.Guidelines guidelines = this.f30456z;
            if (guidelines == CropImageView.Guidelines.ON) {
                m16432c(canvas);
            } else if (guidelines == CropImageView.Guidelines.ON_TOUCH && this.f30451u != null) {
                m16432c(canvas);
            }
        }
        Paint paint = this.f30437g;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF m16447e2 = this.f30434d.m16447e();
            float f2 = strokeWidth / 2.0f;
            m16447e2.inset(f2, f2);
            if (this.f30429A == cropShape2) {
                canvas.drawRect(m16447e2, this.f30437g);
            } else {
                canvas.drawOval(m16447e2, this.f30437g);
            }
        }
        if (this.f30438h != null) {
            Paint paint2 = this.f30437g;
            float strokeWidth2 = paint2 != null ? paint2.getStrokeWidth() : 0.0f;
            float strokeWidth3 = this.f30438h.getStrokeWidth();
            float f3 = strokeWidth3 / 2.0f;
            float f4 = (this.f30429A == cropShape2 ? this.f30446p : 0.0f) + f3;
            RectF m16447e3 = this.f30434d.m16447e();
            m16447e3.inset(f4, f4);
            float f5 = (strokeWidth3 - strokeWidth2) / 2.0f;
            float f6 = f3 + f5;
            float f7 = m16447e3.left - f5;
            float f8 = m16447e3.top;
            canvas.drawLine(f7, f8 - f6, f7, f8 + this.f30447q, this.f30438h);
            float f9 = m16447e3.left;
            float f10 = m16447e3.top - f5;
            canvas.drawLine(f9 - f6, f10, f9 + this.f30447q, f10, this.f30438h);
            float f11 = m16447e3.right + f5;
            float f12 = m16447e3.top;
            canvas.drawLine(f11, f12 - f6, f11, f12 + this.f30447q, this.f30438h);
            float f13 = m16447e3.right;
            float f14 = m16447e3.top - f5;
            canvas.drawLine(f13 + f6, f14, f13 - this.f30447q, f14, this.f30438h);
            float f15 = m16447e3.left - f5;
            float f16 = m16447e3.bottom;
            canvas.drawLine(f15, f16 + f6, f15, f16 - this.f30447q, this.f30438h);
            float f17 = m16447e3.left;
            float f18 = m16447e3.bottom + f5;
            canvas.drawLine(f17 - f6, f18, f17 + this.f30447q, f18, this.f30438h);
            float f19 = m16447e3.right + f5;
            float f20 = m16447e3.bottom;
            canvas.drawLine(f19, f20 + f6, f19, f20 - this.f30447q, this.f30438h);
            float f21 = m16447e3.right;
            float f22 = m16447e3.bottom + f5;
            canvas.drawLine(f21 + f6, f22, f21 - this.f30447q, f22, this.f30438h);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x038a, code lost:
    
        if (r3 < r5) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0395, code lost:
    
        if (r3 < r5) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (r10 <= r14.right) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r10 <= r14.bottom) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x037a, code lost:
    
        if (r3 < r5) goto L144;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.utils.cropper.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAspectRatioX(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f30453w != i2) {
            this.f30453w = i2;
            this.f30455y = i2 / this.f30454x;
            if (this.f30431C) {
                m16434f();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f30454x != i2) {
            this.f30454x = i2;
            this.f30455y = this.f30453w / i2;
            if (this.f30431C) {
                m16434f();
                invalidate();
            }
        }
    }

    public void setCropShape(CropImageView.CropShape cropShape) {
        if (this.f30429A != cropShape) {
            this.f30429A = cropShape;
            invalidate();
        }
    }

    public void setCropWindowChangeListener(CropWindowChangeListener cropWindowChangeListener) {
        this.f30435e = cropWindowChangeListener;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f30434d.f30458a.set(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f30452v != z) {
            this.f30452v = z;
            if (this.f30431C) {
                m16434f();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.Guidelines guidelines) {
        if (this.f30456z != guidelines) {
            this.f30456z = guidelines;
            if (this.f30431C) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        CropWindowHandler cropWindowHandler = this.f30434d;
        Objects.requireNonNull(cropWindowHandler);
        cropWindowHandler.f30460c = cropImageOptions.f30364y;
        cropWindowHandler.f30461d = cropImageOptions.f30365z;
        cropWindowHandler.f30464g = cropImageOptions.f30318A;
        cropWindowHandler.f30465h = cropImageOptions.f30319B;
        cropWindowHandler.f30466i = cropImageOptions.f30320C;
        cropWindowHandler.f30467j = cropImageOptions.f30321D;
        setCropShape(cropImageOptions.f30341b);
        setSnapRadius(cropImageOptions.f30342c);
        setGuidelines(cropImageOptions.f30344e);
        setFixedAspectRatio(cropImageOptions.f30352m);
        setAspectRatioX(cropImageOptions.f30353n);
        setAspectRatioY(cropImageOptions.f30354o);
        m16438j(cropImageOptions.f30349j);
        this.f30449s = cropImageOptions.f30343d;
        this.f30448r = cropImageOptions.f30351l;
        this.f30437g = m16429e(cropImageOptions.f30355p, cropImageOptions.f30356q);
        this.f30446p = cropImageOptions.f30358s;
        this.f30447q = cropImageOptions.f30359t;
        this.f30438h = m16429e(cropImageOptions.f30357r, cropImageOptions.f30360u);
        this.f30439i = m16429e(cropImageOptions.f30361v, cropImageOptions.f30362w);
        int i2 = cropImageOptions.f30363x;
        Paint paint = new Paint();
        paint.setColor(i2);
        this.f30440j = paint;
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f30430B;
        if (rect == null) {
            rect = BitmapUtils.f30291a;
        }
        rect2.set(rect);
        if (this.f30431C) {
            m16434f();
            invalidate();
            m16431b(false);
        }
    }

    public void setSnapRadius(float f2) {
        this.f30450t = f2;
    }
}
