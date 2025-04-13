package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000a.C0000a;

@SuppressLint
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() { // from class: androidx.activity.result.ActivityResult.1
        @Override // android.os.Parcelable.Creator
        public ActivityResult createFromParcel(@NonNull Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityResult[] newArray(int i2) {
            return new ActivityResult[i2];
        }
    };

    /* renamed from: b */
    public final int f239b;

    /* renamed from: c */
    @Nullable
    public final Intent f240c;

    public ActivityResult(int i2, @Nullable Intent intent) {
        this.f239b = i2;
        this.f240c = intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ActivityResult{resultCode=");
        int i2 = this.f239b;
        m24u.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        m24u.append(", data=");
        m24u.append(this.f240c);
        m24u.append('}');
        return m24u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeInt(this.f239b);
        parcel.writeInt(this.f240c == null ? 0 : 1);
        Intent intent = this.f240c;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f239b = parcel.readInt();
        this.f240c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
