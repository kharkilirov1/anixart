package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.Objects;
import kotlin.KotlinVersion;

@RestrictTo
/* loaded from: classes.dex */
class DrawableContainer extends Drawable implements Drawable.Callback {

    /* renamed from: n */
    public static final /* synthetic */ int f618n = 0;

    /* renamed from: b */
    public DrawableContainerState f619b;

    /* renamed from: c */
    public Rect f620c;

    /* renamed from: d */
    public Drawable f621d;

    /* renamed from: e */
    public Drawable f622e;

    /* renamed from: g */
    public boolean f624g;

    /* renamed from: i */
    public boolean f626i;

    /* renamed from: j */
    public Runnable f627j;

    /* renamed from: k */
    public long f628k;

    /* renamed from: l */
    public long f629l;

    /* renamed from: m */
    public BlockInvalidateCallback f630m;

    /* renamed from: f */
    public int f623f = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: h */
    public int f625h = -1;

    @RequiresApi
    public static class Api21Impl {
    }

    public static class BlockInvalidateCallback implements Drawable.Callback {

        /* renamed from: b */
        public Drawable.Callback f632b;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
            Drawable.Callback callback = this.f632b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.f632b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class DrawableContainerState extends Drawable.ConstantState {

        /* renamed from: A */
        public int f633A;

        /* renamed from: B */
        public int f634B;

        /* renamed from: C */
        public boolean f635C;

        /* renamed from: D */
        public ColorFilter f636D;

        /* renamed from: E */
        public boolean f637E;

        /* renamed from: F */
        public ColorStateList f638F;

        /* renamed from: G */
        public PorterDuff.Mode f639G;

        /* renamed from: H */
        public boolean f640H;

        /* renamed from: I */
        public boolean f641I;

        /* renamed from: a */
        public final DrawableContainer f642a;

        /* renamed from: b */
        public Resources f643b;

        /* renamed from: c */
        public int f644c;

        /* renamed from: d */
        public int f645d;

        /* renamed from: e */
        public int f646e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f647f;

        /* renamed from: g */
        public Drawable[] f648g;

        /* renamed from: h */
        public int f649h;

        /* renamed from: i */
        public boolean f650i;

        /* renamed from: j */
        public boolean f651j;

        /* renamed from: k */
        public Rect f652k;

        /* renamed from: l */
        public boolean f653l;

        /* renamed from: m */
        public boolean f654m;

        /* renamed from: n */
        public int f655n;

        /* renamed from: o */
        public int f656o;

        /* renamed from: p */
        public int f657p;

        /* renamed from: q */
        public int f658q;

        /* renamed from: r */
        public boolean f659r;

        /* renamed from: s */
        public int f660s;

        /* renamed from: t */
        public boolean f661t;

        /* renamed from: u */
        public boolean f662u;

        /* renamed from: v */
        public boolean f663v;

        /* renamed from: w */
        public boolean f664w;

        /* renamed from: x */
        public boolean f665x;

        /* renamed from: y */
        public boolean f666y;

        /* renamed from: z */
        public int f667z;

        public DrawableContainerState(DrawableContainerState drawableContainerState, DrawableContainer drawableContainer, Resources resources) {
            this.f650i = false;
            this.f653l = false;
            this.f665x = true;
            this.f633A = 0;
            this.f634B = 0;
            this.f642a = drawableContainer;
            this.f643b = resources != null ? resources : drawableContainerState != null ? drawableContainerState.f643b : null;
            int i2 = drawableContainerState != null ? drawableContainerState.f644c : 0;
            int i3 = DrawableContainer.f618n;
            i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
            i2 = i2 == 0 ? 160 : i2;
            this.f644c = i2;
            if (drawableContainerState == null) {
                this.f648g = new Drawable[10];
                this.f649h = 0;
                return;
            }
            this.f645d = drawableContainerState.f645d;
            this.f646e = drawableContainerState.f646e;
            this.f663v = true;
            this.f664w = true;
            this.f650i = drawableContainerState.f650i;
            this.f653l = drawableContainerState.f653l;
            this.f665x = drawableContainerState.f665x;
            this.f666y = drawableContainerState.f666y;
            this.f667z = drawableContainerState.f667z;
            this.f633A = drawableContainerState.f633A;
            this.f634B = drawableContainerState.f634B;
            this.f635C = drawableContainerState.f635C;
            this.f636D = drawableContainerState.f636D;
            this.f637E = drawableContainerState.f637E;
            this.f638F = drawableContainerState.f638F;
            this.f639G = drawableContainerState.f639G;
            this.f640H = drawableContainerState.f640H;
            this.f641I = drawableContainerState.f641I;
            if (drawableContainerState.f644c == i2) {
                if (drawableContainerState.f651j) {
                    this.f652k = drawableContainerState.f652k != null ? new Rect(drawableContainerState.f652k) : null;
                    this.f651j = true;
                }
                if (drawableContainerState.f654m) {
                    this.f655n = drawableContainerState.f655n;
                    this.f656o = drawableContainerState.f656o;
                    this.f657p = drawableContainerState.f657p;
                    this.f658q = drawableContainerState.f658q;
                    this.f654m = true;
                }
            }
            if (drawableContainerState.f659r) {
                this.f660s = drawableContainerState.f660s;
                this.f659r = true;
            }
            if (drawableContainerState.f661t) {
                this.f662u = drawableContainerState.f662u;
                this.f661t = true;
            }
            Drawable[] drawableArr = drawableContainerState.f648g;
            this.f648g = new Drawable[drawableArr.length];
            this.f649h = drawableContainerState.f649h;
            SparseArray<Drawable.ConstantState> sparseArray = drawableContainerState.f647f;
            if (sparseArray != null) {
                this.f647f = sparseArray.clone();
            } else {
                this.f647f = new SparseArray<>(this.f649h);
            }
            int i4 = this.f649h;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                    if (constantState != null) {
                        this.f647f.put(i5, constantState);
                    } else {
                        this.f648g[i5] = drawableArr[i5];
                    }
                }
            }
        }

        /* renamed from: a */
        public final int m512a(Drawable drawable) {
            int i2 = this.f649h;
            if (i2 >= this.f648g.length) {
                mo516e(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f642a);
            this.f648g[i2] = drawable;
            this.f649h++;
            this.f646e = drawable.getChangingConfigurations() | this.f646e;
            this.f659r = false;
            this.f661t = false;
            this.f652k = null;
            this.f651j = false;
            this.f654m = false;
            this.f663v = false;
            return i2;
        }

        /* renamed from: b */
        public void m513b() {
            this.f654m = true;
            m514c();
            int i2 = this.f649h;
            Drawable[] drawableArr = this.f648g;
            this.f656o = -1;
            this.f655n = -1;
            this.f658q = 0;
            this.f657p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f655n) {
                    this.f655n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f656o) {
                    this.f656o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f657p) {
                    this.f657p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f658q) {
                    this.f658q = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void m514c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f647f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = this.f647f.keyAt(i2);
                    Drawable.ConstantState valueAt = this.f647f.valueAt(i2);
                    Drawable[] drawableArr = this.f648g;
                    Drawable newDrawable = valueAt.newDrawable(this.f643b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        DrawableCompat.m1840l(newDrawable, this.f667z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f642a);
                    drawableArr[keyAt] = mutate;
                }
                this.f647f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi
        public boolean canApplyTheme() {
            int i2 = this.f649h;
            Drawable[] drawableArr = this.f648g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f647f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (DrawableCompat.m1830b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final Drawable m515d(int i2) {
            int indexOfKey;
            Drawable drawable = this.f648g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f647f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f647f.valueAt(indexOfKey).newDrawable(this.f643b);
            if (Build.VERSION.SDK_INT >= 23) {
                DrawableCompat.m1840l(newDrawable, this.f667z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f642a);
            this.f648g[i2] = mutate;
            this.f647f.removeAt(indexOfKey);
            if (this.f647f.size() == 0) {
                this.f647f = null;
            }
            return mutate;
        }

        /* renamed from: e */
        public void mo516e(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f648g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f648g = drawableArr;
        }

        /* renamed from: f */
        public void mo505f() {
            int i2 = this.f649h;
            Drawable[] drawableArr = this.f648g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null) {
                    drawableArr[i3].mutate();
                }
            }
            this.f666y = true;
        }

        /* renamed from: g */
        public final void m517g(Resources resources) {
            if (resources != null) {
                this.f643b = resources;
                int i2 = DrawableContainer.f618n;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = this.f644c;
                this.f644c = i3;
                if (i4 != i3) {
                    this.f654m = false;
                    this.f651j = false;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f645d | this.f646e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m509a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f624g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f621d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f628k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f623f
            r3.setAlpha(r9)
            r13.f628k = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            androidx.appcompat.graphics.drawable.DrawableContainer$DrawableContainerState r9 = r13.f619b
            int r9 = r9.f633A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f623f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f628k = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f622e
            if (r9 == 0) goto L65
            long r10 = r13.f629l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f622e = r0
            r13.f629l = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.DrawableContainer$DrawableContainerState r4 = r13.f619b
            int r4 = r4.f634B
            int r3 = r3 / r4
            int r4 = r13.f623f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f629l = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f627j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.DrawableContainer.m509a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi
    public void applyTheme(@NonNull Resources.Theme theme) {
        DrawableContainerState drawableContainerState = this.f619b;
        Objects.requireNonNull(drawableContainerState);
        if (theme != null) {
            drawableContainerState.m514c();
            int i2 = drawableContainerState.f649h;
            Drawable[] drawableArr = drawableContainerState.f648g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null && DrawableCompat.m1830b(drawableArr[i3])) {
                    DrawableCompat.m1829a(drawableArr[i3], theme);
                    drawableContainerState.f646e |= drawableArr[i3].getChangingConfigurations();
                }
            }
            drawableContainerState.m517g(theme.getResources());
        }
    }

    /* renamed from: b */
    public DrawableContainerState mo499b() {
        return this.f619b;
    }

    /* renamed from: c */
    public final void m510c(Drawable drawable) {
        if (this.f630m == null) {
            this.f630m = new BlockInvalidateCallback();
        }
        BlockInvalidateCallback blockInvalidateCallback = this.f630m;
        blockInvalidateCallback.f632b = drawable.getCallback();
        drawable.setCallback(blockInvalidateCallback);
        try {
            if (this.f619b.f633A <= 0 && this.f624g) {
                drawable.setAlpha(this.f623f);
            }
            DrawableContainerState drawableContainerState = this.f619b;
            if (drawableContainerState.f637E) {
                drawable.setColorFilter(drawableContainerState.f636D);
            } else {
                if (drawableContainerState.f640H) {
                    DrawableCompat.m1842n(drawable, drawableContainerState.f638F);
                }
                DrawableContainerState drawableContainerState2 = this.f619b;
                if (drawableContainerState2.f641I) {
                    DrawableCompat.m1843o(drawable, drawableContainerState2.f639G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f619b.f665x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                DrawableCompat.m1840l(drawable, DrawableCompat.m1834f(this));
            }
            DrawableCompat.m1837i(drawable, this.f619b.f635C);
            Rect rect = this.f620c;
            if (rect != null) {
                DrawableCompat.m1839k(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            BlockInvalidateCallback blockInvalidateCallback2 = this.f630m;
            Drawable.Callback callback = blockInvalidateCallback2.f632b;
            blockInvalidateCallback2.f632b = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi
    public boolean canApplyTheme() {
        return this.f619b.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m511d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f625h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.DrawableContainer$DrawableContainerState r0 = r9.f619b
            int r0 = r0.f634B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f622e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f621d
            if (r0 == 0) goto L29
            r9.f622e = r0
            androidx.appcompat.graphics.drawable.DrawableContainer$DrawableContainerState r0 = r9.f619b
            int r0 = r0.f634B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f629l = r0
            goto L35
        L29:
            r9.f622e = r4
            r9.f629l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f621d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.DrawableContainer$DrawableContainerState r0 = r9.f619b
            int r1 = r0.f649h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m515d(r10)
            r9.f621d = r0
            r9.f625h = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.DrawableContainer$DrawableContainerState r10 = r9.f619b
            int r10 = r10.f633A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f628k = r2
        L51:
            r9.m510c(r0)
            goto L5a
        L55:
            r9.f621d = r4
            r10 = -1
            r9.f625h = r10
        L5a:
            long r0 = r9.f628k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f629l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f627j
            if (r0 != 0) goto L73
            androidx.appcompat.graphics.drawable.DrawableContainer$1 r0 = new androidx.appcompat.graphics.drawable.DrawableContainer$1
            r0.<init>()
            r9.f627j = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m509a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.DrawableContainer.m511d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f621d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f622e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo500e(DrawableContainerState drawableContainerState) {
        this.f619b = drawableContainerState;
        int i2 = this.f625h;
        if (i2 >= 0) {
            Drawable m515d = drawableContainerState.m515d(i2);
            this.f621d = m515d;
            if (m515d != null) {
                m510c(m515d);
            }
        }
        this.f622e = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f623f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f619b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        DrawableContainerState drawableContainerState = this.f619b;
        boolean z = false;
        if (!drawableContainerState.f663v) {
            drawableContainerState.m514c();
            drawableContainerState.f663v = true;
            int i2 = drawableContainerState.f649h;
            Drawable[] drawableArr = drawableContainerState.f648g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    drawableContainerState.f664w = true;
                    z = true;
                    break;
                }
                if (drawableArr[i3].getConstantState() == null) {
                    drawableContainerState.f664w = false;
                    break;
                }
                i3++;
            }
        } else {
            z = drawableContainerState.f664w;
        }
        if (!z) {
            return null;
        }
        this.f619b.f645d = getChangingConfigurations();
        return this.f619b;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f621d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f620c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        DrawableContainerState drawableContainerState = this.f619b;
        if (drawableContainerState.f653l) {
            if (!drawableContainerState.f654m) {
                drawableContainerState.m513b();
            }
            return drawableContainerState.f656o;
        }
        Drawable drawable = this.f621d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        DrawableContainerState drawableContainerState = this.f619b;
        if (drawableContainerState.f653l) {
            if (!drawableContainerState.f654m) {
                drawableContainerState.m513b();
            }
            return drawableContainerState.f655n;
        }
        Drawable drawable = this.f621d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        DrawableContainerState drawableContainerState = this.f619b;
        if (drawableContainerState.f653l) {
            if (!drawableContainerState.f654m) {
                drawableContainerState.m513b();
            }
            return drawableContainerState.f658q;
        }
        Drawable drawable = this.f621d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        DrawableContainerState drawableContainerState = this.f619b;
        if (drawableContainerState.f653l) {
            if (!drawableContainerState.f654m) {
                drawableContainerState.m513b();
            }
            return drawableContainerState.f657p;
        }
        Drawable drawable = this.f621d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f621d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        DrawableContainerState drawableContainerState = this.f619b;
        if (drawableContainerState.f659r) {
            return drawableContainerState.f660s;
        }
        drawableContainerState.m514c();
        int i2 = drawableContainerState.f649h;
        Drawable[] drawableArr = drawableContainerState.f648g;
        int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i3 = 1; i3 < i2; i3++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
        }
        drawableContainerState.f660s = opacity;
        drawableContainerState.f659r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f621d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        DrawableContainerState drawableContainerState = this.f619b;
        Rect rect2 = null;
        if (!drawableContainerState.f650i) {
            Rect rect3 = drawableContainerState.f652k;
            if (rect3 != null || drawableContainerState.f651j) {
                rect2 = rect3;
            } else {
                drawableContainerState.m514c();
                Rect rect4 = new Rect();
                int i2 = drawableContainerState.f649h;
                Drawable[] drawableArr = drawableContainerState.f648g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                drawableContainerState.f651j = true;
                drawableContainerState.f652k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f621d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (isAutoMirrored() && DrawableCompat.m1834f(this) == 1) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        DrawableContainerState drawableContainerState = this.f619b;
        if (drawableContainerState != null) {
            drawableContainerState.f659r = false;
            drawableContainerState.f661t = false;
        }
        if (drawable != this.f621d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f619b.f635C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        DrawableContainerState drawableContainerState = this.f619b;
        if (drawableContainerState.f661t) {
            return drawableContainerState.f662u;
        }
        drawableContainerState.m514c();
        int i2 = drawableContainerState.f649h;
        Drawable[] drawableArr = drawableContainerState.f648g;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (drawableArr[i3].isStateful()) {
                z = true;
                break;
            }
            i3++;
        }
        drawableContainerState.f662u = z;
        drawableContainerState.f661t = true;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f622e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f622e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f621d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f624g) {
                this.f621d.setAlpha(this.f623f);
            }
        }
        if (this.f629l != 0) {
            this.f629l = 0L;
            z = true;
        }
        if (this.f628k != 0) {
            this.f628k = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f626i && super.mutate() == this) {
            DrawableContainerState mo499b = mo499b();
            mo499b.mo505f();
            mo500e(mo499b);
            this.f626i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f622e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f621d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        DrawableContainerState drawableContainerState = this.f619b;
        int i3 = this.f625h;
        int i4 = drawableContainerState.f649h;
        Drawable[] drawableArr = drawableContainerState.f648g;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean m1840l = Build.VERSION.SDK_INT >= 23 ? DrawableCompat.m1840l(drawableArr[i5], i2) : false;
                if (i5 == i3) {
                    z = m1840l;
                }
            }
        }
        drawableContainerState.f667z = i2;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f622e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f621d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.f622e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f621d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
        if (drawable != this.f621d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f624g && this.f623f == i2) {
            return;
        }
        this.f624g = true;
        this.f623f = i2;
        Drawable drawable = this.f621d;
        if (drawable != null) {
            if (this.f628k == 0) {
                drawable.setAlpha(i2);
            } else {
                m509a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        DrawableContainerState drawableContainerState = this.f619b;
        if (drawableContainerState.f635C != z) {
            drawableContainerState.f635C = z;
            Drawable drawable = this.f621d;
            if (drawable != null) {
                DrawableCompat.m1837i(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        DrawableContainerState drawableContainerState = this.f619b;
        drawableContainerState.f637E = true;
        if (drawableContainerState.f636D != colorFilter) {
            drawableContainerState.f636D = colorFilter;
            Drawable drawable = this.f621d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        DrawableContainerState drawableContainerState = this.f619b;
        if (drawableContainerState.f665x != z) {
            drawableContainerState.f665x = z;
            Drawable drawable = this.f621d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f621d;
        if (drawable != null) {
            DrawableCompat.m1838j(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f620c;
        if (rect == null) {
            this.f620c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f621d;
        if (drawable != null) {
            DrawableCompat.m1839k(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        DrawableContainerState drawableContainerState = this.f619b;
        drawableContainerState.f640H = true;
        if (drawableContainerState.f638F != colorStateList) {
            drawableContainerState.f638F = colorStateList;
            DrawableCompat.m1842n(this.f621d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        DrawableContainerState drawableContainerState = this.f619b;
        drawableContainerState.f641I = true;
        if (drawableContainerState.f639G != mode) {
            drawableContainerState.f639G = mode;
            DrawableCompat.m1843o(this.f621d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f622e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f621d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable != this.f621d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
