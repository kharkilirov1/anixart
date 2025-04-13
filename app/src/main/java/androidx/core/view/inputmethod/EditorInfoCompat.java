package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;

@SuppressLint
/* loaded from: classes.dex */
public final class EditorInfoCompat {

    /* renamed from: a */
    public static final String[] f3776a = new String[0];

    @RequiresApi
    public static class Api30Impl {
    }

    @Deprecated
    public EditorInfoCompat() {
    }

    /* renamed from: a */
    public static boolean m2553a(CharSequence charSequence, int i2, int i3) {
        if (i3 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i2));
        }
        if (i3 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i2));
    }

    /* renamed from: b */
    public static void m2554b(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }
}
