package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class MultiWindowModeChangedInfo {

    /* renamed from: a */
    public final boolean f3145a;

    public MultiWindowModeChangedInfo(boolean z) {
        this.f3145a = z;
    }

    @RequiresApi
    public MultiWindowModeChangedInfo(boolean z, @NonNull Configuration configuration) {
        this.f3145a = z;
    }
}
