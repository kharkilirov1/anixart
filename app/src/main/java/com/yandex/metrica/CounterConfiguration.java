package com.yandex.metrica;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3658U2;
import com.yandex.metrica.impl.p023ob.C3897dd;
import com.yandex.metrica.impl.p023ob.ResultReceiverC4144n0;

@Deprecated
/* loaded from: classes2.dex */
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new C3078a();

    /* renamed from: b */
    public final ContentValues f42234b;

    /* renamed from: com.yandex.metrica.CounterConfiguration$a */
    public class C3078a implements Parcelable.Creator<CounterConfiguration> {
        @Override // android.os.Parcelable.Creator
        public CounterConfiguration createFromParcel(Parcel parcel) {
            return new CounterConfiguration((ContentValues) parcel.readBundle(ResultReceiverC4144n0.class.getClassLoader()).getParcelable("com.yandex.metrica.CounterConfiguration.data"));
        }

        @Override // android.os.Parcelable.Creator
        public CounterConfiguration[] newArray(int i2) {
            return new CounterConfiguration[i2];
        }
    }

    /* renamed from: com.yandex.metrica.CounterConfiguration$b */
    public enum EnumC3079b {
        MAIN("main"),
        MANUAL("manual"),
        APPMETRICA("appmetrica"),
        COMMUTATION("commutation"),
        SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
        SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
        CRASH("crash");


        /* renamed from: b */
        @NonNull
        public final String f42243b;

        EnumC3079b(@NonNull String str) {
            this.f42243b = str;
        }

        @NonNull
        /* renamed from: a */
        public static EnumC3079b m17764a(@Nullable String str) {
            EnumC3079b[] values = values();
            for (int i2 = 0; i2 < 7; i2++) {
                EnumC3079b enumC3079b = values[i2];
                if (enumC3079b.f42243b.equals(str)) {
                    return enumC3079b;
                }
            }
            return MAIN;
        }
    }

    public CounterConfiguration(@NonNull CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f42234b = new ContentValues(counterConfiguration.f42234b);
            m17763o();
        }
    }

    /* renamed from: c */
    public String m17753c() {
        return this.f42234b.getAsString("CFG_API_KEY");
    }

    /* renamed from: d */
    public final synchronized void m17754d(@Nullable Location location) {
        ContentValues contentValues = this.f42234b;
        int i2 = C3897dd.f44924q;
        byte[] bArr = null;
        if (location != null) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeValue(location);
                bArr = obtain.marshall();
            } catch (Throwable unused) {
            }
            obtain.recycle();
        }
        contentValues.put("CFG_MANUAL_LOCATION", bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public synchronized void m17755f(@NonNull EnumC3079b enumC3079b) {
        this.f42234b.put("CFG_REPORTER_TYPE", enumC3079b.f42243b);
    }

    /* renamed from: g */
    public final void m17756g(@Nullable Integer num) {
        if (C3658U2.m19212a(num)) {
            int intValue = num.intValue();
            synchronized (this) {
                this.f42234b.put("CFG_DISPATCH_PERIOD", Integer.valueOf(intValue));
            }
        }
    }

    /* renamed from: h */
    public final void m17757h(@Nullable String str) {
        if (C3658U2.m19212a((Object) str)) {
            synchronized (this) {
                this.f42234b.put("CFG_API_KEY", str);
            }
        }
    }

    /* renamed from: i */
    public final void m17758i(@Nullable Integer num) {
        if (C3658U2.m19212a(num)) {
            int intValue = num.intValue();
            synchronized (this) {
                ContentValues contentValues = this.f42234b;
                if (intValue <= 0) {
                    intValue = Integer.MAX_VALUE;
                }
                contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(intValue));
            }
        }
    }

    /* renamed from: k */
    public synchronized void m17759k(boolean z) {
        this.f42234b.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final void m17760l(@Nullable String str) {
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(str)) {
            synchronized (this) {
                this.f42234b.put("CFG_REPORTER_TYPE", "appmetrica");
            }
        } else {
            synchronized (this) {
                this.f42234b.put("CFG_REPORTER_TYPE", "manual");
            }
        }
    }

    /* renamed from: m */
    public final synchronized void m17761m(boolean z) {
        this.f42234b.put("CFG_STATISTICS_SENDING", Boolean.valueOf(z));
    }

    /* renamed from: n */
    public final void m17762n(@Nullable Integer num) {
        if (C3658U2.m19212a(num)) {
            int intValue = num.intValue();
            synchronized (this) {
                this.f42234b.put("CFG_SESSION_TIMEOUT", Integer.valueOf(intValue));
            }
        }
    }

    /* renamed from: o */
    public final void m17763o() {
        if (this.f42234b.containsKey("CFG_REPORTER_TYPE")) {
            return;
        }
        if (this.f42234b.containsKey("CFG_MAIN_REPORTER")) {
            if (!this.f42234b.getAsBoolean("CFG_MAIN_REPORTER").booleanValue()) {
                m17760l(m17753c());
                return;
            } else {
                synchronized (this) {
                    this.f42234b.put("CFG_REPORTER_TYPE", "main");
                }
            }
        }
        if (!this.f42234b.containsKey("CFG_COMMUTATION_REPORTER") || !this.f42234b.getAsBoolean("CFG_COMMUTATION_REPORTER").booleanValue()) {
            return;
        }
        synchronized (this) {
            this.f42234b.put("CFG_REPORTER_TYPE", "commutation");
        }
    }

    public synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f42234b + '}';
    }

    @Override // android.os.Parcelable
    public synchronized void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.data", this.f42234b);
        parcel.writeBundle(bundle);
    }

    public CounterConfiguration() {
        this.f42234b = new ContentValues();
    }

    public CounterConfiguration(C4483l c4483l, @NonNull EnumC3079b enumC3079b) {
        this();
        synchronized (this) {
            m17757h(c4483l.apiKey);
            m17762n(c4483l.sessionTimeout);
            if (C3658U2.m19212a(c4483l.location)) {
                m17754d(c4483l.location);
            }
            if (C3658U2.m19212a(c4483l.locationTracking)) {
                m17759k(c4483l.locationTracking.booleanValue());
            }
            if (C3658U2.m19212a((Object) c4483l.f47167a)) {
                String str = c4483l.f47167a;
                synchronized (this) {
                    this.f42234b.put("CFG_DEVICE_SIZE_TYPE", TextUtils.isEmpty(str) ? null : str);
                }
            }
            m17756g(c4483l.f47172f);
            m17758i(c4483l.f47173g);
            if (!TextUtils.isEmpty(c4483l.appVersion)) {
                String str2 = c4483l.appVersion;
                synchronized (this) {
                    this.f42234b.put("CFG_APP_VERSION", str2);
                }
            }
            if (C3658U2.m19212a(c4483l.f47171e)) {
                int intValue = c4483l.f47171e.intValue();
                synchronized (this) {
                    this.f42234b.put("CFG_APP_VERSION_CODE", String.valueOf(intValue));
                }
            }
            if (C3658U2.m19212a(c4483l.f47176j)) {
                boolean booleanValue = c4483l.f47176j.booleanValue();
                synchronized (this) {
                    this.f42234b.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(booleanValue));
                }
            }
            if (C3658U2.m19212a(c4483l.firstActivationAsUpdate)) {
                boolean booleanValue2 = c4483l.firstActivationAsUpdate.booleanValue();
                synchronized (this) {
                    this.f42234b.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(booleanValue2));
                }
            }
            Boolean bool = c4483l.statisticsSending;
            if (C3658U2.m19212a(bool)) {
                m17761m(bool.booleanValue());
            }
            Integer num = c4483l.maxReportsInDatabaseCount;
            if (C3658U2.m19212a(num)) {
                this.f42234b.put("MAX_REPORTS_IN_DB_COUNT", num);
            }
            Boolean bool2 = c4483l.nativeCrashReporting;
            if (C3658U2.m19212a(bool2)) {
                this.f42234b.put("CFG_NATIVE_CRASHES_ENABLED", bool2);
            }
            if (C3658U2.m19212a(c4483l.revenueAutoTrackingEnabled)) {
                boolean booleanValue3 = c4483l.revenueAutoTrackingEnabled.booleanValue();
                synchronized (this) {
                    this.f42234b.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(booleanValue3));
                }
            }
            m17755f(enumC3079b);
        }
    }

    @VisibleForTesting
    public CounterConfiguration(ContentValues contentValues) {
        this.f42234b = contentValues;
        m17763o();
    }
}
