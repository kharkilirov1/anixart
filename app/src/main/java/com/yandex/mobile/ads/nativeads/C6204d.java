package com.yandex.mobile.ads.nativeads;

import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.C6123zh;
import com.yandex.mobile.ads.impl.m51;
import com.yandex.mobile.ads.impl.wv0;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.nativeads.d */
/* loaded from: classes3.dex */
public final class C6204d implements m51 {

    /* renamed from: a */
    @NonNull
    private final Handler f57680a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @NonNull
    private final CustomClickHandler f57681b;

    /* renamed from: c */
    @NonNull
    private final ResultReceiver f57682c;

    /* renamed from: com.yandex.mobile.ads.nativeads.d$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f57683b;

        public a(String str) {
            this.f57683b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6204d c6204d = C6204d.this;
            c6204d.f57681b.handleCustomClick(this.f57683b, new b(c6204d, 0));
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.d$b */
    public class b implements CustomClickHandlerEventListener {
        private b() {
        }

        @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
        public final void onLeftApplication() {
            C6204d.this.f57682c.send(19, null);
        }

        @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
        public final void onReturnedToApplication() {
            C6204d.this.f57682c.send(20, null);
        }

        public /* synthetic */ b(C6204d c6204d, int i2) {
            this();
        }
    }

    public C6204d(@NonNull CustomClickHandler customClickHandler, @NonNull AdResultReceiver adResultReceiver) {
        this.f57681b = customClickHandler;
        this.f57682c = adResultReceiver;
    }

    @Override // com.yandex.mobile.ads.impl.m51
    /* renamed from: a */
    public final void mo26573a(@NonNull wv0 wv0Var, @NonNull String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_type", "custom");
        ((C6123zh) wv0Var).m30190a(hashMap);
        this.f57680a.post(new a(str));
    }
}
