package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
final class EmojiTextWatcher implements TextWatcher {

    /* renamed from: b */
    public final EditText f4129b;

    /* renamed from: c */
    public final boolean f4130c;

    /* renamed from: d */
    public EmojiCompat.InitCallback f4131d;

    /* renamed from: e */
    public boolean f4132e = true;

    @RequiresApi
    public static class InitCallbackImpl extends EmojiCompat.InitCallback {

        /* renamed from: a */
        public final Reference<EditText> f4133a;

        public InitCallbackImpl(EditText editText) {
            this.f4133a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        /* renamed from: b */
        public void mo944b() {
            EmojiTextWatcher.m2891a(this.f4133a.get(), 1);
        }
    }

    public EmojiTextWatcher(EditText editText, boolean z) {
        this.f4129b = editText;
        this.f4130c = z;
    }

    /* renamed from: a */
    public static void m2891a(@Nullable EditText editText, int i2) {
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.m2796a().m2804i(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (this.f4129b.isInEditMode()) {
            return;
        }
        if (!((this.f4132e && (this.f4130c || EmojiCompat.m2798d())) ? false : true) && i3 <= i4 && (charSequence instanceof Spannable)) {
            int m2799b = EmojiCompat.m2796a().m2799b();
            if (m2799b != 0) {
                if (m2799b == 1) {
                    EmojiCompat.m2796a().m2805j((Spannable) charSequence, i2, i2 + i4, Integer.MAX_VALUE, 0);
                    return;
                } else if (m2799b != 3) {
                    return;
                }
            }
            EmojiCompat m2796a = EmojiCompat.m2796a();
            if (this.f4131d == null) {
                this.f4131d = new InitCallbackImpl(this.f4129b);
            }
            m2796a.m2806k(this.f4131d);
        }
    }
}
