package com.yandex.mobile.ads.exo.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.yandex.div2.C3070s0;
import com.yandex.mobile.ads.exo.drm.InterfaceC4718e;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.a91;
import com.yandex.mobile.ads.impl.uq0;

/* renamed from: com.yandex.mobile.ads.exo.drm.g */
/* loaded from: classes2.dex */
public interface InterfaceC4720g {

    /* renamed from: a */
    public static final InterfaceC4720g f48025a = new a();

    /* renamed from: com.yandex.mobile.ads.exo.drm.g$b */
    public interface b {

        /* renamed from: a */
        public static final b f48026a = C3070s0.f42035j;

        void release();
    }

    /* renamed from: a */
    int mo22135a(C5606pv c5606pv);

    @Nullable
    /* renamed from: a */
    InterfaceC4718e mo22136a(@Nullable InterfaceC4719f.a aVar, C5606pv c5606pv);

    /* renamed from: a */
    void mo22137a(Looper looper, uq0 uq0Var);

    /* renamed from: b */
    b mo22139b(@Nullable InterfaceC4719f.a aVar, C5606pv c5606pv);

    void prepare();

    void release();

    /* renamed from: com.yandex.mobile.ads.exo.drm.g$a */
    public class a implements InterfaceC4720g {
        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
        @Nullable
        /* renamed from: a */
        public final InterfaceC4718e mo22136a(@Nullable InterfaceC4719f.a aVar, C5606pv c5606pv) {
            if (c5606pv.f53823o == null) {
                return null;
            }
            return new C4725l(new InterfaceC4718e.a(new a91(), 6001));
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
        /* renamed from: a */
        public final void mo22137a(Looper looper, uq0 uq0Var) {
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
        /* renamed from: b */
        public /* synthetic */ b mo22139b(InterfaceC4719f.a aVar, C5606pv c5606pv) {
            return C4734u.m22229a(this, aVar, c5606pv);
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
        public /* synthetic */ void prepare() {
            C4734u.m22230b(this);
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
        public /* synthetic */ void release() {
            C4734u.m22231c(this);
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
        /* renamed from: a */
        public final int mo22135a(C5606pv c5606pv) {
            return c5606pv.f53823o != null ? 1 : 0;
        }
    }
}
