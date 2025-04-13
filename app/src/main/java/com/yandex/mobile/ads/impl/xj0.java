package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xj0 {

    /* renamed from: a */
    @NonNull
    private final C5012eb f56489a;

    /* renamed from: c */
    @NonNull
    private final e91 f56491c = new e91();

    /* renamed from: b */
    @NonNull
    private final b80 f56490b = new b80();

    /* renamed from: d */
    @NonNull
    private final j20 f56492d = new j20();

    /* renamed from: e */
    @NonNull
    private final C5876up f56493e = new C5876up();

    /* renamed from: f */
    @NonNull
    private final f20 f56494f = new f20();

    public xj0(@NonNull Context context) {
        this.f56489a = new C5012eb(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01d2 A[LOOP:1: B:11:0x0050->B:93:0x01d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01de A[SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.qi0 m29760a(@androidx.annotation.NonNull java.lang.String r22) throws org.json.JSONException, com.yandex.mobile.ads.impl.ni0 {
        /*
            Method dump skipped, instructions count: 863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xj0.m29760a(java.lang.String):com.yandex.mobile.ads.impl.qi0");
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final v01 m29761a(JSONObject jSONObject) throws ni0, JSONException {
        if (yj0.m29948a(jSONObject, "delay", "url")) {
            v01 v01Var = new v01();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ("delay".equals(next)) {
                    v01Var.m29160a(jSONObject.getLong(next));
                } else if ("url".equals(next)) {
                    Objects.requireNonNull(this.f56491c);
                    v01Var.m29161a(e91.m24049a(next, jSONObject));
                } else if ("visibilityPercent".equals(next)) {
                    v01Var.m29159a(Math.max(Math.min(jSONObject.optInt(next, 0), 100), 0));
                }
            }
            return v01Var;
        }
        throw new ni0("Native Ad json has not required attributes");
    }

    @NonNull
    /* renamed from: a */
    public static String m29759a(@NonNull String str, @NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string) || "null".equals(string)) {
            throw new ni0("Native Ad json has not required attributes");
        }
        return string;
    }
}
