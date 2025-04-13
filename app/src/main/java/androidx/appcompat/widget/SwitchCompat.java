package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0055R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.mobile.ads.C4632R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView {

    /* renamed from: S */
    public static final Property<SwitchCompat, Float> f1521S = new Property<SwitchCompat, Float>(Float.class, "thumbPos") { // from class: androidx.appcompat.widget.SwitchCompat.1
        @Override // android.util.Property
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1523A);
        }

        @Override // android.util.Property
        public void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    };

    /* renamed from: T */
    public static final int[] f1522T = {R.attr.state_checked};

    /* renamed from: A */
    public float f1523A;

    /* renamed from: B */
    public int f1524B;

    /* renamed from: C */
    public int f1525C;

    /* renamed from: D */
    public int f1526D;

    /* renamed from: E */
    public int f1527E;

    /* renamed from: F */
    public int f1528F;

    /* renamed from: G */
    public int f1529G;

    /* renamed from: H */
    public int f1530H;

    /* renamed from: I */
    public boolean f1531I;

    /* renamed from: J */
    public final TextPaint f1532J;

    /* renamed from: K */
    public ColorStateList f1533K;

    /* renamed from: L */
    public Layout f1534L;

    /* renamed from: M */
    public Layout f1535M;

    /* renamed from: N */
    @Nullable
    public TransformationMethod f1536N;

    /* renamed from: O */
    public ObjectAnimator f1537O;

    /* renamed from: P */
    @NonNull
    public AppCompatEmojiTextHelper f1538P;

    /* renamed from: Q */
    @Nullable
    public EmojiCompatInitCallback f1539Q;

    /* renamed from: R */
    public final Rect f1540R;

    /* renamed from: b */
    public Drawable f1541b;

    /* renamed from: c */
    public ColorStateList f1542c;

    /* renamed from: d */
    public PorterDuff.Mode f1543d;

    /* renamed from: e */
    public boolean f1544e;

    /* renamed from: f */
    public boolean f1545f;

    /* renamed from: g */
    public Drawable f1546g;

    /* renamed from: h */
    public ColorStateList f1547h;

    /* renamed from: i */
    public PorterDuff.Mode f1548i;

    /* renamed from: j */
    public boolean f1549j;

    /* renamed from: k */
    public boolean f1550k;

    /* renamed from: l */
    public int f1551l;

    /* renamed from: m */
    public int f1552m;

    /* renamed from: n */
    public int f1553n;

    /* renamed from: o */
    public boolean f1554o;

    /* renamed from: p */
    public CharSequence f1555p;

    /* renamed from: q */
    public CharSequence f1556q;

    /* renamed from: r */
    public CharSequence f1557r;

    /* renamed from: s */
    public CharSequence f1558s;

    /* renamed from: t */
    public boolean f1559t;

    /* renamed from: u */
    public int f1560u;

    /* renamed from: v */
    public int f1561v;

    /* renamed from: w */
    public float f1562w;

    /* renamed from: x */
    public float f1563x;

    /* renamed from: y */
    public VelocityTracker f1564y;

    /* renamed from: z */
    public int f1565z;

    @RequiresApi
    public static class Api18Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m942a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    public static class EmojiCompatInitCallback extends EmojiCompat.InitCallback {

        /* renamed from: a */
        public final Reference<SwitchCompat> f1566a;

        public EmojiCompatInitCallback(SwitchCompat switchCompat) {
            this.f1566a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        /* renamed from: a */
        public void mo943a(@Nullable Throwable th) {
            SwitchCompat switchCompat = this.f1566a.get();
            if (switchCompat != null) {
                switchCompat.m938d();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        /* renamed from: b */
        public void mo944b() {
            SwitchCompat switchCompat = this.f1566a.get();
            if (switchCompat != null) {
                switchCompat.m938d();
            }
        }
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2507R.attr.switchStyle);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f1538P == null) {
            this.f1538P = new AppCompatEmojiTextHelper(this);
        }
        return this.f1538P;
    }

    private boolean getTargetCheckedState() {
        return this.f1523A > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((ViewUtils.m1007b(this) ? 1.0f - this.f1523A : this.f1523A) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1546g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1540R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1541b;
        Rect m851c = drawable2 != null ? DrawableUtils.m851c(drawable2) : DrawableUtils.f1297c;
        return ((((this.f1524B - this.f1526D) - rect.left) - rect.right) - m851c.left) - m851c.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1557r = charSequence;
        AppCompatEmojiTextHelper emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod m2884e = emojiTextViewHelper.f1181b.m2884e(this.f1536N);
        if (m2884e != null) {
            charSequence = m2884e.getTransformation(charSequence, this);
        }
        this.f1558s = charSequence;
        this.f1535M = null;
        if (this.f1559t) {
            m941g();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1555p = charSequence;
        AppCompatEmojiTextHelper emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod m2884e = emojiTextViewHelper.f1181b.m2884e(this.f1536N);
        if (m2884e != null) {
            charSequence = m2884e.getTransformation(charSequence, this);
        }
        this.f1556q = charSequence;
        this.f1534L = null;
        if (this.f1559t) {
            m941g();
        }
    }

    /* renamed from: a */
    public final void m935a() {
        Drawable drawable = this.f1541b;
        if (drawable != null) {
            if (this.f1544e || this.f1545f) {
                Drawable mutate = DrawableCompat.m1845q(drawable).mutate();
                this.f1541b = mutate;
                if (this.f1544e) {
                    DrawableCompat.m1842n(mutate, this.f1542c);
                }
                if (this.f1545f) {
                    DrawableCompat.m1843o(this.f1541b, this.f1543d);
                }
                if (this.f1541b.isStateful()) {
                    this.f1541b.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m936b() {
        Drawable drawable = this.f1546g;
        if (drawable != null) {
            if (this.f1549j || this.f1550k) {
                Drawable mutate = DrawableCompat.m1845q(drawable).mutate();
                this.f1546g = mutate;
                if (this.f1549j) {
                    DrawableCompat.m1842n(mutate, this.f1547h);
                }
                if (this.f1550k) {
                    DrawableCompat.m1843o(this.f1546g, this.f1548i);
                }
                if (this.f1546g.isStateful()) {
                    this.f1546g.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final Layout m937c(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f1532J, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: d */
    public void m938d() {
        setTextOnInternal(this.f1555p);
        setTextOffInternal(this.f1557r);
        requestLayout();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect = this.f1540R;
        int i4 = this.f1527E;
        int i5 = this.f1528F;
        int i6 = this.f1529G;
        int i7 = this.f1530H;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f1541b;
        Rect m851c = drawable != null ? DrawableUtils.m851c(drawable) : DrawableUtils.f1297c;
        Drawable drawable2 = this.f1546g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (m851c != null) {
                int i9 = m851c.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = m851c.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = m851c.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = m851c.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.f1546g.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f1546g.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f1541b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.f1526D + rect.right;
            this.f1541b.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                DrawableCompat.m1839k(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f1541b;
        if (drawable != null) {
            DrawableCompat.m1838j(drawable, f2, f3);
        }
        Drawable drawable2 = this.f1546g;
        if (drawable2 != null) {
            DrawableCompat.m1838j(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1541b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1546g;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m939e() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1557r;
            if (charSequence == null) {
                charSequence = getResources().getString(C2507R.string.abc_capital_off);
            }
            ViewCompat.m2234x0(this, charSequence);
        }
    }

    /* renamed from: f */
    public final void m940f() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1555p;
            if (charSequence == null) {
                charSequence = getResources().getString(C2507R.string.abc_capital_on);
            }
            ViewCompat.m2234x0(this, charSequence);
        }
    }

    /* renamed from: g */
    public final void m941g() {
        if (this.f1539Q == null && this.f1538P.f1181b.m2881b() && EmojiCompat.m2798d()) {
            EmojiCompat m2796a = EmojiCompat.m2796a();
            int m2799b = m2796a.m2799b();
            if (m2799b == 3 || m2799b == 0) {
                EmojiCompatInitCallback emojiCompatInitCallback = new EmojiCompatInitCallback(this);
                this.f1539Q = emojiCompatInitCallback;
                m2796a.m2806k(emojiCompatInitCallback);
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!ViewUtils.m1007b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1524B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1553n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (ViewUtils.m1007b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1524B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1553n : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.m2651m(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1559t;
    }

    public boolean getSplitTrack() {
        return this.f1554o;
    }

    public int getSwitchMinWidth() {
        return this.f1552m;
    }

    public int getSwitchPadding() {
        return this.f1553n;
    }

    public CharSequence getTextOff() {
        return this.f1557r;
    }

    public CharSequence getTextOn() {
        return this.f1555p;
    }

    public Drawable getThumbDrawable() {
        return this.f1541b;
    }

    @FloatRange
    public final float getThumbPosition() {
        return this.f1523A;
    }

    public int getThumbTextPadding() {
        return this.f1551l;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f1542c;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f1543d;
    }

    public Drawable getTrackDrawable() {
        return this.f1546g;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f1547h;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f1548i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1541b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1546g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1537O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1537O.end();
        this.f1537O = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1522T);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1540R;
        Drawable drawable = this.f1546g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1528F;
        int i3 = this.f1530H;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1541b;
        if (drawable != null) {
            if (!this.f1554o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m851c = DrawableUtils.m851c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m851c.left;
                rect.right -= m851c.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1534L : this.f1535M;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1533K;
            if (colorStateList != null) {
                this.f1532J.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1532J.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i4 + i5) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1555p : this.f1557r;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int width;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i2, i3, i4, i5);
        int i10 = 0;
        if (this.f1541b != null) {
            Rect rect = this.f1540R;
            Drawable drawable = this.f1546g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m851c = DrawableUtils.m851c(this.f1541b);
            i6 = Math.max(0, m851c.left - rect.left);
            i10 = Math.max(0, m851c.right - rect.right);
        } else {
            i6 = 0;
        }
        if (ViewUtils.m1007b(this)) {
            i7 = getPaddingLeft() + i6;
            width = ((this.f1524B + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.f1524B) + i6 + i10;
        }
        int gravity = getGravity() & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i11 = this.f1525C;
            int i12 = height - (i11 / 2);
            i8 = i11 + i12;
            i9 = i12;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f1525C + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1525C;
        }
        this.f1527E = i7;
        this.f1528F = i9;
        this.f1530H = i8;
        this.f1529G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.f1559t) {
            if (this.f1534L == null) {
                this.f1534L = m937c(this.f1556q);
            }
            if (this.f1535M == null) {
                this.f1535M = m937c(this.f1558s);
            }
        }
        Rect rect = this.f1540R;
        Drawable drawable = this.f1541b;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1541b.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.f1541b.getIntrinsicHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        this.f1526D = Math.max(this.f1559t ? (this.f1551l * 2) + Math.max(this.f1534L.getWidth(), this.f1535M.getWidth()) : 0, i4);
        Drawable drawable2 = this.f1546g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f1546g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f1541b;
        if (drawable3 != null) {
            Rect m851c = DrawableUtils.m851c(drawable3);
            i7 = Math.max(i7, m851c.left);
            i8 = Math.max(i8, m851c.right);
        }
        int max = this.f1531I ? Math.max(this.f1552m, (this.f1526D * 2) + i7 + i8) : this.f1552m;
        int max2 = Math.max(i6, i5);
        this.f1524B = max;
        this.f1525C = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1555p : this.f1557r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 != 3) goto L84;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().f1181b.m2882c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            m940f();
        } else {
            m939e();
        }
        if (getWindowToken() == null || !ViewCompat.m2174N(this)) {
            ObjectAnimator objectAnimator = this.f1537O;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1521S, isChecked ? 1.0f : 0.0f);
        this.f1537O = ofFloat;
        ofFloat.setDuration(250L);
        Api18Impl.m942a(this.f1537O, true);
        this.f1537O.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m2652n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().f1181b.m2883d(z);
        setTextOnInternal(this.f1555p);
        setTextOffInternal(this.f1557r);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f1531I = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1181b.m2880a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f1559t != z) {
            this.f1559t = z;
            requestLayout();
            if (z) {
                m941g();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1554o = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f1552m = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f1553n = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1532J.getTypeface() == null || this.f1532J.getTypeface().equals(typeface)) && (this.f1532J.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f1532J.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m939e();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m940f();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1541b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1541b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f1523A = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(AppCompatResources.m497b(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f1551l = i2;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f1542c = colorStateList;
        this.f1544e = true;
        m935a();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f1543d = mode;
        this.f1545f = true;
        m935a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1546g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1546g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(AppCompatResources.m497b(getContext(), i2));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f1547h = colorStateList;
        this.f1549j = true;
        m936b();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f1548i = mode;
        this.f1550k = true;
        m936b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1541b || drawable == this.f1546g;
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1542c = null;
        this.f1543d = null;
        this.f1544e = false;
        this.f1545f = false;
        this.f1547h = null;
        this.f1548i = null;
        this.f1549j = false;
        this.f1550k = false;
        this.f1564y = VelocityTracker.obtain();
        this.f1531I = true;
        this.f1540R = new Rect();
        ThemeUtils.m945a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1532J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C0055R.styleable.f313x;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        ViewCompat.m2194d0(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        Drawable m958g = tintTypedArray.m958g(2);
        this.f1541b = m958g;
        if (m958g != null) {
            m958g.setCallback(this);
        }
        Drawable m958g2 = tintTypedArray.m958g(11);
        this.f1546g = m958g2;
        if (m958g2 != null) {
            m958g2.setCallback(this);
        }
        setTextOnInternal(tintTypedArray.m966o(0));
        setTextOffInternal(tintTypedArray.m966o(1));
        this.f1559t = tintTypedArray.m952a(3, true);
        this.f1551l = tintTypedArray.m957f(8, 0);
        this.f1552m = tintTypedArray.m957f(5, 0);
        this.f1553n = tintTypedArray.m957f(6, 0);
        this.f1554o = tintTypedArray.m952a(4, false);
        ColorStateList m954c = tintTypedArray.m954c(9);
        if (m954c != null) {
            this.f1542c = m954c;
            this.f1544e = true;
        }
        PorterDuff.Mode m852d = DrawableUtils.m852d(tintTypedArray.m961j(10, -1), null);
        if (this.f1543d != m852d) {
            this.f1543d = m852d;
            this.f1545f = true;
        }
        if (this.f1544e || this.f1545f) {
            m935a();
        }
        ColorStateList m954c2 = tintTypedArray.m954c(12);
        if (m954c2 != null) {
            this.f1547h = m954c2;
            this.f1549j = true;
        }
        PorterDuff.Mode m852d2 = DrawableUtils.m852d(tintTypedArray.m961j(13, -1), null);
        if (this.f1548i != m852d2) {
            this.f1548i = m852d2;
            this.f1550k = true;
        }
        if (this.f1549j || this.f1550k) {
            m936b();
        }
        int m964m = tintTypedArray.m964m(7, 0);
        if (m964m != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(m964m, C0055R.styleable.f314y);
            TintTypedArray tintTypedArray2 = new TintTypedArray(context, obtainStyledAttributes2);
            ColorStateList m954c3 = tintTypedArray2.m954c(3);
            if (m954c3 != null) {
                this.f1533K = m954c3;
            } else {
                this.f1533K = getTextColors();
            }
            int m957f = tintTypedArray2.m957f(0, 0);
            if (m957f != 0) {
                float f2 = m957f;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int m961j = tintTypedArray2.m961j(1, -1);
            int m961j2 = tintTypedArray2.m961j(2, -1);
            Typeface typeface = m961j != 1 ? m961j != 2 ? m961j != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (m961j2 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(m961j2) : Typeface.create(typeface, m961j2);
                setSwitchTypeface(defaultFromStyle);
                int i3 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & m961j2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (tintTypedArray2.m952a(14, false)) {
                this.f1536N = new AllCapsTransformationMethod(getContext());
            } else {
                this.f1536N = null;
            }
            setTextOnInternal(this.f1555p);
            setTextOffInternal(this.f1557r);
            obtainStyledAttributes2.recycle();
        }
        new AppCompatTextHelper(this).m786g(attributeSet, i2);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1561v = viewConfiguration.getScaledTouchSlop();
        this.f1565z = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m745a(attributeSet, i2);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
