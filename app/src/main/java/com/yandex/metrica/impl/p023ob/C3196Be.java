package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.util.List;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Be */
/* loaded from: classes2.dex */
public class C3196Be implements InterfaceC3207C0<a, C3446Le> {

    /* renamed from: a */
    @NonNull
    public final C3446Le f42623a;

    /* renamed from: b */
    @NonNull
    public final List<a> f42624b;

    /* renamed from: com.yandex.metrica.impl.ob.Be$a */
    public static class a {

        /* renamed from: a */
        @Nullable
        public final String f42625a;

        /* renamed from: b */
        @NonNull
        public final JSONObject f42626b;

        /* renamed from: c */
        @NonNull
        public final EnumC3257E0 f42627c;

        public a(@Nullable String str, @NonNull JSONObject jSONObject, @NonNull EnumC3257E0 enumC3257E0) {
            this.f42625a = str;
            this.f42626b = jSONObject;
            this.f42627c = enumC3257E0;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("Candidate{trackingId='");
            C0576a.m4100A(m24u, this.f42625a, '\'', ", additionalParams=");
            m24u.append(this.f42626b);
            m24u.append(", source=");
            m24u.append(this.f42627c);
            m24u.append('}');
            return m24u.toString();
        }
    }

    public C3196Be(@NonNull C3446Le c3446Le, @NonNull List<a> list) {
        this.f42623a = c3446Le;
        this.f42624b = list;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3207C0
    @NonNull
    /* renamed from: a */
    public List<a> mo17902a() {
        return this.f42624b;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3207C0
    @Nullable
    /* renamed from: b */
    public C3446Le mo17903b() {
        return this.f42623a;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("PreloadInfoData{chosenPreloadInfo=");
        m24u.append(this.f42623a);
        m24u.append(", candidates=");
        return C0576a.m4119r(m24u, this.f42624b, '}');
    }
}
