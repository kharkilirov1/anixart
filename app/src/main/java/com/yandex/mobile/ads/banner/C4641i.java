package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C5427m6;
import com.yandex.mobile.ads.impl.InterfaceC5538oh;
import com.yandex.mobile.ads.impl.tg1;

/* renamed from: com.yandex.mobile.ads.banner.i */
/* loaded from: classes2.dex */
final class C4641i {

    /* renamed from: com.yandex.mobile.ads.banner.i$a */
    public static final class a implements InterfaceC4640h {

        /* renamed from: a */
        @NonNull
        private final C4637e f47650a;

        public a(@NonNull C4637e c4637e) {
            this.f47650a = c4637e;
        }

        @Override // com.yandex.mobile.ads.banner.InterfaceC4640h
        /* renamed from: a */
        public final void mo21790a(@NonNull Context context, @NonNull View view) {
        }

        @Override // com.yandex.mobile.ads.banner.InterfaceC4640h
        public final void onAttachedToWindow() {
            if (C5427m6.m26579a((InterfaceC5538oh) this.f47650a)) {
                return;
            }
            this.f47650a.m28626q();
        }

        @Override // com.yandex.mobile.ads.banner.InterfaceC4640h
        public final void onDetachedFromWindow() {
            if (C5427m6.m26579a((InterfaceC5538oh) this.f47650a)) {
                return;
            }
            this.f47650a.m28628s();
        }
    }

    /* renamed from: com.yandex.mobile.ads.banner.i$b */
    public static final class b implements InterfaceC4640h {
        @Override // com.yandex.mobile.ads.banner.InterfaceC4640h
        /* renamed from: a */
        public final void mo21790a(@NonNull Context context, @NonNull View view) {
            view.setVisibility(0);
            int i2 = tg1.f55120b;
            view.setMinimumHeight(Math.round(TypedValue.applyDimension(1, 50.0f, context.getResources().getDisplayMetrics())));
        }

        @Override // com.yandex.mobile.ads.banner.InterfaceC4640h
        public final void onAttachedToWindow() {
        }

        @Override // com.yandex.mobile.ads.banner.InterfaceC4640h
        public final void onDetachedFromWindow() {
        }
    }

    @NonNull
    /* renamed from: a */
    public static InterfaceC4640h m21791a(@NonNull View view, @NonNull C4637e c4637e) {
        return view.isInEditMode() ? new b() : new a(c4637e);
    }
}
