package androidx.activity.result;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;

/* loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    /* renamed from: a */
    public abstract void mo315a(@SuppressLint I i2, @Nullable ActivityOptionsCompat activityOptionsCompat);

    @MainThread
    /* renamed from: b */
    public abstract void mo316b();
}
