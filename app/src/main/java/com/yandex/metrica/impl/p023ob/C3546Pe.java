package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.PreloadInfo;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Pe */
/* loaded from: classes2.dex */
public class C3546Pe {

    /* renamed from: a */
    @Nullable
    private C3446Le f43646a;

    public C3546Pe(@Nullable PreloadInfo preloadInfo, @NonNull C3379Im c3379Im, boolean z) {
        if (preloadInfo != null) {
            if (!TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                this.f43646a = new C3446Le(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z, EnumC3257E0.APP);
            } else if (c3379Im.m21337c()) {
                c3379Im.m21329a("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public JSONObject m18754a(@NonNull JSONObject jSONObject) {
        C3446Le c3446Le = this.f43646a;
        if (c3446Le != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("trackingId", c3446Le.f43331a);
                    jSONObject2.put("additionalParams", c3446Le.f43332b);
                    jSONObject2.put("wasSet", c3446Le.f43333c);
                    jSONObject2.put("autoTracking", c3446Le.f43334d);
                    jSONObject2.put("source", c3446Le.f43335e.m17995a());
                } catch (Throwable unused) {
                }
                jSONObject.put("preloadInfo", jSONObject2);
            } catch (Throwable unused2) {
            }
        }
        return jSONObject;
    }
}
