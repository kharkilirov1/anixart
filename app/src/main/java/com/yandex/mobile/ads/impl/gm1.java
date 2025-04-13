package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gm1 {

    /* renamed from: a */
    private static WindowManager f50674a;

    /* renamed from: b */
    private static String[] f50675b = {"x", "y", "width", "height"};

    /* renamed from: c */
    public static float f50676c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: d */
    public static final /* synthetic */ int f50677d = 0;

    /* renamed from: a */
    public static float m24942a(int i2) {
        return i2 / f50676c;
    }

    /* renamed from: a */
    public static JSONObject m24943a(int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m24942a(i2));
            jSONObject.put("y", m24942a(i3));
            jSONObject.put("width", m24942a(i4));
            jSONObject.put("height", m24942a(i5));
        } catch (JSONException e2) {
            nm1.m26926a("Error with creating viewStateObject", e2);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m24944a(Context context) {
        if (context != null) {
            f50676c = context.getResources().getDisplayMetrics().density;
            f50674a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m24945a(JSONObject jSONObject) {
        float f2;
        float f3 = 0.0f;
        if (f50674a != null) {
            Point point = new Point(0, 0);
            f50674a.getDefaultDisplay().getRealSize(point);
            float m24942a = m24942a(point.x);
            f3 = m24942a(point.y);
            f2 = m24942a;
        } else {
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f2);
            jSONObject.put("height", f3);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m24946a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e2) {
            nm1.m26926a("JSONException during JSONObject.put for name [" + str + "]", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m24947a(@androidx.annotation.NonNull org.json.JSONObject r10, @androidx.annotation.Nullable org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gm1.m24947a(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
