package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3978gg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Me */
/* loaded from: classes2.dex */
public class C3471Me implements InterfaceC3920ea<C3446Le, C3978gg.a> {

    /* renamed from: a */
    @NonNull
    private final C3421Ke f43429a = new C3421Ke();

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3978gg.a mo17818b(@NonNull C3446Le c3446Le) {
        C3978gg.a aVar = new C3978gg.a();
        if (!TextUtils.isEmpty(c3446Le.f43331a)) {
            aVar.f45210b = c3446Le.f43331a;
        }
        aVar.f45211c = c3446Le.f43332b.toString();
        aVar.f45212d = c3446Le.f43333c;
        aVar.f45213e = c3446Le.f43334d;
        aVar.f45214f = this.f43429a.mo17818b(c3446Le.f43335e).intValue();
        return aVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3446Le mo17817a(@NonNull C3978gg.a aVar) {
        JSONObject jSONObject;
        String str = aVar.f45210b;
        String str2 = aVar.f45211c;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C3446Le(str, jSONObject, aVar.f45212d, aVar.f45213e, this.f43429a.mo17817a(Integer.valueOf(aVar.f45214f)));
        }
        jSONObject = new JSONObject();
        return new C3446Le(str, jSONObject, aVar.f45212d, aVar.f45213e, this.f43429a.mo17817a(Integer.valueOf(aVar.f45214f)));
    }
}
