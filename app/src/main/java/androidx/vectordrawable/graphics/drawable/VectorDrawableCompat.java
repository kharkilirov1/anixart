package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class VectorDrawableCompat extends VectorDrawableCommon {

    /* renamed from: k */
    public static final PorterDuff.Mode f6409k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public VectorDrawableCompatState f6410c;

    /* renamed from: d */
    public PorterDuffColorFilter f6411d;

    /* renamed from: e */
    public ColorFilter f6412e;

    /* renamed from: f */
    public boolean f6413f;

    /* renamed from: g */
    public boolean f6414g;

    /* renamed from: h */
    public final float[] f6415h;

    /* renamed from: i */
    public final Matrix f6416i;

    /* renamed from: j */
    public final Rect f6417j;

    public static class VClipPath extends VPath {
        public VClipPath() {
        }

        public VClipPath(VClipPath vClipPath) {
            super(vClipPath);
        }
    }

    public static abstract class VObject {
        public VObject() {
        }

        /* renamed from: a */
        public boolean mo4305a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo4306b(int[] iArr) {
            return false;
        }

        public VObject(C06521 c06521) {
        }
    }

    public static class VectorDrawableCompatState extends Drawable.ConstantState {

        /* renamed from: a */
        public int f6464a;

        /* renamed from: b */
        public VPathRenderer f6465b;

        /* renamed from: c */
        public ColorStateList f6466c;

        /* renamed from: d */
        public PorterDuff.Mode f6467d;

        /* renamed from: e */
        public boolean f6468e;

        /* renamed from: f */
        public Bitmap f6469f;

        /* renamed from: g */
        public ColorStateList f6470g;

        /* renamed from: h */
        public PorterDuff.Mode f6471h;

        /* renamed from: i */
        public int f6472i;

        /* renamed from: j */
        public boolean f6473j;

        /* renamed from: k */
        public boolean f6474k;

        /* renamed from: l */
        public Paint f6475l;

        public VectorDrawableCompatState(VectorDrawableCompatState vectorDrawableCompatState) {
            this.f6466c = null;
            this.f6467d = VectorDrawableCompat.f6409k;
            if (vectorDrawableCompatState != null) {
                this.f6464a = vectorDrawableCompatState.f6464a;
                VPathRenderer vPathRenderer = new VPathRenderer(vectorDrawableCompatState.f6465b);
                this.f6465b = vPathRenderer;
                if (vectorDrawableCompatState.f6465b.f6452e != null) {
                    vPathRenderer.f6452e = new Paint(vectorDrawableCompatState.f6465b.f6452e);
                }
                if (vectorDrawableCompatState.f6465b.f6451d != null) {
                    this.f6465b.f6451d = new Paint(vectorDrawableCompatState.f6465b.f6451d);
                }
                this.f6466c = vectorDrawableCompatState.f6466c;
                this.f6467d = vectorDrawableCompatState.f6467d;
                this.f6468e = vectorDrawableCompatState.f6468e;
            }
        }

        /* renamed from: a */
        public boolean m4309a() {
            VPathRenderer vPathRenderer = this.f6465b;
            if (vPathRenderer.f6462o == null) {
                vPathRenderer.f6462o = Boolean.valueOf(vPathRenderer.f6455h.mo4305a());
            }
            return vPathRenderer.f6462o.booleanValue();
        }

        /* renamed from: b */
        public void m4310b(int i2, int i3) {
            this.f6469f.eraseColor(0);
            Canvas canvas = new Canvas(this.f6469f);
            VPathRenderer vPathRenderer = this.f6465b;
            vPathRenderer.m4308a(vPathRenderer.f6455h, VPathRenderer.f6447q, canvas, i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6464a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        public VectorDrawableCompatState() {
            this.f6466c = null;
            this.f6467d = VectorDrawableCompat.f6409k;
            this.f6465b = new VPathRenderer();
        }
    }

    public VectorDrawableCompat() {
        this.f6414g = true;
        this.f6415h = new float[9];
        this.f6416i = new Matrix();
        this.f6417j = new Rect();
        this.f6410c = new VectorDrawableCompatState();
    }

    /* renamed from: a */
    public static VectorDrawableCompat m4303a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    /* renamed from: b */
    public PorterDuffColorFilter m4304b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6408b;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.m1830b(drawable);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if ((r1 == r7.getWidth() && r3 == r6.f6469f.getHeight()) == false) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6408b;
        return drawable != null ? DrawableCompat.m1832d(drawable) : this.f6410c.f6465b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6410c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6408b;
        return drawable != null ? DrawableCompat.m1833e(drawable) : this.f6412e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6408b != null && Build.VERSION.SDK_INT >= 24) {
            return new VectorDrawableDelegateState(this.f6408b.getConstantState());
        }
        this.f6410c.f6464a = getChangingConfigurations();
        return this.f6410c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6410c.f6465b.f6457j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6410c.f6465b.f6456i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6408b;
        return drawable != null ? DrawableCompat.m1836h(drawable) : this.f6410c.f6468e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        VectorDrawableCompatState vectorDrawableCompatState;
        ColorStateList colorStateList;
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((vectorDrawableCompatState = this.f6410c) != null && (vectorDrawableCompatState.m4309a() || ((colorStateList = this.f6410c.f6466c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6413f && super.mutate() == this) {
            this.f6410c = new VectorDrawableCompatState(this.f6410c);
            this.f6413f = true;
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        VectorDrawableCompatState vectorDrawableCompatState = this.f6410c;
        ColorStateList colorStateList = vectorDrawableCompatState.f6466c;
        if (colorStateList != null && (mode = vectorDrawableCompatState.f6467d) != null) {
            this.f6411d = m4304b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (vectorDrawableCompatState.m4309a()) {
            boolean mo4306b = vectorDrawableCompatState.f6465b.f6455h.mo4306b(iArr);
            vectorDrawableCompatState.f6474k |= mo4306b;
            if (mo4306b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f6410c.f6465b.getRootAlpha() != i2) {
            this.f6410c.f6465b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            DrawableCompat.m1837i(drawable, z);
        } else {
            this.f6410c.f6468e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6412e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            DrawableCompat.m1841m(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            DrawableCompat.m1842n(drawable, colorStateList);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f6410c;
        if (vectorDrawableCompatState.f6466c != colorStateList) {
            vectorDrawableCompatState.f6466c = colorStateList;
            this.f6411d = m4304b(colorStateList, vectorDrawableCompatState.f6467d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            DrawableCompat.m1843o(drawable, mode);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.f6410c;
        if (vectorDrawableCompatState.f6467d != mode) {
            vectorDrawableCompatState.f6467d = mode;
            this.f6411d = m4304b(vectorDrawableCompatState.f6466c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f6408b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6408b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi
    public static class VectorDrawableDelegateState extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f6476a;

        public VectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f6476a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6476a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6476a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f6408b = (VectorDrawable) this.f6476a.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f6408b = (VectorDrawable) this.f6476a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f6408b = (VectorDrawable) this.f6476a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    public static abstract class VPath extends VObject {

        /* renamed from: a */
        public PathParser.PathDataNode[] f6443a;

        /* renamed from: b */
        public String f6444b;

        /* renamed from: c */
        public int f6445c;

        /* renamed from: d */
        public int f6446d;

        public VPath() {
            super(null);
            this.f6443a = null;
            this.f6445c = 0;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.f6443a;
        }

        public String getPathName() {
            return this.f6444b;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.m1786a(this.f6443a, pathDataNodeArr)) {
                this.f6443a = PathParser.m1790e(pathDataNodeArr);
                return;
            }
            PathParser.PathDataNode[] pathDataNodeArr2 = this.f6443a;
            for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
                pathDataNodeArr2[i2].f3374a = pathDataNodeArr[i2].f3374a;
                for (int i3 = 0; i3 < pathDataNodeArr[i2].f3375b.length; i3++) {
                    pathDataNodeArr2[i2].f3375b[i3] = pathDataNodeArr[i2].f3375b[i3];
                }
            }
        }

        public VPath(VPath vPath) {
            super(null);
            this.f6443a = null;
            this.f6445c = 0;
            this.f6444b = vPath.f6444b;
            this.f6446d = vPath.f6446d;
            this.f6443a = PathParser.m1790e(vPath.f6443a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public VectorDrawableCompat(@NonNull VectorDrawableCompatState vectorDrawableCompatState) {
        this.f6414g = true;
        this.f6415h = new float[9];
        this.f6416i = new Matrix();
        this.f6417j = new Rect();
        this.f6410c = vectorDrawableCompatState;
        this.f6411d = m4304b(vectorDrawableCompatState.f6466c, vectorDrawableCompatState.f6467d);
    }

    public static class VFullPath extends VPath {

        /* renamed from: e */
        public int[] f6418e;

        /* renamed from: f */
        public ComplexColorCompat f6419f;

        /* renamed from: g */
        public float f6420g;

        /* renamed from: h */
        public ComplexColorCompat f6421h;

        /* renamed from: i */
        public float f6422i;

        /* renamed from: j */
        public float f6423j;

        /* renamed from: k */
        public float f6424k;

        /* renamed from: l */
        public float f6425l;

        /* renamed from: m */
        public float f6426m;

        /* renamed from: n */
        public Paint.Cap f6427n;

        /* renamed from: o */
        public Paint.Join f6428o;

        /* renamed from: p */
        public float f6429p;

        public VFullPath() {
            this.f6420g = 0.0f;
            this.f6422i = 1.0f;
            this.f6423j = 1.0f;
            this.f6424k = 0.0f;
            this.f6425l = 1.0f;
            this.f6426m = 0.0f;
            this.f6427n = Paint.Cap.BUTT;
            this.f6428o = Paint.Join.MITER;
            this.f6429p = 4.0f;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        /* renamed from: a */
        public boolean mo4305a() {
            return this.f6421h.m1724c() || this.f6419f.m1724c();
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        /* renamed from: b */
        public boolean mo4306b(int[] iArr) {
            return this.f6419f.m1725d(iArr) | this.f6421h.m1725d(iArr);
        }

        public float getFillAlpha() {
            return this.f6423j;
        }

        @ColorInt
        public int getFillColor() {
            return this.f6421h.f3325c;
        }

        public float getStrokeAlpha() {
            return this.f6422i;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.f6419f.f3325c;
        }

        public float getStrokeWidth() {
            return this.f6420g;
        }

        public float getTrimPathEnd() {
            return this.f6425l;
        }

        public float getTrimPathOffset() {
            return this.f6426m;
        }

        public float getTrimPathStart() {
            return this.f6424k;
        }

        public void setFillAlpha(float f2) {
            this.f6423j = f2;
        }

        public void setFillColor(int i2) {
            this.f6421h.f3325c = i2;
        }

        public void setStrokeAlpha(float f2) {
            this.f6422i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f6419f.f3325c = i2;
        }

        public void setStrokeWidth(float f2) {
            this.f6420g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.f6425l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.f6426m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.f6424k = f2;
        }

        public VFullPath(VFullPath vFullPath) {
            super(vFullPath);
            this.f6420g = 0.0f;
            this.f6422i = 1.0f;
            this.f6423j = 1.0f;
            this.f6424k = 0.0f;
            this.f6425l = 1.0f;
            this.f6426m = 0.0f;
            this.f6427n = Paint.Cap.BUTT;
            this.f6428o = Paint.Join.MITER;
            this.f6429p = 4.0f;
            this.f6418e = vFullPath.f6418e;
            this.f6419f = vFullPath.f6419f;
            this.f6420g = vFullPath.f6420g;
            this.f6422i = vFullPath.f6422i;
            this.f6421h = vFullPath.f6421h;
            this.f6445c = vFullPath.f6445c;
            this.f6423j = vFullPath.f6423j;
            this.f6424k = vFullPath.f6424k;
            this.f6425l = vFullPath.f6425l;
            this.f6426m = vFullPath.f6426m;
            this.f6427n = vFullPath.f6427n;
            this.f6428o = vFullPath.f6428o;
            this.f6429p = vFullPath.f6429p;
        }
    }

    public static class VPathRenderer {

        /* renamed from: q */
        public static final Matrix f6447q = new Matrix();

        /* renamed from: a */
        public final Path f6448a;

        /* renamed from: b */
        public final Path f6449b;

        /* renamed from: c */
        public final Matrix f6450c;

        /* renamed from: d */
        public Paint f6451d;

        /* renamed from: e */
        public Paint f6452e;

        /* renamed from: f */
        public PathMeasure f6453f;

        /* renamed from: g */
        public int f6454g;

        /* renamed from: h */
        public final VGroup f6455h;

        /* renamed from: i */
        public float f6456i;

        /* renamed from: j */
        public float f6457j;

        /* renamed from: k */
        public float f6458k;

        /* renamed from: l */
        public float f6459l;

        /* renamed from: m */
        public int f6460m;

        /* renamed from: n */
        public String f6461n;

        /* renamed from: o */
        public Boolean f6462o;

        /* renamed from: p */
        public final ArrayMap<String, Object> f6463p;

        public VPathRenderer() {
            this.f6450c = new Matrix();
            this.f6456i = 0.0f;
            this.f6457j = 0.0f;
            this.f6458k = 0.0f;
            this.f6459l = 0.0f;
            this.f6460m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f6461n = null;
            this.f6462o = null;
            this.f6463p = new ArrayMap<>();
            this.f6455h = new VGroup();
            this.f6448a = new Path();
            this.f6449b = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* renamed from: a */
        public final void m4308a(VGroup vGroup, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            VPathRenderer vPathRenderer;
            VPathRenderer vPathRenderer2 = this;
            vGroup.f6430a.set(matrix);
            vGroup.f6430a.preConcat(vGroup.f6439j);
            canvas.save();
            ?? r11 = 0;
            int i4 = 0;
            while (i4 < vGroup.f6431b.size()) {
                VObject vObject = vGroup.f6431b.get(i4);
                if (vObject instanceof VGroup) {
                    m4308a((VGroup) vObject, vGroup.f6430a, canvas, i2, i3, colorFilter);
                } else if (vObject instanceof VPath) {
                    VPath vPath = (VPath) vObject;
                    float f2 = i2 / vPathRenderer2.f6458k;
                    float f3 = i3 / vPathRenderer2.f6459l;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = vGroup.f6430a;
                    vPathRenderer2.f6450c.set(matrix2);
                    vPathRenderer2.f6450c.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[r11], fArr[1]);
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                    if (abs == 0.0f) {
                        vPathRenderer = this;
                    } else {
                        vPathRenderer = this;
                        Path path = vPathRenderer.f6448a;
                        Objects.requireNonNull(vPath);
                        path.reset();
                        PathParser.PathDataNode[] pathDataNodeArr = vPath.f6443a;
                        if (pathDataNodeArr != null) {
                            PathParser.PathDataNode.m1792b(pathDataNodeArr, path);
                        }
                        Path path2 = vPathRenderer.f6448a;
                        vPathRenderer.f6449b.reset();
                        if (vPath instanceof VClipPath) {
                            vPathRenderer.f6449b.setFillType(vPath.f6445c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            vPathRenderer.f6449b.addPath(path2, vPathRenderer.f6450c);
                            canvas.clipPath(vPathRenderer.f6449b);
                        } else {
                            VFullPath vFullPath = (VFullPath) vPath;
                            float f5 = vFullPath.f6424k;
                            if (f5 != 0.0f || vFullPath.f6425l != 1.0f) {
                                float f6 = vFullPath.f6426m;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (vFullPath.f6425l + f6) % 1.0f;
                                if (vPathRenderer.f6453f == null) {
                                    vPathRenderer.f6453f = new PathMeasure();
                                }
                                vPathRenderer.f6453f.setPath(vPathRenderer.f6448a, r11);
                                float length = vPathRenderer.f6453f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path2.reset();
                                if (f9 > f10) {
                                    vPathRenderer.f6453f.getSegment(f9, length, path2, true);
                                    vPathRenderer.f6453f.getSegment(0.0f, f10, path2, true);
                                } else {
                                    vPathRenderer.f6453f.getSegment(f9, f10, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            vPathRenderer.f6449b.addPath(path2, vPathRenderer.f6450c);
                            ComplexColorCompat complexColorCompat = vFullPath.f6421h;
                            if (complexColorCompat.m1723b() || complexColorCompat.f3325c != 0) {
                                ComplexColorCompat complexColorCompat2 = vFullPath.f6421h;
                                if (vPathRenderer.f6452e == null) {
                                    Paint paint = new Paint(1);
                                    vPathRenderer.f6452e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = vPathRenderer.f6452e;
                                if (complexColorCompat2.m1723b()) {
                                    Shader shader = complexColorCompat2.f3323a;
                                    shader.setLocalMatrix(vPathRenderer.f6450c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(vFullPath.f6423j * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                    int i5 = complexColorCompat2.f3325c;
                                    float f11 = vFullPath.f6423j;
                                    PorterDuff.Mode mode = VectorDrawableCompat.f6409k;
                                    paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                                }
                                paint2.setColorFilter(colorFilter);
                                vPathRenderer.f6449b.setFillType(vFullPath.f6445c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(vPathRenderer.f6449b, paint2);
                            }
                            ComplexColorCompat complexColorCompat3 = vFullPath.f6419f;
                            if (complexColorCompat3.m1723b() || complexColorCompat3.f3325c != 0) {
                                ComplexColorCompat complexColorCompat4 = vFullPath.f6419f;
                                if (vPathRenderer.f6451d == null) {
                                    Paint paint3 = new Paint(1);
                                    vPathRenderer.f6451d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = vPathRenderer.f6451d;
                                Paint.Join join = vFullPath.f6428o;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = vFullPath.f6427n;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(vFullPath.f6429p);
                                if (complexColorCompat4.m1723b()) {
                                    Shader shader2 = complexColorCompat4.f3323a;
                                    shader2.setLocalMatrix(vPathRenderer.f6450c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(vFullPath.f6422i * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                    int i6 = complexColorCompat4.f3325c;
                                    float f12 = vFullPath.f6422i;
                                    PorterDuff.Mode mode2 = VectorDrawableCompat.f6409k;
                                    paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint4.setColorFilter(colorFilter);
                                paint4.setStrokeWidth(vFullPath.f6420g * abs * min);
                                canvas.drawPath(vPathRenderer.f6449b, paint4);
                            }
                        }
                    }
                    i4++;
                    vPathRenderer2 = vPathRenderer;
                    r11 = 0;
                }
                vPathRenderer = vPathRenderer2;
                i4++;
                vPathRenderer2 = vPathRenderer;
                r11 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f6460m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f6460m = i2;
        }

        public VPathRenderer(VPathRenderer vPathRenderer) {
            this.f6450c = new Matrix();
            this.f6456i = 0.0f;
            this.f6457j = 0.0f;
            this.f6458k = 0.0f;
            this.f6459l = 0.0f;
            this.f6460m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f6461n = null;
            this.f6462o = null;
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            this.f6463p = arrayMap;
            this.f6455h = new VGroup(vPathRenderer.f6455h, arrayMap);
            this.f6448a = new Path(vPathRenderer.f6448a);
            this.f6449b = new Path(vPathRenderer.f6449b);
            this.f6456i = vPathRenderer.f6456i;
            this.f6457j = vPathRenderer.f6457j;
            this.f6458k = vPathRenderer.f6458k;
            this.f6459l = vPathRenderer.f6459l;
            this.f6454g = vPathRenderer.f6454g;
            this.f6460m = vPathRenderer.f6460m;
            this.f6461n = vPathRenderer.f6461n;
            String str = vPathRenderer.f6461n;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.f6462o = vPathRenderer.f6462o;
        }
    }

    public static class VGroup extends VObject {

        /* renamed from: a */
        public final Matrix f6430a;

        /* renamed from: b */
        public final ArrayList<VObject> f6431b;

        /* renamed from: c */
        public float f6432c;

        /* renamed from: d */
        public float f6433d;

        /* renamed from: e */
        public float f6434e;

        /* renamed from: f */
        public float f6435f;

        /* renamed from: g */
        public float f6436g;

        /* renamed from: h */
        public float f6437h;

        /* renamed from: i */
        public float f6438i;

        /* renamed from: j */
        public final Matrix f6439j;

        /* renamed from: k */
        public int f6440k;

        /* renamed from: l */
        public int[] f6441l;

        /* renamed from: m */
        public String f6442m;

        public VGroup(VGroup vGroup, ArrayMap<String, Object> arrayMap) {
            super(null);
            VPath vClipPath;
            this.f6430a = new Matrix();
            this.f6431b = new ArrayList<>();
            this.f6432c = 0.0f;
            this.f6433d = 0.0f;
            this.f6434e = 0.0f;
            this.f6435f = 1.0f;
            this.f6436g = 1.0f;
            this.f6437h = 0.0f;
            this.f6438i = 0.0f;
            Matrix matrix = new Matrix();
            this.f6439j = matrix;
            this.f6442m = null;
            this.f6432c = vGroup.f6432c;
            this.f6433d = vGroup.f6433d;
            this.f6434e = vGroup.f6434e;
            this.f6435f = vGroup.f6435f;
            this.f6436g = vGroup.f6436g;
            this.f6437h = vGroup.f6437h;
            this.f6438i = vGroup.f6438i;
            this.f6441l = vGroup.f6441l;
            String str = vGroup.f6442m;
            this.f6442m = str;
            this.f6440k = vGroup.f6440k;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.f6439j);
            ArrayList<VObject> arrayList = vGroup.f6431b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                VObject vObject = arrayList.get(i2);
                if (vObject instanceof VGroup) {
                    this.f6431b.add(new VGroup((VGroup) vObject, arrayMap));
                } else {
                    if (vObject instanceof VFullPath) {
                        vClipPath = new VFullPath((VFullPath) vObject);
                    } else {
                        if (!(vObject instanceof VClipPath)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        vClipPath = new VClipPath((VClipPath) vObject);
                    }
                    this.f6431b.add(vClipPath);
                    String str2 = vClipPath.f6444b;
                    if (str2 != null) {
                        arrayMap.put(str2, vClipPath);
                    }
                }
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        /* renamed from: a */
        public boolean mo4305a() {
            for (int i2 = 0; i2 < this.f6431b.size(); i2++) {
                if (this.f6431b.get(i2).mo4305a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        /* renamed from: b */
        public boolean mo4306b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f6431b.size(); i2++) {
                z |= this.f6431b.get(i2).mo4306b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public final void m4307c() {
            this.f6439j.reset();
            this.f6439j.postTranslate(-this.f6433d, -this.f6434e);
            this.f6439j.postScale(this.f6435f, this.f6436g);
            this.f6439j.postRotate(this.f6432c, 0.0f, 0.0f);
            this.f6439j.postTranslate(this.f6437h + this.f6433d, this.f6438i + this.f6434e);
        }

        public String getGroupName() {
            return this.f6442m;
        }

        public Matrix getLocalMatrix() {
            return this.f6439j;
        }

        public float getPivotX() {
            return this.f6433d;
        }

        public float getPivotY() {
            return this.f6434e;
        }

        public float getRotation() {
            return this.f6432c;
        }

        public float getScaleX() {
            return this.f6435f;
        }

        public float getScaleY() {
            return this.f6436g;
        }

        public float getTranslateX() {
            return this.f6437h;
        }

        public float getTranslateY() {
            return this.f6438i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f6433d) {
                this.f6433d = f2;
                m4307c();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f6434e) {
                this.f6434e = f2;
                m4307c();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f6432c) {
                this.f6432c = f2;
                m4307c();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f6435f) {
                this.f6435f = f2;
                m4307c();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f6436g) {
                this.f6436g = f2;
                m4307c();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f6437h) {
                this.f6437h = f2;
                m4307c();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f6438i) {
                this.f6438i = f2;
                m4307c();
            }
        }

        public VGroup() {
            super(null);
            this.f6430a = new Matrix();
            this.f6431b = new ArrayList<>();
            this.f6432c = 0.0f;
            this.f6433d = 0.0f;
            this.f6434e = 0.0f;
            this.f6435f = 1.0f;
            this.f6436g = 1.0f;
            this.f6437h = 0.0f;
            this.f6438i = 0.0f;
            this.f6439j = new Matrix();
            this.f6442m = null;
        }
    }
}
