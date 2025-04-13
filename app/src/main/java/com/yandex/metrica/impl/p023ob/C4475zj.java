package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.zj */
/* loaded from: classes2.dex */
public class C4475zj {

    /* renamed from: a */
    @NonNull
    private final C3417Ka f47132a;

    /* renamed from: b */
    @NonNull
    private final C3176Aj f47133b;

    public C4475zj() {
        this(new C3417Ka(), new C3176Aj());
    }

    @NonNull
    /* renamed from: a */
    public void m21306a(@NonNull C4371vj c4371vj, @NonNull JSONObject jSONObject) {
        C3417Ka c3417Ka = this.f47132a;
        C4082kg.v vVar = new C4082kg.v();
        JSONObject optJSONObject = jSONObject.optJSONObject("ui_parsing");
        if (optJSONObject != null) {
            vVar.f45801b = optJSONObject.optInt("too_long_text_bound", vVar.f45801b);
            vVar.f45802c = optJSONObject.optInt("truncated_text_bound", vVar.f45802c);
            vVar.f45803d = optJSONObject.optInt("max_visited_children_in_level", vVar.f45803d);
            vVar.f45804e = C4452ym.m21231a(C4452ym.m21264d(optJSONObject, "after_create_timeout"), TimeUnit.SECONDS, vVar.f45804e);
            vVar.f45805f = optJSONObject.optBoolean("relative_text_size_calculation", vVar.f45805f);
            vVar.f45806g = optJSONObject.optBoolean("error_reporting", vVar.f45806g);
            vVar.f45807h = optJSONObject.optBoolean("parsing_allowed_by_default", vVar.f45807h);
            vVar.f45808i = this.f47133b.m17838a(optJSONObject.optJSONArray("filters"));
        }
        c4371vj.m21008a(c3417Ka.mo17817a(vVar));
    }

    @VisibleForTesting
    public C4475zj(@NonNull C3417Ka c3417Ka, @NonNull C3176Aj c3176Aj) {
        this.f47132a = c3417Ka;
        this.f47133b = c3176Aj;
    }
}
