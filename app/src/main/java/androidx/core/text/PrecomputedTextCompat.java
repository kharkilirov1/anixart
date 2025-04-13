package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p000a.C0000a;

/* loaded from: classes.dex */
public class PrecomputedTextCompat implements Spannable {

    /* renamed from: b */
    @NonNull
    public final Spannable f3529b;

    /* renamed from: c */
    @NonNull
    public final Params f3530c;

    /* renamed from: d */
    @Nullable
    public final PrecomputedText f3531d;

    public static class PrecomputedTextFutureTask extends FutureTask<PrecomputedTextCompat> {

        public static class PrecomputedTextCallback implements Callable<PrecomputedTextCompat> {
            @Override // java.util.concurrent.Callable
            public PrecomputedTextCompat call() throws Exception {
                Objects.requireNonNull(null);
                throw null;
            }
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f3529b.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3529b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3529b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3529b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f3531d.getSpans(i2, i3, cls) : (T[]) this.f3529b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3529b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f3529b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3531d.removeSpan(obj);
        } else {
            this.f3529b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3531d.setSpan(obj, i2, i3, i4);
        } else {
            this.f3529b.setSpan(obj, i2, i3, i4);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f3529b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f3529b.toString();
    }

    public static final class Params {

        /* renamed from: a */
        @NonNull
        public final TextPaint f3532a;

        /* renamed from: b */
        @Nullable
        public final TextDirectionHeuristic f3533b;

        /* renamed from: c */
        public final int f3534c;

        /* renamed from: d */
        public final int f3535d;

        /* renamed from: e */
        public final PrecomputedText.Params f3536e;

        public static class Builder {

            /* renamed from: a */
            @NonNull
            public final TextPaint f3537a;

            /* renamed from: b */
            public TextDirectionHeuristic f3538b;

            /* renamed from: c */
            public int f3539c;

            /* renamed from: d */
            public int f3540d;

            public Builder(@NonNull TextPaint textPaint) {
                this.f3537a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f3539c = 1;
                    this.f3540d = 1;
                } else {
                    this.f3540d = 0;
                    this.f3539c = 0;
                }
                this.f3538b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        }

        public Params(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3536e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f3536e = null;
            }
            this.f3532a = textPaint;
            this.f3533b = textDirectionHeuristic;
            this.f3534c = i2;
            this.f3535d = i3;
        }

        @RestrictTo
        /* renamed from: a */
        public boolean m2014a(@NonNull Params params) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.f3534c != params.f3534c || this.f3535d != params.f3535d)) || this.f3532a.getTextSize() != params.f3532a.getTextSize() || this.f3532a.getTextScaleX() != params.f3532a.getTextScaleX() || this.f3532a.getTextSkewX() != params.f3532a.getTextSkewX() || this.f3532a.getLetterSpacing() != params.f3532a.getLetterSpacing() || !TextUtils.equals(this.f3532a.getFontFeatureSettings(), params.f3532a.getFontFeatureSettings()) || this.f3532a.getFlags() != params.f3532a.getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.f3532a.getTextLocales().equals(params.f3532a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f3532a.getTextLocale().equals(params.f3532a.getTextLocale())) {
                return false;
            }
            return this.f3532a.getTypeface() == null ? params.f3532a.getTypeface() == null : this.f3532a.getTypeface().equals(params.f3532a.getTypeface());
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return m2014a(params) && this.f3533b == params.f3533b;
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? ObjectsCompat.m2023b(Float.valueOf(this.f3532a.getTextSize()), Float.valueOf(this.f3532a.getTextScaleX()), Float.valueOf(this.f3532a.getTextSkewX()), Float.valueOf(this.f3532a.getLetterSpacing()), Integer.valueOf(this.f3532a.getFlags()), this.f3532a.getTextLocales(), this.f3532a.getTypeface(), Boolean.valueOf(this.f3532a.isElegantTextHeight()), this.f3533b, Integer.valueOf(this.f3534c), Integer.valueOf(this.f3535d)) : ObjectsCompat.m2023b(Float.valueOf(this.f3532a.getTextSize()), Float.valueOf(this.f3532a.getTextScaleX()), Float.valueOf(this.f3532a.getTextSkewX()), Float.valueOf(this.f3532a.getLetterSpacing()), Integer.valueOf(this.f3532a.getFlags()), this.f3532a.getTextLocale(), this.f3532a.getTypeface(), Boolean.valueOf(this.f3532a.isElegantTextHeight()), this.f3533b, Integer.valueOf(this.f3534c), Integer.valueOf(this.f3535d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder m24u = C0000a.m24u("textSize=");
            m24u.append(this.f3532a.getTextSize());
            sb.append(m24u.toString());
            sb.append(", textScaleX=" + this.f3532a.getTextScaleX());
            sb.append(", textSkewX=" + this.f3532a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            StringBuilder m24u2 = C0000a.m24u(", letterSpacing=");
            m24u2.append(this.f3532a.getLetterSpacing());
            sb.append(m24u2.toString());
            sb.append(", elegantTextHeight=" + this.f3532a.isElegantTextHeight());
            if (i2 >= 24) {
                StringBuilder m24u3 = C0000a.m24u(", textLocale=");
                m24u3.append(this.f3532a.getTextLocales());
                sb.append(m24u3.toString());
            } else {
                StringBuilder m24u4 = C0000a.m24u(", textLocale=");
                m24u4.append(this.f3532a.getTextLocale());
                sb.append(m24u4.toString());
            }
            StringBuilder m24u5 = C0000a.m24u(", typeface=");
            m24u5.append(this.f3532a.getTypeface());
            sb.append(m24u5.toString());
            if (i2 >= 26) {
                StringBuilder m24u6 = C0000a.m24u(", variationSettings=");
                m24u6.append(this.f3532a.getFontVariationSettings());
                sb.append(m24u6.toString());
            }
            StringBuilder m24u7 = C0000a.m24u(", textDir=");
            m24u7.append(this.f3533b);
            sb.append(m24u7.toString());
            sb.append(", breakStrategy=" + this.f3534c);
            sb.append(", hyphenationFrequency=" + this.f3535d);
            sb.append("}");
            return sb.toString();
        }

        @RequiresApi
        public Params(@NonNull PrecomputedText.Params params) {
            this.f3532a = params.getTextPaint();
            this.f3533b = params.getTextDirection();
            this.f3534c = params.getBreakStrategy();
            this.f3535d = params.getHyphenationFrequency();
            this.f3536e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
