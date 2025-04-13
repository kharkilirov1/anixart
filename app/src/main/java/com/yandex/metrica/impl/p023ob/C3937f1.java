package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: com.yandex.metrica.impl.ob.f1 */
/* loaded from: classes2.dex */
public class C3937f1 implements Parcelable {
    public static final Parcelable.Creator<C3937f1> CREATOR = new b();

    /* renamed from: a */
    @Nullable
    private ResultReceiver f45078a;

    /* renamed from: b */
    @Nullable
    private List<String> f45079b;

    /* renamed from: c */
    @NonNull
    private Map<String, String> f45080c;

    /* renamed from: com.yandex.metrica.impl.ob.f1$a */
    public class a implements Function0<C3556Q> {
        public a(C3937f1 c3937f1) {
        }

        @Override // kotlin.jvm.functions.Function0
        public C3556Q invoke() {
            return C3532P0.m18696i().m18703e();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.f1$b */
    public class b implements Parcelable.Creator<C3937f1> {
        @Override // android.os.Parcelable.Creator
        public C3937f1 createFromParcel(Parcel parcel) {
            return new C3937f1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3937f1[] newArray(int i2) {
            return new C3937f1[i2];
        }
    }

    public C3937f1(@Nullable List<String> list, @Nullable Map<String, String> map, @Nullable ResultReceiver resultReceiver) {
        this.f45079b = list;
        this.f45078a = resultReceiver;
        this.f45080c = map == null ? new HashMap() : new HashMap(map);
    }

    /* renamed from: a */
    public boolean m19836a(@NonNull C3575Qi c3575Qi) {
        return C3525Oi.m18684a(c3575Qi, this.f45079b, this.f45080c, new a(this));
    }

    @Nullable
    /* renamed from: b */
    public List<String> m19837b() {
        return this.f45079b;
    }

    @Nullable
    /* renamed from: c */
    public ResultReceiver m19838c() {
        return this.f45078a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.receiver", this.f45078a);
        if (this.f45079b != null) {
            bundle.putStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList", new ArrayList<>(this.f45079b));
        }
        Map<String, String> map = this.f45080c;
        if (map != null) {
            bundle.putString("com.yandex.metrica.CounterConfiguration.clidsForVerification", C4452ym.m21262c(map));
        }
        parcel.writeBundle(bundle);
    }

    @NonNull
    /* renamed from: a */
    public Map<String, String> m19835a() {
        return this.f45080c;
    }

    public C3937f1(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(ResultReceiverC4144n0.class.getClassLoader());
        if (readBundle != null) {
            this.f45078a = (ResultReceiver) readBundle.getParcelable("com.yandex.metrica.CounterConfiguration.receiver");
            this.f45079b = readBundle.getStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList");
            this.f45080c = C4452ym.m21241a(readBundle.getString("com.yandex.metrica.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f45080c = new HashMap();
    }
}
