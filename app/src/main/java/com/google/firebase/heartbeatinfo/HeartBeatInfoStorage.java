package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
class HeartBeatInfoStorage {

    /* renamed from: a */
    public final SharedPreferences f23046a;

    public HeartBeatInfoStorage(Context context, String str) {
        this.f23046a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    public final synchronized void m12511a() {
        long j2 = this.f23046a.getLong("fire-count", 0L);
        String str = null;
        String str2 = "";
        for (Map.Entry<String, ?> entry : this.f23046a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = entry.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f23046a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f23046a.edit().putStringSet(str2, hashSet).putLong("fire-count", j2 - 1).commit();
    }

    /* renamed from: b */
    public synchronized void m12512b() {
        SharedPreferences.Editor edit = this.f23046a.edit();
        for (Map.Entry<String, ?> entry : this.f23046a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* renamed from: c */
    public synchronized List<HeartBeatResult> m12513c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f23046a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(new AutoValue_HeartBeatResult(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            this.f23046a.edit().putLong("fire-global", currentTimeMillis).commit();
        }
        return arrayList;
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String m12514d(long j2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j2).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_PLAIN, Locale.UK).format(new Date(j2));
    }

    /* renamed from: e */
    public final synchronized String m12515e(String str) {
        for (Map.Entry<String, ?> entry : this.f23046a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final synchronized void m12516f(String str) {
        String m12515e = m12515e(str);
        if (m12515e == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f23046a.getStringSet(m12515e, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f23046a.edit().remove(m12515e).commit();
        } else {
            this.f23046a.edit().putStringSet(m12515e, hashSet).commit();
        }
    }

    /* renamed from: g */
    public synchronized boolean m12517g(String str, long j2) {
        if (!this.f23046a.contains(str)) {
            this.f23046a.edit().putLong(str, j2).commit();
            return true;
        }
        long j3 = this.f23046a.getLong(str, -1L);
        synchronized (this) {
            if (m12514d(j3).equals(m12514d(j2))) {
                return false;
            }
            this.f23046a.edit().putLong(str, j2).commit();
            return true;
        }
    }

    /* renamed from: h */
    public synchronized void m12518h(long j2, String str) {
        String m12514d = m12514d(j2);
        if (this.f23046a.getString("last-used-date", "").equals(m12514d)) {
            return;
        }
        long j3 = this.f23046a.getLong("fire-count", 0L);
        if (j3 + 1 == 30) {
            m12511a();
            j3 = this.f23046a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f23046a.getStringSet(str, new HashSet()));
        hashSet.add(m12514d);
        this.f23046a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", m12514d).commit();
    }
}
