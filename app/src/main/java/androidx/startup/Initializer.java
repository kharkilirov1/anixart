package androidx.startup;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes.dex */
public interface Initializer<T> {
    @NonNull
    /* renamed from: a */
    List<Class<? extends Initializer<?>>> mo2814a();

    @NonNull
    /* renamed from: b */
    T mo2815b(@NonNull Context context);
}
