package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class InputContentInfoCompat {

    /* renamed from: a */
    public final InputContentInfoCompatImpl f3779a;

    public static final class InputContentInfoCompatBaseImpl implements InputContentInfoCompatImpl {

        /* renamed from: a */
        @NonNull
        public final Uri f3781a;

        /* renamed from: b */
        @NonNull
        public final ClipDescription f3782b;

        /* renamed from: c */
        @Nullable
        public final Uri f3783c;

        public InputContentInfoCompatBaseImpl(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f3781a = uri;
            this.f3782b = clipDescription;
            this.f3783c = uri2;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @NonNull
        /* renamed from: a */
        public Uri mo2558a() {
            return this.f3781a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* renamed from: b */
        public void mo2559b() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @Nullable
        /* renamed from: c */
        public Uri mo2560c() {
            return this.f3783c;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @Nullable
        /* renamed from: d */
        public Object mo2561d() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @NonNull
        public ClipDescription getDescription() {
            return this.f3782b;
        }
    }

    public interface InputContentInfoCompatImpl {
        @NonNull
        /* renamed from: a */
        Uri mo2558a();

        /* renamed from: b */
        void mo2559b();

        @Nullable
        /* renamed from: c */
        Uri mo2560c();

        @Nullable
        /* renamed from: d */
        Object mo2561d();

        @NonNull
        ClipDescription getDescription();
    }

    public InputContentInfoCompat(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f3779a = new InputContentInfoCompatApi25Impl(uri, clipDescription, uri2);
        } else {
            this.f3779a = new InputContentInfoCompatBaseImpl(uri, clipDescription, uri2);
        }
    }

    @RequiresApi
    public static final class InputContentInfoCompatApi25Impl implements InputContentInfoCompatImpl {

        /* renamed from: a */
        @NonNull
        public final InputContentInfo f3780a;

        public InputContentInfoCompatApi25Impl(@NonNull Object obj) {
            this.f3780a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @NonNull
        /* renamed from: a */
        public Uri mo2558a() {
            return this.f3780a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        /* renamed from: b */
        public void mo2559b() {
            this.f3780a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @Nullable
        /* renamed from: c */
        public Uri mo2560c() {
            return this.f3780a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @NonNull
        /* renamed from: d */
        public Object mo2561d() {
            return this.f3780a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        @NonNull
        public ClipDescription getDescription() {
            return this.f3780a.getDescription();
        }

        public InputContentInfoCompatApi25Impl(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f3780a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public InputContentInfoCompat(@NonNull InputContentInfoCompatImpl inputContentInfoCompatImpl) {
        this.f3779a = inputContentInfoCompatImpl;
    }
}
