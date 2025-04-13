package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
class UnprecomputeTextOnModificationSpannable implements Spannable {

    /* renamed from: b */
    public boolean f4073b = false;

    /* renamed from: c */
    @NonNull
    public Spannable f4074c;

    @RequiresApi
    public static class CharSequenceHelper_API24 {
    }

    public static class PrecomputedTextDetector {
        /* renamed from: a */
        public boolean mo2849a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    @RequiresApi
    public static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        /* renamed from: a */
        public boolean mo2849a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    public UnprecomputeTextOnModificationSpannable(@NonNull Spannable spannable) {
        this.f4074c = spannable;
    }

    /* renamed from: a */
    public final void m2848a() {
        Spannable spannable = this.f4074c;
        if (!this.f4073b) {
            if ((Build.VERSION.SDK_INT < 28 ? new PrecomputedTextDetector() : new PrecomputedTextDetector_28()).mo2849a(spannable)) {
                this.f4074c = new SpannableString(spannable);
            }
        }
        this.f4073b = true;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f4074c.charAt(i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi
    public IntStream chars() {
        return this.f4074c.chars();
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi
    public IntStream codePoints() {
        return this.f4074c.codePoints();
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f4074c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f4074c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f4074c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return (T[]) this.f4074c.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f4074c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f4074c.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m2848a();
        this.f4074c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        m2848a();
        this.f4074c.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public CharSequence subSequence(int i2, int i3) {
        return this.f4074c.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f4074c.toString();
    }

    public UnprecomputeTextOnModificationSpannable(@NonNull CharSequence charSequence) {
        this.f4074c = new SpannableString(charSequence);
    }
}
