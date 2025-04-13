package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.yj */
/* loaded from: classes2.dex */
public class C4449yj {

    /* renamed from: a */
    @NonNull
    private C3392Ja f47029a;

    /* renamed from: b */
    @NonNull
    private final C3176Aj f47030b;

    public C4449yj() {
        this(new C3392Ja(), new C3176Aj());
    }

    @NonNull
    /* renamed from: a */
    public C3428Kl m21230a(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull C4082kg.u uVar) {
        C3392Ja c3392Ja = this.f47029a;
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            uVar.f45785b = optJSONObject.optBoolean("text_size_collecting", uVar.f45785b);
            uVar.f45786c = optJSONObject.optBoolean("relative_text_size_collecting", uVar.f45786c);
            uVar.f45787d = optJSONObject.optBoolean("text_visibility_collecting", uVar.f45787d);
            uVar.f45788e = optJSONObject.optBoolean("text_style_collecting", uVar.f45788e);
            uVar.f45793j = optJSONObject.optBoolean("info_collecting", uVar.f45793j);
            uVar.f45794k = optJSONObject.optBoolean("non_content_view_collecting", uVar.f45794k);
            uVar.f45795l = optJSONObject.optBoolean("text_length_collecting", uVar.f45795l);
            uVar.f45796m = optJSONObject.optBoolean("view_hierarchical", uVar.f45796m);
            uVar.f45798o = optJSONObject.optBoolean("ignore_filtered", uVar.f45798o);
            uVar.f45799p = optJSONObject.optBoolean("web_view_urls_collecting", uVar.f45799p);
            uVar.f45789f = optJSONObject.optInt("too_long_text_bound", uVar.f45789f);
            uVar.f45790g = optJSONObject.optInt("truncated_text_bound", uVar.f45790g);
            uVar.f45791h = optJSONObject.optInt("max_entities_count", uVar.f45791h);
            uVar.f45792i = optJSONObject.optInt("max_full_content_length", uVar.f45792i);
            uVar.f45800q = optJSONObject.optInt("web_view_url_limit", uVar.f45800q);
            uVar.f45797n = this.f47030b.m17838a(optJSONObject.optJSONArray("filters"));
        }
        return c3392Ja.mo17817a(uVar);
    }

    @VisibleForTesting
    public C4449yj(@NonNull C3392Ja c3392Ja, @NonNull C3176Aj c3176Aj) {
        this.f47029a = c3392Ja;
        this.f47030b = c3176Aj;
    }
}
