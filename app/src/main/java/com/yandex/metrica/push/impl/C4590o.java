package com.yandex.metrica.push.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.InternalLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.o */
/* loaded from: classes2.dex */
public class C4590o {

    /* renamed from: a */
    @Nullable
    private final Integer f47402a;

    /* renamed from: b */
    @Nullable
    private final Integer f47403b;

    /* renamed from: c */
    @Nullable
    private final String f47404c;

    /* renamed from: d */
    @Nullable
    private final Integer f47405d;

    /* renamed from: e */
    @Nullable
    private final a f47406e;

    /* renamed from: f */
    @Nullable
    private final Long f47407f;

    /* renamed from: g */
    @Nullable
    private final Integer f47408g;

    /* renamed from: h */
    @Nullable
    private final Boolean f47409h;

    /* renamed from: i */
    @Nullable
    private final Integer f47410i;

    /* renamed from: j */
    @Nullable
    private final Integer f47411j;

    /* renamed from: k */
    @Nullable
    private final Integer f47412k;

    /* renamed from: l */
    @Nullable
    private final Integer f47413l;

    /* renamed from: m */
    @Nullable
    private final String f47414m;

    /* renamed from: com.yandex.metrica.push.impl.o$a */
    public static class a {

        /* renamed from: a */
        @Nullable
        private final Integer f47415a;

        /* renamed from: b */
        @Nullable
        private final List<Location> f47416b;

        public a(@NonNull JSONObject jSONObject) {
            this.f47415a = C4605v0.m21737b(jSONObject, "r");
            List<Location> m21570a = m21570a(jSONObject);
            this.f47416b = m21570a == null ? null : Collections.unmodifiableList(m21570a);
        }

        @Nullable
        /* renamed from: a */
        public List<Location> m21571a() {
            return this.f47416b;
        }

        @Nullable
        /* renamed from: a */
        private List<Location> m21570a(@NonNull JSONObject jSONObject) {
            Location location;
            if (jSONObject.has("p")) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("p");
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONArray optJSONArray = jSONArray.optJSONArray(i2);
                        if (optJSONArray != null) {
                            try {
                                location = new Location("");
                                location.setLatitude(optJSONArray.getDouble(0));
                                location.setLongitude(optJSONArray.getDouble(1));
                            } catch (JSONException e2) {
                                InternalLogger.m21369e(e2, "Error parsing location point", new Object[0]);
                                TrackersHub.getInstance().reportError("Error parsing location point", e2);
                            }
                            arrayList.add(location);
                        }
                        location = null;
                        arrayList.add(location);
                    }
                    return arrayList;
                } catch (JSONException e3) {
                    InternalLogger.m21369e(e3, "Error parsing location points", new Object[0]);
                    TrackersHub.getInstance().reportError("Error parsing location points", e3);
                }
            }
            return null;
        }
    }

    public C4590o(@NonNull JSONObject jSONObject) {
        this.f47402a = C4605v0.m21737b(jSONObject, "d");
        this.f47403b = C4605v0.m21737b(jSONObject, "p");
        this.f47404c = C4605v0.m21739d(jSONObject, "u");
        this.f47405d = C4605v0.m21737b(jSONObject, "x");
        this.f47406e = m21559a(jSONObject);
        this.f47407f = C4605v0.m21738c(jSONObject, "r");
        this.f47408g = C4605v0.m21737b(jSONObject, "a");
        this.f47409h = C4605v0.m21734a(jSONObject, "m");
        this.f47410i = C4605v0.m21737b(jSONObject, "v");
        this.f47411j = C4605v0.m21737b(jSONObject, "W");
        this.f47412k = C4605v0.m21737b(jSONObject, "s");
        this.f47413l = C4605v0.m21737b(jSONObject, "t");
        this.f47414m = C4605v0.m21739d(jSONObject, "i");
    }

    @Nullable
    /* renamed from: a */
    public String m21560a() {
        return this.f47414m;
    }

    @Nullable
    /* renamed from: b */
    public a m21561b() {
        return this.f47406e;
    }

    @Nullable
    /* renamed from: c */
    public Integer m21562c() {
        return this.f47405d;
    }

    @Nullable
    /* renamed from: d */
    public Integer m21563d() {
        return this.f47413l;
    }

    @Nullable
    /* renamed from: e */
    public Integer m21564e() {
        return this.f47402a;
    }

    @Nullable
    /* renamed from: f */
    public Integer m21565f() {
        return this.f47411j;
    }

    @Nullable
    /* renamed from: g */
    public Integer m21566g() {
        return this.f47412k;
    }

    @Nullable
    /* renamed from: h */
    public Integer m21567h() {
        return this.f47410i;
    }

    @Nullable
    /* renamed from: i */
    public Integer m21568i() {
        return this.f47403b;
    }

    @Nullable
    /* renamed from: j */
    public String m21569j() {
        return this.f47404c;
    }

    @Nullable
    /* renamed from: a */
    private static a m21559a(@NonNull JSONObject jSONObject) {
        if (jSONObject.has("c")) {
            try {
                return new a(jSONObject.getJSONObject("c"));
            } catch (JSONException e2) {
                InternalLogger.m21369e(e2, "Error parsing coordinates", new Object[0]);
                TrackersHub.getInstance().reportError("Error parsing coordinates", e2);
            }
        }
        return null;
    }
}
