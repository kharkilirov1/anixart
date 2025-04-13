package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public class PhoneAuthProvider {

    /* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
    @SafeParcelable.Class
    public static class ForceResendingToken extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<ForceResendingToken> CREATOR = new zzd();

        @SafeParcelable.Constructor
        public ForceResendingToken() {
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i2) {
            SafeParcelWriter.m8174m(parcel, SafeParcelWriter.m8173l(parcel, 20293));
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
    public static abstract class OnVerificationStateChangedCallbacks {

        /* renamed from: a */
        public static final Logger f22334a = new Logger("PhoneAuthProvider", new String[0]);

        /* renamed from: a */
        public void mo9446a(@NonNull String str) {
            Logger logger = f22334a;
            Log.i(logger.f15834a, logger.m8206c("Sms auto retrieval timed-out.", new Object[0]));
        }

        /* renamed from: b */
        public void mo9447b(@NonNull String str, @NonNull ForceResendingToken forceResendingToken) {
        }

        /* renamed from: c */
        public abstract void mo9448c(@NonNull PhoneAuthCredential phoneAuthCredential);

        /* renamed from: d */
        public abstract void mo9449d(@NonNull FirebaseException firebaseException);
    }
}
