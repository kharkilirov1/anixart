package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class AppCompatTextViewAutoSizeHelper {

    /* renamed from: l */
    public static final RectF f1267l = new RectF();

    /* renamed from: m */
    @SuppressLint
    public static ConcurrentHashMap<String, Method> f1268m = new ConcurrentHashMap<>();

    /* renamed from: n */
    @SuppressLint
    public static ConcurrentHashMap<String, Field> f1269n = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f1270a = 0;

    /* renamed from: b */
    public boolean f1271b = false;

    /* renamed from: c */
    public float f1272c = -1.0f;

    /* renamed from: d */
    public float f1273d = -1.0f;

    /* renamed from: e */
    public float f1274e = -1.0f;

    /* renamed from: f */
    public int[] f1275f = new int[0];

    /* renamed from: g */
    public boolean f1276g = false;

    /* renamed from: h */
    public TextPaint f1277h;

    /* renamed from: i */
    @NonNull
    public final TextView f1278i;

    /* renamed from: j */
    public final Context f1279j;

    /* renamed from: k */
    public final Impl f1280k;

    @RequiresApi
    public static final class Api16Impl {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static StaticLayout m818a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i2, @NonNull TextView textView, @NonNull TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i2, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @DoNotInline
        /* renamed from: b */
        public static int m819b(@NonNull TextView textView) {
            return textView.getMaxLines();
        }
    }

    @RequiresApi
    public static final class Api18Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m820a(@NonNull View view) {
            return view.isInLayout();
        }
    }

    @RequiresApi
    public static final class Api23Impl {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static StaticLayout m821a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i2, int i3, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull Impl impl) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i3 == -1) {
                i3 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i3);
            try {
                impl.mo822a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    public static class Impl {
        /* renamed from: a */
        public void mo822a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        public boolean mo823b(TextView textView) {
            return ((Boolean) AppCompatTextViewAutoSizeHelper.m809e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    @RequiresApi
    public static class Impl23 extends Impl {
        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        /* renamed from: a */
        public void mo822a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) AppCompatTextViewAutoSizeHelper.m809e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @RequiresApi
    public static class Impl29 extends Impl23 {
        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        /* renamed from: a */
        public void mo822a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        /* renamed from: b */
        public boolean mo823b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public AppCompatTextViewAutoSizeHelper(@NonNull TextView textView) {
        this.f1278i = textView;
        this.f1279j = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f1280k = new Impl29();
        } else if (i2 >= 23) {
            this.f1280k = new Impl23();
        } else {
            this.f1280k = new Impl();
        }
    }

    @Nullable
    /* renamed from: d */
    public static Method m808d(@NonNull String str) {
        try {
            Method method = f1268m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1268m.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* renamed from: e */
    public static <T> T m809e(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        try {
            return (T) m808d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    @RestrictTo
    /* renamed from: a */
    public void m810a() {
        if (m816i() && this.f1270a != 0) {
            if (this.f1271b) {
                if (this.f1278i.getMeasuredHeight() <= 0 || this.f1278i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1280k.mo823b(this.f1278i) ? 1048576 : (this.f1278i.getMeasuredWidth() - this.f1278i.getTotalPaddingLeft()) - this.f1278i.getTotalPaddingRight();
                int height = (this.f1278i.getHeight() - this.f1278i.getCompoundPaddingBottom()) - this.f1278i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1267l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m812c = m812c(rectF);
                    if (m812c != this.f1278i.getTextSize()) {
                        m813f(0, m812c);
                    }
                }
            }
            this.f1271b = true;
        }
    }

    /* renamed from: b */
    public final int[] m811b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    public final int m812c(RectF rectF) {
        int i2;
        StaticLayout m818a;
        CharSequence transformation;
        int length = this.f1275f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = length - 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 <= i3) {
            int i6 = (i4 + i3) / 2;
            int i7 = this.f1275f[i6];
            CharSequence text = this.f1278i.getText();
            TransformationMethod transformationMethod = this.f1278i.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1278i)) != null) {
                text = transformation;
            }
            int i8 = Build.VERSION.SDK_INT;
            int m819b = Api16Impl.m819b(this.f1278i);
            TextPaint textPaint = this.f1277h;
            if (textPaint == null) {
                this.f1277h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f1277h.set(this.f1278i.getPaint());
            this.f1277h.setTextSize(i7);
            Layout.Alignment alignment = (Layout.Alignment) m809e(this.f1278i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int round = Math.round(rectF.right);
            if (i8 >= 23) {
                i2 = m819b;
                m818a = Api23Impl.m821a(text, alignment, round, m819b, this.f1278i, this.f1277h, this.f1280k);
            } else {
                i2 = m819b;
                m818a = Api16Impl.m818a(text, alignment, round, this.f1278i, this.f1277h);
            }
            if ((i2 == -1 || (m818a.getLineCount() <= i2 && m818a.getLineEnd(m818a.getLineCount() - 1) == text.length())) && ((float) m818a.getHeight()) <= rectF.bottom) {
                int i9 = i6 + 1;
                i5 = i4;
                i4 = i9;
            } else {
                i5 = i6 - 1;
                i3 = i5;
            }
        }
        return this.f1275f[i5];
    }

    @RestrictTo
    /* renamed from: f */
    public void m813f(int i2, float f2) {
        Context context = this.f1279j;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f1278i.getPaint().getTextSize()) {
            this.f1278i.getPaint().setTextSize(applyDimension);
            boolean m820a = Api18Impl.m820a(this.f1278i);
            if (this.f1278i.getLayout() != null) {
                this.f1271b = false;
                try {
                    Method m808d = m808d("nullLayouts");
                    if (m808d != null) {
                        m808d.invoke(this.f1278i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (m820a) {
                    this.f1278i.forceLayout();
                } else {
                    this.f1278i.requestLayout();
                }
                this.f1278i.invalidate();
            }
        }
    }

    /* renamed from: g */
    public final boolean m814g() {
        if (m816i() && this.f1270a == 1) {
            if (!this.f1276g || this.f1275f.length == 0) {
                int floor = ((int) Math.floor((this.f1274e - this.f1273d) / this.f1272c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f1272c) + this.f1273d);
                }
                this.f1275f = m811b(iArr);
            }
            this.f1271b = true;
        } else {
            this.f1271b = false;
        }
        return this.f1271b;
    }

    /* renamed from: h */
    public final boolean m815h() {
        boolean z = this.f1275f.length > 0;
        this.f1276g = z;
        if (z) {
            this.f1270a = 1;
            this.f1273d = r0[0];
            this.f1274e = r0[r1 - 1];
            this.f1272c = -1.0f;
        }
        return z;
    }

    /* renamed from: i */
    public final boolean m816i() {
        return !(this.f1278i instanceof AppCompatEditText);
    }

    /* renamed from: j */
    public final void m817j(float f2, float f3, float f4) throws IllegalArgumentException {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f1270a = 1;
        this.f1273d = f2;
        this.f1274e = f3;
        this.f1272c = f4;
        this.f1276g = false;
    }
}
