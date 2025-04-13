package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.vh1;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes3.dex */
public final class qa1 {

    /* renamed from: a */
    @NonNull
    private final tt0 f53995a = new tt0();

    /* renamed from: b */
    @NonNull
    private final fw0 f53996b;

    /* renamed from: c */
    @NonNull
    private final C6078yi f53997c;

    /* renamed from: d */
    @NonNull
    private final l01 f53998d;

    public qa1() {
        fw0 fw0Var = new fw0();
        this.f53996b = fw0Var;
        this.f53997c = new C6078yi(fw0Var);
        this.f53998d = new l01();
    }

    @NonNull
    /* renamed from: a */
    public final ea1 m27665a(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull pa1 pa1Var, @NonNull Object obj, @NonNull ia1 ia1Var) {
        C5726s4 c5726s4 = new C5726s4(pa1Var.m27198a());
        ta1 ta1Var = new ta1(c5726s4);
        Uri.Builder appendQueryParameter = Uri.parse(c5726s4.m28065a().m22728a()).buildUpon().appendQueryParameter("charset", "UTF-8");
        Objects.requireNonNull(this.f53995a);
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("rnd", Integer.toString(new Random().nextInt(89999999) + 10000000));
        C5507nr m24788j = c5101g2.m24788j();
        fw0 fw0Var = this.f53996b;
        Map<String, String> m27199b = pa1Var.m27199b();
        Objects.requireNonNull(fw0Var);
        if (m27199b != null) {
            for (Map.Entry<String, String> entry : m27199b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    fw0.m24750a(appendQueryParameter2, key, value);
                }
            }
        }
        fw0 fw0Var2 = this.f53996b;
        String m28069e = c5726s4.m28069e();
        Objects.requireNonNull(fw0Var2);
        fw0.m24750a(appendQueryParameter2, "video-session-id", m28069e);
        Objects.requireNonNull(this.f53998d);
        if (!l01.m26309a(context)) {
            fw0 fw0Var3 = this.f53996b;
            String m26950f = m24788j.m26950f();
            Objects.requireNonNull(fw0Var3);
            fw0.m24750a(appendQueryParameter2, "uuid", m26950f);
            fw0 fw0Var4 = this.f53996b;
            String m26947d = m24788j.m26947d();
            Objects.requireNonNull(fw0Var4);
            fw0.m24750a(appendQueryParameter2, "mauid", m26947d);
        }
        this.f53997c.m29944a(context, appendQueryParameter2);
        new C5602pr(context, c5101g2).m27368a(context, appendQueryParameter2);
        ea1 ea1Var = new ea1(context, appendQueryParameter2.build().toString(), new vh1.C5921b(ia1Var), pa1Var, ta1Var);
        ea1Var.m30318b(obj);
        return ea1Var;
    }
}
