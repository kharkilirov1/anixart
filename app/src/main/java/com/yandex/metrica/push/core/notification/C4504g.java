package com.yandex.metrica.push.core.notification;

import android.annotation.SuppressLint;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationManagerCompat;
import com.yandex.metrica.push.impl.C4530J0;
import com.yandex.metrica.push.impl.C4566c;
import java.util.Collections;

/* renamed from: com.yandex.metrica.push.core.notification.g */
/* loaded from: classes2.dex */
public class C4504g {

    /* renamed from: a */
    @Nullable
    private final NotificationManager f47272a;

    /* renamed from: b */
    @NonNull
    private final NotificationManagerCompat f47273b;

    /* renamed from: c */
    @NonNull
    private final d f47274c;

    /* renamed from: d */
    @NonNull
    private final C4566c f47275d;

    @RequiresApi
    /* renamed from: com.yandex.metrica.push.core.notification.g$a */
    public class a extends c {
        public a() {
            super();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e7 A[EDGE_INSN: B:31:0x00e7->B:32:0x00e7 BREAK  A[LOOP:0: B:8:0x0051->B:25:0x0051], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.yandex.metrica.push.core.notification.C4504g.c, com.yandex.metrica.push.core.notification.C4504g.d
        @androidx.annotation.NonNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.yandex.metrica.push.core.notification.C4503f mo21406a() {
            /*
                Method dump skipped, instructions count: 371
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.push.core.notification.C4504g.a.mo21406a():com.yandex.metrica.push.core.notification.f");
        }

        /* renamed from: a */
        public boolean mo21407a(@NonNull NotificationChannelGroup notificationChannelGroup) {
            return true;
        }
    }

    @RequiresApi
    /* renamed from: com.yandex.metrica.push.core.notification.g$b */
    public class b extends a {
        public b(C4504g c4504g) {
            super();
        }

        @Override // com.yandex.metrica.push.core.notification.C4504g.a
        @SuppressLint
        /* renamed from: a */
        public boolean mo21407a(@NonNull NotificationChannelGroup notificationChannelGroup) {
            return !notificationChannelGroup.isBlocked();
        }
    }

    /* renamed from: com.yandex.metrica.push.core.notification.g$d */
    public interface d {
        @NonNull
        /* renamed from: a */
        C4503f mo21406a();
    }

    public C4504g(@NonNull Context context) {
        this((NotificationManager) context.getSystemService("notification"), new NotificationManagerCompat(context), new C4566c(context, ".NOTIFICATION_STATUS"));
    }

    @NonNull
    /* renamed from: a */
    public C4503f m21405a() {
        return this.f47274c.mo21406a();
    }

    /* renamed from: com.yandex.metrica.push.core.notification.g$c */
    public class c implements d {
        public c() {
        }

        @Override // com.yandex.metrica.push.core.notification.C4504g.d
        @NonNull
        /* renamed from: a */
        public C4503f mo21406a() {
            boolean m1627a = C4504g.this.f47273b.m1627a();
            return new C4503f(Collections.emptySet(), Collections.emptySet(), m1627a, m21408a(m1627a));
        }

        /* renamed from: a */
        public boolean m21408a(boolean z) {
            Boolean m21527a = C4504g.this.f47275d.m21527a("app_notification_status");
            C4504g.this.f47275d.m21524a().edit().putBoolean("app_notification_status", z).apply();
            return (m21527a == null || m21527a.booleanValue() == z) ? false : true;
        }
    }

    @VisibleForTesting
    public C4504g(@Nullable NotificationManager notificationManager, @NonNull NotificationManagerCompat notificationManagerCompat, @NonNull C4566c c4566c) {
        this.f47272a = notificationManager;
        this.f47273b = notificationManagerCompat;
        this.f47275d = c4566c;
        if (C4530J0.m21447a(28)) {
            this.f47274c = new b(this);
        } else if (C4530J0.m21447a(26)) {
            this.f47274c = new a();
        } else {
            this.f47274c = new c();
        }
    }
}
