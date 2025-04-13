package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class EmojiEditTextHelper {

    /* renamed from: a */
    public final HelperInternal f4110a;

    public static class HelperInternal {
        @Nullable
        /* renamed from: a */
        public KeyListener mo2876a(@Nullable KeyListener keyListener) {
            return keyListener;
        }

        /* renamed from: b */
        public InputConnection mo2877b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection;
        }

        /* renamed from: c */
        public void mo2878c(boolean z) {
        }
    }

    @RequiresApi
    public static class HelperInternal19 extends HelperInternal {

        /* renamed from: a */
        public final EditText f4111a;

        /* renamed from: b */
        public final EmojiTextWatcher f4112b;

        public HelperInternal19(@NonNull EditText editText, boolean z) {
            this.f4111a = editText;
            EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText, z);
            this.f4112b = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            if (EmojiEditableFactory.f4114b == null) {
                synchronized (EmojiEditableFactory.f4113a) {
                    if (EmojiEditableFactory.f4114b == null) {
                        EmojiEditableFactory.f4114b = new EmojiEditableFactory();
                    }
                }
            }
            editText.setEditableFactory(EmojiEditableFactory.f4114b);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        /* renamed from: a */
        public KeyListener mo2876a(@Nullable KeyListener keyListener) {
            if (keyListener instanceof EmojiKeyListener) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        /* renamed from: b */
        public InputConnection mo2877b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(this.f4111a, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        /* renamed from: c */
        public void mo2878c(boolean z) {
            EmojiTextWatcher emojiTextWatcher = this.f4112b;
            if (emojiTextWatcher.f4132e != z) {
                if (emojiTextWatcher.f4131d != null) {
                    EmojiCompat m2796a = EmojiCompat.m2796a();
                    EmojiCompat.InitCallback initCallback = emojiTextWatcher.f4131d;
                    Objects.requireNonNull(m2796a);
                    Preconditions.m2032e(initCallback, "initCallback cannot be null");
                    m2796a.f4005a.writeLock().lock();
                    try {
                        m2796a.f4006b.remove(initCallback);
                    } finally {
                        m2796a.f4005a.writeLock().unlock();
                    }
                }
                emojiTextWatcher.f4132e = z;
                if (z) {
                    EmojiTextWatcher.m2891a(emojiTextWatcher.f4129b, EmojiCompat.m2796a().m2799b());
                }
            }
        }
    }

    public EmojiEditTextHelper(@NonNull EditText editText, boolean z) {
        Preconditions.m2032e(editText, "editText cannot be null");
        this.f4110a = new HelperInternal19(editText, z);
    }

    @Nullable
    /* renamed from: a */
    public KeyListener m2873a(@Nullable KeyListener keyListener) {
        return this.f4110a.mo2876a(keyListener);
    }

    @Nullable
    /* renamed from: b */
    public InputConnection m2874b(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f4110a.mo2877b(inputConnection, editorInfo);
    }

    /* renamed from: c */
    public void m2875c(boolean z) {
        this.f4110a.mo2878c(z);
    }
}
