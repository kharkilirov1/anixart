package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nf */
/* loaded from: classes2.dex */
public class C4159nf implements InterfaceC4133mf {

    /* renamed from: a */
    @NonNull
    private final C3720We f46009a;

    public C4159nf() {
        this(new C3720We());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4133mf
    @NonNull
    /* renamed from: a */
    public byte[] mo18816a(@NonNull C3745Xe c3745Xe, @NonNull C4057jh c4057jh) {
        if (!c4057jh.m20115U() && !TextUtils.isEmpty(c3745Xe.f44480b)) {
            try {
                JSONObject jSONObject = new JSONObject(c3745Xe.f44480b);
                jSONObject.remove("preloadInfo");
                c3745Xe.f44480b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f46009a.mo18816a(c3745Xe, c4057jh);
    }

    @VisibleForTesting
    public C4159nf(@NonNull C3720We c3720We) {
        this.f46009a = c3720We;
    }
}
