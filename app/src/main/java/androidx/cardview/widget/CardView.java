package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.cardview.C0167R;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: i */
    public static final int[] f1756i = {R.attr.colorBackground};

    /* renamed from: j */
    public static final CardViewImpl f1757j = new CardViewApi21Impl();

    /* renamed from: b */
    public boolean f1758b;

    /* renamed from: c */
    public boolean f1759c;

    /* renamed from: d */
    public int f1760d;

    /* renamed from: e */
    public int f1761e;

    /* renamed from: f */
    public final Rect f1762f;

    /* renamed from: g */
    public final Rect f1763g;

    /* renamed from: h */
    public final CardViewDelegate f1764h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.cardview.widget.CardView$1, androidx.cardview.widget.CardViewDelegate] */
    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1762f = rect;
        this.f1763g = new Rect();
        ?? r2 = new CardViewDelegate() { // from class: androidx.cardview.widget.CardView.1

            /* renamed from: a */
            public Drawable f1765a;

            @Override // androidx.cardview.widget.CardViewDelegate
            /* renamed from: a */
            public void mo1050a(int i2, int i3, int i4, int i5) {
                CardView.this.f1763g.set(i2, i3, i4, i5);
                CardView cardView = CardView.this;
                Rect rect2 = cardView.f1762f;
                CardView.super.setPadding(i2 + rect2.left, i3 + rect2.top, i4 + rect2.right, i5 + rect2.bottom);
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            /* renamed from: b */
            public boolean mo1051b() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            /* renamed from: c */
            public boolean mo1052c() {
                return CardView.this.getUseCompatPadding();
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            /* renamed from: d */
            public Drawable mo1053d() {
                return this.f1765a;
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            /* renamed from: e */
            public View mo1054e() {
                return CardView.this;
            }

            /* renamed from: f */
            public void m1055f(Drawable drawable) {
                this.f1765a = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }
        };
        this.f1764h = r2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0167R.styleable.f1755a, C2507R.attr.cardViewStyle, C2507R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1756i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C2507R.color.cardview_light_background) : getResources().getColor(C2507R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1758b = obtainStyledAttributes.getBoolean(7, false);
        this.f1759c = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1760d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1761e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        CardViewApi21Impl cardViewApi21Impl = (CardViewApi21Impl) f1757j;
        r2.m1055f(new RoundRectDrawable(valueOf, dimension));
        View mo1054e = r2.mo1054e();
        mo1054e.setClipToOutline(true);
        mo1054e.setElevation(dimension2);
        cardViewApi21Impl.m1060d(r2, dimension3);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((CardViewApi21Impl) f1757j).m1057a(this.f1764h).f1776h;
    }

    public float getCardElevation() {
        return this.f1764h.mo1054e().getElevation();
    }

    @Px
    public int getContentPaddingBottom() {
        return this.f1762f.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.f1762f.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.f1762f.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.f1762f.top;
    }

    public float getMaxCardElevation() {
        return ((CardViewApi21Impl) f1757j).m1058b(this.f1764h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1759c;
    }

    public float getRadius() {
        return ((CardViewApi21Impl) f1757j).m1059c(this.f1764h);
    }

    public boolean getUseCompatPadding() {
        return this.f1758b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(@ColorInt int i2) {
        CardViewImpl cardViewImpl = f1757j;
        CardViewDelegate cardViewDelegate = this.f1764h;
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        RoundRectDrawable m1057a = ((CardViewApi21Impl) cardViewImpl).m1057a(cardViewDelegate);
        m1057a.m1063b(valueOf);
        m1057a.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        this.f1764h.mo1054e().setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        ((CardViewApi21Impl) f1757j).m1060d(this.f1764h, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.f1761e = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f1760d = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1759c) {
            this.f1759c = z;
            CardViewImpl cardViewImpl = f1757j;
            CardViewDelegate cardViewDelegate = this.f1764h;
            CardViewApi21Impl cardViewApi21Impl = (CardViewApi21Impl) cardViewImpl;
            cardViewApi21Impl.m1060d(cardViewDelegate, cardViewApi21Impl.m1057a(cardViewDelegate).f1773e);
        }
    }

    public void setRadius(float f2) {
        RoundRectDrawable m1057a = ((CardViewApi21Impl) f1757j).m1057a(this.f1764h);
        if (f2 == m1057a.f1769a) {
            return;
        }
        m1057a.f1769a = f2;
        m1057a.m1064c(null);
        m1057a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1758b != z) {
            this.f1758b = z;
            CardViewImpl cardViewImpl = f1757j;
            CardViewDelegate cardViewDelegate = this.f1764h;
            CardViewApi21Impl cardViewApi21Impl = (CardViewApi21Impl) cardViewImpl;
            cardViewApi21Impl.m1060d(cardViewDelegate, cardViewApi21Impl.m1057a(cardViewDelegate).f1773e);
        }
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        RoundRectDrawable m1057a = ((CardViewApi21Impl) f1757j).m1057a(this.f1764h);
        m1057a.m1063b(colorStateList);
        m1057a.invalidateSelf();
    }
}
