package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

@RequiresApi
/* loaded from: classes.dex */
public abstract class EmojiSpan extends ReplacementSpan {

    /* renamed from: c */
    @NonNull
    public final EmojiMetadata f4047c;

    /* renamed from: b */
    public final Paint.FontMetricsInt f4046b = new Paint.FontMetricsInt();

    /* renamed from: d */
    public short f4048d = -1;

    /* renamed from: e */
    public float f4049e = 1.0f;

    @RestrictTo
    public EmojiSpan(@NonNull EmojiMetadata emojiMetadata) {
        Preconditions.m2032e(emojiMetadata, "metadata cannot be null");
        this.f4047c = emojiMetadata;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, @SuppressLint CharSequence charSequence, int i2, int i3, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f4046b);
        Paint.FontMetricsInt fontMetricsInt2 = this.f4046b;
        this.f4049e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f4047c.m2825c();
        this.f4047c.m2825c();
        short s = (short) ((this.f4047c.m2827e().m2864a(12) != 0 ? r1.f4104b.getShort(r2 + r1.f4103a) : (short) 0) * this.f4049e);
        this.f4048d = s;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f4046b;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s;
    }
}
