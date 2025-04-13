package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Objects;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
public final class TypefaceEmojiSpan extends EmojiSpan {
    public TypefaceEmojiSpan(@NonNull EmojiMetadata emojiMetadata) {
        super(emojiMetadata);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @SuppressLint CharSequence charSequence, @IntRange int i2, @IntRange int i3, float f2, int i4, int i5, int i6, @NonNull Paint paint) {
        Objects.requireNonNull(EmojiCompat.m2796a());
        EmojiMetadata emojiMetadata = this.f4047c;
        Typeface typeface = emojiMetadata.f4031b.f4066d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(emojiMetadata.f4031b.f4064b, emojiMetadata.f4030a * 2, 2, f2, i5, paint);
        paint.setTypeface(typeface2);
    }
}
