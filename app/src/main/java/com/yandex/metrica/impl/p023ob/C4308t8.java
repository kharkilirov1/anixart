package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3156A;
import com.yandex.metrica.impl.p023ob.C3515O8;
import com.yandex.metrica.impl.p023ob.C3699Vi;
import com.yandex.metrica.impl.p023ob.C3779Yn;
import com.yandex.metrica.impl.p023ob.C4282s8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.t8 */
/* loaded from: classes2.dex */
public class C4308t8 {

    /* renamed from: o */
    private static final HashSet<Integer> f46492o;

    /* renamed from: a */
    private final ReentrantReadWriteLock f46493a;

    /* renamed from: b */
    private final Lock f46494b;

    /* renamed from: c */
    private final Lock f46495c;

    /* renamed from: d */
    private final C4386w8 f46496d;

    /* renamed from: e */
    private final a f46497e;

    /* renamed from: f */
    private final Object f46498f;

    /* renamed from: g */
    private final List<ContentValues> f46499g;

    /* renamed from: h */
    private final Context f46500h;

    /* renamed from: i */
    private final C3940f4 f46501i;

    /* renamed from: j */
    private final AtomicLong f46502j;

    /* renamed from: k */
    @NonNull
    private final List<InterfaceC3667Ub> f46503k;

    /* renamed from: l */
    @NonNull
    private final C4282s8 f46504l;

    /* renamed from: m */
    private volatile C3830ao<C3699Vi.b, Object> f46505m;

    /* renamed from: n */
    private final C3856bo<C3699Vi.b, Object> f46506n;

    /* renamed from: com.yandex.metrica.impl.ob.t8$a */
    public class a extends C4375vn {

        /* renamed from: b */
        @NonNull
        private final C3940f4 f46507b;

        public a(@NonNull C3940f4 c3940f4) {
            this.f46507b = c3940f4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            while (mo20676c()) {
                try {
                } catch (Throwable unused) {
                    m21067d();
                }
                synchronized (this) {
                    if (C4308t8.m20789a(C4308t8.this)) {
                        wait();
                    }
                    synchronized (C4308t8.this.f46498f) {
                        arrayList = new ArrayList(C4308t8.this.f46499g);
                        C4308t8.this.f46499g.clear();
                    }
                    C4308t8.this.m20804a(arrayList);
                    synchronized (this) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Integer.valueOf(C4308t8.this.m20782a((ContentValues) it.next())));
                        }
                        Iterator it2 = C4308t8.this.f46503k.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC3667Ub) it2.next()).mo19081a(arrayList2);
                        }
                        this.f46507b.m19881l().m19273c();
                    }
                }
            }
        }
    }

    static {
        HashSet<Integer> hashSet = new HashSet<>();
        f46492o = hashSet;
        hashSet.add(Integer.valueOf(EnumC4067k1.EVENT_TYPE_INIT.m20218b()));
        hashSet.add(Integer.valueOf(EnumC4067k1.EVENT_TYPE_START.m20218b()));
    }

    public C4308t8(@NonNull C3940f4 c3940f4, C4386w8 c4386w8, @NonNull C4282s8 c4282s8) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f46493a = reentrantReadWriteLock;
        this.f46494b = reentrantReadWriteLock.readLock();
        this.f46495c = reentrantReadWriteLock.writeLock();
        this.f46498f = new Object();
        this.f46499g = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f46502j = atomicLong;
        this.f46503k = new ArrayList();
        this.f46506n = new C3856bo<>();
        this.f46496d = c4386w8;
        this.f46500h = c3940f4.m19876g();
        this.f46501i = c3940f4;
        this.f46504l = c4282s8;
        atomicLong.set(m20793d());
        a aVar = new a(c3940f4);
        this.f46497e = aVar;
        aVar.setName(m20785a(c3940f4));
        m20788a(c3940f4.m19890v());
    }

    /* renamed from: e */
    public void m20809e() {
        this.f46497e.start();
    }

    /* renamed from: a */
    private void m20788a(@NonNull C3575Qi c3575Qi) {
        C3699Vi.a aVar = null;
        C3699Vi.a aVar2 = (!c3575Qi.m18848f().f46416p || c3575Qi.m18836Q() == null) ? null : c3575Qi.m18836Q().f44315b;
        if (c3575Qi.m18848f().f46416p && c3575Qi.m18836Q() != null) {
            aVar = c3575Qi.m18836Q().f44314a;
        }
        EnumMap enumMap = new EnumMap(C3699Vi.b.class);
        enumMap.put((EnumMap) C3699Vi.b.WIFI, (C3699Vi.b) (aVar2 == null ? new C3882co() : new C4038io(new C4012ho(new C4116lo(), new C4142mo()), new C3504Nm(), aVar2.f44316a, aVar2.f44317b)));
        enumMap.put((EnumMap) C3699Vi.b.CELL, (C3699Vi.b) (aVar == null ? new C3882co() : new C4038io(new C4012ho(new C3779Yn.a(), new C3804Zn()), new C3504Nm(), aVar.f44316a, aVar.f44317b)));
        this.f46505m = new C3830ao<>(enumMap);
    }

    /* renamed from: d */
    private long m20793d() {
        long j2;
        SQLiteDatabase readableDatabase;
        this.f46494b.lock();
        try {
            readableDatabase = this.f46496d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j2 = C4013i.m20028a(readableDatabase, "reports");
            this.f46494b.unlock();
            return j2;
        }
        j2 = 0;
        this.f46494b.unlock();
        return j2;
    }

    @Nullable
    /* renamed from: b */
    public Cursor m20805b(long j2, @NonNull EnumC4462z6 enumC4462z6) throws SQLiteException {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        this.f46494b.lock();
        try {
            readableDatabase = this.f46496d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("reports", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j2), Integer.toString(enumC4462z6.m21291a())}, null, null, "number ASC", null);
            this.f46494b.unlock();
            return cursor;
        }
        cursor = null;
        this.f46494b.unlock();
        return cursor;
    }

    /* renamed from: c */
    public long m20808c() {
        this.f46494b.lock();
        try {
            return this.f46502j.get();
        } finally {
            this.f46494b.unlock();
        }
    }

    @NonNull
    /* renamed from: b */
    public List<ContentValues> m20806b() {
        ArrayList arrayList = new ArrayList();
        this.f46494b.lock();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase readableDatabase = this.f46496d.getReadableDatabase();
                if (readableDatabase != null) {
                    cursor = readableDatabase.rawQuery(C3515O8.e.f43553c, null);
                    while (cursor.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                        arrayList.add(contentValues);
                    }
                }
            } finally {
                C3658U2.m19207a(cursor);
                this.f46494b.unlock();
            }
        } catch (Throwable unused) {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: a */
    public long m20796a(@NonNull Set<Integer> set) {
        this.f46494b.lock();
        Cursor cursor = null;
        long j2 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f46496d.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM reports");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                int i2 = 0;
                for (Integer num : set) {
                    if (i2 > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    i2++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), null);
                if (cursor.moveToFirst()) {
                    j2 = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        C3658U2.m19207a(cursor);
        this.f46494b.unlock();
        return j2;
    }

    /* renamed from: b */
    public void m20807b(@NonNull C3575Qi c3575Qi) {
        m20788a(c3575Qi);
    }

    /* renamed from: a */
    public void m20802a(@NonNull InterfaceC3667Ub interfaceC3667Ub) {
        this.f46503k.add(interfaceC3667Ub);
    }

    /* renamed from: a */
    private static String m20785a(InterfaceC4044j4 interfaceC4044j4) {
        StringBuilder m24u = C0000a.m24u("DatabaseWorker [");
        m24u.append(((C3940f4) interfaceC4044j4).m19874e().mo19670c());
        m24u.append("]");
        return m24u.toString();
    }

    /* renamed from: a */
    public void m20801a(long j2, EnumC4462z6 enumC4462z6, long j3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(j2));
        contentValues.put("start_time", Long.valueOf(j3));
        contentValues.put("server_time_offset", Long.valueOf(C3454Lm.m18520c().mo18321a()));
        contentValues.put("obtained_before_first_sync", Boolean.valueOf(C3454Lm.m18520c().m18524e()));
        contentValues.put("type", Integer.valueOf(enumC4462z6.m21291a()));
        new C4222q0(this.f46500h).m20564a(this.f46501i.m19882m()).m20563a(contentValues).m20565a();
        this.f46495c.lock();
        try {
            SQLiteDatabase writableDatabase = this.f46496d.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValues);
            }
        } catch (Throwable unused) {
        }
        this.f46495c.unlock();
    }

    /* renamed from: a */
    public void m20803a(@NonNull C4063jn c4063jn, int i2, @NonNull C4384w6 c4384w6, @NonNull C3156A.a aVar, @NonNull C4018i4 c4018i4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("number", Long.valueOf(c4384w6.m21085a()));
        contentValues.put("global_number", Integer.valueOf(C3382J0.m18374d(i2) ? c4018i4.m20048a() : 0));
        contentValues.put("number_of_type", Integer.valueOf(c4018i4.m20049a(i2)));
        contentValues.put("time", Long.valueOf(c4384w6.m21088b()));
        contentValues.put("session_id", Long.valueOf(c4384w6.m21090c()));
        contentValues.put("session_type", Integer.valueOf(c4384w6.m21092d().m21291a()));
        new C4222q0(this.f46500h).m20564a(this.f46501i.m19882m()).m20563a(contentValues).m20566a(c4063jn, aVar, f46492o.contains(Integer.valueOf(i2)) ? this.f46506n : this.f46505m);
        synchronized (this.f46498f) {
            this.f46499g.add(contentValues);
        }
        synchronized (this.f46497e) {
            this.f46497e.notifyAll();
        }
    }

    /* renamed from: a */
    public int m20795a(long j2) {
        this.f46495c.lock();
        int i2 = 0;
        try {
            int i3 = C3515O8.f43538a;
            SQLiteDatabase writableDatabase = this.f46496d.getWritableDatabase();
            if (writableDatabase != null) {
                i2 = writableDatabase.delete("sessions", C3515O8.e.f43554d, new String[]{String.valueOf(j2)});
            }
        } catch (Throwable unused) {
        }
        this.f46495c.unlock();
        return i2;
    }

    /* renamed from: a */
    public void m20799a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f46495c.lock();
            if (this.f46502j.get() > this.f46501i.m19882m().m20105K() && (writableDatabase = this.f46496d.getWritableDatabase()) != null) {
                this.f46502j.addAndGet(-m20783a(writableDatabase));
            }
        } catch (Throwable unused) {
        }
        this.f46495c.unlock();
    }

    /* renamed from: a */
    private int m20783a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f46504l.m20687a(sQLiteDatabase, "reports", String.format("%1$s IN (SELECT %1$s FROM %2$s ORDER BY CASE WHEN %3$s IN (%4$s) THEN 2 WHEN %3$s IN (%5$s) THEN 1 ELSE 0 END, %6$s LIMIT (SELECT count() FROM %2$s) / %7$s)", "id", "reports", "type", TextUtils.join(", ", C3382J0.f43175i), TextUtils.join(", ", C3382J0.f43176j), "id", 10), C4282s8.b.DB_OVERFLOW, this.f46501i.m19874e().m19668a(), true).f46351b;
        } catch (Throwable th) {
            ((C3499Nh) C3524Oh.m18679a()).reportError("deleteExcessiveReports exception", th);
            return 0;
        }
    }

    /* renamed from: a */
    public void m20800a(long j2, int i2, int i3, boolean z) throws SQLiteException {
        List<ContentValues> list;
        if (i3 <= 0) {
            return;
        }
        this.f46495c.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j2), "session_type", Integer.toString(i2), "id", "reports", Integer.toString(i3 - 1));
            SQLiteDatabase writableDatabase = this.f46496d.getWritableDatabase();
            if (writableDatabase != null) {
                C4282s8.a m20687a = this.f46504l.m20687a(writableDatabase, "reports", format, C4282s8.b.BAD_REQUEST, this.f46501i.m19874e().m19668a(), z);
                if (m20687a.f46350a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ContentValues> it = m20687a.f46350a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(m20782a(it.next())));
                    }
                    Iterator<InterfaceC3667Ub> it2 = this.f46503k.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo19083b(arrayList);
                    }
                }
                if (this.f46501i.m19886q().m21337c() && (list = m20687a.f46350a) != null) {
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        m20787a(list.get(i4), "Event removed from db");
                    }
                }
                this.f46502j.addAndGet(-m20687a.f46351b);
            }
        } catch (Throwable unused) {
        }
        this.f46495c.unlock();
    }

    @Nullable
    /* renamed from: a */
    public Cursor m20798a(Map<String, String> map) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        this.f46494b.lock();
        try {
            readableDatabase = this.f46496d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, m20786a("id >= ?", map), m20790a(new String[]{Long.toString(0L)}, map), null, null, "id ASC", null);
            this.f46494b.unlock();
            return cursor;
        }
        cursor = null;
        this.f46494b.unlock();
        return cursor;
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m20804a(List<ContentValues> list) {
        SQLiteDatabase sQLiteDatabase;
        if (list.isEmpty()) {
            return;
        }
        this.f46495c.lock();
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f46496d.getWritableDatabase();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (ContentValues contentValues : list) {
                        sQLiteDatabase.insertOrThrow("reports", null, contentValues);
                        this.f46502j.incrementAndGet();
                        m20787a(contentValues, "Event saved to db");
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    this.f46502j.get();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    C3658U2.m19208a(sQLiteDatabase);
                    this.f46495c.unlock();
                }
            }
        } catch (Throwable unused2) {
        }
        C3658U2.m19208a(sQLiteDatabase);
        this.f46495c.unlock();
    }

    /* renamed from: a */
    public ContentValues m20797a(long j2, EnumC4462z6 enumC4462z6) {
        ContentValues contentValues = new ContentValues();
        this.f46494b.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f46496d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", Long.valueOf(j2), Integer.valueOf(enumC4462z6.m21291a())), null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
            C3658U2.m19207a(cursor);
            this.f46494b.unlock();
        } catch (Throwable unused) {
            C3658U2.m19207a(cursor);
            this.f46494b.unlock();
        }
        return contentValues;
    }

    /* renamed from: a */
    private static String m20786a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        for (String str2 : map.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(str2 + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String[] m20790a(String[] strArr, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    private void m20787a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (C3382J0.m18373c(asInteger != null ? asInteger.intValue() : -1)) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(": ");
            String asString = contentValues.getAsString("name");
            int i2 = C3509O2.f43529a;
            if (asString == null) {
                asString = "";
            }
            sb.append(asString);
            String asString2 = contentValues.getAsString("value");
            String str2 = asString2 != null ? asString2 : "";
            if (C3382J0.m18375e(m20782a(contentValues)) && !TextUtils.isEmpty(str2)) {
                sb.append(" with value ");
                sb.append(str2);
            }
            this.f46501i.m19886q().m21333b(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m20782a(ContentValues contentValues) {
        return contentValues.getAsInteger("type").intValue();
    }

    /* renamed from: a */
    public static boolean m20789a(C4308t8 c4308t8) {
        boolean isEmpty;
        synchronized (c4308t8.f46498f) {
            isEmpty = c4308t8.f46499g.isEmpty();
        }
        return isEmpty;
    }
}
