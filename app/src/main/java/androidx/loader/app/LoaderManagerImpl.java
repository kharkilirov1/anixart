package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.C0414b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes.dex */
class LoaderManagerImpl extends LoaderManager {

    /* renamed from: a */
    @NonNull
    public final LifecycleOwner f4710a;

    /* renamed from: b */
    @NonNull
    public final LoaderViewModel f4711b;

    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {

        /* renamed from: l */
        public final int f4712l;

        /* renamed from: m */
        @Nullable
        public final Bundle f4713m;

        /* renamed from: n */
        @NonNull
        public final Loader<D> f4714n;

        /* renamed from: o */
        public LifecycleOwner f4715o;

        /* renamed from: p */
        public LoaderObserver<D> f4716p;

        /* renamed from: q */
        public Loader<D> f4717q;

        public LoaderInfo(int i2, @Nullable Bundle bundle, @NonNull Loader<D> loader, @Nullable Loader<D> loader2) {
            this.f4712l = i2;
            this.f4713m = bundle;
            this.f4714n = loader;
            this.f4717q = loader2;
            if (loader.f4732b != null) {
                throw new IllegalStateException("There is already a listener registered");
            }
            loader.f4732b = this;
            loader.f4731a = i2;
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        /* renamed from: a */
        public void mo3258a(@NonNull Loader<D> loader, @Nullable D d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo3216l(d);
            } else {
                mo3214j(d);
            }
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: h */
        public void mo3179h() {
            Loader<D> loader = this.f4714n;
            loader.f4734d = true;
            loader.f4736f = false;
            loader.f4735e = false;
            loader.mo3275e();
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: i */
        public void mo3213i() {
            Loader<D> loader = this.f4714n;
            loader.f4734d = false;
            loader.mo3276f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: k */
        public void mo3215k(@NonNull Observer<? super D> observer) {
            super.mo3215k(observer);
            this.f4715o = null;
            this.f4716p = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        /* renamed from: l */
        public void mo3216l(D d) {
            super.mo3216l(d);
            Loader<D> loader = this.f4717q;
            if (loader != null) {
                loader.mo3274d();
                loader.f4736f = true;
                loader.f4734d = false;
                loader.f4735e = false;
                loader.f4737g = false;
                loader.f4738h = false;
                this.f4717q = null;
            }
        }

        @MainThread
        /* renamed from: m */
        public Loader<D> m3259m(boolean z) {
            this.f4714n.mo3263c();
            this.f4714n.f4735e = true;
            LoaderObserver<D> loaderObserver = this.f4716p;
            if (loaderObserver != null) {
                super.mo3215k(loaderObserver);
                this.f4715o = null;
                this.f4716p = null;
                if (z && loaderObserver.f4720c) {
                    loaderObserver.f4719b.mo3257c(loaderObserver.f4718a);
                }
            }
            Loader<D> loader = this.f4714n;
            Loader.OnLoadCompleteListener<D> onLoadCompleteListener = loader.f4732b;
            if (onLoadCompleteListener == null) {
                throw new IllegalStateException("No listener register");
            }
            if (onLoadCompleteListener != this) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            loader.f4732b = null;
            if ((loaderObserver == null || loaderObserver.f4720c) && !z) {
                return loader;
            }
            loader.mo3274d();
            loader.f4736f = true;
            loader.f4734d = false;
            loader.f4735e = false;
            loader.f4737g = false;
            loader.f4738h = false;
            return this.f4717q;
        }

        /* renamed from: n */
        public void m3260n() {
            LifecycleOwner lifecycleOwner = this.f4715o;
            LoaderObserver<D> loaderObserver = this.f4716p;
            if (lifecycleOwner == null || loaderObserver == null) {
                return;
            }
            super.mo3215k(loaderObserver);
            m3211f(lifecycleOwner, loaderObserver);
        }

        @NonNull
        @MainThread
        /* renamed from: o */
        public Loader<D> m3261o(@NonNull LifecycleOwner lifecycleOwner, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            LoaderObserver<D> loaderObserver = new LoaderObserver<>(this.f4714n, loaderCallbacks);
            m3211f(lifecycleOwner, loaderObserver);
            LoaderObserver<D> loaderObserver2 = this.f4716p;
            if (loaderObserver2 != null) {
                mo3215k(loaderObserver2);
            }
            this.f4715o = lifecycleOwner;
            this.f4716p = loaderObserver;
            return this.f4714n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f4712l);
            sb.append(" : ");
            DebugUtils.m2021a(this.f4714n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class LoaderObserver<D> implements Observer<D> {

        /* renamed from: a */
        @NonNull
        public final Loader<D> f4718a;

        /* renamed from: b */
        @NonNull
        public final LoaderManager.LoaderCallbacks<D> f4719b;

        /* renamed from: c */
        public boolean f4720c = false;

        public LoaderObserver(@NonNull Loader<D> loader, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            this.f4718a = loader;
            this.f4719b = loaderCallbacks;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void mo2959a(@Nullable D d) {
            this.f4719b.mo3255a(this.f4718a, d);
            this.f4720c = true;
        }

        public String toString() {
            return this.f4719b.toString();
        }
    }

    public static class LoaderViewModel extends ViewModel {

        /* renamed from: f */
        public static final ViewModelProvider.Factory f4721f = new ViewModelProvider.Factory() { // from class: androidx.loader.app.LoaderManagerImpl.LoaderViewModel.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NonNull
            /* renamed from: a */
            public <T extends ViewModel> T mo3071a(@NonNull Class<T> cls) {
                return new LoaderViewModel();
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            /* renamed from: b */
            public /* synthetic */ ViewModel mo3072b(Class cls, CreationExtras creationExtras) {
                return C0414b.m3248a(this, cls, creationExtras);
            }
        };

        /* renamed from: d */
        public SparseArrayCompat<LoaderInfo> f4722d = new SparseArrayCompat<>();

        /* renamed from: e */
        public boolean f4723e = false;

        @Override // androidx.lifecycle.ViewModel
        /* renamed from: b */
        public void mo3065b() {
            int i2 = this.f4722d.f1854d;
            for (int i3 = 0; i3 < i2; i3++) {
                ((LoaderInfo) this.f4722d.f1853c[i3]).m3259m(true);
            }
            SparseArrayCompat<LoaderInfo> sparseArrayCompat = this.f4722d;
            int i4 = sparseArrayCompat.f1854d;
            Object[] objArr = sparseArrayCompat.f1853c;
            for (int i5 = 0; i5 < i4; i5++) {
                objArr[i5] = null;
            }
            sparseArrayCompat.f1854d = 0;
        }
    }

    public LoaderManagerImpl(@NonNull LifecycleOwner lifecycleOwner, @NonNull ViewModelStore store) {
        this.f4710a = lifecycleOwner;
        ViewModelProvider.Factory factory = LoaderViewModel.f4721f;
        Intrinsics.m32179h(store, "store");
        this.f4711b = (LoaderViewModel) new ViewModelProvider(store, factory, CreationExtras.Empty.f4705b).m3244a(LoaderViewModel.class);
    }

    @Override // androidx.loader.app.LoaderManager
    @Deprecated
    /* renamed from: a */
    public void mo3252a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        LoaderViewModel loaderViewModel = this.f4711b;
        if (loaderViewModel.f4722d.f1854d <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i2 = 0;
        while (true) {
            SparseArrayCompat<LoaderInfo> sparseArrayCompat = loaderViewModel.f4722d;
            if (i2 >= sparseArrayCompat.f1854d) {
                return;
            }
            LoaderInfo loaderInfo = (LoaderInfo) sparseArrayCompat.f1853c[i2];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(loaderViewModel.f4722d.f1852b[i2]);
            printWriter.print(": ");
            printWriter.println(loaderInfo.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(loaderInfo.f4712l);
            printWriter.print(" mArgs=");
            printWriter.println(loaderInfo.f4713m);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(loaderInfo.f4714n);
            loaderInfo.f4714n.mo3262b(C0000a.m14k(str2, "  "), fileDescriptor, printWriter, strArr);
            if (loaderInfo.f4716p != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(loaderInfo.f4716p);
                LoaderObserver<D> loaderObserver = loaderInfo.f4716p;
                Objects.requireNonNull(loaderObserver);
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(loaderObserver.f4720c);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            Object obj = loaderInfo.f4714n;
            Object obj2 = loaderInfo.f4617e;
            if (obj2 == LiveData.f4612k) {
                obj2 = null;
            }
            Objects.requireNonNull(obj);
            StringBuilder sb = new StringBuilder(64);
            DebugUtils.m2021a(obj2, sb);
            sb.append("}");
            printWriter.println(sb.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(loaderInfo.m3210e());
            i2++;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    @NonNull
    @MainThread
    /* renamed from: c */
    public <D> Loader<D> mo3253c(int i2, @Nullable Bundle bundle, @NonNull LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        if (this.f4711b.f4723e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        LoaderInfo m1130d = this.f4711b.f4722d.m1130d(i2, null);
        if (m1130d != null) {
            return m1130d.m3261o(this.f4710a, loaderCallbacks);
        }
        try {
            this.f4711b.f4723e = true;
            Loader<D> mo3256b = loaderCallbacks.mo3256b(i2, null);
            if (mo3256b.getClass().isMemberClass() && !Modifier.isStatic(mo3256b.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo3256b);
            }
            LoaderInfo loaderInfo = new LoaderInfo(i2, null, mo3256b, null);
            this.f4711b.f4722d.m1132f(i2, loaderInfo);
            this.f4711b.f4723e = false;
            return loaderInfo.m3261o(this.f4710a, loaderCallbacks);
        } catch (Throwable th) {
            this.f4711b.f4723e = false;
            throw th;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    /* renamed from: d */
    public void mo3254d() {
        LoaderViewModel loaderViewModel = this.f4711b;
        int m1133g = loaderViewModel.f4722d.m1133g();
        for (int i2 = 0; i2 < m1133g; i2++) {
            loaderViewModel.f4722d.m1134h(i2).m3260n();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.m2021a(this.f4710a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
