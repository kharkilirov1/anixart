package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.util.Objects;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
final class EmojiKeyListener implements KeyListener {

    /* renamed from: a */
    public final KeyListener f4122a;

    /* renamed from: b */
    public final EmojiCompatHandleKeyDownHelper f4123b;

    public static class EmojiCompatHandleKeyDownHelper {
    }

    public EmojiKeyListener(KeyListener keyListener) {
        EmojiCompatHandleKeyDownHelper emojiCompatHandleKeyDownHelper = new EmojiCompatHandleKeyDownHelper();
        this.f4122a = keyListener;
        this.f4123b = emojiCompatHandleKeyDownHelper;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f4122a.clearMetaKeyState(view, editable, i2);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f4122a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        Objects.requireNonNull(this.f4123b);
        return EmojiCompat.m2797c(editable, i2, keyEvent) || this.f4122a.onKeyDown(view, editable, i2, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f4122a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f4122a.onKeyUp(view, editable, i2, keyEvent);
    }
}
