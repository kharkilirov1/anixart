package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.H9 */
/* loaded from: classes2.dex */
public abstract class AbstractC3341H9 {

    /* renamed from: a */
    private final InterfaceC4464z8 f43044a;

    /* renamed from: b */
    private final String f43045b;

    public AbstractC3341H9(InterfaceC4464z8 interfaceC4464z8) {
        this(interfaceC4464z8, null);
    }

    /* renamed from: a */
    public long m18216a(String str, long j2) {
        return this.f43044a.mo18951a(str, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public <T extends AbstractC3341H9> T m18222b(String str, String str2) {
        synchronized (this) {
            this.f43044a.mo18952a(str, str2);
        }
        return this;
    }

    /* renamed from: c */
    public C4444ye m18226c(String str) {
        return new C4444ye(str, this.f43045b);
    }

    @Nullable
    /* renamed from: d */
    public String m18228d(@NonNull String str) {
        return this.f43044a.mo18960b(str, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T extends AbstractC3341H9> T m18230e(String str) {
        synchronized (this) {
            this.f43044a.mo18957b(str);
        }
        return this;
    }

    public AbstractC3341H9(InterfaceC4464z8 interfaceC4464z8, String str) {
        this.f43044a = interfaceC4464z8;
        this.f43045b = str;
    }

    /* renamed from: a */
    public int m18215a(@NonNull String str, int i2) {
        return this.f43044a.mo18950a(str, i2);
    }

    @NonNull
    /* renamed from: d */
    public Set<String> m18229d() {
        return this.f43044a.mo18954a();
    }

    @Nullable
    /* renamed from: a */
    public String m18217a(@NonNull String str, @Nullable String str2) {
        return this.f43044a.mo18960b(str, str2);
    }

    /* renamed from: a */
    public boolean m18219a(String str, boolean z) {
        return this.f43044a.mo18962b(str, z);
    }

    /* renamed from: c */
    public void m18227c() {
        synchronized (this) {
            this.f43044a.mo18961b();
        }
    }

    @Nullable
    /* renamed from: a */
    public List<String> m18218a(@NonNull String str, @Nullable List<String> list) {
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String mo18960b = this.f43044a.mo18960b(str, (String) null);
        if (!TextUtils.isEmpty(mo18960b)) {
            try {
                JSONArray jSONArray = new JSONArray(mo18960b);
                strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = jSONArray.optString(i2);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public <T extends AbstractC3341H9> T m18221b(String str, long j2) {
        synchronized (this) {
            this.f43044a.mo18959b(str, j2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: b */
    public <T extends AbstractC3341H9> T m18220b(String str, int i2) {
        synchronized (this) {
            this.f43044a.mo18958b(str, i2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public <T extends AbstractC3341H9> T m18224b(String str, boolean z) {
        synchronized (this) {
            this.f43044a.mo18953a(str, z);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public <T extends AbstractC3341H9> T m18223b(String str, List<String> list) {
        String str2;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f43044a.mo18952a(str, str2);
        return this;
    }

    /* renamed from: b */
    public boolean m18225b(@NonNull String str) {
        return this.f43044a.mo18956a(str);
    }
}
