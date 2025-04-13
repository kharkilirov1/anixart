package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import p000a.C0000a;

/* loaded from: classes.dex */
public class PhotoViewAttacher implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: i */
    public ImageView f8912i;

    /* renamed from: j */
    public GestureDetector f8913j;

    /* renamed from: k */
    public CustomGestureDetector f8914k;

    /* renamed from: q */
    public OnMatrixChangedListener f8920q;

    /* renamed from: r */
    public OnPhotoTapListener f8921r;

    /* renamed from: s */
    public OnOutsidePhotoTapListener f8922s;

    /* renamed from: t */
    public OnViewTapListener f8923t;

    /* renamed from: u */
    public View.OnClickListener f8924u;

    /* renamed from: v */
    public View.OnLongClickListener f8925v;

    /* renamed from: w */
    public OnScaleChangedListener f8926w;

    /* renamed from: x */
    public OnSingleFlingListener f8927x;

    /* renamed from: y */
    public OnViewDragListener f8928y;

    /* renamed from: z */
    public FlingRunnable f8929z;

    /* renamed from: b */
    public Interpolator f8905b = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    public int f8906c = DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER;

    /* renamed from: d */
    public float f8907d = 1.0f;

    /* renamed from: e */
    public float f8908e = 1.75f;

    /* renamed from: f */
    public float f8909f = 3.0f;

    /* renamed from: g */
    public boolean f8910g = true;

    /* renamed from: h */
    public boolean f8911h = false;

    /* renamed from: l */
    public final Matrix f8915l = new Matrix();

    /* renamed from: m */
    public final Matrix f8916m = new Matrix();

    /* renamed from: n */
    public final Matrix f8917n = new Matrix();

    /* renamed from: o */
    public final RectF f8918o = new RectF();

    /* renamed from: p */
    public final float[] f8919p = new float[9];

    /* renamed from: A */
    public int f8901A = 2;

    /* renamed from: B */
    public boolean f8902B = true;

    /* renamed from: C */
    public ImageView.ScaleType f8903C = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: D */
    public OnGestureListener f8904D = new OnGestureListener() { // from class: com.github.chrisbanes.photoview.PhotoViewAttacher.1
        @Override // com.github.chrisbanes.photoview.OnGestureListener
        /* renamed from: a */
        public void mo5372a(float f2, float f3) {
            if (PhotoViewAttacher.this.f8914k.m5370c()) {
                return;
            }
            OnViewDragListener onViewDragListener = PhotoViewAttacher.this.f8928y;
            if (onViewDragListener != null) {
                onViewDragListener.mo5379a(f2, f3);
            }
            PhotoViewAttacher.this.f8917n.postTranslate(f2, f3);
            PhotoViewAttacher.this.m5381a();
            ViewParent parent = PhotoViewAttacher.this.f8912i.getParent();
            PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
            if (photoViewAttacher.f8910g && !photoViewAttacher.f8914k.m5370c()) {
                PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                if (!photoViewAttacher2.f8911h) {
                    int i2 = photoViewAttacher2.f8901A;
                    if ((i2 == 2 || ((i2 == 0 && f2 >= 1.0f) || (i2 == 1 && f2 <= -1.0f))) && parent != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                        return;
                    }
                    return;
                }
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // com.github.chrisbanes.photoview.OnGestureListener
        /* renamed from: b */
        public void mo5373b(float f2, float f3, float f4) {
            float m5388h = PhotoViewAttacher.this.m5388h();
            PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
            if (m5388h < photoViewAttacher.f8909f || f2 < 1.0f) {
                float m5388h2 = photoViewAttacher.m5388h();
                PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                if (m5388h2 > photoViewAttacher2.f8907d || f2 > 1.0f) {
                    OnScaleChangedListener onScaleChangedListener = photoViewAttacher2.f8926w;
                    if (onScaleChangedListener != null) {
                        onScaleChangedListener.m5378a(f2, f3, f4);
                    }
                    PhotoViewAttacher.this.f8917n.postScale(f2, f2, f3, f4);
                    PhotoViewAttacher.this.m5381a();
                }
            }
        }

        @Override // com.github.chrisbanes.photoview.OnGestureListener
        /* renamed from: c */
        public void mo5374c(float f2, float f3, float f4, float f5) {
            int i2;
            int i3;
            int i4;
            int i5;
            PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
            photoViewAttacher.f8929z = photoViewAttacher.new FlingRunnable(photoViewAttacher.f8912i.getContext());
            PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
            FlingRunnable flingRunnable = photoViewAttacher2.f8929z;
            int m5387g = photoViewAttacher2.m5387g(photoViewAttacher2.f8912i);
            PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
            int m5386f = photoViewAttacher3.m5386f(photoViewAttacher3.f8912i);
            int i6 = (int) f4;
            int i7 = (int) f5;
            RectF m5383c = PhotoViewAttacher.this.m5383c();
            if (m5383c != null) {
                int round = Math.round(-m5383c.left);
                float f6 = m5387g;
                if (f6 < m5383c.width()) {
                    i3 = Math.round(m5383c.width() - f6);
                    i2 = 0;
                } else {
                    i2 = round;
                    i3 = i2;
                }
                int round2 = Math.round(-m5383c.top);
                float f7 = m5386f;
                if (f7 < m5383c.height()) {
                    i5 = Math.round(m5383c.height() - f7);
                    i4 = 0;
                } else {
                    i4 = round2;
                    i5 = i4;
                }
                flingRunnable.f8941c = round;
                flingRunnable.f8942d = round2;
                if (round != i3 || round2 != i5) {
                    flingRunnable.f8940b.fling(round, round2, i6, i7, i2, i3, i4, i5, 0, 0);
                }
            }
            PhotoViewAttacher photoViewAttacher4 = PhotoViewAttacher.this;
            photoViewAttacher4.f8912i.post(photoViewAttacher4.f8929z);
        }
    };

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$4 */
    public static /* synthetic */ class C08894 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8933a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f8933a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8933a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8933a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8933a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class AnimatedZoomRunnable implements Runnable {

        /* renamed from: b */
        public final float f8934b;

        /* renamed from: c */
        public final float f8935c;

        /* renamed from: d */
        public final long f8936d = System.currentTimeMillis();

        /* renamed from: e */
        public final float f8937e;

        /* renamed from: f */
        public final float f8938f;

        public AnimatedZoomRunnable(float f2, float f3, float f4, float f5) {
            this.f8934b = f4;
            this.f8935c = f5;
            this.f8937e = f2;
            this.f8938f = f3;
        }

        @Override // java.lang.Runnable
        public void run() {
            float interpolation = PhotoViewAttacher.this.f8905b.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f8936d) * 1.0f) / PhotoViewAttacher.this.f8906c));
            float f2 = this.f8937e;
            PhotoViewAttacher.this.f8904D.mo5373b(C0000a.m4a(this.f8938f, f2, interpolation, f2) / PhotoViewAttacher.this.m5388h(), this.f8934b, this.f8935c);
            if (interpolation < 1.0f) {
                PhotoViewAttacher.this.f8912i.postOnAnimation(this);
            }
        }
    }

    public class FlingRunnable implements Runnable {

        /* renamed from: b */
        public final OverScroller f8940b;

        /* renamed from: c */
        public int f8941c;

        /* renamed from: d */
        public int f8942d;

        public FlingRunnable(Context context) {
            this.f8940b = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f8940b.isFinished() && this.f8940b.computeScrollOffset()) {
                int currX = this.f8940b.getCurrX();
                int currY = this.f8940b.getCurrY();
                PhotoViewAttacher.this.f8917n.postTranslate(this.f8941c - currX, this.f8942d - currY);
                PhotoViewAttacher.this.m5381a();
                this.f8941c = currX;
                this.f8942d = currY;
                PhotoViewAttacher.this.f8912i.postOnAnimation(this);
            }
        }
    }

    public PhotoViewAttacher(ImageView imageView) {
        this.f8912i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f8914k = new CustomGestureDetector(imageView.getContext(), this.f8904D);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.github.chrisbanes.photoview.PhotoViewAttacher.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                if (photoViewAttacher.f8927x == null || photoViewAttacher.m5388h() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                    return false;
                }
                return PhotoViewAttacher.this.f8927x.onFling(motionEvent, motionEvent2, f2, f3);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                View.OnLongClickListener onLongClickListener = photoViewAttacher.f8925v;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(photoViewAttacher.f8912i);
                }
            }
        });
        this.f8913j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: com.github.chrisbanes.photoview.PhotoViewAttacher.3
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                try {
                    float m5388h = PhotoViewAttacher.this.m5388h();
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                    float f2 = photoViewAttacher.f8908e;
                    if (m5388h < f2) {
                        photoViewAttacher.m5390j(f2, x, y, true);
                    } else {
                        if (m5388h >= f2) {
                            float f3 = photoViewAttacher.f8909f;
                            if (m5388h < f3) {
                                photoViewAttacher.m5390j(f3, x, y, true);
                            }
                        }
                        photoViewAttacher.m5390j(photoViewAttacher.f8907d, x, y, true);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                View.OnClickListener onClickListener = photoViewAttacher.f8924u;
                if (onClickListener != null) {
                    onClickListener.onClick(photoViewAttacher.f8912i);
                }
                RectF m5383c = PhotoViewAttacher.this.m5383c();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                OnViewTapListener onViewTapListener = photoViewAttacher2.f8923t;
                if (onViewTapListener != null) {
                    onViewTapListener.m5380a(photoViewAttacher2.f8912i, x, y);
                }
                if (m5383c == null) {
                    return false;
                }
                if (!m5383c.contains(x, y)) {
                    PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
                    OnOutsidePhotoTapListener onOutsidePhotoTapListener = photoViewAttacher3.f8922s;
                    if (onOutsidePhotoTapListener == null) {
                        return false;
                    }
                    onOutsidePhotoTapListener.m5376a(photoViewAttacher3.f8912i);
                    return false;
                }
                float width = (x - m5383c.left) / m5383c.width();
                float height = (y - m5383c.top) / m5383c.height();
                PhotoViewAttacher photoViewAttacher4 = PhotoViewAttacher.this;
                OnPhotoTapListener onPhotoTapListener = photoViewAttacher4.f8921r;
                if (onPhotoTapListener == null) {
                    return true;
                }
                onPhotoTapListener.m5377a(photoViewAttacher4.f8912i, width, height);
                return true;
            }
        });
    }

    /* renamed from: a */
    public final void m5381a() {
        RectF m5384d;
        if (m5382b()) {
            Matrix m5385e = m5385e();
            this.f8912i.setImageMatrix(m5385e);
            if (this.f8920q == null || (m5384d = m5384d(m5385e)) == null) {
                return;
            }
            this.f8920q.m5375a(m5384d);
        }
    }

    /* renamed from: b */
    public final boolean m5382b() {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        RectF m5384d = m5384d(m5385e());
        if (m5384d == null) {
            return false;
        }
        float height = m5384d.height();
        float width = m5384d.width();
        float m5386f = m5386f(this.f8912i);
        float f7 = 0.0f;
        if (height <= m5386f) {
            int i2 = C08894.f8933a[this.f8903C.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    m5386f = (m5386f - height) / 2.0f;
                    f3 = m5384d.top;
                } else {
                    m5386f -= height;
                    f3 = m5384d.top;
                }
                f4 = m5386f - f3;
            } else {
                f2 = m5384d.top;
                f4 = -f2;
            }
        } else {
            f2 = m5384d.top;
            if (f2 <= 0.0f) {
                f3 = m5384d.bottom;
                if (f3 >= m5386f) {
                    f4 = 0.0f;
                }
                f4 = m5386f - f3;
            }
            f4 = -f2;
        }
        float m5387g = m5387g(this.f8912i);
        if (width <= m5387g) {
            int i3 = C08894.f8933a[this.f8903C.ordinal()];
            if (i3 != 2) {
                if (i3 != 3) {
                    f5 = (m5387g - width) / 2.0f;
                    f6 = m5384d.left;
                } else {
                    f5 = m5387g - width;
                    f6 = m5384d.left;
                }
                f7 = f5 - f6;
            } else {
                f7 = -m5384d.left;
            }
            this.f8901A = 2;
        } else {
            float f8 = m5384d.left;
            if (f8 > 0.0f) {
                this.f8901A = 0;
                f7 = -f8;
            } else {
                float f9 = m5384d.right;
                if (f9 < m5387g) {
                    f7 = m5387g - f9;
                    this.f8901A = 1;
                } else {
                    this.f8901A = -1;
                }
            }
        }
        this.f8917n.postTranslate(f7, f4);
        return true;
    }

    /* renamed from: c */
    public RectF m5383c() {
        m5382b();
        return m5384d(m5385e());
    }

    /* renamed from: d */
    public final RectF m5384d(Matrix matrix) {
        if (this.f8912i.getDrawable() == null) {
            return null;
        }
        this.f8918o.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.f8918o);
        return this.f8918o;
    }

    /* renamed from: e */
    public final Matrix m5385e() {
        this.f8916m.set(this.f8915l);
        this.f8916m.postConcat(this.f8917n);
        return this.f8916m;
    }

    /* renamed from: f */
    public final int m5386f(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: g */
    public final int m5387g(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: h */
    public float m5388h() {
        this.f8917n.getValues(this.f8919p);
        float pow = (float) Math.pow(this.f8919p[0], 2.0d);
        this.f8917n.getValues(this.f8919p);
        return (float) Math.sqrt(pow + ((float) Math.pow(this.f8919p[3], 2.0d)));
    }

    /* renamed from: i */
    public final void m5389i() {
        RectF m5384d;
        this.f8917n.reset();
        this.f8917n.postRotate(0.0f);
        m5381a();
        Matrix m5385e = m5385e();
        this.f8912i.setImageMatrix(m5385e);
        if (this.f8920q != null && (m5384d = m5384d(m5385e)) != null) {
            this.f8920q.m5375a(m5384d);
        }
        m5382b();
    }

    /* renamed from: j */
    public void m5390j(float f2, float f3, float f4, boolean z) {
        if (f2 < this.f8907d || f2 > this.f8909f) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f8912i.post(new AnimatedZoomRunnable(m5388h(), f2, f3, f4));
        } else {
            this.f8917n.setScale(f2, f2, f3, f4);
            m5381a();
        }
    }

    /* renamed from: k */
    public void m5391k(float f2, boolean z) {
        m5390j(f2, this.f8912i.getRight() / 2, this.f8912i.getBottom() / 2, z);
    }

    /* renamed from: l */
    public void m5392l() {
        if (this.f8902B) {
            m5393m(this.f8912i.getDrawable());
        } else {
            m5389i();
        }
    }

    /* renamed from: m */
    public final void m5393m(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float m5387g = m5387g(this.f8912i);
        float m5386f = m5386f(this.f8912i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f8915l.reset();
        float f2 = intrinsicWidth;
        float f3 = m5387g / f2;
        float f4 = intrinsicHeight;
        float f5 = m5386f / f4;
        ImageView.ScaleType scaleType = this.f8903C;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f8915l.postTranslate((m5387g - f2) / 2.0f, (m5386f - f4) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f3, f5);
            this.f8915l.postScale(max, max);
            this.f8915l.postTranslate((m5387g - (f2 * max)) / 2.0f, (m5386f - (f4 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f3, f5));
            this.f8915l.postScale(min, min);
            this.f8915l.postTranslate((m5387g - (f2 * min)) / 2.0f, (m5386f - (f4 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
            RectF rectF2 = new RectF(0.0f, 0.0f, m5387g, m5386f);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f4, f2);
            }
            int i2 = C08894.f8933a[this.f8903C.ordinal()];
            if (i2 == 1) {
                this.f8915l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i2 == 2) {
                this.f8915l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 3) {
                this.f8915l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i2 == 4) {
                this.f8915l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m5389i();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i2 == i6 && i3 == i7 && i4 == i8 && i5 == i9) {
            return;
        }
        m5393m(this.f8912i.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f8902B
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lcc
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto Lcc
            int r0 = r12.getAction()
            if (r0 == 0) goto L73
            if (r0 == r2) goto L20
            r3 = 3
            if (r0 == r3) goto L20
            goto L88
        L20:
            float r0 = r10.m5388h()
            float r3 = r10.f8907d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L49
            android.graphics.RectF r0 = r10.m5383c()
            if (r0 == 0) goto L88
            com.github.chrisbanes.photoview.PhotoViewAttacher$AnimatedZoomRunnable r9 = new com.github.chrisbanes.photoview.PhotoViewAttacher$AnimatedZoomRunnable
            float r5 = r10.m5388h()
            float r6 = r10.f8907d
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L71
        L49:
            float r0 = r10.m5388h()
            float r3 = r10.f8909f
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L88
            android.graphics.RectF r0 = r10.m5383c()
            if (r0 == 0) goto L88
            com.github.chrisbanes.photoview.PhotoViewAttacher$AnimatedZoomRunnable r9 = new com.github.chrisbanes.photoview.PhotoViewAttacher$AnimatedZoomRunnable
            float r5 = r10.m5388h()
            float r6 = r10.f8909f
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L71:
            r11 = 1
            goto L89
        L73:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L7c
            r11.requestDisallowInterceptTouchEvent(r2)
        L7c:
            com.github.chrisbanes.photoview.PhotoViewAttacher$FlingRunnable r11 = r10.f8929z
            if (r11 == 0) goto L88
            android.widget.OverScroller r11 = r11.f8940b
            r11.forceFinished(r2)
            r11 = 0
            r10.f8929z = r11
        L88:
            r11 = 0
        L89:
            com.github.chrisbanes.photoview.CustomGestureDetector r0 = r10.f8914k
            if (r0 == 0) goto Lc0
            boolean r11 = r0.m5370c()
            com.github.chrisbanes.photoview.CustomGestureDetector r0 = r10.f8914k
            boolean r3 = r0.f8892e
            android.view.ScaleGestureDetector r4 = r0.f8890c     // Catch: java.lang.IllegalArgumentException -> L9e
            r4.onTouchEvent(r12)     // Catch: java.lang.IllegalArgumentException -> L9e
            r0.m5371d(r12)     // Catch: java.lang.IllegalArgumentException -> L9e
            goto L9f
        L9e:
        L9f:
            if (r11 != 0) goto Lab
            com.github.chrisbanes.photoview.CustomGestureDetector r11 = r10.f8914k
            boolean r11 = r11.m5370c()
            if (r11 != 0) goto Lab
            r11 = 1
            goto Lac
        Lab:
            r11 = 0
        Lac:
            if (r3 != 0) goto Lb6
            com.github.chrisbanes.photoview.CustomGestureDetector r0 = r10.f8914k
            boolean r0 = r0.f8892e
            if (r0 != 0) goto Lb6
            r0 = 1
            goto Lb7
        Lb6:
            r0 = 0
        Lb7:
            if (r11 == 0) goto Lbc
            if (r0 == 0) goto Lbc
            r1 = 1
        Lbc:
            r10.f8911h = r1
            r1 = 1
            goto Lc1
        Lc0:
            r1 = r11
        Lc1:
            android.view.GestureDetector r11 = r10.f8913j
            if (r11 == 0) goto Lcc
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto Lcc
            r1 = 1
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.chrisbanes.photoview.PhotoViewAttacher.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
