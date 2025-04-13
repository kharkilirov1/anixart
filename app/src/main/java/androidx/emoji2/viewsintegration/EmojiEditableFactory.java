package androidx.emoji2.viewsintegration;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.SpannableBuilder;

/* loaded from: classes.dex */
final class EmojiEditableFactory extends Editable.Factory {

    /* renamed from: a */
    public static final Object f4113a = new Object();

    /* renamed from: b */
    @GuardedBy
    public static volatile Editable.Factory f4114b;

    /* renamed from: c */
    @Nullable
    public static Class<?> f4115c;

    @SuppressLint
    public EmojiEditableFactory() {
        try {
            f4115c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f4115c;
        return cls != null ? new SpannableBuilder(cls, charSequence) : super.newEditable(charSequence);
    }
}
