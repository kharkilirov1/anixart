package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
final class EmojiInputFilter implements InputFilter {

    /* renamed from: a */
    public final TextView f4118a;

    /* renamed from: b */
    public EmojiCompat.InitCallback f4119b;

    @RequiresApi
    public static class InitCallbackImpl extends EmojiCompat.InitCallback {

        /* renamed from: a */
        public final Reference<TextView> f4120a;

        /* renamed from: b */
        public final Reference<EmojiInputFilter> f4121b;

        public InitCallbackImpl(TextView textView, EmojiInputFilter emojiInputFilter) {
            this.f4120a = new WeakReference(textView);
            this.f4121b = new WeakReference(emojiInputFilter);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        /* renamed from: b */
        public void mo944b() {
            CharSequence text;
            CharSequence m2804i;
            InputFilter[] filters;
            TextView textView = this.f4120a.get();
            EmojiInputFilter emojiInputFilter = this.f4121b.get();
            boolean z = false;
            if (emojiInputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= filters.length) {
                        break;
                    }
                    if (filters[i2] == emojiInputFilter) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z && textView.isAttachedToWindow() && text != (m2804i = EmojiCompat.m2796a().m2804i((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(m2804i);
                int selectionEnd = Selection.getSelectionEnd(m2804i);
                textView.setText(m2804i);
                if (m2804i instanceof Spannable) {
                    Spannable spannable = (Spannable) m2804i;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public EmojiInputFilter(@NonNull TextView textView) {
        this.f4118a = textView;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        if (this.f4118a.isInEditMode()) {
            return charSequence;
        }
        int m2799b = EmojiCompat.m2796a().m2799b();
        if (m2799b != 0) {
            boolean z = true;
            if (m2799b == 1) {
                if (i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == this.f4118a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                CharSequence charSequence2 = charSequence;
                return EmojiCompat.m2796a().m2805j(charSequence2, 0, charSequence2.length(), Integer.MAX_VALUE, 0);
            }
            if (m2799b != 3) {
                return charSequence;
            }
        }
        EmojiCompat m2796a = EmojiCompat.m2796a();
        if (this.f4119b == null) {
            this.f4119b = new InitCallbackImpl(this.f4118a, this);
        }
        m2796a.m2806k(this.f4119b);
        return charSequence;
    }
}
