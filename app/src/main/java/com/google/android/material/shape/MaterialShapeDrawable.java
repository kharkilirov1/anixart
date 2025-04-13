package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.ShapePath;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {

    /* renamed from: y */
    public static final Paint f18632y;

    /* renamed from: b */
    public MaterialShapeDrawableState f18633b;

    /* renamed from: c */
    public final ShapePath.ShadowCompatOperation[] f18634c;

    /* renamed from: d */
    public final ShapePath.ShadowCompatOperation[] f18635d;

    /* renamed from: e */
    public final BitSet f18636e;

    /* renamed from: f */
    public boolean f18637f;

    /* renamed from: g */
    public final Matrix f18638g;

    /* renamed from: h */
    public final Path f18639h;

    /* renamed from: i */
    public final Path f18640i;

    /* renamed from: j */
    public final RectF f18641j;

    /* renamed from: k */
    public final RectF f18642k;

    /* renamed from: l */
    public final Region f18643l;

    /* renamed from: m */
    public final Region f18644m;

    /* renamed from: n */
    public ShapeAppearanceModel f18645n;

    /* renamed from: o */
    public final Paint f18646o;

    /* renamed from: p */
    public final Paint f18647p;

    /* renamed from: q */
    public final ShadowRenderer f18648q;

    /* renamed from: r */
    @NonNull
    public final ShapeAppearancePathProvider.PathListener f18649r;

    /* renamed from: s */
    public final ShapeAppearancePathProvider f18650s;

    /* renamed from: t */
    @Nullable
    public PorterDuffColorFilter f18651t;

    /* renamed from: u */
    @Nullable
    public PorterDuffColorFilter f18652u;

    /* renamed from: v */
    public int f18653v;

    /* renamed from: w */
    @NonNull
    public final RectF f18654w;

    /* renamed from: x */
    public boolean f18655x;

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$2 */
    class C13672 implements ShapeAppearanceModel.CornerSizeUnaryOperator {

        /* renamed from: a */
        public final /* synthetic */ float f18657a;

        public C13672(MaterialShapeDrawable materialShapeDrawable, float f2) {
            this.f18657a = f2;
        }

        @NonNull
        /* renamed from: a */
        public CornerSize m10306a(@NonNull CornerSize cornerSize) {
            return cornerSize instanceof RelativeCornerSize ? cornerSize : new AdjustedCornerSize(this.f18657a, cornerSize);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    static {
        Paint paint = new Paint(1);
        f18632y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    @NonNull
    /* renamed from: f */
    public static MaterialShapeDrawable m10268f(Context context, float f2) {
        int m9970c = MaterialColors.m9970c(context, C2507R.attr.colorSurface, "MaterialShapeDrawable");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.f18633b.f18659b = new ElevationOverlayProvider(context);
        materialShapeDrawable.m10279K();
        materialShapeDrawable.m10301x(ColorStateList.valueOf(m9970c));
        MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.f18633b;
        if (materialShapeDrawableState.f18672o != f2) {
            materialShapeDrawableState.f18672o = f2;
            materialShapeDrawable.m10279K();
        }
        return materialShapeDrawable;
    }

    /* renamed from: A */
    public void m10269A(int i2) {
        this.f18648q.m10264c(i2);
        this.f18633b.f18678u = false;
        super.invalidateSelf();
    }

    /* renamed from: B */
    public void m10270B(int i2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        if (materialShapeDrawableState.f18677t != i2) {
            materialShapeDrawableState.f18677t = i2;
            super.invalidateSelf();
        }
    }

    /* renamed from: C */
    public void m10271C(int i2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        if (materialShapeDrawableState.f18674q != i2) {
            materialShapeDrawableState.f18674q = i2;
            super.invalidateSelf();
        }
    }

    @RestrictTo
    /* renamed from: D */
    public void m10272D(int i2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        if (materialShapeDrawableState.f18676s != i2) {
            materialShapeDrawableState.f18676s = i2;
            super.invalidateSelf();
        }
    }

    /* renamed from: E */
    public void m10273E(float f2, @ColorInt int i2) {
        this.f18633b.f18669l = f2;
        invalidateSelf();
        m10275G(ColorStateList.valueOf(i2));
    }

    /* renamed from: F */
    public void m10274F(float f2, @Nullable ColorStateList colorStateList) {
        this.f18633b.f18669l = f2;
        invalidateSelf();
        m10275G(colorStateList);
    }

    /* renamed from: G */
    public void m10275G(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        if (materialShapeDrawableState.f18662e != colorStateList) {
            materialShapeDrawableState.f18662e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: H */
    public void m10276H(float f2) {
        this.f18633b.f18669l = f2;
        invalidateSelf();
    }

    /* renamed from: I */
    public final boolean m10277I(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f18633b.f18661d == null || color2 == (colorForState2 = this.f18633b.f18661d.getColorForState(iArr, (color2 = this.f18646o.getColor())))) {
            z = false;
        } else {
            this.f18646o.setColor(colorForState2);
            z = true;
        }
        if (this.f18633b.f18662e == null || color == (colorForState = this.f18633b.f18662e.getColorForState(iArr, (color = this.f18647p.getColor())))) {
            return z;
        }
        this.f18647p.setColor(colorForState);
        return true;
    }

    /* renamed from: J */
    public final boolean m10278J() {
        PorterDuffColorFilter porterDuffColorFilter = this.f18651t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f18652u;
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        this.f18651t = m10282d(materialShapeDrawableState.f18664g, materialShapeDrawableState.f18665h, this.f18646o, true);
        MaterialShapeDrawableState materialShapeDrawableState2 = this.f18633b;
        this.f18652u = m10282d(materialShapeDrawableState2.f18663f, materialShapeDrawableState2.f18665h, this.f18647p, false);
        MaterialShapeDrawableState materialShapeDrawableState3 = this.f18633b;
        if (materialShapeDrawableState3.f18678u) {
            this.f18648q.m10264c(materialShapeDrawableState3.f18664g.getColorForState(getState(), 0));
        }
        return (ObjectsCompat.m2022a(porterDuffColorFilter, this.f18651t) && ObjectsCompat.m2022a(porterDuffColorFilter2, this.f18652u)) ? false : true;
    }

    /* renamed from: K */
    public final void m10279K() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        float f2 = materialShapeDrawableState.f18672o + materialShapeDrawableState.f18673p;
        materialShapeDrawableState.f18675r = (int) Math.ceil(0.75f * f2);
        this.f18633b.f18676s = (int) Math.ceil(f2 * 0.25f);
        m10278J();
        super.invalidateSelf();
    }

    /* renamed from: b */
    public final void m10280b(@NonNull RectF rectF, @NonNull Path path) {
        m10281c(rectF, path);
        if (this.f18633b.f18667j != 1.0f) {
            this.f18638g.reset();
            Matrix matrix = this.f18638g;
            float f2 = this.f18633b.f18667j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f18638g);
        }
        path.computeBounds(this.f18654w, true);
    }

    @RestrictTo
    /* renamed from: c */
    public final void m10281c(@NonNull RectF rectF, @NonNull Path path) {
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.f18650s;
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        shapeAppearancePathProvider.m10328b(materialShapeDrawableState.f18658a, materialShapeDrawableState.f18668k, rectF, this.f18649r, path);
    }

    @NonNull
    /* renamed from: d */
    public final PorterDuffColorFilter m10282d(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = m10283e(colorForState);
            }
            this.f18653v = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            int m10283e = m10283e(color);
            this.f18653v = m10283e;
            if (m10283e != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(m10283e, PorterDuff.Mode.SRC_IN);
                return porterDuffColorFilter;
            }
        }
        porterDuffColorFilter = null;
        return porterDuffColorFilter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        if (((m10297t() || r10.f18639h.isConvex() || android.os.Build.VERSION.SDK_INT >= 29) ? false : true) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016f  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.shape.MaterialShapeDrawable.draw(android.graphics.Canvas):void");
    }

    @ColorInt
    @RestrictTo
    /* renamed from: e */
    public int m10283e(@ColorInt int i2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        float f2 = materialShapeDrawableState.f18672o + materialShapeDrawableState.f18673p + materialShapeDrawableState.f18671n;
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawableState.f18659b;
        return elevationOverlayProvider != null ? elevationOverlayProvider.m10047a(i2, f2) : i2;
    }

    /* renamed from: g */
    public final void m10284g(@NonNull Canvas canvas) {
        if (this.f18636e.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f18633b.f18676s != 0) {
            canvas.drawPath(this.f18639h, this.f18648q.f18620a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ShapePath.ShadowCompatOperation shadowCompatOperation = this.f18634c[i2];
            ShadowRenderer shadowRenderer = this.f18648q;
            int i3 = this.f18633b.f18675r;
            Matrix matrix = ShapePath.ShadowCompatOperation.f18754b;
            shadowCompatOperation.mo10337a(matrix, shadowRenderer, i3, canvas);
            this.f18635d[i2].mo10337a(matrix, this.f18648q, this.f18633b.f18675r, canvas);
        }
        if (this.f18655x) {
            int m10291n = m10291n();
            int m10292o = m10292o();
            canvas.translate(-m10291n, -m10292o);
            canvas.drawPath(this.f18639h, f18632y);
            canvas.translate(m10291n, m10292o);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18633b.f18670m;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f18633b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi
    public void getOutline(@NonNull Outline outline) {
        if (this.f18633b.f18674q == 2) {
            return;
        }
        if (m10297t()) {
            outline.setRoundRect(getBounds(), m10294q() * this.f18633b.f18668k);
            return;
        }
        m10280b(m10288k(), this.f18639h);
        if (this.f18639h.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f18639h);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f18633b.f18666i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f18633b.f18658a;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f18643l.set(getBounds());
        m10280b(m10288k(), this.f18639h);
        this.f18644m.setPath(this.f18639h, this.f18643l);
        this.f18643l.op(this.f18644m, Region.Op.DIFFERENCE);
        return this.f18643l;
    }

    @RestrictTo
    /* renamed from: h */
    public void m10285h(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        m10286i(canvas, paint, path, this.f18633b.f18658a, rectF);
    }

    /* renamed from: i */
    public final void m10286i(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull ShapeAppearanceModel shapeAppearanceModel, @NonNull RectF rectF) {
        if (!shapeAppearanceModel.m10316f(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float mo10265a = shapeAppearanceModel.f18689f.mo10265a(rectF) * this.f18633b.f18668k;
            canvas.drawRoundRect(rectF, mo10265a, mo10265a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f18637f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f18633b.f18664g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f18633b.f18663f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f18633b.f18662e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f18633b.f18661d) != null && colorStateList4.isStateful())));
    }

    @RestrictTo
    /* renamed from: j */
    public void mo10287j(@NonNull Canvas canvas) {
        Paint paint = this.f18647p;
        Path path = this.f18640i;
        ShapeAppearanceModel shapeAppearanceModel = this.f18645n;
        this.f18642k.set(m10288k());
        float m10293p = m10293p();
        this.f18642k.inset(m10293p, m10293p);
        m10286i(canvas, paint, path, shapeAppearanceModel, this.f18642k);
    }

    @NonNull
    /* renamed from: k */
    public RectF m10288k() {
        this.f18641j.set(getBounds());
        return this.f18641j;
    }

    /* renamed from: l */
    public float m10289l() {
        return this.f18633b.f18672o;
    }

    @Nullable
    /* renamed from: m */
    public ColorStateList m10290m() {
        return this.f18633b.f18661d;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f18633b = new MaterialShapeDrawableState(this.f18633b);
        return this;
    }

    /* renamed from: n */
    public int m10291n() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        return (int) (Math.sin(Math.toRadians(materialShapeDrawableState.f18677t)) * materialShapeDrawableState.f18676s);
    }

    /* renamed from: o */
    public int m10292o() {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        return (int) (Math.cos(Math.toRadians(materialShapeDrawableState.f18677t)) * materialShapeDrawableState.f18676s);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f18637f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        boolean z = m10277I(iArr) || m10278J();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public final float m10293p() {
        if (m10295r()) {
            return this.f18647p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: q */
    public float m10294q() {
        return this.f18633b.f18658a.f18688e.mo10265a(m10288k());
    }

    /* renamed from: r */
    public final boolean m10295r() {
        Paint.Style style = this.f18633b.f18679v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f18647p.getStrokeWidth() > 0.0f;
    }

    /* renamed from: s */
    public void m10296s(Context context) {
        this.f18633b.f18659b = new ElevationOverlayProvider(context);
        m10279K();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange int i2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        if (materialShapeDrawableState.f18670m != i2) {
            materialShapeDrawableState.f18670m = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f18633b.f18660c = colorFilter;
        super.invalidateSelf();
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f18633b.f18658a = shapeAppearanceModel;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f18633b.f18664g = colorStateList;
        m10278J();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        if (materialShapeDrawableState.f18665h != mode) {
            materialShapeDrawableState.f18665h = mode;
            m10278J();
            super.invalidateSelf();
        }
    }

    @RestrictTo
    /* renamed from: t */
    public boolean m10297t() {
        return this.f18633b.f18658a.m10316f(m10288k());
    }

    /* renamed from: u */
    public void m10298u(float f2) {
        this.f18633b.f18658a = this.f18633b.f18658a.m10317g(f2);
        invalidateSelf();
    }

    /* renamed from: v */
    public void m10299v(@NonNull CornerSize cornerSize) {
        ShapeAppearanceModel shapeAppearanceModel = this.f18633b.f18658a;
        Objects.requireNonNull(shapeAppearanceModel);
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder(shapeAppearanceModel);
        builder.f18700e = cornerSize;
        builder.f18701f = cornerSize;
        builder.f18702g = cornerSize;
        builder.f18703h = cornerSize;
        this.f18633b.f18658a = builder.m10320a();
        invalidateSelf();
    }

    /* renamed from: w */
    public void m10300w(float f2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        if (materialShapeDrawableState.f18672o != f2) {
            materialShapeDrawableState.f18672o = f2;
            m10279K();
        }
    }

    /* renamed from: x */
    public void m10301x(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        if (materialShapeDrawableState.f18661d != colorStateList) {
            materialShapeDrawableState.f18661d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: y */
    public void m10302y(float f2) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        if (materialShapeDrawableState.f18668k != f2) {
            materialShapeDrawableState.f18668k = f2;
            this.f18637f = true;
            invalidateSelf();
        }
    }

    /* renamed from: z */
    public void m10303z(int i2, int i3, int i4, int i5) {
        MaterialShapeDrawableState materialShapeDrawableState = this.f18633b;
        if (materialShapeDrawableState.f18666i == null) {
            materialShapeDrawableState.f18666i = new Rect();
        }
        this.f18633b.f18666i.set(i2, i3, i4, i5);
        invalidateSelf();
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        this(ShapeAppearanceModel.m10313c(context, attributeSet, i2, i3).m10320a());
    }

    public MaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel, null));
    }

    public MaterialShapeDrawable(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
        ShapeAppearancePathProvider shapeAppearancePathProvider;
        this.f18634c = new ShapePath.ShadowCompatOperation[4];
        this.f18635d = new ShapePath.ShadowCompatOperation[4];
        this.f18636e = new BitSet(8);
        this.f18638g = new Matrix();
        this.f18639h = new Path();
        this.f18640i = new Path();
        this.f18641j = new RectF();
        this.f18642k = new RectF();
        this.f18643l = new Region();
        this.f18644m = new Region();
        Paint paint = new Paint(1);
        this.f18646o = paint;
        Paint paint2 = new Paint(1);
        this.f18647p = paint2;
        this.f18648q = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            shapeAppearancePathProvider = ShapeAppearancePathProvider.Lazy.f18720a;
        } else {
            shapeAppearancePathProvider = new ShapeAppearancePathProvider();
        }
        this.f18650s = shapeAppearancePathProvider;
        this.f18654w = new RectF();
        this.f18655x = true;
        this.f18633b = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m10278J();
        m10277I(getState());
        this.f18649r = new ShapeAppearancePathProvider.PathListener() { // from class: com.google.android.material.shape.MaterialShapeDrawable.1
            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            /* renamed from: a */
            public void mo10304a(@NonNull ShapePath shapePath, Matrix matrix, int i2) {
                BitSet bitSet = MaterialShapeDrawable.this.f18636e;
                Objects.requireNonNull(shapePath);
                bitSet.set(i2, false);
                ShapePath.ShadowCompatOperation[] shadowCompatOperationArr = MaterialShapeDrawable.this.f18634c;
                shapePath.m10331b(shapePath.f18731f);
                shadowCompatOperationArr[i2] = new ShapePath.C13691(shapePath, new ArrayList(shapePath.f18733h), new Matrix(matrix));
            }

            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            /* renamed from: b */
            public void mo10305b(@NonNull ShapePath shapePath, Matrix matrix, int i2) {
                Objects.requireNonNull(shapePath);
                MaterialShapeDrawable.this.f18636e.set(i2 + 4, false);
                ShapePath.ShadowCompatOperation[] shadowCompatOperationArr = MaterialShapeDrawable.this.f18635d;
                shapePath.m10331b(shapePath.f18731f);
                shadowCompatOperationArr[i2] = new ShapePath.C13691(shapePath, new ArrayList(shapePath.f18733h), new Matrix(matrix));
            }
        };
    }

    public static final class MaterialShapeDrawableState extends Drawable.ConstantState {

        /* renamed from: a */
        @NonNull
        public ShapeAppearanceModel f18658a;

        /* renamed from: b */
        @Nullable
        public ElevationOverlayProvider f18659b;

        /* renamed from: c */
        @Nullable
        public ColorFilter f18660c;

        /* renamed from: d */
        @Nullable
        public ColorStateList f18661d;

        /* renamed from: e */
        @Nullable
        public ColorStateList f18662e;

        /* renamed from: f */
        @Nullable
        public ColorStateList f18663f;

        /* renamed from: g */
        @Nullable
        public ColorStateList f18664g;

        /* renamed from: h */
        @Nullable
        public PorterDuff.Mode f18665h;

        /* renamed from: i */
        @Nullable
        public Rect f18666i;

        /* renamed from: j */
        public float f18667j;

        /* renamed from: k */
        public float f18668k;

        /* renamed from: l */
        public float f18669l;

        /* renamed from: m */
        public int f18670m;

        /* renamed from: n */
        public float f18671n;

        /* renamed from: o */
        public float f18672o;

        /* renamed from: p */
        public float f18673p;

        /* renamed from: q */
        public int f18674q;

        /* renamed from: r */
        public int f18675r;

        /* renamed from: s */
        public int f18676s;

        /* renamed from: t */
        public int f18677t;

        /* renamed from: u */
        public boolean f18678u;

        /* renamed from: v */
        public Paint.Style f18679v;

        public MaterialShapeDrawableState(ShapeAppearanceModel shapeAppearanceModel, ElevationOverlayProvider elevationOverlayProvider) {
            this.f18661d = null;
            this.f18662e = null;
            this.f18663f = null;
            this.f18664g = null;
            this.f18665h = PorterDuff.Mode.SRC_IN;
            this.f18666i = null;
            this.f18667j = 1.0f;
            this.f18668k = 1.0f;
            this.f18670m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f18671n = 0.0f;
            this.f18672o = 0.0f;
            this.f18673p = 0.0f;
            this.f18674q = 0;
            this.f18675r = 0;
            this.f18676s = 0;
            this.f18677t = 0;
            this.f18678u = false;
            this.f18679v = Paint.Style.FILL_AND_STROKE;
            this.f18658a = shapeAppearanceModel;
            this.f18659b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f18637f = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
            this.f18661d = null;
            this.f18662e = null;
            this.f18663f = null;
            this.f18664g = null;
            this.f18665h = PorterDuff.Mode.SRC_IN;
            this.f18666i = null;
            this.f18667j = 1.0f;
            this.f18668k = 1.0f;
            this.f18670m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f18671n = 0.0f;
            this.f18672o = 0.0f;
            this.f18673p = 0.0f;
            this.f18674q = 0;
            this.f18675r = 0;
            this.f18676s = 0;
            this.f18677t = 0;
            this.f18678u = false;
            this.f18679v = Paint.Style.FILL_AND_STROKE;
            this.f18658a = materialShapeDrawableState.f18658a;
            this.f18659b = materialShapeDrawableState.f18659b;
            this.f18669l = materialShapeDrawableState.f18669l;
            this.f18660c = materialShapeDrawableState.f18660c;
            this.f18661d = materialShapeDrawableState.f18661d;
            this.f18662e = materialShapeDrawableState.f18662e;
            this.f18665h = materialShapeDrawableState.f18665h;
            this.f18664g = materialShapeDrawableState.f18664g;
            this.f18670m = materialShapeDrawableState.f18670m;
            this.f18667j = materialShapeDrawableState.f18667j;
            this.f18676s = materialShapeDrawableState.f18676s;
            this.f18674q = materialShapeDrawableState.f18674q;
            this.f18678u = materialShapeDrawableState.f18678u;
            this.f18668k = materialShapeDrawableState.f18668k;
            this.f18671n = materialShapeDrawableState.f18671n;
            this.f18672o = materialShapeDrawableState.f18672o;
            this.f18673p = materialShapeDrawableState.f18673p;
            this.f18675r = materialShapeDrawableState.f18675r;
            this.f18677t = materialShapeDrawableState.f18677t;
            this.f18663f = materialShapeDrawableState.f18663f;
            this.f18679v = materialShapeDrawableState.f18679v;
            if (materialShapeDrawableState.f18666i != null) {
                this.f18666i = new Rect(materialShapeDrawableState.f18666i);
            }
        }
    }
}
