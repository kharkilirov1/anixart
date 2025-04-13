package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzvv extends AbstractSafeParcelable implements zzuf<zzvv> {
    public static final Parcelable.Creator<zzvv> CREATOR = new zzvw();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f16914b;

    /* renamed from: c */
    @SafeParcelable.Field
    public boolean f16915c;

    /* renamed from: d */
    @SafeParcelable.Field
    public String f16916d;

    /* renamed from: e */
    @SafeParcelable.Field
    public boolean f16917e;

    /* renamed from: f */
    @SafeParcelable.Field
    public zzxo f16918f;

    /* renamed from: g */
    @SafeParcelable.Field
    public List f16919g;

    public zzvv() {
        this.f16918f = new zzxo(null);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f16914b = jSONObject.optString("authUri", null);
            this.f16915c = jSONObject.optBoolean("registered", false);
            this.f16916d = jSONObject.optString("providerId", null);
            this.f16917e = jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                this.f16918f = new zzxo(1, zzyc.m9484b(jSONObject.optJSONArray("allProviders")));
            } else {
                this.f16918f = new zzxo(null);
            }
            this.f16919g = zzyc.m9484b(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzvv", str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, this.f16914b, false);
        boolean z = this.f16915c;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 4, this.f16916d, false);
        boolean z2 = this.f16917e;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8167f(parcel, 6, this.f16918f, i2, false);
        SafeParcelWriter.m8170i(parcel, 7, this.f16919g, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzvv(@SafeParcelable.Param String str, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z2, @SafeParcelable.Param zzxo zzxoVar, @SafeParcelable.Param List list) {
        zzxo zzxoVar2;
        this.f16914b = str;
        this.f16915c = z;
        this.f16916d = str2;
        this.f16917e = z2;
        if (zzxoVar == null) {
            zzxoVar2 = new zzxo(null);
        } else {
            zzxoVar2 = new zzxo(zzxoVar.f17044c);
        }
        this.f16918f = zzxoVar2;
        this.f16919g = list;
    }
}
