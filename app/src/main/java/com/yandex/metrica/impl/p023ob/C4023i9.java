package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p023ob.C3515O8;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.i9 */
/* loaded from: classes2.dex */
public class C4023i9 extends AbstractC3540P8 {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3540P8
    /* renamed from: a */
    public void mo17822a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions_BACKUP (id INTEGER,start_time INTEGER,connection_type INTEGER,network_type TEXT,country_code INTEGER,operator_id INTEGER,lac INTEGER,report_request_parameters TEXT );");
        StringBuilder sb = new StringBuilder();
        String str = "id";
        sb.append("id");
        sb.append(",");
        sb.append("start_time");
        C0000a.m2C(sb, ",", "connection_type", ",", "network_type");
        C0000a.m2C(sb, ",", "country_code", ",", "operator_id");
        sb.append(",");
        sb.append("lac");
        sb.append(",");
        sb.append("report_request_parameters");
        sQLiteDatabase.execSQL("INSERT INTO sessions_BACKUP SELECT " + ((CharSequence) sb) + " FROM sessions;");
        sQLiteDatabase.execSQL("DROP TABLE sessions;");
        sQLiteDatabase.execSQL(C3515O8.e.f43552b);
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT * FROM sessions_BACKUP", null);
            while (cursor.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                arrayList.add("start_time");
                arrayList.add("report_request_parameters");
                ContentValues contentValues2 = new ContentValues(contentValues);
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    String str2 = str;
                    if (!arrayList.contains(entry.getKey())) {
                        contentValues2.remove(entry.getKey());
                    }
                    str = str2;
                }
                String str3 = str;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    contentValues.remove((String) it.next());
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("conn_type", contentValues.getAsInteger("connection_type"));
                jSONObject.putOpt("net_type", contentValues.get("network_type"));
                jSONObject.putOpt("operator_id", contentValues.get("operator_id"));
                jSONObject.putOpt("lac", contentValues.get("lac"));
                jSONObject.putOpt("country_code", contentValues.get("country_code"));
                contentValues2.put("network_info", jSONObject.toString());
                sQLiteDatabase.insertOrThrow("sessions", null, contentValues2);
                str = str3;
            }
            C3658U2.m19207a(cursor);
            sQLiteDatabase.execSQL("DROP TABLE sessions_BACKUP;");
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN wifi_network_info TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN cell_info TEXT DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN location_info TEXT DEFAULT ''");
        } catch (Throwable th) {
            C3658U2.m19207a(cursor);
            throw th;
        }
    }
}
