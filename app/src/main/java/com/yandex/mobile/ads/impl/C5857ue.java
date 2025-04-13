package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ue */
/* loaded from: classes3.dex */
public final class C5857ue {

    /* renamed from: a */
    @NonNull
    private final Context f55483a;

    /* renamed from: b */
    @NonNull
    private final InstreamAdPlayer f55484b;

    /* renamed from: c */
    @NonNull
    private final VideoPlayer f55485c;

    public C5857ue(@NonNull Context context, @NonNull C4937cs c4937cs, @NonNull rl1 rl1Var) {
        this.f55483a = context.getApplicationContext();
        this.f55484b = c4937cs;
        this.f55485c = rl1Var;
    }

    @NonNull
    /* renamed from: a */
    public final C5797te m28985a(@NonNull ViewGroup viewGroup, @NonNull List<fc1> list, @NonNull InstreamAd instreamAd) {
        return new C5797te(viewGroup, list, new InstreamAdBinder(this.f55483a, instreamAd, this.f55484b, this.f55485c));
    }
}
