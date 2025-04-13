package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3535P3;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.u2 */
/* loaded from: classes2.dex */
public class C4328u2 implements InterfaceC4354v2<C3535P3.a> {

    /* renamed from: a */
    private final Context f46575a;

    public C4328u2(@NonNull Context context) {
        this.f46575a = context;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4354v2, kotlin.jvm.functions.Function0
    @Nullable
    public Object invoke() {
        Cursor cursor;
        C3535P3.a aVar = null;
        try {
            cursor = this.f46575a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/clids"), null, null, null, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            if (cursor != null) {
                HashMap hashMap = new HashMap();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("clid_key"));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("clid_value"));
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            C3184B2.m17877a("Invalid clid {%s : %s}", string, string2);
                        } else {
                            hashMap.put(string, string2);
                        }
                    } catch (Throwable unused) {
                    }
                }
                C3184B2.m17877a("Clids from satellite: %s", hashMap);
                C3535P3.a aVar2 = new C3535P3.a(hashMap, EnumC3257E0.SATELLITE);
                C3658U2.m19207a(cursor);
                aVar = aVar2;
            } else {
                C3184B2.m17877a("No Satellite content provider found", new Object[0]);
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                C3184B2.m17878a(th, "Error while getting satellite clids", new Object[0]);
                return aVar;
            } finally {
                C3658U2.m19207a(cursor);
            }
        }
        return aVar;
    }
}
