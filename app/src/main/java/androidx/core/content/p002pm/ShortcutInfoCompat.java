package androidx.core.content.p002pm;

import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class ShortcutInfoCompat {

    /* renamed from: a */
    public Context f3304a;

    /* renamed from: b */
    public String f3305b;

    /* renamed from: c */
    public Intent[] f3306c;

    /* renamed from: d */
    public CharSequence f3307d;

    /* renamed from: e */
    public IconCompat f3308e;

    /* renamed from: f */
    public PersistableBundle f3309f;

    public static class Builder {

        /* renamed from: a */
        public final ShortcutInfoCompat f3310a;

        public Builder(@NonNull Context context, @NonNull String str) {
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.f3310a = shortcutInfoCompat;
            shortcutInfoCompat.f3304a = context;
            shortcutInfoCompat.f3305b = str;
        }

        @NonNull
        /* renamed from: a */
        public ShortcutInfoCompat m1711a() {
            if (TextUtils.isEmpty(this.f3310a.f3307d)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            ShortcutInfoCompat shortcutInfoCompat = this.f3310a;
            Intent[] intentArr = shortcutInfoCompat.f3306c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            return shortcutInfoCompat;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Surface {
    }
}
