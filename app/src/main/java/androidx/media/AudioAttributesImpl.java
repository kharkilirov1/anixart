package androidx.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;

@RestrictTo
/* loaded from: classes.dex */
public interface AudioAttributesImpl extends VersionedParcelable {

    public interface Builder {
        @NonNull
        /* renamed from: A */
        AudioAttributesImpl mo3286A();

        @NonNull
        /* renamed from: a */
        Builder mo3287a(int i2);

        @NonNull
        /* renamed from: b */
        Builder mo3288b(int i2);

        @NonNull
        /* renamed from: c */
        Builder mo3289c(int i2);
    }

    /* renamed from: a */
    int mo3284a();

    @Nullable
    /* renamed from: b */
    Object mo3285b();
}
