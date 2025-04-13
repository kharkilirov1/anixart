package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3696Vf;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.bf */
/* loaded from: classes2.dex */
public class C3847bf implements InterfaceC3951ff {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3951ff
    @Nullable
    /* renamed from: a */
    public C3696Vf.d.a.b mo19087a(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        C3646Tf[] c3646TfArr;
        C3696Vf.d.a.b bVar = new C3696Vf.d.a.b();
        if (num != null) {
            bVar.f44296d = num.intValue();
        }
        if (str != null) {
            bVar.f44297e = str;
        }
        C3646Tf[] c3646TfArr2 = null;
        try {
            try {
                if (!TextUtils.isEmpty(str3)) {
                    c3646TfArr2 = C3886d2.m19701b(new JSONArray(str3));
                }
            } catch (Throwable unused) {
            }
            c3646TfArr = c3646TfArr2;
        } catch (Throwable unused2) {
            c3646TfArr = new C3646Tf[]{C3886d2.m19699b(new JSONObject(str3))};
        }
        if (c3646TfArr != null) {
            bVar.f44294b = c3646TfArr;
        }
        if (!TextUtils.isEmpty(str2)) {
            C3721Wf[] c3721WfArr = new C3721Wf[0];
            try {
                c3721WfArr = C3886d2.m19698a(new JSONArray(str2));
            } catch (Throwable unused3) {
            }
            bVar.f44295c = c3721WfArr;
        }
        return bVar;
    }
}
