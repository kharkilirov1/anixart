package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0055R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* loaded from: classes.dex */
class AppCompatEmojiTextHelper {

    /* renamed from: a */
    @NonNull
    public final TextView f1180a;

    /* renamed from: b */
    @NonNull
    public final EmojiTextViewHelper f1181b;

    public AppCompatEmojiTextHelper(@NonNull TextView textView) {
        this.f1180a = textView;
        this.f1181b = new EmojiTextViewHelper(textView, false);
    }

    /* renamed from: a */
    public void m745a(@Nullable AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f1180a.getContext().obtainStyledAttributes(attributeSet, C0055R.styleable.f299j, i2, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            this.f1181b.m2883d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
