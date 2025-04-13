package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Dk */
/* loaded from: classes2.dex */
class C3252Dk implements InterfaceC4243ql {

    /* renamed from: a */
    @NonNull
    private final C3729Wn f42746a;

    public C3252Dk() {
        this(new C3729Wn());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4243ql
    @Nullable
    /* renamed from: a */
    public Bundle mo17980a(@NonNull Activity activity) {
        ActivityInfo activityInfo;
        C3729Wn c3729Wn = this.f42746a;
        ComponentName componentName = activity.getComponentName();
        Objects.requireNonNull(c3729Wn);
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(componentName, 128);
        } catch (Throwable unused) {
            activityInfo = null;
        }
        if (activityInfo != null) {
            return activityInfo.metaData;
        }
        return null;
    }

    @VisibleForTesting
    public C3252Dk(@NonNull C3729Wn c3729Wn) {
        this.f42746a = c3729Wn;
    }
}
