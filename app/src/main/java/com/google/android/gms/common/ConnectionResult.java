package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15314b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final int f15315c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final PendingIntent f15316d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public final String f15317e;

    /* renamed from: f */
    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final ConnectionResult f15313f = new ConnectionResult(0);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zzb();

    public ConnectionResult(int i2) {
        this.f15314b = 1;
        this.f15315c = i2;
        this.f15316d = null;
        this.f15317e = null;
    }

    @SafeParcelable.Constructor
    public ConnectionResult(@SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @Nullable @SafeParcelable.Param PendingIntent pendingIntent, @Nullable @SafeParcelable.Param String str) {
        this.f15314b = i2;
        this.f15315c = i3;
        this.f15316d = pendingIntent;
        this.f15317e = str;
    }

    @NonNull
    /* renamed from: o */
    public static String m7912o(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f15315c == connectionResult.f15315c && Objects.m8123a(this.f15316d, connectionResult.f15316d) && Objects.m8123a(this.f15317e, connectionResult.f15317e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15315c), this.f15316d, this.f15317e});
    }

    /* renamed from: m */
    public boolean m7913m() {
        return (this.f15315c == 0 || this.f15316d == null) ? false : true;
    }

    /* renamed from: n */
    public boolean m7914n() {
        return this.f15315c == 0;
    }

    @NonNull
    public String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m8124a("statusCode", m7912o(this.f15315c));
        toStringHelper.m8124a("resolution", this.f15316d);
        toStringHelper.m8124a(ThrowableDeserializer.PROP_NAME_MESSAGE, this.f15317e);
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15314b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        int i4 = this.f15315c;
        parcel.writeInt(262146);
        parcel.writeInt(i4);
        SafeParcelWriter.m8167f(parcel, 3, this.f15316d, i2, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f15317e, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    public ConnectionResult(int i2, @Nullable PendingIntent pendingIntent) {
        this.f15314b = 1;
        this.f15315c = i2;
        this.f15316d = pendingIntent;
        this.f15317e = null;
    }

    public ConnectionResult(int i2, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        this.f15314b = 1;
        this.f15315c = i2;
        this.f15316d = null;
        this.f15317e = str;
    }
}
