package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Ra */
/* loaded from: classes2.dex */
class C3591Ra implements InterfaceC4464z8, Closeable {

    /* renamed from: a */
    private final Map<String, Object> f43808a;

    /* renamed from: b */
    private final Map<String, Object> f43809b;

    /* renamed from: c */
    private final String f43810c;

    /* renamed from: d */
    private final a f43811d;

    /* renamed from: e */
    private volatile boolean f43812e;

    /* renamed from: f */
    private final InterfaceC3440L8 f43813f;

    /* renamed from: com.yandex.metrica.impl.ob.Ra$a */
    public class a extends C4375vn {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            HashMap hashMap;
            synchronized (C3591Ra.this.f43808a) {
                C3591Ra.m18946b(C3591Ra.this);
                C3591Ra.this.f43812e = true;
                C3591Ra.this.f43808a.notifyAll();
            }
            while (mo20676c()) {
                synchronized (this) {
                    if (C3591Ra.this.f43809b.size() == 0) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    hashMap = new HashMap(C3591Ra.this.f43809b);
                    C3591Ra.this.f43809b.clear();
                }
                if (hashMap.size() > 0) {
                    C3591Ra.m18944a(C3591Ra.this, hashMap);
                    hashMap.clear();
                }
            }
        }
    }

    public C3591Ra(C4386w8 c4386w8, String str) {
        this(str, new C3490N8(c4386w8));
    }

    /* renamed from: a */
    public static void m18944a(C3591Ra c3591Ra, Map map) {
        SQLiteDatabase sQLiteDatabase;
        Objects.requireNonNull(c3591Ra);
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c3591Ra) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i2] = contentValues;
            i2++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c3591Ra.f43813f.mo18481a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i3 = 0; i3 < size; i3++) {
                        ContentValues contentValues2 = contentValuesArr[i3];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(c3591Ra.f43810c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(c3591Ra.f43810c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    C3658U2.m19208a(sQLiteDatabase);
                    c3591Ra.f43813f.mo18482a(sQLiteDatabase);
                }
            }
        } catch (Throwable unused2) {
        }
        C3658U2.m19208a(sQLiteDatabase);
        c3591Ra.f43813f.mo18482a(sQLiteDatabase);
    }

    /* renamed from: b */
    public static void m18946b(C3591Ra c3591Ra) {
        SQLiteDatabase sQLiteDatabase;
        Object obj;
        Objects.requireNonNull(c3591Ra);
        Cursor cursor = null;
        try {
            sQLiteDatabase = c3591Ra.f43813f.mo18481a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(c3591Ra.f43810c, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("key"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                            int i2 = query.getInt(query.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        obj = Integer.valueOf(Integer.parseInt(string2));
                                    } else if (i2 != 3) {
                                        obj = string2;
                                        if (i2 != 4) {
                                            if (i2 == 5) {
                                                try {
                                                    obj = Float.valueOf(Float.parseFloat(string2));
                                                } catch (NumberFormatException unused) {
                                                }
                                            }
                                            obj = null;
                                        }
                                    } else {
                                        obj = Long.valueOf(Long.parseLong(string2));
                                    }
                                } else if ("true".equals(string2)) {
                                    obj = Boolean.TRUE;
                                } else {
                                    if ("false".equals(string2)) {
                                        obj = Boolean.FALSE;
                                    }
                                    obj = null;
                                }
                                if (obj != null) {
                                    c3591Ra.f43808a.put(string, obj);
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    cursor = query;
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
            sQLiteDatabase = null;
        }
        C3658U2.m19207a(cursor);
        c3591Ra.f43813f.mo18482a(sQLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @VisibleForTesting
    public void close() {
        if (this.f43811d.mo20676c()) {
            this.f43811d.m21067d();
        }
    }

    public C3591Ra(String str, InterfaceC3440L8 interfaceC3440L8) {
        this.f43808a = new HashMap();
        this.f43809b = new HashMap();
        this.f43813f = interfaceC3440L8;
        this.f43810c = str;
        a aVar = new a(String.format(Locale.US, "YMM-DW-%s", Integer.valueOf(ThreadFactoryC4401wn.m21120c())));
        this.f43811d = aVar;
        aVar.start();
    }

    /* renamed from: c */
    private Object m18947c(String str) {
        Object obj;
        synchronized (this.f43808a) {
            m18949c();
            obj = this.f43808a.get(str);
        }
        return obj;
    }

    /* renamed from: c */
    private void m18949c() {
        if (this.f43812e) {
            return;
        }
        try {
            this.f43808a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: b */
    public void mo18961b() {
        synchronized (this.f43811d) {
            this.f43811d.notifyAll();
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    @Nullable
    /* renamed from: b */
    public String mo18960b(String str, String str2) {
        Object m18947c = m18947c(str);
        return m18947c instanceof String ? (String) m18947c : str2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: b */
    public boolean mo18962b(String str, boolean z) {
        Object m18947c = m18947c(str);
        return m18947c instanceof Boolean ? ((Boolean) m18947c).booleanValue() : z;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: b */
    public InterfaceC4464z8 mo18957b(String str) {
        synchronized (this.f43808a) {
            m18949c();
            this.f43808a.remove(str);
        }
        synchronized (this.f43811d) {
            this.f43809b.put(str, this);
            this.f43811d.notifyAll();
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: b */
    public InterfaceC4464z8 mo18959b(String str, long j2) {
        m18955a(str, Long.valueOf(j2));
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: b */
    public synchronized InterfaceC4464z8 mo18958b(String str, int i2) {
        m18955a(str, Integer.valueOf(i2));
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: a */
    public int mo18950a(String str, int i2) {
        Object m18947c = m18947c(str);
        return m18947c instanceof Integer ? ((Integer) m18947c).intValue() : i2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: a */
    public long mo18951a(String str, long j2) {
        Object m18947c = m18947c(str);
        return m18947c instanceof Long ? ((Long) m18947c).longValue() : j2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: a */
    public synchronized InterfaceC4464z8 mo18952a(String str, String str2) {
        m18955a(str, (Object) str2);
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: a */
    public InterfaceC4464z8 mo18953a(String str, boolean z) {
        m18955a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    /* renamed from: a */
    public boolean mo18956a(@NonNull String str) {
        boolean containsKey;
        synchronized (this.f43808a) {
            m18949c();
            containsKey = this.f43808a.containsKey(str);
        }
        return containsKey;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4464z8
    @NonNull
    /* renamed from: a */
    public Set<String> mo18954a() {
        HashSet hashSet;
        synchronized (this.f43808a) {
            hashSet = new HashSet(this.f43808a.keySet());
        }
        return hashSet;
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m18955a(String str, Object obj) {
        synchronized (this.f43808a) {
            m18949c();
            this.f43808a.put(str, obj);
        }
        synchronized (this.f43811d) {
            this.f43809b.put(str, obj);
            this.f43811d.notifyAll();
        }
    }
}
