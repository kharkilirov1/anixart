package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.EmojiCompat;

@AnyThread
@RestrictTo
/* loaded from: classes.dex */
class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {

    /* renamed from: b */
    public static final ThreadLocal<StringBuilder> f4001b = new ThreadLocal<>();

    /* renamed from: a */
    public final TextPaint f4002a;

    public DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.f4002a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    /* renamed from: a */
    public boolean mo2795a(@NonNull CharSequence charSequence, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 23 && i4 > i5) {
            return false;
        }
        ThreadLocal<StringBuilder> threadLocal = f4001b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb = threadLocal.get();
        sb.setLength(0);
        while (i2 < i3) {
            sb.append(charSequence.charAt(i2));
            i2++;
        }
        return PaintCompat.m1783a(this.f4002a, sb.toString());
    }
}
