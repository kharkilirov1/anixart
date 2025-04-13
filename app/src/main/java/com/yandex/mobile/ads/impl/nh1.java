package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.vh1;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class nh1 {

    /* renamed from: a */
    @NonNull
    private final C5781t4 f53012a = new C5781t4();

    /* renamed from: b */
    @NonNull
    private final ph1 f53013b = new ph1();

    /* renamed from: c */
    @NonNull
    private final fw0 f53014c;

    /* renamed from: d */
    @NonNull
    private final C6078yi f53015d;

    /* renamed from: e */
    @NonNull
    private final C5299jr f53016e;

    /* renamed from: f */
    @NonNull
    private final l01 f53017f;

    public nh1() {
        fw0 fw0Var = new fw0();
        this.f53014c = fw0Var;
        this.f53015d = new C6078yi(fw0Var);
        this.f53016e = new C5299jr();
        this.f53017f = new l01();
    }

    @NonNull
    /* renamed from: a */
    public final kh1 m26914a(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull lh1 lh1Var, @NonNull Object obj, @NonNull oh1 oh1Var) {
        String m26465a = lh1Var.m26465a();
        String m26467c = lh1Var.m26467c();
        String m26466b = lh1Var.m26466b();
        C5781t4 c5781t4 = this.f53012a;
        Map<String, String> m26468d = lh1Var.m26468d();
        Objects.requireNonNull(c5781t4);
        HashMap m28459a = C5781t4.m28459a(m26468d);
        C5507nr m24788j = c5101g2.m24788j();
        String m26950f = m24788j.m26950f();
        String m26947d = m24788j.m26947d();
        String m26941a = m24788j.m26941a();
        if (TextUtils.isEmpty(m26941a)) {
            m26941a = "https://mobile.yandexadexchange.net";
        }
        Uri.Builder appendQueryParameter = Uri.parse(m26941a).buildUpon().appendPath(m26465a).appendPath("vmap").appendPath(m26467c).appendQueryParameter("video-category-id", m26466b);
        Objects.requireNonNull(this.f53017f);
        if (!l01.m26309a(context)) {
            Objects.requireNonNull(this.f53014c);
            fw0.m24750a(appendQueryParameter, "uuid", m26950f);
            Objects.requireNonNull(this.f53014c);
            fw0.m24750a(appendQueryParameter, "mauid", m26947d);
        }
        this.f53015d.m29944a(context, appendQueryParameter);
        if (m28459a != null) {
            for (Map.Entry entry : m28459a.entrySet()) {
                appendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        new C5602pr(context, c5101g2).m27368a(context, appendQueryParameter);
        kh1 kh1Var = new kh1(context, this.f53016e.m25933a(context, appendQueryParameter.build().toString()), new vh1.C5921b(oh1Var), lh1Var, this.f53013b);
        kh1Var.m30318b(obj);
        return kh1Var;
    }
}
