package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class ContentInfoCompat {

    /* renamed from: a */
    @NonNull
    public final Compat f3575a;

    @RequiresApi
    public static final class Api31Impl {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static Pair<ContentInfo, ContentInfo> m2057a(@NonNull ContentInfo contentInfo, @NonNull Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = test ? contentInfo : null;
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i2 = 0; i2 < clip.getItemCount(); i2++) {
                ClipData.Item itemAt = clip.getItemAt(i2);
                if (predicate.test(itemAt)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(itemAt);
                }
            }
            Pair create = arrayList == null ? Pair.create(null, clip) : arrayList2 == null ? Pair.create(clip, null) : Pair.create(ContentInfoCompat.m2053a(clip.getDescription(), arrayList), ContentInfoCompat.m2053a(clip.getDescription(), arrayList2));
            return create.first == null ? Pair.create(null, contentInfo) : create.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) create.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) create.second).build());
        }
    }

    public static final class Builder {

        /* renamed from: a */
        @NonNull
        public final BuilderCompat f3576a;

        public Builder(@NonNull ClipData clipData, int i2) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3576a = new BuilderCompat31Impl(clipData, i2);
            } else {
                this.f3576a = new BuilderCompatImpl(clipData, i2);
            }
        }

        @NonNull
        /* renamed from: a */
        public ContentInfoCompat m2058a() {
            return this.f3576a.mo2062A();
        }

        @NonNull
        /* renamed from: b */
        public Builder m2059b(@Nullable Bundle bundle) {
            this.f3576a.setExtras(bundle);
            return this;
        }

        @NonNull
        /* renamed from: c */
        public Builder m2060c(int i2) {
            this.f3576a.mo2064b(i2);
            return this;
        }

        @NonNull
        /* renamed from: d */
        public Builder m2061d(@Nullable Uri uri) {
            this.f3576a.mo2063B(uri);
            return this;
        }
    }

    public interface BuilderCompat {
        @NonNull
        /* renamed from: A */
        ContentInfoCompat mo2062A();

        /* renamed from: B */
        void mo2063B(@Nullable Uri uri);

        /* renamed from: b */
        void mo2064b(int i2);

        void setExtras(@Nullable Bundle bundle);
    }

    @RequiresApi
    public static final class BuilderCompat31Impl implements BuilderCompat {

        /* renamed from: a */
        @NonNull
        public final ContentInfo.Builder f3577a;

        public BuilderCompat31Impl(@NonNull ClipData clipData, int i2) {
            this.f3577a = new ContentInfo.Builder(clipData, i2);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        @NonNull
        /* renamed from: A */
        public ContentInfoCompat mo2062A() {
            return new ContentInfoCompat(new Compat31Impl(this.f3577a.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        /* renamed from: B */
        public void mo2063B(@Nullable Uri uri) {
            this.f3577a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        /* renamed from: b */
        public void mo2064b(int i2) {
            this.f3577a.setFlags(i2);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(@Nullable Bundle bundle) {
            this.f3577a.setExtras(bundle);
        }
    }

    public static final class BuilderCompatImpl implements BuilderCompat {

        /* renamed from: a */
        @NonNull
        public ClipData f3578a;

        /* renamed from: b */
        public int f3579b;

        /* renamed from: c */
        public int f3580c;

        /* renamed from: d */
        @Nullable
        public Uri f3581d;

        /* renamed from: e */
        @Nullable
        public Bundle f3582e;

        public BuilderCompatImpl(@NonNull ClipData clipData, int i2) {
            this.f3578a = clipData;
            this.f3579b = i2;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        @NonNull
        /* renamed from: A */
        public ContentInfoCompat mo2062A() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        /* renamed from: B */
        public void mo2063B(@Nullable Uri uri) {
            this.f3581d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        /* renamed from: b */
        public void mo2064b(int i2) {
            this.f3580c = i2;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(@Nullable Bundle bundle) {
            this.f3582e = bundle;
        }
    }

    public interface Compat {
        /* renamed from: i */
        int mo2065i();

        @NonNull
        /* renamed from: j */
        ClipData mo2066j();

        @Nullable
        /* renamed from: k */
        ContentInfo mo2067k();

        /* renamed from: p */
        int mo2068p();
    }

    @RequiresApi
    public static final class Compat31Impl implements Compat {

        /* renamed from: a */
        @NonNull
        public final ContentInfo f3583a;

        public Compat31Impl(@NonNull ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.f3583a = contentInfo;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* renamed from: i */
        public int mo2065i() {
            return this.f3583a.getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @NonNull
        /* renamed from: j */
        public ClipData mo2066j() {
            return this.f3583a.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @NonNull
        /* renamed from: k */
        public ContentInfo mo2067k() {
            return this.f3583a;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* renamed from: p */
        public int mo2068p() {
            return this.f3583a.getFlags();
        }

        @NonNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("ContentInfoCompat{");
            m24u.append(this.f3583a);
            m24u.append("}");
            return m24u.toString();
        }
    }

    public static final class CompatImpl implements Compat {

        /* renamed from: a */
        @NonNull
        public final ClipData f3584a;

        /* renamed from: b */
        public final int f3585b;

        /* renamed from: c */
        public final int f3586c;

        /* renamed from: d */
        @Nullable
        public final Uri f3587d;

        /* renamed from: e */
        @Nullable
        public final Bundle f3588e;

        public CompatImpl(BuilderCompatImpl builderCompatImpl) {
            ClipData clipData = builderCompatImpl.f3578a;
            Objects.requireNonNull(clipData);
            this.f3584a = clipData;
            int i2 = builderCompatImpl.f3579b;
            if (i2 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i2 > 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            this.f3585b = i2;
            int i3 = builderCompatImpl.f3580c;
            if ((i3 & 1) == i3) {
                this.f3586c = i3;
                this.f3587d = builderCompatImpl.f3581d;
                this.f3588e = builderCompatImpl.f3582e;
            } else {
                StringBuilder m24u = C0000a.m24u("Requested flags 0x");
                m24u.append(Integer.toHexString(i3));
                m24u.append(", but only 0x");
                m24u.append(Integer.toHexString(1));
                m24u.append(" are allowed");
                throw new IllegalArgumentException(m24u.toString());
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* renamed from: i */
        public int mo2065i() {
            return this.f3585b;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @NonNull
        /* renamed from: j */
        public ClipData mo2066j() {
            return this.f3584a;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        @Nullable
        /* renamed from: k */
        public ContentInfo mo2067k() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        /* renamed from: p */
        public int mo2068p() {
            return this.f3586c;
        }

        @NonNull
        public String toString() {
            String sb;
            StringBuilder m24u = C0000a.m24u("ContentInfoCompat{clip=");
            m24u.append(this.f3584a.getDescription());
            m24u.append(", source=");
            int i2 = this.f3585b;
            m24u.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            m24u.append(", flags=");
            int i3 = this.f3586c;
            m24u.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
            if (this.f3587d == null) {
                sb = "";
            } else {
                StringBuilder m24u2 = C0000a.m24u(", hasLinkUri(");
                m24u2.append(this.f3587d.toString().length());
                m24u2.append(")");
                sb = m24u2.toString();
            }
            m24u.append(sb);
            return C0000a.m20q(m24u, this.f3588e != null ? ", hasExtras" : "", "}");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Source {
    }

    public ContentInfoCompat(@NonNull Compat compat) {
        this.f3575a = compat;
    }

    @NonNull
    /* renamed from: a */
    public static ClipData m2053a(@NonNull ClipDescription clipDescription, @NonNull List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i2 = 1; i2 < list.size(); i2++) {
            clipData.addItem(list.get(i2));
        }
        return clipData;
    }

    @NonNull
    /* renamed from: b */
    public ClipData m2054b() {
        return this.f3575a.mo2066j();
    }

    /* renamed from: c */
    public int m2055c() {
        return this.f3575a.mo2068p();
    }

    /* renamed from: d */
    public int m2056d() {
        return this.f3575a.mo2065i();
    }

    @NonNull
    public String toString() {
        return this.f3575a.toString();
    }
}
