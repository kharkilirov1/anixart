package com.yandex.mobile.ads.mediation.banner;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import com.yandex.mobile.ads.mediation.banner.C6155a;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.mediation.banner.h */
/* loaded from: classes3.dex */
final class C6162h {

    /* renamed from: a */
    @NonNull
    private final Handler f57482a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @NonNull
    private final WeakReference<ViewGroup> f57483b;

    /* renamed from: com.yandex.mobile.ads.mediation.banner.h$a */
    public interface a {
    }

    public C6162h(@Nullable AbstractC4639g abstractC4639g) {
        this.f57483b = new WeakReference<>(abstractC4639g);
    }

    /* renamed from: a */
    public final void m30416a(@NonNull View view, @NonNull C6155a.a aVar) {
        this.f57482a.post(new RunnableC6160f(this, view, aVar));
    }
}
