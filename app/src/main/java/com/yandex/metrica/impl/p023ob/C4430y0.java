package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.y0 */
/* loaded from: classes2.dex */
public class C4430y0 {

    /* renamed from: a */
    private boolean f46970a;

    /* renamed from: b */
    @Nullable
    private DeferredDeeplinkListener f46971b;

    /* renamed from: c */
    @Nullable
    private DeferredDeeplinkParametersListener f46972c;

    /* renamed from: d */
    @Nullable
    private C4404x0 f46973d;

    /* renamed from: com.yandex.metrica.impl.ob.y0$a */
    public enum a {
        NOT_A_FIRST_LAUNCH,
        PARSE_ERROR,
        NO_REFERRER
    }

    public C4430y0(boolean z) {
        this.f46970a = z;
    }

    /* renamed from: a */
    public void m21176a(@Nullable C4404x0 c4404x0) {
        this.f46973d = c4404x0;
        m21171a();
    }

    /* renamed from: a */
    private void m21172a(@NonNull a aVar) {
        DeferredDeeplinkListener.Error error;
        C4404x0 c4404x0 = this.f46973d;
        String str = c4404x0 == null ? null : c4404x0.f46911c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f46971b;
        if (deferredDeeplinkListener != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                error = DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (ordinal == 1) {
                error = DeferredDeeplinkListener.Error.PARSE_ERROR;
            } else if (ordinal != 2) {
                error = DeferredDeeplinkListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkListener.Error.NO_REFERRER;
            }
            deferredDeeplinkListener.onError(error, str == null ? "" : str);
            this.f46971b = null;
        }
        m21173a(aVar, str);
    }

    /* renamed from: a */
    public void m21175a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f46972c = deferredDeeplinkParametersListener;
        if (this.f46970a) {
            m21172a(a.NOT_A_FIRST_LAUNCH);
        } else {
            m21171a();
        }
    }

    /* renamed from: a */
    public void m21174a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f46971b = deferredDeeplinkListener;
        if (this.f46970a) {
            m21172a(a.NOT_A_FIRST_LAUNCH);
        } else {
            m21171a();
        }
    }

    /* renamed from: a */
    private void m21171a() {
        C4404x0 c4404x0 = this.f46973d;
        if (c4404x0 != null) {
            String str = c4404x0.f46910b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f46971b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f46971b = null;
                }
                if (!C3658U2.m19218b(this.f46973d.f46909a)) {
                    Map<String, String> map = this.f46973d.f46909a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f46972c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f46972c = null;
                        return;
                    }
                    return;
                }
                m21173a(a.PARSE_ERROR, this.f46973d.f46911c);
                return;
            }
            if (c4404x0.f46911c != null) {
                m21172a(a.PARSE_ERROR);
            } else {
                m21172a(a.NO_REFERRER);
            }
        }
    }

    /* renamed from: a */
    private void m21173a(@NonNull a aVar, @Nullable String str) {
        DeferredDeeplinkParametersListener.Error error;
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f46972c;
        if (deferredDeeplinkParametersListener != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                error = DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (ordinal == 1) {
                error = DeferredDeeplinkParametersListener.Error.PARSE_ERROR;
            } else if (ordinal != 2) {
                error = DeferredDeeplinkParametersListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkParametersListener.Error.NO_REFERRER;
            }
            if (str == null) {
                str = "";
            }
            deferredDeeplinkParametersListener.onError(error, str);
            this.f46972c = null;
        }
    }
}
