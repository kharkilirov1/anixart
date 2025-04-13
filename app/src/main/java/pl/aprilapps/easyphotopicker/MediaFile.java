package pl.aprilapps.easyphotopicker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: MediaFile.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lpl/aprilapps/easyphotopicker/MediaFile;", "Landroid/os/Parcelable;", "CREATOR", "library_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class MediaFile implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b */
    @NotNull
    public final Uri f69349b;

    /* renamed from: c */
    @NotNull
    public final File f69350c;

    /* compiled from: MediaFile.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lpl/aprilapps/easyphotopicker/MediaFile$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lpl/aprilapps/easyphotopicker/MediaFile;", "library_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    /* renamed from: pl.aprilapps.easyphotopicker.MediaFile$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<MediaFile> {
        public Companion() {
        }

        @Override // android.os.Parcelable.Creator
        public MediaFile createFromParcel(Parcel parcel) {
            Intrinsics.m32180i(parcel, "parcel");
            Parcelable readParcelable = parcel.readParcelable(Uri.class.getClassLoader());
            if (readParcelable == null) {
                Intrinsics.m32188q();
                throw null;
            }
            Uri uri = (Uri) readParcelable;
            Serializable readSerializable = parcel.readSerializable();
            if (readSerializable != null) {
                return new MediaFile(uri, (File) readSerializable);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.io.File");
        }

        @Override // android.os.Parcelable.Creator
        public MediaFile[] newArray(int i2) {
            return new MediaFile[i2];
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MediaFile(@NotNull Uri uri, @NotNull File file) {
        Intrinsics.m32180i(uri, "uri");
        this.f69349b = uri;
        this.f69350c = file;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaFile)) {
            return false;
        }
        MediaFile mediaFile = (MediaFile) obj;
        return Intrinsics.m32174c(this.f69349b, mediaFile.f69349b) && Intrinsics.m32174c(this.f69350c, mediaFile.f69350c);
    }

    public int hashCode() {
        Uri uri = this.f69349b;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        File file = this.f69350c;
        return hashCode + (file != null ? file.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("MediaFile(uri=");
        m24u.append(this.f69349b);
        m24u.append(", file=");
        m24u.append(this.f69350c);
        m24u.append(")");
        return m24u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        Intrinsics.m32180i(parcel, "parcel");
        parcel.writeParcelable(this.f69349b, i2);
        parcel.writeSerializable(this.f69350c);
    }
}
