package pl.aprilapps.easyphotopicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EasyImage.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lpl/aprilapps/easyphotopicker/EasyImage;", "", "ActivityCaller", "Builder", "Callbacks", "library_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class EasyImage {

    /* renamed from: a */
    public final boolean f69337a;

    /* compiled from: EasyImage.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lpl/aprilapps/easyphotopicker/EasyImage$ActivityCaller;", "", "library_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class ActivityCaller {

        /* renamed from: a */
        @Nullable
        public final Fragment f69338a;

        /* renamed from: b */
        @Nullable
        public final Activity f69339b;

        /* renamed from: c */
        @Nullable
        public final android.app.Fragment f69340c;

        public ActivityCaller() {
            this(null, null, null, 7);
        }

        public ActivityCaller(Fragment fragment, Activity activity, android.app.Fragment fragment2, int i2) {
            fragment = (i2 & 1) != 0 ? null : fragment;
            activity = (i2 & 2) != 0 ? null : activity;
            fragment2 = (i2 & 4) != 0 ? null : fragment2;
            this.f69338a = fragment;
            this.f69339b = activity;
            this.f69340c = fragment2;
        }
    }

    /* compiled from: EasyImage.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lpl/aprilapps/easyphotopicker/EasyImage$Builder;", "", "Companion", "library_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Builder {

        /* renamed from: a */
        public String f69341a = "";

        /* renamed from: b */
        public String f69342b;

        /* renamed from: c */
        public ChooserType f69343c;

        /* renamed from: d */
        public final Context f69344d;

        /* compiled from: EasyImage.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lpl/aprilapps/easyphotopicker/EasyImage$Builder$Companion;", "", "library_release"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class Companion {
        }

        public Builder(@NotNull Context context) {
            this.f69344d = context;
            String str = "EasyImage";
            try {
                str = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
            } catch (Throwable th) {
                Log.e("EasyImage", "App name couldn't be found. Probably no label was specified in the AndroidManifest.xml. Using EasyImage as a folder name for files.");
                th.printStackTrace();
            }
            this.f69342b = str;
            this.f69343c = ChooserType.CAMERA_AND_DOCUMENTS;
        }

        @NotNull
        /* renamed from: a */
        public final EasyImage m34985a() {
            return new EasyImage(this.f69344d, this.f69341a, this.f69342b, false, this.f69343c, false, null);
        }
    }

    /* compiled from: EasyImage.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lpl/aprilapps/easyphotopicker/EasyImage$Callbacks;", "", "library_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public interface Callbacks {
        /* renamed from: a */
        void mo34980a(@NotNull Throwable th, @NotNull MediaSource mediaSource);

        /* renamed from: b */
        void mo15474b(@NotNull MediaFile[] mediaFileArr, @NotNull MediaSource mediaSource);
    }

    public EasyImage(Context context, String str, String str2, boolean z, ChooserType chooserType, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f69337a = z;
    }

    /* renamed from: a */
    public final void m34981a(int i2, int i3, @Nullable Intent intent, @NotNull Activity activity, @NotNull Callbacks callbacks) {
        if (34961 > i2 || 34965 < i2 || i3 != -1) {
            return;
        }
        if (i2 == 34961 && intent != null) {
            m34983c(intent, activity, callbacks);
            return;
        }
        if (i2 == 34962 && intent != null) {
            m34982b(intent, activity, callbacks);
            return;
        }
        if (i2 == 34963) {
            Log.d("EasyImage", "File returned from chooser");
            if (intent != null) {
                m34982b(intent, activity, callbacks);
                return;
            }
            return;
        }
        if (i2 == 34964) {
            Log.d("EasyImage", "Picture returned from camera");
        } else if (i2 == 34965) {
            Log.d("EasyImage", "Video returned from camera");
        }
    }

    /* renamed from: b */
    public final void m34982b(Intent intent, Activity activity, Callbacks callbacks) {
        MediaSource mediaSource = MediaSource.GALLERY;
        try {
            ClipData clipData = intent.getClipData();
            if (clipData == null) {
                m34983c(intent, activity, callbacks);
                return;
            }
            Log.d("EasyImage", "Existing picture returned");
            ArrayList arrayList = new ArrayList();
            int itemCount = clipData.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                ClipData.Item itemAt = clipData.getItemAt(i2);
                Intrinsics.m32175d(itemAt, "clipData.getItemAt(i)");
                Uri uri = itemAt.getUri();
                Files files = Files.f69345a;
                Intrinsics.m32175d(uri, "uri");
                arrayList.add(new MediaFile(uri, files.m34986a(activity, uri)));
            }
            if (!(!arrayList.isEmpty())) {
                callbacks.mo34980a(new EasyImageException("No files were returned from gallery", null), mediaSource);
                return;
            }
            Object[] array = arrayList.toArray(new MediaFile[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            callbacks.mo15474b((MediaFile[]) array, mediaSource);
        } catch (Throwable th) {
            th.printStackTrace();
            callbacks.mo34980a(th, mediaSource);
        }
    }

    /* renamed from: c */
    public final void m34983c(Intent intent, Activity activity, Callbacks callbacks) {
        MediaSource mediaSource = MediaSource.DOCUMENTS;
        Log.d("EasyImage", "Existing picture returned from local storage");
        try {
            Uri data = intent.getData();
            if (data != null) {
                callbacks.mo15474b(new MediaFile[]{new MediaFile(data, Files.f69345a.m34986a(activity, data))}, mediaSource);
            } else {
                Intrinsics.m32188q();
                throw null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            callbacks.mo34980a(th, mediaSource);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void m34984d(@NotNull Fragment fragment) {
        android.app.Fragment fragment2;
        Unit unit = null;
        ActivityCaller activityCaller = fragment instanceof Activity ? new ActivityCaller(null, (Activity) fragment, null, 5) : new ActivityCaller(fragment, null, null, 6);
        boolean z = this.f69337a;
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        Activity activity = activityCaller.f69339b;
        if (activity != null) {
            activity.startActivityForResult(intent, 34962);
            unit = Unit.f63088a;
        } else {
            Fragment fragment3 = activityCaller.f69338a;
            if (fragment3 != null) {
                fragment3.startActivityForResult(intent, 34962);
                unit = Unit.f63088a;
            }
        }
        if (unit == null && (fragment2 = activityCaller.f69340c) != null) {
            fragment2.startActivityForResult(intent, 34962);
        }
    }
}
