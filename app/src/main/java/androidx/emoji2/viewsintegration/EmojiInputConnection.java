package androidx.emoji2.viewsintegration;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
final class EmojiInputConnection extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f4116a;

    /* renamed from: b */
    public final EmojiCompatDeleteHelper f4117b;

    public static class EmojiCompatDeleteHelper {
        /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
        
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0089, code lost:
        
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x007c, code lost:
        
            if (r12 != false) goto L70;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m2879a(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r8, @androidx.annotation.NonNull android.text.Editable r9, @androidx.annotation.IntRange int r10, @androidx.annotation.IntRange int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper.m2879a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiInputConnection(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        super(inputConnection, false);
        EmojiCompatDeleteHelper emojiCompatDeleteHelper = new EmojiCompatDeleteHelper();
        this.f4116a = textView;
        this.f4117b = emojiCompatDeleteHelper;
        if (EmojiCompat.m2798d()) {
            EmojiCompat.m2796a().m2807l(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        return this.f4117b.m2879a(this, this.f4116a.getEditableText(), i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return this.f4117b.m2879a(this, this.f4116a.getEditableText(), i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
