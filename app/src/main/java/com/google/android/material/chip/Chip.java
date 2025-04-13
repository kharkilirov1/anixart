package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.C1195R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements ChipDrawable.Delegate, Shapeable, MaterialCheckable<Chip> {

    /* renamed from: f */
    @Nullable
    public ChipDrawable f17776f;

    /* renamed from: g */
    @Nullable
    public InsetDrawable f17777g;

    /* renamed from: h */
    @Nullable
    public RippleDrawable f17778h;

    /* renamed from: i */
    @Nullable
    public View.OnClickListener f17779i;

    /* renamed from: j */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f17780j;

    /* renamed from: k */
    @Nullable
    public MaterialCheckable.OnCheckedChangeListener<Chip> f17781k;

    /* renamed from: l */
    public boolean f17782l;

    /* renamed from: m */
    public boolean f17783m;

    /* renamed from: n */
    public boolean f17784n;

    /* renamed from: o */
    public boolean f17785o;

    /* renamed from: p */
    public boolean f17786p;

    /* renamed from: q */
    public int f17787q;

    /* renamed from: r */
    @Dimension
    public int f17788r;

    /* renamed from: s */
    @Nullable
    public CharSequence f17789s;

    /* renamed from: t */
    @NonNull
    public final ChipTouchHelper f17790t;

    /* renamed from: u */
    public boolean f17791u;

    /* renamed from: v */
    public final Rect f17792v;

    /* renamed from: w */
    public final RectF f17793w;

    /* renamed from: x */
    public final TextAppearanceFontCallback f17794x;

    /* renamed from: y */
    public static final Rect f17774y = new Rect();

    /* renamed from: z */
    public static final int[] f17775z = {R.attr.state_selected};

    /* renamed from: A */
    public static final int[] f17773A = {R.attr.state_checkable};

    public class ChipTouchHelper extends ExploreByTouchHelper {
        public ChipTouchHelper(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        /* renamed from: o */
        public int mo2692o(float f2, float f3) {
            Chip chip = Chip.this;
            Rect rect = Chip.f17774y;
            return (chip.m9903e() && Chip.this.getCloseIconTouchBounds().contains(f2, f3)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        /* renamed from: p */
        public void mo2693p(@NonNull List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.f17774y;
            if (chip.m9903e()) {
                Chip chip2 = Chip.this;
                ChipDrawable chipDrawable = chip2.f17776f;
                if (chipDrawable != null && chipDrawable.f17820M) {
                    z = true;
                }
                if (!z || chip2.f17779i == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        /* renamed from: s */
        public boolean mo2696s(int i2, int i3, Bundle bundle) {
            if (i3 != 16) {
                return false;
            }
            if (i2 == 0) {
                return Chip.this.performClick();
            }
            if (i2 == 1) {
                return Chip.this.m9905g();
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        /* renamed from: t */
        public void mo2697t(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.f3743a.setCheckable(Chip.this.m9904f());
            accessibilityNodeInfoCompat.f3743a.setClickable(Chip.this.isClickable());
            accessibilityNodeInfoCompat.f3743a.setClassName(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityNodeInfoCompat.f3743a.setText(text);
            } else {
                accessibilityNodeInfoCompat.f3743a.setContentDescription(text);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        /* renamed from: u */
        public void mo2698u(int i2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i2 != 1) {
                accessibilityNodeInfoCompat.f3743a.setContentDescription("");
                accessibilityNodeInfoCompat.f3743a.setBoundsInParent(Chip.f17774y);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.f3743a.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                accessibilityNodeInfoCompat.f3743a.setContentDescription(context.getString(C2507R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            accessibilityNodeInfoCompat.f3743a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.m2497a(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3748g);
            accessibilityNodeInfoCompat.f3743a.setEnabled(Chip.this.isEnabled());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        /* renamed from: v */
        public void mo2699v(int i2, boolean z) {
            if (i2 == 1) {
                Chip chip = Chip.this;
                chip.f17785o = z;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.chipStyle, C2507R.style.Widget_MaterialComponents_Chip_Action), attributeSet, C2507R.attr.chipStyle);
        this.f17792v = new Rect();
        this.f17793w = new RectF();
        this.f17794x = new TextAppearanceFontCallback() { // from class: com.google.android.material.chip.Chip.1
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            /* renamed from: a */
            public void mo9911a(int i2) {
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            /* renamed from: b */
            public void mo9912b(@NonNull Typeface typeface, boolean z) {
                Chip chip = Chip.this;
                ChipDrawable chipDrawable = chip.f17776f;
                chip.setText(chipDrawable.f17811F0 ? chipDrawable.f17812G : chip.getText());
                Chip.this.requestLayout();
                Chip.this.invalidate();
            }
        };
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        ChipDrawable chipDrawable = new ChipDrawable(context2, attributeSet, C2507R.attr.chipStyle, C2507R.style.Widget_MaterialComponents_Chip_Action);
        Context context3 = chipDrawable.f17840g0;
        int[] iArr = C1195R.styleable.f17322g;
        TypedArray m10159d = ThemeEnforcement.m10159d(context3, attributeSet, iArr, C2507R.attr.chipStyle, C2507R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        chipDrawable.f17815H0 = m10159d.hasValue(37);
        ColorStateList m10240a = MaterialResources.m10240a(chipDrawable.f17840g0, m10159d, 24);
        if (chipDrawable.f17859z != m10240a) {
            chipDrawable.f17859z = m10240a;
            chipDrawable.onStateChange(chipDrawable.getState());
        }
        chipDrawable.m9935c0(MaterialResources.m10240a(chipDrawable.f17840g0, m10159d, 11));
        chipDrawable.m9942j0(m10159d.getDimension(19, 0.0f));
        if (m10159d.hasValue(12)) {
            chipDrawable.m9936d0(m10159d.getDimension(12, 0.0f));
        }
        chipDrawable.m9944l0(MaterialResources.m10240a(chipDrawable.f17840g0, m10159d, 22));
        chipDrawable.m9945m0(m10159d.getDimension(23, 0.0f));
        chipDrawable.m9955w0(MaterialResources.m10240a(chipDrawable.f17840g0, m10159d, 36));
        chipDrawable.m9956x0(m10159d.getText(5));
        TextAppearance m10244e = MaterialResources.m10244e(chipDrawable.f17840g0, m10159d, 0);
        m10244e.f18596k = m10159d.getDimension(1, m10244e.f18596k);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            m10244e.f18595j = MaterialResources.m10240a(chipDrawable.f17840g0, m10159d, 2);
        }
        chipDrawable.f17846m0.m10154b(m10244e, chipDrawable.f17840g0);
        int i3 = m10159d.getInt(3, 0);
        if (i3 == 1) {
            chipDrawable.f17809E0 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            chipDrawable.f17809E0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            chipDrawable.f17809E0 = TextUtils.TruncateAt.END;
        }
        chipDrawable.m9941i0(m10159d.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            chipDrawable.m9941i0(m10159d.getBoolean(15, false));
        }
        chipDrawable.m9938f0(MaterialResources.m10243d(chipDrawable.f17840g0, m10159d, 14));
        if (m10159d.hasValue(17)) {
            chipDrawable.m9940h0(MaterialResources.m10240a(chipDrawable.f17840g0, m10159d, 17));
        }
        chipDrawable.m9939g0(m10159d.getDimension(16, -1.0f));
        chipDrawable.m9952t0(m10159d.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            chipDrawable.m9952t0(m10159d.getBoolean(26, false));
        }
        chipDrawable.m9946n0(MaterialResources.m10243d(chipDrawable.f17840g0, m10159d, 25));
        chipDrawable.m9951s0(MaterialResources.m10240a(chipDrawable.f17840g0, m10159d, 30));
        chipDrawable.m9948p0(m10159d.getDimension(28, 0.0f));
        chipDrawable.m9931Y(m10159d.getBoolean(6, false));
        chipDrawable.m9934b0(m10159d.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            chipDrawable.m9934b0(m10159d.getBoolean(8, false));
        }
        chipDrawable.m9932Z(MaterialResources.m10243d(chipDrawable.f17840g0, m10159d, 7));
        if (m10159d.hasValue(9)) {
            chipDrawable.m9933a0(MaterialResources.m10240a(chipDrawable.f17840g0, m10159d, 9));
        }
        chipDrawable.f17830W = MotionSpec.m9743a(chipDrawable.f17840g0, m10159d, 39);
        chipDrawable.f17831X = MotionSpec.m9743a(chipDrawable.f17840g0, m10159d, 33);
        chipDrawable.m9943k0(m10159d.getDimension(21, 0.0f));
        chipDrawable.m9954v0(m10159d.getDimension(35, 0.0f));
        chipDrawable.m9953u0(m10159d.getDimension(34, 0.0f));
        chipDrawable.m9958z0(m10159d.getDimension(41, 0.0f));
        chipDrawable.m9957y0(m10159d.getDimension(40, 0.0f));
        chipDrawable.m9949q0(m10159d.getDimension(29, 0.0f));
        chipDrawable.m9947o0(m10159d.getDimension(27, 0.0f));
        chipDrawable.m9937e0(m10159d.getDimension(13, 0.0f));
        chipDrawable.f17813G0 = m10159d.getDimensionPixelSize(4, Integer.MAX_VALUE);
        m10159d.recycle();
        ThemeEnforcement.m10156a(context2, attributeSet, C2507R.attr.chipStyle, C2507R.style.Widget_MaterialComponents_Chip_Action);
        ThemeEnforcement.m10157b(context2, attributeSet, iArr, C2507R.attr.chipStyle, C2507R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C2507R.attr.chipStyle, C2507R.style.Widget_MaterialComponents_Chip_Action);
        this.f17786p = obtainStyledAttributes.getBoolean(32, false);
        this.f17788r = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(ViewUtils.m10165b(getContext(), 48))));
        obtainStyledAttributes.recycle();
        setChipDrawable(chipDrawable);
        chipDrawable.m10300w(ViewCompat.m2221r(this));
        ThemeEnforcement.m10156a(context2, attributeSet, C2507R.attr.chipStyle, C2507R.style.Widget_MaterialComponents_Chip_Action);
        ThemeEnforcement.m10157b(context2, attributeSet, iArr, C2507R.attr.chipStyle, C2507R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, C2507R.attr.chipStyle, C2507R.style.Widget_MaterialComponents_Chip_Action);
        if (i2 < 23) {
            setTextColor(MaterialResources.m10240a(context2, obtainStyledAttributes2, 2));
        }
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f17790t = new ChipTouchHelper(this);
        m9907i();
        if (!hasValue) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.chip.Chip.2
                @Override // android.view.ViewOutlineProvider
                @TargetApi
                public void getOutline(View view, @NonNull Outline outline) {
                    ChipDrawable chipDrawable2 = Chip.this.f17776f;
                    if (chipDrawable2 != null) {
                        chipDrawable2.getOutline(outline);
                    } else {
                        outline.setAlpha(0.0f);
                    }
                }
            });
        }
        setChecked(this.f17782l);
        setText(chipDrawable.f17812G);
        setEllipsize(chipDrawable.f17809E0);
        m9910l();
        if (!this.f17776f.f17811F0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m9909k();
        if (this.f17786p) {
            setMinHeight(this.f17788r);
        }
        this.f17787q = ViewCompat.m2231w(this);
        super.setOnCheckedChangeListener(new C1251a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f17793w.setEmpty();
        if (m9903e() && this.f17779i != null) {
            ChipDrawable chipDrawable = this.f17776f;
            chipDrawable.m9924P(chipDrawable.getBounds(), this.f17793w);
        }
        return this.f17793w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f17792v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f17792v;
    }

    @Nullable
    private TextAppearance getTextAppearance() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17846m0.f18356f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f17784n != z) {
            this.f17784n = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f17783m != z) {
            this.f17783m = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.ChipDrawable.Delegate
    /* renamed from: a */
    public void mo9901a() {
        m9902d(this.f17788r);
        requestLayout();
        invalidateOutline();
    }

    /* renamed from: d */
    public boolean m9902d(@Dimension int i2) {
        this.f17788r = i2;
        if (!this.f17786p) {
            if (this.f17777g != null) {
                m9906h();
            } else {
                m9908j();
            }
            return false;
        }
        int max = Math.max(0, i2 - this.f17776f.getIntrinsicHeight());
        int max2 = Math.max(0, i2 - this.f17776f.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f17777g != null) {
                m9906h();
            } else {
                m9908j();
            }
            return false;
        }
        int i3 = max2 > 0 ? max2 / 2 : 0;
        int i4 = max > 0 ? max / 2 : 0;
        if (this.f17777g != null) {
            Rect rect = new Rect();
            this.f17777g.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                m9908j();
                return true;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f17777g = new InsetDrawable((Drawable) this.f17776f, i3, i4, i3, i4);
        m9908j();
        return true;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return !this.f17791u ? super.dispatchHoverEvent(motionEvent) : this.f17790t.m2691n(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f17791u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ChipTouchHelper chipTouchHelper = this.f17790t;
        Objects.requireNonNull(chipTouchHelper);
        boolean z = false;
        int i2 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i2 < repeatCount && chipTouchHelper.m2694q(i3, null)) {
                                    i2++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = chipTouchHelper.f3887l;
                    if (i4 != Integer.MIN_VALUE) {
                        chipTouchHelper.mo2696s(i4, 16, null);
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = chipTouchHelper.m2694q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = chipTouchHelper.m2694q(1, null);
            }
        }
        if (!z || this.f17790t.f3887l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ChipDrawable chipDrawable = this.f17776f;
        boolean z = false;
        int i2 = 0;
        z = false;
        if (chipDrawable != null && ChipDrawable.m9914V(chipDrawable.f17821N)) {
            ChipDrawable chipDrawable2 = this.f17776f;
            ?? isEnabled = isEnabled();
            int i3 = isEnabled;
            if (this.f17785o) {
                i3 = isEnabled + 1;
            }
            int i4 = i3;
            if (this.f17784n) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (this.f17783m) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (isChecked()) {
                i6 = i5 + 1;
            }
            int[] iArr = new int[i6];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.f17785o) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f17784n) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f17783m) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            z = chipDrawable2.m9950r0(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final boolean m9903e() {
        ChipDrawable chipDrawable = this.f17776f;
        return (chipDrawable == null || chipDrawable.m9927S() == null) ? false : true;
    }

    /* renamed from: f */
    public boolean m9904f() {
        ChipDrawable chipDrawable = this.f17776f;
        return chipDrawable != null && chipDrawable.f17826S;
    }

    @CallSuper
    /* renamed from: g */
    public boolean m9905g() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f17779i;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f17791u) {
            this.f17790t.m2701x(1, 1);
        }
        return z;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f17789s)) {
            return this.f17789s;
        }
        if (!m9904f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f17864i.f18216d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f17777g;
        return insetDrawable == null ? this.f17776f : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17828U;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17829V;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17800A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return Math.max(0.0f, chipDrawable.m9926R());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f17776f;
    }

    public float getChipEndPadding() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17839f0;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable == null || (drawable = chipDrawable.f17816I) == null) {
            return null;
        }
        return DrawableCompat.m1844p(drawable);
    }

    public float getChipIconSize() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17818K;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17817J;
        }
        return null;
    }

    public float getChipMinHeight() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17802B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17832Y;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17806D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17808E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.m9927S();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17825R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17838e0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17824Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17837d0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17823P;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17809E0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.f17791u) {
            ChipTouchHelper chipTouchHelper = this.f17790t;
            if (chipTouchHelper.f3887l == 1 || chipTouchHelper.f3886k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17831X;
        }
        return null;
    }

    public float getIconEndPadding() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17834a0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17833Z;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17810F;
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f17776f.getShapeAppearanceModel();
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17830W;
        }
        return null;
    }

    public float getTextEndPadding() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17836c0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            return chipDrawable.f17835b0;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void m9906h() {
        if (this.f17777g != null) {
            this.f17777g = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m9908j();
        }
    }

    /* renamed from: i */
    public final void m9907i() {
        if (m9903e()) {
            ChipDrawable chipDrawable = this.f17776f;
            if ((chipDrawable != null && chipDrawable.f17820M) && this.f17779i != null) {
                ViewCompat.m2196e0(this, this.f17790t);
                this.f17791u = true;
                return;
            }
        }
        ViewCompat.m2196e0(this, null);
        this.f17791u = false;
    }

    /* renamed from: j */
    public final void m9908j() {
        this.f17778h = new RippleDrawable(RippleUtils.m10258d(this.f17776f.f17810F), getBackgroundDrawable(), null);
        this.f17776f.m9915A0(false);
        ViewCompat.m2204i0(this, this.f17778h);
        m9909k();
    }

    /* renamed from: k */
    public final void m9909k() {
        ChipDrawable chipDrawable;
        if (TextUtils.isEmpty(getText()) || (chipDrawable = this.f17776f) == null) {
            return;
        }
        int m9925Q = (int) (chipDrawable.m9925Q() + chipDrawable.f17839f0 + chipDrawable.f17836c0);
        ChipDrawable chipDrawable2 = this.f17776f;
        int m9922N = (int) (chipDrawable2.m9922N() + chipDrawable2.f17832Y + chipDrawable2.f17835b0);
        if (this.f17777g != null) {
            Rect rect = new Rect();
            this.f17777g.getPadding(rect);
            m9922N += rect.left;
            m9925Q += rect.right;
        }
        ViewCompat.m2226t0(this, m9922N, getPaddingTop(), m9925Q, getPaddingBottom());
    }

    /* renamed from: l */
    public final void m9910l() {
        TextPaint paint = getPaint();
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            paint.drawableState = chipDrawable.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m10251e(getContext(), paint, this.f17794x);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m10309c(this, this.f17776f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f17775z);
        }
        if (m9904f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f17773A);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (this.f17791u) {
            ChipTouchHelper chipTouchHelper = this.f17790t;
            int i3 = chipTouchHelper.f3887l;
            if (i3 != Integer.MIN_VALUE) {
                chipTouchHelper.m2688k(i3);
            }
            if (z) {
                chipTouchHelper.m2694q(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m9904f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            if (chipGroup.f18301d) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        i4 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i3);
                    if (childAt instanceof Chip) {
                        if (!(chipGroup.getChildAt(i3).getVisibility() == 0)) {
                            continue;
                        } else if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    i3++;
                }
                i2 = i4;
            } else {
                i2 = -1;
            }
            Object tag = getTag(C2507R.id.row_index_key);
            accessibilityNodeInfoCompat.m2512r(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m2519a(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i2, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f17787q != i2) {
            this.f17787q = i2;
            m9909k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f17783m
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f17783m
            if (r0 == 0) goto L34
            r5.m9905g()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f17789s = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f17778h) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f17778h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9931Y(z);
        }
    }

    public void setCheckableResource(@BoolRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9931Y(chipDrawable.f17840g0.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable == null) {
            this.f17782l = z;
        } else if (chipDrawable.f17826S) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9932Z(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(@DrawableRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9932Z(AppCompatResources.m497b(chipDrawable.f17840g0, i2));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9933a0(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9933a0(AppCompatResources.m496a(chipDrawable.f17840g0, i2));
        }
    }

    public void setCheckedIconVisible(@BoolRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9934b0(chipDrawable.f17840g0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable == null || chipDrawable.f17800A == colorStateList) {
            return;
        }
        chipDrawable.f17800A = colorStateList;
        chipDrawable.onStateChange(chipDrawable.getState());
    }

    public void setChipBackgroundColorResource(@ColorRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9935c0(AppCompatResources.m496a(chipDrawable.f17840g0, i2));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9936d0(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9936d0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(@NonNull ChipDrawable chipDrawable) {
        ChipDrawable chipDrawable2 = this.f17776f;
        if (chipDrawable2 != chipDrawable) {
            if (chipDrawable2 != null) {
                chipDrawable2.f17807D0 = new WeakReference<>(null);
            }
            this.f17776f = chipDrawable;
            chipDrawable.f17811F0 = false;
            Objects.requireNonNull(chipDrawable);
            chipDrawable.f17807D0 = new WeakReference<>(this);
            m9902d(this.f17788r);
        }
    }

    public void setChipEndPadding(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable == null || chipDrawable.f17839f0 == f2) {
            return;
        }
        chipDrawable.f17839f0 = f2;
        chipDrawable.invalidateSelf();
        chipDrawable.m9929W();
    }

    public void setChipEndPaddingResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9937e0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9938f0(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(@DrawableRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9938f0(AppCompatResources.m497b(chipDrawable.f17840g0, i2));
        }
    }

    public void setChipIconSize(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9939g0(f2);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9939g0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9940h0(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9940h0(AppCompatResources.m496a(chipDrawable.f17840g0, i2));
        }
    }

    public void setChipIconVisible(@BoolRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9941i0(chipDrawable.f17840g0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable == null || chipDrawable.f17802B == f2) {
            return;
        }
        chipDrawable.f17802B = f2;
        chipDrawable.invalidateSelf();
        chipDrawable.m9929W();
    }

    public void setChipMinHeightResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9942j0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    public void setChipStartPadding(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable == null || chipDrawable.f17832Y == f2) {
            return;
        }
        chipDrawable.f17832Y = f2;
        chipDrawable.invalidateSelf();
        chipDrawable.m9929W();
    }

    public void setChipStartPaddingResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9943k0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9944l0(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9944l0(AppCompatResources.m496a(chipDrawable.f17840g0, i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9945m0(f2);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9945m0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9946n0(drawable);
        }
        m9907i();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable == null || chipDrawable.f17825R == charSequence) {
            return;
        }
        BidiFormatter m2004c = BidiFormatter.m2004c();
        chipDrawable.f17825R = m2004c.m2005d(charSequence, m2004c.f3518c, true);
        chipDrawable.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9947o0(f2);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9947o0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(@DrawableRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9946n0(AppCompatResources.m497b(chipDrawable.f17840g0, i2));
        }
        m9907i();
    }

    public void setCloseIconSize(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9948p0(f2);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9948p0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9949q0(f2);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9949q0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9951s0(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9951s0(AppCompatResources.m496a(chipDrawable.f17840g0, i2));
        }
    }

    public void setCloseIconVisible(@BoolRes int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    @RequiresApi
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f2) {
        super.setElevation(f2);
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m10300w(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f17776f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.f17809E0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f17786p = z;
        m9902d(this.f17788r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.f17831X = motionSpec;
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.f17831X = MotionSpec.m9744b(chipDrawable.f17840g0, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9953u0(f2);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9953u0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9954v0(f2);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9954v0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    @Override // com.google.android.material.internal.MaterialCheckable
    @RestrictTo
    public void setInternalOnCheckedChangeListener(@Nullable MaterialCheckable.OnCheckedChangeListener<Chip> onCheckedChangeListener) {
        this.f17781k = onCheckedChangeListener;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f17776f == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i2) {
        super.setMaxWidth(i2);
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.f17813G0 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f17780j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f17779i = onClickListener;
        m9907i();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9955w0(colorStateList);
        }
        if (this.f17776f.f17803B0) {
            return;
        }
        m9908j();
    }

    public void setRippleColorResource(@ColorRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9955w0(AppCompatResources.m496a(chipDrawable.f17840g0, i2));
            if (this.f17776f.f17803B0) {
                return;
            }
            m9908j();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f17776f.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.f17830W = motionSpec;
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.f17830W = MotionSpec.m9744b(chipDrawable.f17840g0, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(chipDrawable.f17811F0 ? null : charSequence, bufferType);
        ChipDrawable chipDrawable2 = this.f17776f;
        if (chipDrawable2 != null) {
            chipDrawable2.m9956x0(charSequence);
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.f17846m0.m10154b(textAppearance, chipDrawable.f17840g0);
        }
        m9910l();
    }

    public void setTextAppearanceResource(@StyleRes int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable == null || chipDrawable.f17836c0 == f2) {
            return;
        }
        chipDrawable.f17836c0 = f2;
        chipDrawable.invalidateSelf();
        chipDrawable.m9929W();
    }

    public void setTextEndPaddingResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9957y0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            float applyDimension = TypedValue.applyDimension(i2, f2, getResources().getDisplayMetrics());
            TextDrawableHelper textDrawableHelper = chipDrawable.f17846m0;
            TextAppearance textAppearance = textDrawableHelper.f18356f;
            if (textAppearance != null) {
                textAppearance.f18596k = applyDimension;
                textDrawableHelper.f18351a.setTextSize(applyDimension);
                chipDrawable.m9929W();
                chipDrawable.invalidateSelf();
            }
        }
        m9910l();
    }

    public void setTextStartPadding(float f2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable == null || chipDrawable.f17835b0 == f2) {
            return;
        }
        chipDrawable.f17835b0 = f2;
        chipDrawable.invalidateSelf();
        chipDrawable.m9929W();
    }

    public void setTextStartPaddingResource(@DimenRes int i2) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9958z0(chipDrawable.f17840g0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9952t0(z);
        }
        m9907i();
    }

    public void setCheckedIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9934b0(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.m9941i0(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.f17846m0.m10154b(new TextAppearance(chipDrawable.f17840g0, i2), chipDrawable.f17840g0);
        }
        m9910l();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        ChipDrawable chipDrawable = this.f17776f;
        if (chipDrawable != null) {
            chipDrawable.f17846m0.m10154b(new TextAppearance(chipDrawable.f17840g0, i2), chipDrawable.f17840g0);
        }
        m9910l();
    }
}
