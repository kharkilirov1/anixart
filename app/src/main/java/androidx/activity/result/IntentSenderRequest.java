package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator<IntentSenderRequest>() { // from class: androidx.activity.result.IntentSenderRequest.1
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest[] newArray(int i2) {
            return new IntentSenderRequest[i2];
        }
    };

    /* renamed from: b */
    @NonNull
    public final IntentSender f264b;

    /* renamed from: c */
    @Nullable
    public final Intent f265c;

    /* renamed from: d */
    public final int f266d;

    /* renamed from: e */
    public final int f267e;

    public static final class Builder {

        /* renamed from: a */
        public IntentSender f268a;

        /* renamed from: b */
        public Intent f269b;

        /* renamed from: c */
        public int f270c;

        /* renamed from: d */
        public int f271d;

        public Builder(@NonNull IntentSender intentSender) {
            this.f268a = intentSender;
        }
    }

    public IntentSenderRequest(@NonNull IntentSender intentSender, @Nullable Intent intent, int i2, int i3) {
        this.f264b = intentSender;
        this.f265c = intent;
        this.f266d = i2;
        this.f267e = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeParcelable(this.f264b, i2);
        parcel.writeParcelable(this.f265c, i2);
        parcel.writeInt(this.f266d);
        parcel.writeInt(this.f267e);
    }

    public IntentSenderRequest(@NonNull Parcel parcel) {
        this.f264b = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f265c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f266d = parcel.readInt();
        this.f267e = parcel.readInt();
    }
}
