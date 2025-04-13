package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.fragment.app.Fragment;

/* loaded from: classes3.dex */
public class AppSettingsDialog implements Parcelable {

    @RestrictTo
    public static final Parcelable.Creator<AppSettingsDialog> CREATOR = new Parcelable.Creator<AppSettingsDialog>() { // from class: pub.devrel.easypermissions.AppSettingsDialog.1
        @Override // android.os.Parcelable.Creator
        public AppSettingsDialog createFromParcel(Parcel parcel) {
            return new AppSettingsDialog(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public AppSettingsDialog[] newArray(int i2) {
            return new AppSettingsDialog[i2];
        }
    };

    /* renamed from: b */
    @StyleRes
    public final int f69357b;

    /* renamed from: c */
    public final String f69358c;

    /* renamed from: d */
    public final String f69359d;

    /* renamed from: e */
    public final String f69360e;

    /* renamed from: f */
    public final String f69361f;

    /* renamed from: g */
    public final int f69362g;

    /* renamed from: h */
    public final int f69363h;

    /* renamed from: i */
    public Object f69364i;

    /* renamed from: j */
    public Context f69365j;

    public static class Builder {

        /* renamed from: a */
        public final Object f69366a;

        /* renamed from: b */
        public final Context f69367b;

        /* renamed from: c */
        public String f69368c;

        /* renamed from: d */
        public String f69369d;

        /* renamed from: e */
        public String f69370e;

        /* renamed from: f */
        public String f69371f;

        /* renamed from: g */
        public int f69372g = -1;

        public Builder(@NonNull Activity activity) {
            this.f69366a = activity;
            this.f69367b = activity;
        }
    }

    public AppSettingsDialog(Parcel parcel, C69771 c69771) {
        this.f69357b = parcel.readInt();
        this.f69358c = parcel.readString();
        this.f69359d = parcel.readString();
        this.f69360e = parcel.readString();
        this.f69361f = parcel.readString();
        this.f69362g = parcel.readInt();
        this.f69363h = parcel.readInt();
    }

    /* renamed from: a */
    public final void m34988a(Object obj) {
        this.f69364i = obj;
        if (obj instanceof Activity) {
            this.f69365j = (Activity) obj;
        } else {
            if (obj instanceof Fragment) {
                this.f69365j = ((Fragment) obj).getContext();
                return;
            }
            throw new IllegalStateException("Unknown object: " + obj);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeInt(this.f69357b);
        parcel.writeString(this.f69358c);
        parcel.writeString(this.f69359d);
        parcel.writeString(this.f69360e);
        parcel.writeString(this.f69361f);
        parcel.writeInt(this.f69362g);
        parcel.writeInt(this.f69363h);
    }

    public AppSettingsDialog(Object obj, int i2, String str, String str2, String str3, String str4, int i3, int i4, C69771 c69771) {
        m34988a(obj);
        this.f69357b = i2;
        this.f69358c = str;
        this.f69359d = str2;
        this.f69360e = str3;
        this.f69361f = str4;
        this.f69362g = i3;
        this.f69363h = i4;
    }
}
