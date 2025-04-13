package androidx.core.widget;

import android.os.Build;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public interface AutoSizeableTextView {

    /* renamed from: u1 */
    @RestrictTo
    public static final boolean f3815u1;

    static {
        f3815u1 = Build.VERSION.SDK_INT >= 27;
    }
}
