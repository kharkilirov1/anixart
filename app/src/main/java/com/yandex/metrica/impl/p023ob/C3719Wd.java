package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Wd */
/* loaded from: classes2.dex */
public class C3719Wd extends AbstractC3694Vd {
    public C3719Wd(String str) {
        super(m19357a(str));
    }

    /* renamed from: a */
    private static String m19357a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return "http".equals(parse.getScheme()) ? parse.buildUpon().scheme("https").build().toString() : str;
    }
}
