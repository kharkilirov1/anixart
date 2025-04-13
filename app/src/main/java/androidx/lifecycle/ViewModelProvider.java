package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewModelProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "AndroidViewModelFactory", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public class ViewModelProvider {

    /* renamed from: a */
    @NotNull
    public final ViewModelStore f4688a;

    /* renamed from: b */
    @NotNull
    public final Factory f4689b;

    /* renamed from: c */
    @NotNull
    public final CreationExtras f4690c;

    /* compiled from: ViewModelProvider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Companion", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public interface Factory {

        /* compiled from: ViewModelProvider.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {
        }

        @NotNull
        /* renamed from: a */
        <T extends ViewModel> T mo3071a(@NotNull Class<T> cls);

        @NotNull
        /* renamed from: b */
        <T extends ViewModel> T mo3072b(@NotNull Class<T> cls, @NotNull CreationExtras creationExtras);
    }

    /* compiled from: ViewModelProvider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Companion", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class NewInstanceFactory implements Factory {

        /* renamed from: b */
        @Nullable
        public static NewInstanceFactory f4697b;

        /* renamed from: a */
        @NotNull
        public static final Companion f4696a = new Companion(null);

        /* renamed from: c */
        @JvmField
        @NotNull
        public static final CreationExtras.Key<String> f4698c = Companion.ViewModelKeyImpl.f4699a;

        /* compiled from: ViewModelProvider.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m31884d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "sInstance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "ViewModelKeyImpl", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {

            /* compiled from: ViewModelProvider.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
            public static final class ViewModelKeyImpl implements CreationExtras.Key<String> {

                /* renamed from: a */
                @NotNull
                public static final ViewModelKeyImpl f4699a = new ViewModelKeyImpl();
            }

            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        /* renamed from: a */
        public <T extends ViewModel> T mo3071a(@NotNull Class<T> modelClass) {
            Intrinsics.m32179h(modelClass, "modelClass");
            try {
                T newInstance = modelClass.newInstance();
                Intrinsics.m32178g(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: b */
        public /* synthetic */ ViewModel mo3072b(Class cls, CreationExtras creationExtras) {
            return C0414b.m3248a(this, cls, creationExtras);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    @RestrictTo
    public static class OnRequeryFactory {
        /* renamed from: c */
        public void mo3172c(@NotNull ViewModel viewModel) {
        }
    }

    @JvmOverloads
    public ViewModelProvider(@NotNull ViewModelStore store, @NotNull Factory factory, @NotNull CreationExtras defaultCreationExtras) {
        Intrinsics.m32179h(store, "store");
        Intrinsics.m32179h(factory, "factory");
        Intrinsics.m32179h(defaultCreationExtras, "defaultCreationExtras");
        this.f4688a = store;
        this.f4689b = factory;
        this.f4690c = defaultCreationExtras;
    }

    @MainThread
    @NotNull
    /* renamed from: a */
    public <T extends ViewModel> T m3244a(@NotNull Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) m3245b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    @MainThread
    @NotNull
    /* renamed from: b */
    public <T extends ViewModel> T m3245b(@NotNull String key, @NotNull Class<T> cls) {
        T t;
        Intrinsics.m32179h(key, "key");
        T viewModel = (T) this.f4688a.f4700a.get(key);
        if (cls.isInstance(viewModel)) {
            Object obj = this.f4689b;
            OnRequeryFactory onRequeryFactory = obj instanceof OnRequeryFactory ? (OnRequeryFactory) obj : null;
            if (onRequeryFactory != null) {
                Intrinsics.m32178g(viewModel, "viewModel");
                onRequeryFactory.mo3172c(viewModel);
            }
            Objects.requireNonNull(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return viewModel;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.f4690c);
        NewInstanceFactory.Companion companion = NewInstanceFactory.f4696a;
        mutableCreationExtras.f4704a.put(NewInstanceFactory.Companion.ViewModelKeyImpl.f4699a, key);
        try {
            t = (T) this.f4689b.mo3072b(cls, mutableCreationExtras);
        } catch (AbstractMethodError unused) {
            t = (T) this.f4689b.mo3071a(cls);
        }
        ViewModel put = this.f4688a.f4700a.put(key, t);
        if (put != null) {
            put.mo3065b();
        }
        return t;
    }

    /* compiled from: ViewModelProvider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Companion", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class AndroidViewModelFactory extends NewInstanceFactory {

        /* renamed from: f */
        @Nullable
        public static AndroidViewModelFactory f4692f;

        /* renamed from: d */
        @Nullable
        public final Application f4694d;

        /* renamed from: e */
        @NotNull
        public static final Companion f4691e = new Companion(null);

        /* renamed from: g */
        @JvmField
        @NotNull
        public static final CreationExtras.Key<Application> f4693g = Companion.ApplicationKeyImpl.f4695a;

        /* compiled from: ViewModelProvider.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m31884d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "DEFAULT_KEY", "Ljava/lang/String;", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "sInstance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "ApplicationKeyImpl", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {

            /* compiled from: ViewModelProvider.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
            public static final class ApplicationKeyImpl implements CreationExtras.Key<Application> {

                /* renamed from: a */
                @NotNull
                public static final ApplicationKeyImpl f4695a = new ApplicationKeyImpl();
            }

            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public AndroidViewModelFactory() {
            this.f4694d = null;
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        /* renamed from: a */
        public <T extends ViewModel> T mo3071a(@NotNull Class<T> cls) {
            Application application = this.f4694d;
            if (application != null) {
                return (T) m3246c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        /* renamed from: b */
        public <T extends ViewModel> T mo3072b(@NotNull Class<T> cls, @NotNull CreationExtras creationExtras) {
            if (this.f4694d != null) {
                return (T) mo3071a(cls);
            }
            Application application = (Application) creationExtras.mo3249a(Companion.ApplicationKeyImpl.f4695a);
            if (application != null) {
                return (T) m3246c(cls, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.mo3071a(cls);
        }

        /* renamed from: c */
        public final <T extends ViewModel> T m3246c(Class<T> cls, Application application) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return (T) super.mo3071a(cls);
            }
            try {
                T newInstance = cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.m32178g(newInstance, "{\n                try {\n…          }\n            }");
                return newInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }

        public AndroidViewModelFactory(@NotNull Application application) {
            this.f4694d = application;
        }
    }
}
