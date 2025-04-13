package androidx.core.content;

import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class IntentCompat {

    @RequiresApi
    public static class Api15Impl {
        @DoNotInline
        /* renamed from: a */
        public static Intent m1701a(String str, String str2) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
    }
}
