package pub.devrel.easypermissions;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;

/* loaded from: classes3.dex */
class RationaleDialogConfig {

    /* renamed from: a */
    public String f69392a;

    /* renamed from: b */
    public String f69393b;

    /* renamed from: c */
    public int f69394c;

    /* renamed from: d */
    public int f69395d;

    /* renamed from: e */
    public String f69396e;

    /* renamed from: f */
    public String[] f69397f;

    public RationaleDialogConfig(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i2, int i3, @NonNull String[] strArr) {
        this.f69392a = str;
        this.f69393b = str2;
        this.f69396e = str3;
        this.f69394c = i2;
        this.f69395d = i3;
        this.f69397f = strArr;
    }

    /* renamed from: a */
    public Bundle m34998a() {
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", this.f69392a);
        bundle.putString("negativeButton", this.f69393b);
        bundle.putString("rationaleMsg", this.f69396e);
        bundle.putInt("theme", this.f69394c);
        bundle.putInt("requestCode", this.f69395d);
        bundle.putStringArray("permissions", this.f69397f);
        return bundle;
    }

    public RationaleDialogConfig(Bundle bundle) {
        this.f69392a = bundle.getString("positiveButton");
        this.f69393b = bundle.getString("negativeButton");
        this.f69396e = bundle.getString("rationaleMsg");
        this.f69394c = bundle.getInt("theme");
        this.f69395d = bundle.getInt("requestCode");
        this.f69397f = bundle.getStringArray("permissions");
    }
}
