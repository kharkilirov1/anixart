package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3196Be;
import com.yandex.metrica.impl.p023ob.C3978gg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ze */
/* loaded from: classes2.dex */
public class C4470ze implements InterfaceC3920ea<C3196Be.a, C3978gg.b> {

    /* renamed from: a */
    @NonNull
    private final C3421Ke f47116a;

    public C4470ze() {
        this(new C3421Ke());
    }

    @VisibleForTesting
    public C4470ze(@NonNull C3421Ke c3421Ke) {
        this.f47116a = c3421Ke;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3978gg.b mo17818b(@NonNull C3196Be.a aVar) {
        C3978gg.b bVar = new C3978gg.b();
        if (!TextUtils.isEmpty(aVar.f42625a)) {
            bVar.f45216b = aVar.f42625a;
        }
        bVar.f45217c = aVar.f42626b.toString();
        bVar.f45218d = this.f47116a.mo17818b(aVar.f42627c).intValue();
        return bVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3196Be.a mo17817a(@NonNull C3978gg.b bVar) {
        JSONObject jSONObject;
        String str = bVar.f45216b;
        String str2 = bVar.f45217c;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C3196Be.a(str, jSONObject, this.f47116a.mo17817a(Integer.valueOf(bVar.f45218d)));
        }
        jSONObject = new JSONObject();
        return new C3196Be.a(str, jSONObject, this.f47116a.mo17817a(Integer.valueOf(bVar.f45218d)));
    }
}
