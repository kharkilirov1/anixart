package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class TextViewCompat {

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m2653a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m2654b(TextView textView) {
            return textView.getMaxLines();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m2655c(TextView textView) {
            return textView.getMinLines();
        }
    }

    @RequiresApi
    public static class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static Drawable[] m2656a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m2657b(View view) {
            return view.getLayoutDirection();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m2658c(View view) {
            return view.getTextDirection();
        }

        @DoNotInline
        /* renamed from: d */
        public static Locale m2659d(TextView textView) {
            return textView.getTextLocale();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m2660e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m2661f(TextView textView, int i2, int i3, int i4, int i5) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m2662g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m2663h(View view, int i2) {
            view.setTextDirection(i2);
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2664a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @DoNotInline
        /* renamed from: b */
        public static ColorStateList m2665b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @DoNotInline
        /* renamed from: c */
        public static PorterDuff.Mode m2666c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m2667d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m2668e(TextView textView, int i2) {
            textView.setBreakStrategy(i2);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m2669f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m2670g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m2671h(TextView textView, int i2) {
            textView.setHyphenationFrequency(i2);
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static DecimalFormatSymbols m2672a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2673a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m2674b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m2675c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        /* renamed from: d */
        public static int[] m2676d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m2677e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @DoNotInline
        /* renamed from: f */
        public static void m2678f(TextView textView, int i2, int i3, int i4, int i5) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m2679g(TextView textView, int[] iArr, int i2) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m2680h(TextView textView, int i2) {
            textView.setAutoSizeTextTypeWithDefaults(i2);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static String[] m2681a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @DoNotInline
        /* renamed from: b */
        public static PrecomputedText.Params m2682b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m2683c(TextView textView, int i2) {
            textView.setFirstBaselineToTopHeight(i2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AutoSizeTextType {
    }

    @RequiresApi
    public static class OreoCallback implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f3853a;

        /* renamed from: b */
        public final TextView f3854b;

        /* renamed from: c */
        public Class<?> f3855c;

        /* renamed from: d */
        public Method f3856d;

        /* renamed from: e */
        public boolean f3857e;

        /* renamed from: f */
        public boolean f3858f = false;

        public OreoCallback(ActionMode.Callback callback, TextView textView) {
            this.f3853a = callback;
            this.f3854b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3853a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3853a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3853a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.TextViewCompat.OreoCallback.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    @NonNull
    /* renamed from: a */
    public static Drawable[] m2639a(@NonNull TextView textView) {
        return Api17Impl.m2656a(textView);
    }

    /* renamed from: b */
    public static int m2640b(@NonNull TextView textView) {
        return Api16Impl.m2654b(textView);
    }

    @NonNull
    /* renamed from: c */
    public static PrecomputedTextCompat.Params m2641c(@NonNull TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new PrecomputedTextCompat.Params(Api28Impl.m2682b(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        PrecomputedTextCompat.Params.Builder builder = new PrecomputedTextCompat.Params.Builder(textPaint);
        if (i2 >= 23) {
            builder.f3539c = Api23Impl.m2664a(textView);
            builder.f3540d = Api23Impl.m2667d(textView);
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (textView.getInputType() & 15) != 3) {
                boolean z = Api17Impl.m2657b(textView) == 1;
                switch (Api17Impl.m2658c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(Api28Impl.m2681a(Api24Impl.m2672a(Api17Impl.m2659d(textView)))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        builder.f3538b = textDirectionHeuristic;
        return new PrecomputedTextCompat.Params(textPaint, textDirectionHeuristic, builder.f3539c, builder.f3540d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static void m2642d(@NonNull TextView textView, @Nullable ColorStateList colorStateList) {
        Objects.requireNonNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            Api23Impl.m2669f(textView, colorStateList);
        } else if (textView instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static void m2643e(@NonNull TextView textView, @Nullable PorterDuff.Mode mode) {
        Objects.requireNonNull(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            Api23Impl.m2670g(textView, mode);
        } else if (textView instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: f */
    public static void m2644f(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        Api17Impl.m2660e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: g */
    public static void m2645g(@NonNull TextView textView, @IntRange @Px int i2) {
        Preconditions.m2030c(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.m2683c(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = Api16Impl.m2653a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: h */
    public static void m2646h(@NonNull TextView textView, @IntRange @Px int i2) {
        Preconditions.m2030c(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = Api16Impl.m2653a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    /* renamed from: i */
    public static void m2647i(@NonNull TextView textView, @IntRange @Px int i2) {
        Preconditions.m2030c(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    /* renamed from: j */
    public static void m2648j(@NonNull TextView textView, @NonNull PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Spannable spannable = precomputedTextCompat.f3529b;
            textView.setText(spannable instanceof PrecomputedText ? (PrecomputedText) spannable : null);
        } else {
            if (!m2641c(textView).m2014a(precomputedTextCompat.f3530c)) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(precomputedTextCompat);
        }
    }

    /* renamed from: k */
    public static void m2649k(@NonNull TextView textView, @StyleRes int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2650l(@androidx.annotation.NonNull android.widget.TextView r3, @androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat.Params r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            android.text.TextDirectionHeuristic r1 = r4.f3533b
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r1 != r2) goto L9
            goto L32
        L9:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r1 != r2) goto Le
            goto L32
        Le:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r1 != r2) goto L14
            r1 = 2
            goto L33
        L14:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LTR
            if (r1 != r2) goto L1a
            r1 = 3
            goto L33
        L1a:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.RTL
            if (r1 != r2) goto L20
            r1 = 4
            goto L33
        L20:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LOCALE
            if (r1 != r2) goto L26
            r1 = 5
            goto L33
        L26:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r1 != r2) goto L2c
            r1 = 6
            goto L33
        L2c:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r1 != r2) goto L32
            r1 = 7
            goto L33
        L32:
            r1 = 1
        L33:
            androidx.core.widget.TextViewCompat.Api17Impl.m2663h(r3, r1)
            r1 = 23
            if (r0 >= r1) goto L5f
            android.text.TextPaint r0 = r4.f3532a
            float r0 = r0.getTextScaleX()
            android.text.TextPaint r1 = r3.getPaint()
            android.text.TextPaint r4 = r4.f3532a
            r1.set(r4)
            float r4 = r3.getTextScaleX()
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L5b
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r0 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 + r1
            r3.setTextScaleX(r4)
        L5b:
            r3.setTextScaleX(r0)
            goto L72
        L5f:
            android.text.TextPaint r0 = r3.getPaint()
            android.text.TextPaint r1 = r4.f3532a
            r0.set(r1)
            int r0 = r4.f3534c
            androidx.core.widget.TextViewCompat.Api23Impl.m2668e(r3, r0)
            int r4 = r4.f3535d
            androidx.core.widget.TextViewCompat.Api23Impl.m2671h(r3, r4)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.TextViewCompat.m2650l(android.widget.TextView, androidx.core.text.PrecomputedTextCompat$Params):void");
    }

    @Nullable
    @RestrictTo
    /* renamed from: m */
    public static ActionMode.Callback m2651m(@Nullable ActionMode.Callback callback) {
        return (!(callback instanceof OreoCallback) || Build.VERSION.SDK_INT < 26) ? callback : ((OreoCallback) callback).f3853a;
    }

    @Nullable
    @RestrictTo
    /* renamed from: n */
    public static ActionMode.Callback m2652n(@NonNull TextView textView, @Nullable ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof OreoCallback) || callback == null) ? callback : new OreoCallback(callback, textView);
    }
}
