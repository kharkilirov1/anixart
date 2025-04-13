package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.swiftsoft.anixartd.C2507R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* loaded from: classes.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {

    /* renamed from: b */
    @NonNull
    public final WeakReference<Context> f17467b;

    /* renamed from: c */
    @NonNull
    public final MaterialShapeDrawable f17468c;

    /* renamed from: d */
    @NonNull
    public final TextDrawableHelper f17469d;

    /* renamed from: e */
    @NonNull
    public final Rect f17470e;

    /* renamed from: f */
    @NonNull
    public final BadgeState f17471f;

    /* renamed from: g */
    public float f17472g;

    /* renamed from: h */
    public float f17473h;

    /* renamed from: i */
    public int f17474i;

    /* renamed from: j */
    public float f17475j;

    /* renamed from: k */
    public float f17476k;

    /* renamed from: l */
    public float f17477l;

    /* renamed from: m */
    @Nullable
    public WeakReference<View> f17478m;

    /* renamed from: n */
    @Nullable
    public WeakReference<FrameLayout> f17479n;

    /* renamed from: com.google.android.material.badge.BadgeDrawable$1 */
    class RunnableC12051 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f17480b;

        /* renamed from: c */
        public final /* synthetic */ FrameLayout f17481c;

        /* renamed from: d */
        public final /* synthetic */ BadgeDrawable f17482d;

        @Override // java.lang.Runnable
        public void run() {
            this.f17482d.m9806g(this.f17480b, this.f17481c);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public BadgeDrawable(@NonNull Context context, @XmlRes int i2, @AttrRes int i3, @StyleRes int i4, @Nullable BadgeState.State state) {
        TextAppearance textAppearance;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f17467b = weakReference;
        ThemeEnforcement.m10158c(context, ThemeEnforcement.f18360b, "Theme.MaterialComponents");
        this.f17470e = new Rect();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f17468c = materialShapeDrawable;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f17469d = textDrawableHelper;
        textDrawableHelper.f18351a.setTextAlign(Paint.Align.CENTER);
        Context context3 = weakReference.get();
        if (context3 != null && textDrawableHelper.f18356f != (textAppearance = new TextAppearance(context3, C2507R.style.TextAppearance_MaterialComponents_Badge)) && (context2 = weakReference.get()) != null) {
            textDrawableHelper.m10154b(textAppearance, context2);
            m9807h();
        }
        BadgeState badgeState = new BadgeState(context, i2, i3, i4, state);
        this.f17471f = badgeState;
        this.f17474i = ((int) Math.pow(10.0d, badgeState.f17484b.f17493g - 1.0d)) - 1;
        textDrawableHelper.f18354d = true;
        m9807h();
        invalidateSelf();
        textDrawableHelper.f18354d = true;
        m9807h();
        invalidateSelf();
        textDrawableHelper.f18351a.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(badgeState.f17484b.f17489c.intValue());
        if (materialShapeDrawable.m10290m() != valueOf) {
            materialShapeDrawable.m10301x(valueOf);
            invalidateSelf();
        }
        textDrawableHelper.f18351a.setColor(badgeState.f17484b.f17490d.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f17478m;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f17478m.get();
            WeakReference<FrameLayout> weakReference3 = this.f17479n;
            m9806g(view, weakReference3 != null ? weakReference3.get() : null);
        }
        m9807h();
        setVisible(badgeState.f17484b.f17499m.booleanValue(), false);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    @RestrictTo
    /* renamed from: a */
    public void mo9800a() {
        invalidateSelf();
    }

    @NonNull
    /* renamed from: b */
    public final String m9801b() {
        if (m9804e() <= this.f17474i) {
            return NumberFormat.getInstance(this.f17471f.f17484b.f17494h).format(m9804e());
        }
        Context context = this.f17467b.get();
        return context == null ? "" : String.format(this.f17471f.f17484b.f17494h, context.getString(C2507R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f17474i), "+");
    }

    @Nullable
    /* renamed from: c */
    public CharSequence m9802c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!m9805f()) {
            return this.f17471f.f17484b.f17495i;
        }
        if (this.f17471f.f17484b.f17496j == 0 || (context = this.f17467b.get()) == null) {
            return null;
        }
        int m9804e = m9804e();
        int i2 = this.f17474i;
        return m9804e <= i2 ? context.getResources().getQuantityString(this.f17471f.f17484b.f17496j, m9804e(), Integer.valueOf(m9804e())) : context.getString(this.f17471f.f17484b.f17497k, Integer.valueOf(i2));
    }

    @Nullable
    /* renamed from: d */
    public FrameLayout m9803d() {
        WeakReference<FrameLayout> weakReference = this.f17479n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f17468c.draw(canvas);
        if (m9805f()) {
            Rect rect = new Rect();
            String m9801b = m9801b();
            this.f17469d.f18351a.getTextBounds(m9801b, 0, m9801b.length(), rect);
            canvas.drawText(m9801b, this.f17472g, this.f17473h + (rect.height() / 2), this.f17469d.f18351a);
        }
    }

    /* renamed from: e */
    public int m9804e() {
        if (m9805f()) {
            return this.f17471f.f17484b.f17492f;
        }
        return 0;
    }

    /* renamed from: f */
    public boolean m9805f() {
        return this.f17471f.f17484b.f17492f != -1;
    }

    /* renamed from: g */
    public void m9806g(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.f17478m = new WeakReference<>(view);
        this.f17479n = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m9807h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17471f.f17484b.f17491e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f17470e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f17470e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void m9807h() {
        Context context = this.f17467b.get();
        WeakReference<View> weakReference = this.f17478m;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f17470e);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f17479n;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        int intValue = this.f17471f.f17484b.f17505s.intValue() + (m9805f() ? this.f17471f.f17484b.f17503q.intValue() : this.f17471f.f17484b.f17501o.intValue());
        int intValue2 = this.f17471f.f17484b.f17498l.intValue();
        if (intValue2 == 8388691 || intValue2 == 8388693) {
            this.f17473h = rect2.bottom - intValue;
        } else {
            this.f17473h = rect2.top + intValue;
        }
        if (m9804e() <= 9) {
            float f2 = !m9805f() ? this.f17471f.f17485c : this.f17471f.f17486d;
            this.f17475j = f2;
            this.f17477l = f2;
            this.f17476k = f2;
        } else {
            float f3 = this.f17471f.f17486d;
            this.f17475j = f3;
            this.f17477l = f3;
            this.f17476k = (this.f17469d.m10153a(m9801b()) / 2.0f) + this.f17471f.f17487e;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m9805f() ? C2507R.dimen.mtrl_badge_text_horizontal_edge_offset : C2507R.dimen.mtrl_badge_horizontal_edge_offset);
        int intValue3 = this.f17471f.f17484b.f17504r.intValue() + (m9805f() ? this.f17471f.f17484b.f17502p.intValue() : this.f17471f.f17484b.f17500n.intValue());
        int intValue4 = this.f17471f.f17484b.f17498l.intValue();
        if (intValue4 == 8388659 || intValue4 == 8388691) {
            this.f17472g = ViewCompat.m2231w(view) == 0 ? (rect2.left - this.f17476k) + dimensionPixelSize + intValue3 : ((rect2.right + this.f17476k) - dimensionPixelSize) - intValue3;
        } else {
            this.f17472g = ViewCompat.m2231w(view) == 0 ? ((rect2.right + this.f17476k) - dimensionPixelSize) - intValue3 : (rect2.left - this.f17476k) + dimensionPixelSize + intValue3;
        }
        Rect rect3 = this.f17470e;
        float f4 = this.f17472g;
        float f5 = this.f17473h;
        float f6 = this.f17476k;
        float f7 = this.f17477l;
        rect3.set((int) (f4 - f6), (int) (f5 - f7), (int) (f4 + f6), (int) (f5 + f7));
        this.f17468c.m10298u(this.f17475j);
        if (rect.equals(this.f17470e)) {
            return;
        }
        this.f17468c.setBounds(this.f17470e);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        BadgeState badgeState = this.f17471f;
        badgeState.f17483a.f17491e = i2;
        badgeState.f17484b.f17491e = i2;
        this.f17469d.f18351a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
