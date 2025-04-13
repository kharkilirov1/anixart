package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: InitializerViewModelFactory.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", "T", "", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ViewModelInitializer<T extends ViewModel> {

    /* renamed from: a */
    @NotNull
    public final Class<T> f4708a;

    /* renamed from: b */
    @NotNull
    public final Function1<CreationExtras, T> f4709b;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(@NotNull Class<T> cls, @NotNull Function1<? super CreationExtras, ? extends T> function1) {
        this.f4708a = cls;
        this.f4709b = function1;
    }
}
