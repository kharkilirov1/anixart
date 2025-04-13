package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0055R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {

    /* renamed from: a */
    @NonNull
    public final EditText f1178a;

    /* renamed from: b */
    @NonNull
    public final EmojiEditTextHelper f1179b;

    public AppCompatEmojiEditTextHelper(@NonNull EditText editText) {
        this.f1178a = editText;
        this.f1179b = new EmojiEditTextHelper(editText, false);
    }

    @Nullable
    /* renamed from: a */
    public KeyListener m742a(@Nullable KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? this.f1179b.m2873a(keyListener) : keyListener;
    }

    /* renamed from: b */
    public void m743b(@Nullable AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f1178a.getContext().obtainStyledAttributes(attributeSet, C0055R.styleable.f299j, i2, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            this.f1179b.m2875c(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Nullable
    /* renamed from: c */
    public InputConnection m744c(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.f1179b.m2874b(inputConnection, editorInfo);
    }
}
