package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.He */
/* loaded from: classes2.dex */
public class C3346He implements InterfaceC4354v2<C3446Le> {

    /* renamed from: a */
    private final Context f43055a;

    public C3346He(@NonNull Context context) {
        this.f43055a = context;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4354v2, kotlin.jvm.functions.Function0
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3446Le invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        try {
            cursor = this.f43055a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/preload_info"), null, null, null, null);
            try {
                if (cursor == null) {
                    C3184B2.m17877a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("tracking_id"));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("additional_parameters"));
                        JSONObject jSONObject2 = new JSONObject();
                        if (!TextUtils.isEmpty(string2)) {
                            jSONObject = new JSONObject(string2);
                            C3184B2.m17877a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                            C3446Le c3446Le = new C3446Le(string, jSONObject, !TextUtils.isEmpty(string), false, EnumC3257E0.SATELLITE);
                            C3658U2.m19207a(cursor);
                            return c3446Le;
                        }
                        jSONObject = jSONObject2;
                        C3184B2.m17877a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                        C3446Le c3446Le2 = new C3446Le(string, jSONObject, !TextUtils.isEmpty(string), false, EnumC3257E0.SATELLITE);
                        C3658U2.m19207a(cursor);
                        return c3446Le2;
                    }
                    C3184B2.m17877a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        C3658U2.m19207a(cursor);
        return null;
    }
}
