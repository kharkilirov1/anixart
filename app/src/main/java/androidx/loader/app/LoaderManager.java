package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class LoaderManager {

    public interface LoaderCallbacks<D> {
        @MainThread
        /* renamed from: a */
        void mo3255a(@NonNull Loader<D> loader, D d);

        @NonNull
        @MainThread
        /* renamed from: b */
        Loader<D> mo3256b(int i2, @Nullable Bundle bundle);

        @MainThread
        /* renamed from: c */
        void mo3257c(@NonNull Loader<D> loader);
    }

    @NonNull
    /* renamed from: b */
    public static <T extends LifecycleOwner & ViewModelStoreOwner> LoaderManager m3251b(@NonNull T t) {
        return new LoaderManagerImpl(t, t.getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo3252a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    @MainThread
    /* renamed from: c */
    public abstract <D> Loader<D> mo3253c(int i2, @Nullable Bundle bundle, @NonNull LoaderCallbacks<D> loaderCallbacks);

    /* renamed from: d */
    public abstract void mo3254d();
}
