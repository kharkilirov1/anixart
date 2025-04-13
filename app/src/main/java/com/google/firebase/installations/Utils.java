package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class Utils {

    /* renamed from: b */
    public static final long f23155b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f23156c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static Utils f23157d;

    /* renamed from: a */
    public final Clock f23158a;

    public Utils(Clock clock) {
        this.f23158a = clock;
    }

    /* renamed from: c */
    public static Utils m12578c() {
        if (SystemClock.f23221a == null) {
            SystemClock.f23221a = new SystemClock();
        }
        SystemClock systemClock = SystemClock.f23221a;
        if (f23157d == null) {
            f23157d = new Utils(systemClock);
        }
        return f23157d;
    }

    /* renamed from: a */
    public long m12579a() {
        return this.f23158a.mo12632a();
    }

    /* renamed from: b */
    public long m12580b() {
        return TimeUnit.MILLISECONDS.toSeconds(m12579a());
    }

    /* renamed from: d */
    public boolean m12581d(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        if (TextUtils.isEmpty(persistedInstallationEntry.mo12583a())) {
            return true;
        }
        return persistedInstallationEntry.mo12584b() + persistedInstallationEntry.mo12589g() < m12580b() + f23155b;
    }
}
