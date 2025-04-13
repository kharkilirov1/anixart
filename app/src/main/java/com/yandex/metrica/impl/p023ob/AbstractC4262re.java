package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.re */
/* loaded from: classes2.dex */
public abstract class AbstractC4262re {

    /* renamed from: e */
    private static final C4444ye f46305e = new C4444ye("UNDEFINED_", null);

    /* renamed from: a */
    public final String f46306a;

    /* renamed from: b */
    public final SharedPreferences f46307b;

    /* renamed from: c */
    private final Map<String, Object> f46308c = new HashMap();

    /* renamed from: d */
    private boolean f46309d = false;

    public AbstractC4262re(Context context, String str) {
        this.f46306a = str;
        this.f46307b = m20655a(context);
        new C4444ye(f46305e.m21203b(), str);
    }

    /* renamed from: a */
    private SharedPreferences m20655a(Context context) {
        return C4013i.m20029a(context, mo20581d());
    }

    /* renamed from: b */
    public void m20659b() {
        synchronized (this) {
            m20656a();
            this.f46308c.clear();
            this.f46309d = false;
        }
    }

    /* renamed from: c */
    public String m20660c() {
        return this.f46306a;
    }

    /* renamed from: d */
    public abstract String mo20581d();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T extends AbstractC4262re> T m20661e() {
        synchronized (this) {
            this.f46309d = true;
            this.f46308c.clear();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T extends AbstractC4262re> T m20658a(String str, Object obj) {
        synchronized (this) {
            if (obj != null) {
                this.f46308c.put(str, obj);
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T extends AbstractC4262re> T m20657a(String str) {
        synchronized (this) {
            this.f46308c.put(str, this);
        }
        return this;
    }

    /* renamed from: a */
    private void m20656a() {
        SharedPreferences.Editor edit = this.f46307b.edit();
        if (this.f46309d) {
            edit.clear();
            edit.apply();
            return;
        }
        for (Map.Entry<String, Object> entry : this.f46308c.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == this) {
                edit.remove(key);
            } else if (value instanceof String) {
                edit.putString(key, (String) value);
            } else if (value instanceof Long) {
                edit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Integer) {
                edit.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value != null) {
                throw new UnsupportedOperationException();
            }
        }
        edit.apply();
    }
}
