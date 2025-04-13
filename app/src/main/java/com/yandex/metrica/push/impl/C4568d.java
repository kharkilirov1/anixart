package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.CoreUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.d */
/* loaded from: classes2.dex */
public class C4568d {

    /* renamed from: a */
    @NonNull
    private final C4566c f47365a;

    /* renamed from: com.yandex.metrica.push.impl.d$a */
    public static class a {

        /* renamed from: a */
        @NonNull
        public final String f47366a;

        /* renamed from: b */
        @NonNull
        public final Integer f47367b;

        /* renamed from: c */
        @Nullable
        public final String f47368c;

        /* renamed from: d */
        @Nullable
        public final Boolean f47369d;

        public a(@NonNull String str, @NonNull Integer num, @Nullable String str2, @Nullable Boolean bool) {
            this.f47366a = str;
            this.f47367b = num;
            this.f47368c = str2;
            this.f47369d = bool;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f47367b.equals(aVar.f47367b)) {
                return false;
            }
            String str = this.f47368c;
            return str != null ? str.equals(aVar.f47368c) : aVar.f47368c == null;
        }

        public int hashCode() {
            int hashCode = this.f47367b.hashCode() * 31;
            String str = this.f47368c;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    public C4568d(@NonNull C4566c c4566c) {
        this.f47365a = c4566c;
    }

    /* renamed from: a */
    public void m21531a(@NonNull C4596r c4596r) {
        if (!CoreUtils.isEmpty(c4596r.m21659d())) {
            String m21659d = c4596r.m21659d();
            List<String> m21534b = m21534b();
            LinkedList linkedList = (LinkedList) m21534b;
            linkedList.remove(m21659d);
            linkedList.add(m21659d);
            if (linkedList.size() > 50) {
                linkedList.remove(0);
            }
            JSONArray jSONArray = new JSONArray();
            try {
                Iterator<String> it = m21534b.iterator();
                while (it.hasNext()) {
                    jSONArray.put(new JSONObject().put("push_id", it.next()));
                }
            } catch (JSONException unused) {
            }
            C4566c c4566c = this.f47365a;
            c4566c.m21524a().edit().putString("refated_push_notification_ids", jSONArray.toString()).apply();
        }
        C4590o m21655a = c4596r.m21655a();
        if (m21655a == null || CoreUtils.isEmpty(m21655a.m21560a())) {
            return;
        }
        String m21560a = m21655a.m21560a();
        List<String> m21529a = m21529a();
        LinkedList linkedList2 = (LinkedList) m21529a;
        linkedList2.remove(m21560a);
        linkedList2.add(m21560a);
        if (linkedList2.size() > 50) {
            linkedList2.remove(0);
        }
        JSONArray jSONArray2 = new JSONArray();
        try {
            Iterator<String> it2 = m21529a.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(new JSONObject().put("content_id", it2.next()));
            }
        } catch (JSONException unused2) {
        }
        C4566c c4566c2 = this.f47365a;
        c4566c2.m21524a().edit().putString("refated_content_notification_ids", jSONArray2.toString()).apply();
    }

    /* renamed from: b */
    public void m21535b(@NonNull C4596r c4596r) {
        if (c4596r.m21658c() != null) {
            String m21684d = c4596r.m21658c().m21684d();
            long m21663h = c4596r.m21663h();
            List<Long> m21530a = m21530a(m21684d);
            LinkedList linkedList = (LinkedList) m21530a;
            linkedList.add(Long.valueOf(m21663h));
            if (linkedList.size() > 50) {
                linkedList.remove(0);
            }
            C4566c c4566c = this.f47365a;
            String jSONArray = new JSONArray((Collection) m21530a).toString();
            Objects.requireNonNull(c4566c);
            c4566c.m21525a("shown_times_millis_by_channel_id" + m21684d, jSONArray);
        }
    }

    @NonNull
    /* renamed from: c */
    public List<a> m21536c() {
        String string = this.f47365a.m21524a().getString("refated_push_notification_info_list", "");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                linkedList.add(new a(jSONObject.getString("push_id"), Integer.valueOf(jSONObject.getInt("notification_id")), jSONObject.has("notification_tag") ? jSONObject.getString("notification_tag") : null, jSONObject.has("active") ? Boolean.valueOf(jSONObject.getBoolean("active")) : null));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }

    @NonNull
    /* renamed from: b */
    public List<String> m21534b() {
        String string = this.f47365a.m21524a().getString("refated_push_notification_ids", "");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                linkedList.add(jSONArray.getJSONObject(i2).getString("push_id"));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }

    /* renamed from: a */
    public void m21532a(@NonNull String str, @NonNull Integer num, @Nullable String str2, boolean z) {
        List<a> m21536c = m21536c();
        a aVar = new a(str, num, str2, Boolean.valueOf(z));
        LinkedList linkedList = (LinkedList) m21536c;
        linkedList.remove(aVar);
        linkedList.add(aVar);
        if (linkedList.size() > 50) {
            linkedList.remove(0);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (a aVar2 : m21536c) {
                Objects.requireNonNull(aVar2);
                jSONArray.put(new JSONObject().put("push_id", aVar2.f47366a).put("notification_id", aVar2.f47367b).put("notification_tag", aVar2.f47368c).put("active", aVar2.f47369d));
            }
        } catch (JSONException unused) {
        }
        C4566c c4566c = this.f47365a;
        c4566c.m21524a().edit().putString("refated_push_notification_info_list", jSONArray.toString()).apply();
    }

    /* renamed from: a */
    public void m21533a(@NonNull String str, boolean z) {
        a aVar;
        Iterator<a> it = m21536c().iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            } else {
                aVar = it.next();
                if (aVar.f47366a.equals(str)) {
                    break;
                }
            }
        }
        if (aVar != null) {
            m21532a(str, aVar.f47367b, aVar.f47368c, z);
        }
    }

    @NonNull
    /* renamed from: a */
    public List<String> m21529a() {
        String string = this.f47365a.m21524a().getString("refated_content_notification_ids", "");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                linkedList.add(jSONArray.getJSONObject(i2).getString("content_id"));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }

    @NonNull
    /* renamed from: a */
    public List<Long> m21530a(@Nullable String str) {
        C4566c c4566c = this.f47365a;
        Objects.requireNonNull(c4566c);
        String string = c4566c.m21524a().getString("shown_times_millis_by_channel_id" + str, "");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                linkedList.add(Long.valueOf(jSONArray.getLong(i2)));
            }
        } catch (JSONException unused) {
        }
        return linkedList;
    }
}
