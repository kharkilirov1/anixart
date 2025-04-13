package com.google.gson.internal.sql;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes2.dex */
public final class SqlTypesSupport {

    /* renamed from: a */
    public static final boolean f23881a;

    /* renamed from: b */
    public static final TypeAdapterFactory f23882b;

    /* renamed from: c */
    public static final TypeAdapterFactory f23883c;

    /* renamed from: d */
    public static final TypeAdapterFactory f23884d;

    /* renamed from: com.google.gson.internal.sql.SqlTypesSupport$1 */
    public class C23261 extends DefaultDateTypeAdapter.DateType<Date> {
    }

    /* renamed from: com.google.gson.internal.sql.SqlTypesSupport$2 */
    public class C23272 extends DefaultDateTypeAdapter.DateType<Timestamp> {
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f23881a = z;
        if (z) {
            f23882b = SqlDateTypeAdapter.f23875b;
            f23883c = SqlTimeTypeAdapter.f23877b;
            f23884d = SqlTimestampTypeAdapter.f23879b;
        } else {
            f23882b = null;
            f23883c = null;
            f23884d = null;
        }
    }
}
