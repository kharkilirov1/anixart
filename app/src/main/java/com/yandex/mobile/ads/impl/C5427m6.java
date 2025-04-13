package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebViewDatabase;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.m6 */
/* loaded from: classes3.dex */
public final class C5427m6 {

    /* renamed from: a */
    public static final long f52582a = (long) (Math.floor(Math.random() * 4.294967295E9d) + 1.0d);

    /* renamed from: b */
    public static final /* synthetic */ int f52583b = 0;

    /* renamed from: a */
    public static boolean m26579a(InterfaceC5538oh interfaceC5538oh) {
        return interfaceC5538oh == null || interfaceC5538oh.mo27086a();
    }

    /* renamed from: a */
    public static ResultReceiver m26575a(ResultReceiver resultReceiver) {
        if (resultReceiver == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }

    /* renamed from: a */
    public static Bitmap m26574a(String str) {
        try {
            String substring = str.substring(str.indexOf(",") + 1);
            if (TextUtils.isEmpty(substring)) {
                return null;
            }
            byte[] decode = Base64.decode(substring, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m26578a(Context context) {
        try {
            return WebViewDatabase.getInstance(context) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    @NonNull
    /* renamed from: a */
    public static <T> String m26576a(T t) {
        return t.toString();
    }

    /* renamed from: a */
    public static ArrayList m26577a(@NonNull AdResponse adResponse, Map map) {
        List<String> m21822l = adResponse.m21822l();
        List<Long> m21816f = adResponse.m21816f();
        List<Integer> m21827q = adResponse.m21827q();
        ArrayList arrayList = new ArrayList();
        if (m21822l != null) {
            int i2 = 0;
            while (i2 < m21822l.size()) {
                String str = m21822l.get(i2);
                if (map != null) {
                    Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                    for (Map.Entry entry : map.entrySet()) {
                        StringBuilder m26356a = l60.m26356a("?");
                        m26356a.append((String) entry.getKey());
                        m26356a.append("=");
                        m26356a.append((String) entry.getValue());
                        Uri parse = Uri.parse(m26356a.toString());
                        for (String str2 : parse.getQueryParameterNames()) {
                            buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
                        }
                    }
                    str = buildUpon.build().toString();
                }
                long longValue = m21816f.size() > i2 ? m21816f.get(i2).longValue() : 0L;
                int intValue = m21827q.size() > i2 ? m21827q.get(i2).intValue() : 0;
                v01 v01Var = new v01();
                v01Var.m29161a(str);
                v01Var.m29160a(longValue);
                v01Var.m29159a(intValue);
                arrayList.add(v01Var);
                i2++;
            }
        }
        return arrayList;
    }
}
