package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface bc0 {

    /* renamed from: com.yandex.mobile.ads.impl.bc0$a */
    public interface InterfaceC4857a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.bc0$b */
    public static final class C4858b extends xb0 {
        public C4858b(Object obj) {
            super(obj);
        }

        /* renamed from: b */
        public final C4858b m22800b(Object obj) {
            return new C4858b(m29734a(obj));
        }

        public C4858b(Object obj, long j2) {
            super(obj, j2);
        }

        public C4858b(int i2, long j2, Object obj) {
            super(i2, j2, obj);
        }

        public C4858b(Object obj, int i2, int i3, long j2) {
            super(obj, i2, i3, j2);
        }

        public C4858b(xb0 xb0Var) {
            super(xb0Var);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bc0$c */
    public interface InterfaceC4859c {
        /* renamed from: a */
        void mo22801a(bc0 bc0Var, k61 k61Var);
    }

    /* renamed from: a */
    vb0 mo22790a(C4858b c4858b, InterfaceC5476n8 interfaceC5476n8, long j2);

    /* renamed from: a */
    void mo22791a(Handler handler, InterfaceC4719f interfaceC4719f);

    /* renamed from: a */
    void mo22792a(Handler handler, cc0 cc0Var);

    /* renamed from: a */
    void mo22793a(InterfaceC4719f interfaceC4719f);

    /* renamed from: a */
    void mo22794a(InterfaceC4859c interfaceC4859c);

    /* renamed from: a */
    void mo22795a(InterfaceC4859c interfaceC4859c, @Nullable v71 v71Var, uq0 uq0Var);

    /* renamed from: a */
    void mo22796a(cc0 cc0Var);

    /* renamed from: a */
    void mo22797a(vb0 vb0Var);

    /* renamed from: b */
    void mo22798b(InterfaceC4859c interfaceC4859c);

    /* renamed from: c */
    void mo22799c(InterfaceC4859c interfaceC4859c);

    pb0 getMediaItem();

    void maybeThrowSourceInfoRefreshError() throws IOException;
}
