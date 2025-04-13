package androidx.room.util;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class CursorUtil {
    /* renamed from: a */
    public static int m4093a(@NonNull Cursor cursor, @NonNull String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + "`");
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    String m14k = C0000a.m14k(".", str);
                    String m16m = C0000a.m16m(".", str, "`");
                    for (int i2 = 0; i2 < columnNames.length; i2++) {
                        String str3 = columnNames[i2];
                        if (str3.length() >= str.length() + 2 && (str3.endsWith(m14k) || (str3.charAt(0) == '`' && str3.endsWith(m16m)))) {
                            columnIndex = i2;
                            break;
                        }
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            str2 = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
