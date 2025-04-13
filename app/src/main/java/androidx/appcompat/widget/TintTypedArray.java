package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo
/* loaded from: classes.dex */
public class TintTypedArray {

    /* renamed from: a */
    public final Context f1581a;

    /* renamed from: b */
    public final TypedArray f1582b;

    /* renamed from: c */
    public TypedValue f1583c;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m968a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m969b(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    public TintTypedArray(Context context, TypedArray typedArray) {
        this.f1581a = context;
        this.f1582b = typedArray;
    }

    /* renamed from: q */
    public static TintTypedArray m950q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: r */
    public static TintTypedArray m951r(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    /* renamed from: a */
    public boolean m952a(int i2, boolean z) {
        return this.f1582b.getBoolean(i2, z);
    }

    /* renamed from: b */
    public int m953b(int i2, int i3) {
        return this.f1582b.getColor(i2, i3);
    }

    /* renamed from: c */
    public ColorStateList m954c(int i2) {
        int resourceId;
        ColorStateList m496a;
        return (!this.f1582b.hasValue(i2) || (resourceId = this.f1582b.getResourceId(i2, 0)) == 0 || (m496a = AppCompatResources.m496a(this.f1581a, resourceId)) == null) ? this.f1582b.getColorStateList(i2) : m496a;
    }

    /* renamed from: d */
    public float m955d(int i2, float f2) {
        return this.f1582b.getDimension(i2, f2);
    }

    /* renamed from: e */
    public int m956e(int i2, int i3) {
        return this.f1582b.getDimensionPixelOffset(i2, i3);
    }

    /* renamed from: f */
    public int m957f(int i2, int i3) {
        return this.f1582b.getDimensionPixelSize(i2, i3);
    }

    /* renamed from: g */
    public Drawable m958g(int i2) {
        int resourceId;
        return (!this.f1582b.hasValue(i2) || (resourceId = this.f1582b.getResourceId(i2, 0)) == 0) ? this.f1582b.getDrawable(i2) : AppCompatResources.m497b(this.f1581a, resourceId);
    }

    /* renamed from: h */
    public Drawable m959h(int i2) {
        int resourceId;
        Drawable m891g;
        if (!this.f1582b.hasValue(i2) || (resourceId = this.f1582b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        AppCompatDrawableManager m726a = AppCompatDrawableManager.m726a();
        Context context = this.f1581a;
        synchronized (m726a) {
            m891g = m726a.f1166a.m891g(context, resourceId, true);
        }
        return m891g;
    }

    @Nullable
    /* renamed from: i */
    public Typeface m960i(@StyleableRes int i2, int i3, @Nullable ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.f1582b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1583c == null) {
            this.f1583c = new TypedValue();
        }
        Context context = this.f1581a;
        TypedValue typedValue = this.f1583c;
        ThreadLocal<TypedValue> threadLocal = ResourcesCompat.f3339a;
        if (context.isRestricted()) {
            return null;
        }
        return ResourcesCompat.m1736f(context, resourceId, typedValue, i3, fontCallback, null, true, false);
    }

    /* renamed from: j */
    public int m961j(int i2, int i3) {
        return this.f1582b.getInt(i2, i3);
    }

    /* renamed from: k */
    public int m962k(int i2, int i3) {
        return this.f1582b.getInteger(i2, i3);
    }

    /* renamed from: l */
    public int m963l(int i2, int i3) {
        return this.f1582b.getLayoutDimension(i2, i3);
    }

    /* renamed from: m */
    public int m964m(int i2, int i3) {
        return this.f1582b.getResourceId(i2, i3);
    }

    /* renamed from: n */
    public String m965n(int i2) {
        return this.f1582b.getString(i2);
    }

    /* renamed from: o */
    public CharSequence m966o(int i2) {
        return this.f1582b.getText(i2);
    }

    /* renamed from: p */
    public boolean m967p(int i2) {
        return this.f1582b.hasValue(i2);
    }
}
