package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.C1195R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;

/* loaded from: classes.dex */
public class ShapeAppearanceModel {

    /* renamed from: m */
    public static final CornerSize f18683m = new RelativeCornerSize(0.5f);

    /* renamed from: a */
    public CornerTreatment f18684a;

    /* renamed from: b */
    public CornerTreatment f18685b;

    /* renamed from: c */
    public CornerTreatment f18686c;

    /* renamed from: d */
    public CornerTreatment f18687d;

    /* renamed from: e */
    public CornerSize f18688e;

    /* renamed from: f */
    public CornerSize f18689f;

    /* renamed from: g */
    public CornerSize f18690g;

    /* renamed from: h */
    public CornerSize f18691h;

    /* renamed from: i */
    public EdgeTreatment f18692i;

    /* renamed from: j */
    public EdgeTreatment f18693j;

    /* renamed from: k */
    public EdgeTreatment f18694k;

    /* renamed from: l */
    public EdgeTreatment f18695l;

    @RestrictTo
    public interface CornerSizeUnaryOperator {
    }

    public ShapeAppearanceModel(Builder builder, C13681 c13681) {
        this.f18684a = builder.f18696a;
        this.f18685b = builder.f18697b;
        this.f18686c = builder.f18698c;
        this.f18687d = builder.f18699d;
        this.f18688e = builder.f18700e;
        this.f18689f = builder.f18701f;
        this.f18690g = builder.f18702g;
        this.f18691h = builder.f18703h;
        this.f18692i = builder.f18704i;
        this.f18693j = builder.f18705j;
        this.f18694k = builder.f18706k;
        this.f18695l = builder.f18707l;
    }

    @NonNull
    /* renamed from: a */
    public static Builder m10311a(Context context, @StyleRes int i2, @StyleRes int i3) {
        return m10312b(context, i2, i3, new AbsoluteCornerSize(0));
    }

    @NonNull
    /* renamed from: b */
    public static Builder m10312b(Context context, @StyleRes int i2, @StyleRes int i3, @NonNull CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C1195R.styleable.f17308I);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            CornerSize m10315e = m10315e(obtainStyledAttributes, 5, cornerSize);
            CornerSize m10315e2 = m10315e(obtainStyledAttributes, 8, m10315e);
            CornerSize m10315e3 = m10315e(obtainStyledAttributes, 9, m10315e);
            CornerSize m10315e4 = m10315e(obtainStyledAttributes, 7, m10315e);
            CornerSize m10315e5 = m10315e(obtainStyledAttributes, 6, m10315e);
            Builder builder = new Builder();
            CornerTreatment m10307a = MaterialShapeUtils.m10307a(i5);
            builder.f18696a = m10307a;
            Builder.m10319b(m10307a);
            builder.f18700e = m10315e2;
            CornerTreatment m10307a2 = MaterialShapeUtils.m10307a(i6);
            builder.f18697b = m10307a2;
            Builder.m10319b(m10307a2);
            builder.f18701f = m10315e3;
            CornerTreatment m10307a3 = MaterialShapeUtils.m10307a(i7);
            builder.f18698c = m10307a3;
            Builder.m10319b(m10307a3);
            builder.f18702g = m10315e4;
            CornerTreatment m10307a4 = MaterialShapeUtils.m10307a(i8);
            builder.f18699d = m10307a4;
            Builder.m10319b(m10307a4);
            builder.f18703h = m10315e5;
            return builder;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    /* renamed from: c */
    public static Builder m10313c(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        return m10314d(context, attributeSet, i2, i3, new AbsoluteCornerSize(0));
    }

    @NonNull
    /* renamed from: d */
    public static Builder m10314d(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3, @NonNull CornerSize cornerSize) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17341z, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m10312b(context, resourceId, resourceId2, cornerSize);
    }

    @NonNull
    /* renamed from: e */
    public static CornerSize m10315e(TypedArray typedArray, int i2, @NonNull CornerSize cornerSize) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cornerSize;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f)) : cornerSize;
    }

    @RestrictTo
    /* renamed from: f */
    public boolean m10316f(@NonNull RectF rectF) {
        boolean z = this.f18695l.getClass().equals(EdgeTreatment.class) && this.f18693j.getClass().equals(EdgeTreatment.class) && this.f18692i.getClass().equals(EdgeTreatment.class) && this.f18694k.getClass().equals(EdgeTreatment.class);
        float mo10265a = this.f18688e.mo10265a(rectF);
        return z && ((this.f18689f.mo10265a(rectF) > mo10265a ? 1 : (this.f18689f.mo10265a(rectF) == mo10265a ? 0 : -1)) == 0 && (this.f18691h.mo10265a(rectF) > mo10265a ? 1 : (this.f18691h.mo10265a(rectF) == mo10265a ? 0 : -1)) == 0 && (this.f18690g.mo10265a(rectF) > mo10265a ? 1 : (this.f18690g.mo10265a(rectF) == mo10265a ? 0 : -1)) == 0) && ((this.f18685b instanceof RoundedCornerTreatment) && (this.f18684a instanceof RoundedCornerTreatment) && (this.f18686c instanceof RoundedCornerTreatment) && (this.f18687d instanceof RoundedCornerTreatment));
    }

    @NonNull
    /* renamed from: g */
    public ShapeAppearanceModel m10317g(float f2) {
        Builder builder = new Builder(this);
        builder.m10324f(f2);
        builder.m10325g(f2);
        builder.m10323e(f2);
        builder.m10322d(f2);
        return builder.m10320a();
    }

    @NonNull
    @RestrictTo
    /* renamed from: h */
    public ShapeAppearanceModel m10318h(@NonNull CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        Builder builder = new Builder(this);
        MaterialShapeDrawable.C13672 c13672 = (MaterialShapeDrawable.C13672) cornerSizeUnaryOperator;
        builder.f18700e = c13672.m10306a(this.f18688e);
        builder.f18701f = c13672.m10306a(this.f18689f);
        builder.f18703h = c13672.m10306a(this.f18691h);
        builder.f18702g = c13672.m10306a(this.f18690g);
        return builder.m10320a();
    }

    public static final class Builder {

        /* renamed from: a */
        @NonNull
        public CornerTreatment f18696a;

        /* renamed from: b */
        @NonNull
        public CornerTreatment f18697b;

        /* renamed from: c */
        @NonNull
        public CornerTreatment f18698c;

        /* renamed from: d */
        @NonNull
        public CornerTreatment f18699d;

        /* renamed from: e */
        @NonNull
        public CornerSize f18700e;

        /* renamed from: f */
        @NonNull
        public CornerSize f18701f;

        /* renamed from: g */
        @NonNull
        public CornerSize f18702g;

        /* renamed from: h */
        @NonNull
        public CornerSize f18703h;

        /* renamed from: i */
        @NonNull
        public EdgeTreatment f18704i;

        /* renamed from: j */
        @NonNull
        public EdgeTreatment f18705j;

        /* renamed from: k */
        @NonNull
        public EdgeTreatment f18706k;

        /* renamed from: l */
        @NonNull
        public EdgeTreatment f18707l;

        public Builder() {
            this.f18696a = new RoundedCornerTreatment();
            this.f18697b = new RoundedCornerTreatment();
            this.f18698c = new RoundedCornerTreatment();
            this.f18699d = new RoundedCornerTreatment();
            this.f18700e = new AbsoluteCornerSize(0.0f);
            this.f18701f = new AbsoluteCornerSize(0.0f);
            this.f18702g = new AbsoluteCornerSize(0.0f);
            this.f18703h = new AbsoluteCornerSize(0.0f);
            this.f18704i = new EdgeTreatment();
            this.f18705j = new EdgeTreatment();
            this.f18706k = new EdgeTreatment();
            this.f18707l = new EdgeTreatment();
        }

        /* renamed from: b */
        public static float m10319b(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                Objects.requireNonNull((RoundedCornerTreatment) cornerTreatment);
                return -1.0f;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                Objects.requireNonNull((CutCornerTreatment) cornerTreatment);
            }
            return -1.0f;
        }

        @NonNull
        /* renamed from: a */
        public ShapeAppearanceModel m10320a() {
            return new ShapeAppearanceModel(this, null);
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: c */
        public Builder m10321c(@Dimension float f2) {
            m10324f(f2);
            m10325g(f2);
            m10323e(f2);
            m10322d(f2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: d */
        public Builder m10322d(@Dimension float f2) {
            this.f18703h = new AbsoluteCornerSize(f2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: e */
        public Builder m10323e(@Dimension float f2) {
            this.f18702g = new AbsoluteCornerSize(f2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: f */
        public Builder m10324f(@Dimension float f2) {
            this.f18700e = new AbsoluteCornerSize(f2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: g */
        public Builder m10325g(@Dimension float f2) {
            this.f18701f = new AbsoluteCornerSize(f2);
            return this;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            this.f18696a = new RoundedCornerTreatment();
            this.f18697b = new RoundedCornerTreatment();
            this.f18698c = new RoundedCornerTreatment();
            this.f18699d = new RoundedCornerTreatment();
            this.f18700e = new AbsoluteCornerSize(0.0f);
            this.f18701f = new AbsoluteCornerSize(0.0f);
            this.f18702g = new AbsoluteCornerSize(0.0f);
            this.f18703h = new AbsoluteCornerSize(0.0f);
            this.f18704i = new EdgeTreatment();
            this.f18705j = new EdgeTreatment();
            this.f18706k = new EdgeTreatment();
            this.f18707l = new EdgeTreatment();
            this.f18696a = shapeAppearanceModel.f18684a;
            this.f18697b = shapeAppearanceModel.f18685b;
            this.f18698c = shapeAppearanceModel.f18686c;
            this.f18699d = shapeAppearanceModel.f18687d;
            this.f18700e = shapeAppearanceModel.f18688e;
            this.f18701f = shapeAppearanceModel.f18689f;
            this.f18702g = shapeAppearanceModel.f18690g;
            this.f18703h = shapeAppearanceModel.f18691h;
            this.f18704i = shapeAppearanceModel.f18692i;
            this.f18705j = shapeAppearanceModel.f18693j;
            this.f18706k = shapeAppearanceModel.f18694k;
            this.f18707l = shapeAppearanceModel.f18695l;
        }
    }

    public ShapeAppearanceModel() {
        this.f18684a = new RoundedCornerTreatment();
        this.f18685b = new RoundedCornerTreatment();
        this.f18686c = new RoundedCornerTreatment();
        this.f18687d = new RoundedCornerTreatment();
        this.f18688e = new AbsoluteCornerSize(0.0f);
        this.f18689f = new AbsoluteCornerSize(0.0f);
        this.f18690g = new AbsoluteCornerSize(0.0f);
        this.f18691h = new AbsoluteCornerSize(0.0f);
        this.f18692i = new EdgeTreatment();
        this.f18693j = new EdgeTreatment();
        this.f18694k = new EdgeTreatment();
        this.f18695l = new EdgeTreatment();
    }
}
